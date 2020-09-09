package com.mgspring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.aop
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 14:59
 * Description:TODO
 * Modify: TODO
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/aop.xml");
//        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        MathI i = cpa.getBean("mathImpl", MathI.class);
        int result = i.add(1, 2);
        System.out.println(result);
    }
}
