package com.example.service;


import com.example.entity.Us;
import com.github.pagehelper.Page;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    //查询所有用户+分页插件
    Page<Us> all(Integer pageIndex, Integer pageSize);

    //添加+事务测试
    int adduser(Us user);
}
