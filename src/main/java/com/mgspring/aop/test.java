package com.mgspring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/aop.xml");
//        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        MathI i = cpa.getBean("mathImpl", MathI.class);
        int result = i.add(1, 2);
        System.out.println(result);
    }

}
