package com.example.controller;


import com.example.entity.Us;
import com.example.service.UserService;
import com.github.pagehelper.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
//在控制台打印出日志的注解
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session) {
        System.out.println("=============模拟登录成功==============");
        //给的死值保存到session
        System.out.println("用户:" + username + "密码:" + password);
        session.setAttribute("us", "张三");
        return "redirect:/showall.html";
    }

    @RequestMapping("/all")
    @ResponseBody
    public Map all(Integer pageIndex, Integer pageSize) {
        System.out.println("执行了");
        pageSize = 2;
        if (pageIndex == null) {
            pageIndex = 1;
        }
        System.out.println("指定页" + pageIndex + "每页大小" + pageSize);

        log.info("查询出所有的用户日志");

        Page<Us> list = userService.all(pageIndex, pageSize);
        for (Us uu : list) {
            System.out.println("用户" + uu.getUNAME());
        }
        Map<String, Object> map1 = new HashMap<>();
        map1.put("list", list);
        //当前页面
        map1.put("payu", list.getPageNum());
        //总页码
        map1.put("pay", list.getPages());
        //System.out.println("当前页"+list.getPageNum()+"每页大小"+list.getPageSize());
        return map1;
    }
}
