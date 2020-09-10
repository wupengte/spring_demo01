package com.mgspring.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.jdbctemplate
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 10:33
 * Description:TODO
 * Modify: TODO
 */
public class TestJdbcTemplateTest {

    ApplicationContext cap = new ClassPathXmlApplicationContext("META-INF/jdbc.xml");
    JdbcTemplate jdbcTemplate = cap.getBean("jdbcTemplate", JdbcTemplate.class);

    @Test
    public void test1() {
//        jdbcTemplate.update("insert into test.emp values(2,'李1',22,'男')");
        String ename = "小吴,张三";
//        String sql="delete from test.emp where test.emp.eid in (" + eid + ")"; //可以删除
        String sql = "delete from test.emp where test.emp.ename in (?)"; //删除不了
//        jdbcTemplate.update(sql);
        jdbcTemplate.update(sql, ename);


    }

    @Test
    public void testBatchUpdate() {
        String sql = "insert into test.emp values(?,?,?,?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{10,"aa",10,"男"});
        list.add(new Object[]{11,"bb",11,"女"});
        list.add(new Object[]{12,"cc",12,"女"});
        list.add(new Object[]{13,"dd",13,"女"});
        jdbcTemplate.batchUpdate(sql,list);
    }

    @Test
    public void testQueryForObject(){
        String sql="select count(*) from test.emp";
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(result);
    }

    @Test
    public void testQuery(){
        String sql="select eid,ename,sex,age from test.emp";
        RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
        List<Emp> query = jdbcTemplate.query(sql, rowMapper);
        for (Emp emp : query) {
            System.out.println(emp);
        }




    }

}