package com.mgspring.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.aopxml
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 16:04
 * Description:TODO
 * Modify: TODO
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext cap = new ClassPathXmlApplicationContext("META-INF/aopxml.xml");
        MathI math = cap.getBean("mathImpl", MathI.class);
        int result = math.add(10, 2);
        System.out.println(result);
    }
}
