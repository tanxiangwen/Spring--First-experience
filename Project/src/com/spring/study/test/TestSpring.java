package com.spring.study.test;

import com.spring.study.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        /**
         * ApplicationContext上下文对象
         * 配置文件在src里面用:ClassPathXmlApplicationContext
         * 其他用:FileSystemXmlApplicationContext
         */
        //加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring5.xml");

        //获取对象
       User user= applicationContext.getBean("user", User.class);
        System.out.println(user);
        user.add();


    }
}
