package com.mgspring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ctrl + alt + l 美化代码
//ctrl + alt + v 自动补全返回值

public class Main {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        HelloWorld hw = (HelloWorld) ctx.getBean("helloworld");

        hw.hello();
    }
}
