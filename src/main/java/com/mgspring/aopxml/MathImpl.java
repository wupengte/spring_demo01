package com.mgspring.aopxml;


import org.springframework.stereotype.Controller;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.proxy
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 10:25
 * Description:TODO
 * Modify: TODO
 */

@Controller
public class MathImpl implements MathI {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;
        return result;
    }
}
