package com.mgspring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

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

        Student s2 = cpa.getBean("s2", Student.class);
        System.out.println(s2);

        Student s3 = cpa.getBean("s3", Student.class);
        System.out.println(s3)
        ;
        Student s4 = cpa.getBean("s4", Student.class);
        System.out.println(s4);

        Student s5 = cpa.getBean("s5", Student.class);
        System.out.println(s5);

        Student s6 = cpa.getBean("s6", Student.class);
        System.out.println(s6);

        Teacher t1 = cpa.getBean("t1", Teacher.class);
        System.out.println(t1);

        Teacher t2 = cpa.getBean("t2", Teacher.class);
        System.out.println(t2);

        Teacher t3 = cpa.getBean("t3", Teacher.class);
        System.out.println(t3);




    }
}
