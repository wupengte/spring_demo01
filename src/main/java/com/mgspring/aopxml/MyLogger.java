package com.mgspring.aopxml;

import org.springframework.stereotype.Component;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.aopxml
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 16:02
 * Description:TODO
 * Modify: TODO
 */
@Component
public class MyLogger {

    public void before(){
        System.out.println("前置通知");
    }
}
