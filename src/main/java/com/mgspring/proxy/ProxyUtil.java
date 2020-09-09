package com.mgspring.proxy;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.proxy
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 10:43
 * Description:TODO
 * Modify: TODO
 */
public class ProxyUtil {

    private MathImpl mathImpl;

    public ProxyUtil(MathImpl mathImpl) {
        super();
        this.mathImpl = mathImpl;
    }

    public Object getProxy() {
        ClassLoader loader = this.getClass().getClassLoader();
        Class[] interfaces = mathImpl.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                try {
                    //System.out.println("前置通知");
                    MyLogger.before(method.getName(), Arrays.toString(args));
                    Object result = method.invoke(mathImpl, args);
                    //System.out.println("后置通知");
                    MyLogger.after(method.getName(), Arrays.toString(args));
                    return result;
                } catch (Exception e) {
                    MyLogger.throwing();
                    e.printStackTrace();
                }
                finally {
                    System.out.println("哪里都有我");
                }
            return null;
            }
        });


    }

}
