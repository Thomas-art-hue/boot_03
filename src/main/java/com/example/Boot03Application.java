package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@ServletComponentScan(basePackages = "com.example.filter")
@MapperScan(basePackages = "com.example.dao")
@SpringBootApplication
//EnableTransactionManagement(开启事务支持默认是支持的);
@EnableTransactionManagement
public class Boot03Application extends SpringBootServletInitializer {
    /*打jar包 extends SpringBootServletInitializer 不需要继承,
      页不需要重写SpringApplicationBuilder
      二打war包都需要
      **/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Boot03Application.class);
    }

    //重写后这个main方法可以注释掉
/*    public static void main(String[] args) {
        SpringApplication.run(Boot03Application.class, args);
    }*/

}
