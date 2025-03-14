package com.itheima.service.impl;

import com.itheima.anno.Bean;
import com.itheima.anno.Di;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service.....");
        //调用dao的方法
        userDao.add();
    }
}
