package com.example.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sessioniceptor extends HandlerInterceptorAdapter {

    /**
     * true放行
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==============拦截器===================");
        // 除掉项目名称时访问页面当前路径
        String url = request.getRequestURI();
        System.out.println("路径" + url);
        HttpSession session = request.getSession();
        Object user = session.getAttribute("us");
        System.out.println("是空的嘛?:" + user);
        if (user == null) {
            //获取当前请求的路径
            System.out.println("走重定向");
            //告诉ajax我重定向的路径
            response.sendRedirect("/index.html");
            return false;
        } else {
            System.out.println("路径" + url);
            return true;
        }
    }
}