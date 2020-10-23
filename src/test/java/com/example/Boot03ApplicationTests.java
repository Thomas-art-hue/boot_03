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
        //测试盐值
        String url = encryptor.encrypt("jdbc:mysql:///myhouse?serverTimezone=UTC");
        String name = encryptor.encrypt("root");//你的数据库用户名
        String password = encryptor.encrypt("430423");//你的数据库密码
        System.out.println("盐值路径:" + url);
        System.out.println("盐值用户:" + name);
        System.out.println("验证密码:" + password);
    }

}
