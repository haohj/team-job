package com.hao.teamjob.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * url格式化过滤器
 *
 * @author haohj
 * @date 2019-12-11 14:47
 */
@Component("uriFormatFilter")
public class UriFormatFilter extends OncePerRequestFilter {
    /**
     * 格式化url，将url中的'//'替换为'/'
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String uri = httpServletRequest.getRequestURI();
        String newUri = uri.replace("//", "/");
        httpServletRequest = new HttpServletRequestWrapper(httpServletRequest) {
            @Override
            public String getRequestURI() {
                return newUri;
            }
        };
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
