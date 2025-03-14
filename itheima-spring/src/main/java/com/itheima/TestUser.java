package com.itheima;

import com.itheima.bean.AnnotationApplicationContext;
import com.itheima.bean.ApplicationContext;
import com.itheima.service.UserService;


public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.itheima");
        UserService userService = (UserService)context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
