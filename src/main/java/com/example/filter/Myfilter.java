package com.example.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.util.logging.LogRecord;

//过滤器
@WebFilter("/*")
public class Myfilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤前");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("过滤后");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
