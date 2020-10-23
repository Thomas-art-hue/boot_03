package com.example.controller;


import com.example.entity.Us;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class Useradd {

    @Autowired
    private UserService userService;

    @PostMapping("carry")
    public String carry(Us user) {
        System.out.println("==============执行用的添加================");
        System.out.println("用户名" + user.getUNAME() + "密码" + user.getUpwd());
        userService.adduser(user);
        int i = 1 / 0;
        return "redirect:/showall.html";
    }
}
