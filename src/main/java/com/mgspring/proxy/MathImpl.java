package com.mgspring.proxy;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.proxy
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 10:25
 * Description:TODO
 * Modify: TODO
 */
public class MathImpl implements MathI {
    @Override
    public int add(int i, int j) {
//        System.out.println("method: arguments" + i+";" + j); //这么写弊端很明显 代码重复  侵入业务代码明显 代码冗余
        int result = i + j;
//        System.out.println("method:add result:" + result);
        return result;

    }

    @Override
    public int sub(int i, int j) {
//        System.out.println("method: arguments" + i+";" + j);
        int result = i - j;
//        System.out.println("method:sub result:" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
//        System.out.println("method: arguments" + i+";" + j);
        int result = i * j;
//        System.out.println("method:add result:" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
//        System.out.println("method: arguments" + i+";" + j);
        int result = i / j;
//        System.out.println("method:div result:" + result);
        return result;
    }
}
