package com.mgspring.database;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.database
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/3 15:08
 * Description:TODO
 * Modify: TODO
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext cpa = new ClassPathXmlApplicationContext("META-INF/datasource.xml");
        DruidDataSource datasource = cpa.getBean("datasource", DruidDataSource.class);
        System.out.println(datasource);
    }
}
