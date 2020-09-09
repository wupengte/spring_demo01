package com.mgspring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyLoggerAspect {

    @Pointcut(value = "execution(* com.mgspring.aop.*.*(..))")
    public void test(){
    }

//    @Before(value = "execution(public int com.mgspring.aop.MathImpl.add(int,int))")
    @Before(value = "test()")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(" 前置通知：method:" + methodName+ "    Arguments:" + Arrays.toString(args));

//        System.out.println("前置通知");
    }
//    @After(value = "execution(* com.mgspring.aop.*.*(..))")
    @After(value = "test()")
    public void afterMethod(){
        System.out.println("后置通知");
    }

    @AfterReturning(value = "test()",returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(" 返回通知 AfterReturning method:" + methodName + " result:" + result);
    }

    @AfterThrowing(value = "test()",throwing = "ex")
    public void afterThrowingMethod(Exception ex){
        System.out.println("异常通知" + ex);
    }

//    环绕通知 较少使用
//    @Around(value = "test()")
//    public Object aroundMethod(ProceedingJoinPoint joinPoint){
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//            System.out.println("前置通知");
//            return result;
//        } catch (Throwable e) {
//            e.printStackTrace();
//            System.out.println("异常通知");
//        } finally {
//            System.out.println("后置通知");
//        }
//        return -1;
//    }




}
