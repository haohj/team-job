package com.hao.teamjob.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;

/**
 * @author haohj
 * @date 2019-12-11 14:44
 */
@Component("permitAllSecurityConfig")
public class PermitAllSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    @Autowired
    private Filter uriFormatFilter;

    /**
     * 注册自定义的url格式化过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean setFilter() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean();
        filterBean.setFilter(uriFormatFilter);
        filterBean.setName("uriFormatFilter");
        filterBean.addUrlPatterns("/*");
        filterBean.setOrder(-10000);
        return filterBean;
    }
}
