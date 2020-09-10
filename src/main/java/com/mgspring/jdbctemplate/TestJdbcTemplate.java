package com.mgspring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.jdbctemplate
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 10:11
 * Description:TODO
 * Modify: TODO
 */
public class TestJdbcTemplate {


    ApplicationContext cap = new ClassPathXmlApplicationContext("META-INF/jdbc.xml");
    JdbcTemplate jdbcTemplate = cap.getBean("jdbcTemplate", JdbcTemplate.class);


    public void test(){
        jdbcTemplate.update("insert into test.emp values(1,'李三',21,'男')");
    }


    public static void main(String[] args) {

//        ApplicationContext cap = new ClassPathXmlApplicationContext("META-INF/jdbc.xml");
//        JdbcTemplate jdbcTemplate = cap.getBean("jdbcTemplate", JdbcTemplate.class);
//        jdbcTemplate.update("insert into test.emp values(1,'李三',21,'男')");
    }
}
