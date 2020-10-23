package com.example.filter;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener("/*")
public class MyListener implements HttpSessionListener, ServletContextListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session销毁");
    }

    //启动就会有
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("applicaton创建");
    }

    //重启的时候会销毁
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("applicaton销毁");
    }
}
