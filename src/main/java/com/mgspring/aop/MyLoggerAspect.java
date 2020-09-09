package com.mgspring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggerAspect {

    @Before(value = "execution(public int com.mgspring.aop.MathImpl.add(int,int))")
    public void beforeMethod() {
        System.out.println("前置通知");
    }

}
