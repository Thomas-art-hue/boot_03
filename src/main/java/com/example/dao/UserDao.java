package com.example.dao;

import com.example.entity.Us;

import java.util.List;

public interface UserDao {
    //查询所有+分页插件
    List<Us> all();

    //添加+事务测试
    int adduser(Us user);
}
