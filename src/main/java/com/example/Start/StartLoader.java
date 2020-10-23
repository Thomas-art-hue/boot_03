package com.example.Start;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        sio();
    }

    public void sio() {
        System.out.println("启动类加载中......");

        System.out.println("启动类类加载完成.....");

    }
}
