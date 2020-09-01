package com.mgspring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.mod
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/1 15:30
 * Description:TODO
 * Modify: TODO
 */
public class TestBySpring {

    public static void main(String[] args) {
        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        Person personOne = cpa.getBean("personOne", Person.class);
        System.out.println(personOne);
    }
}
