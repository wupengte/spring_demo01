package com.mgspring.proxy;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.proxy
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 11:07
 * Description:TODO
 * Modify: TODO
 */
public class MyLogger {
    public static void before(String methodName,String args){
        System.out.println("method:"+ methodName+"arguments" + args);
    }
    public static void after(String methodName,String args){
        System.out.println("method:"+ methodName+"arguments" + args);
    }

    public static void throwing(){
        System.out.println("有异常了....");
    }

}
