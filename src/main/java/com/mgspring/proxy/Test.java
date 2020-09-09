package com.mgspring.proxy;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.proxy
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/9 10:31
 * Description:TODO
 * Modify: TODO
 */
public class Test {

    public static void main(String[] args) {
//        基本写法
//        MathI math = new MathImpl();
//        int result = math.div(1, 1);
//        System.out.println(result);

//        Properties properties = System.getProperties();
//        properties.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //动态代理写法
        ProxyUtil proxy = new ProxyUtil( new MathImpl());
        MathI math = (MathI)proxy.getProxy();
        int result = math.add(1, 2);
        System.out.println(result);
    }

}
