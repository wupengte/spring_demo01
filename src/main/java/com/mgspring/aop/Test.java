package com.mgspring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.aop
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 14:35
 * Description:TODO
 * Modify: TODO
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/aop.xml");
        MathI math = cpa.getBean("mathImpl", MathI.class);
        System.out.println(math.getClass().getName());
        int result = math.div(4, 2);
        System.out.println(result);
    }


}
