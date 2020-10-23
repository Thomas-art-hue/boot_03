package com.example.service.impl;


import com.example.dao.UserDao;
import com.example.entity.Us;
import com.example.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Page<Us> all(Integer pageIndex, Integer pageSize) {
        Page<Us> page = PageHelper.startPage(pageIndex, pageSize, "UID desc");
        userDao.all();
        return page;
    }

    @Override
    public int adduser(Us user) {
        return userDao.adduser(user);
    }
}
