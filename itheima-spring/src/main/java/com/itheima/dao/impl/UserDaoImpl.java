package com.itheima.dao.impl;

import com.itheima.anno.Bean;
import com.itheima.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao...");
    }
}
