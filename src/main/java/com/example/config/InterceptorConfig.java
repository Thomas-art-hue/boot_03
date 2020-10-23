package com.example.config;


import com.example.interceptor.Sessioniceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  //定义此类位配置文件(即相当于之前xml配置文件)
public class InterceptorConfig implements WebMvcConfigurer {
    /**
     * 重写一个 addInterceptors 方法 添加一个拦截器
     * 否则拦截器不会启动
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //InterceptorRegistry 参数 拦截器注册类
        //要拦截的
        String[] addPathPatterns = {
                "/admin/all", "/showall.html", "/addwall.html"
        };
        //要排除的，不进行拦截
        String[] excludePathPatterns = {
                "/admin/login", "/index.html"
        };
        //相当于之前写的mvc:interceptor具体某一个
        registry.addInterceptor(new Sessioniceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
