package com.mgspring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.controller
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/1 15:40
 * Description:TODO
 * Modify: TODO
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/bean-di.xml");
        Student s1 = cpa.getBean("s1", Student.class);
        System.out.println(s1);

    }
}
