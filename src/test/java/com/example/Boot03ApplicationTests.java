package com.example;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot03ApplicationTests {

    @Autowired
    StringEncryptor encryptor;

    @Test
    void contextLoads() {
        System.out.println("==============自我介绍==============");
        String name="张三";
        int age=20;
        String sex="男";
        System.out.println("姓名"+name+"年龄"+age+"性别"+sex);
    }
}