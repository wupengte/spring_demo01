package com.mgspring.UserMod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.UserMod
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/3 10:37
 * Description:TODO
 * Modify: TODO
 */
public class test {

    public static void main(String[] args) {
        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/user.xml");
    }
}
