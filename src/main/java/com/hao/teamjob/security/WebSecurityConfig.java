package com.hao.teamjob.security;

import com.hao.teamjob.config.SecurityProperties;
import com.hao.teamjob.dao.UserRepository;
import com.hao.teamjob.domian.User;
import com.hao.teamjob.service.LoginRecordService;
import com.hao.teamjob.utils.IpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
@EnableWebSecurity
@Slf4j
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecurityProperties securityProperties;
    private RequestCache requestCache = new HttpSessionRequestCache();
    @Autowired
    private LoginRecordService loginRecordService;

    /**
     * 处理密码加密解密
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncode() {
        //PasswordEncoder的一个实现类
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭跨站请求伪造
        http.csrf().disable();
        http.authorizeRequests().
                antMatchers("/global/**", "/druid/**").permitAll().anyRequest().authenticated()
                .and().formLogin().loginPage("/login").permitAll().successHandler(loginSuccessHandler())
                .and().logout().logoutSuccessUrl("/login")
                .permitAll().invalidateHttpSession(true)
                .deleteCookies("JSESSIONID").logoutSuccessHandler(logoutSuccessHandler())
                .and().sessionManagement().maximumSessions(10).expiredUrl("/login");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
        auth.eraseCredentials(false);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return new LogoutSuccessHandler() {
            @Override
            public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                try {
                    SecurityUser user = (SecurityUser) authentication.getPrincipal();
                    log.info("USER : " + user.getUsername() + "LOGOUT SUCCESS !");

                } catch (Exception e) {
                    log.info("LOGOUT EXCEPTION , e : " + e.getMessage());
                }
                httpServletResponse.sendRedirect("login");
            }
        };
    }

    @Bean
    public SavedRequestAwareAuthenticationSuccessHandler loginSuccessHandler() {
        return new SavedRequestAwareAuthenticationSuccessHandler() {
            @Override
            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
                User userDetails = (User) authentication.getPrincipal();
                String ipAddress = IpUtils.getIpAddr(request);
                String browserType = request.getHeader("Browser-Type");
                log.info("USER : " + userDetails.getEmail() + " LOGIN SUCCESS !  ");
                log.info("USER IP : " + IpUtils.getIpAddr(request));
                log.info("USER Browser Type : " + request.getHeader("Browser-Type"));
                ExecutorService service = Executors.newFixedThreadPool(5);
                service.execute(() -> loginRecordService.addRecord(userDetails.getEmail(), ipAddress, browserType));
                response.setStatus(200);
                response.getWriter().write("success");
            }
        };
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsService() {
            @Autowired
            private UserRepository userRepository;
            @Override
            public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
                User user = userRepository.selectUserByEmail(email);
                if(user == null){
                    throw new UsernameNotFoundException("Username " + email + " not found");
                }
                return new SecurityUser(user);
            }
        };
    }

    public void setRequestCache(RequestCache requestCache) {
        this.requestCache = requestCache;
    }
}
