package com.mgspring.book_xml.dao.impl;

import com.mgspring.book_xml.dao.BookDao;
import com.mgspring.book_xml.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.book.dao.impl
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 14:21
 * Description:TODO
 * Modify: TODO
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer selectPrice(String bid) {
        Integer price = jdbcTemplate.queryForObject("select price from test.book where bid = ? ", new Object[]{bid}, Integer.class);
        return price;
    }

    @Override
    public void updateSt(String bid) {
        Integer st = jdbcTemplate.queryForObject("select st from test.stock where sid= ? ", new Object[]{bid}, Integer.class);
        if (st <= 0) {
            throw new RuntimeException();
        } else {
            jdbcTemplate.update("update test.stock set st=st-1 where sid= ? ", bid);
        }
    }

    @Override
    public void updateBalance(String uid, Integer price) {
        Integer balance = jdbcTemplate.queryForObject("select balance from test.money where uid=? ", new Object[]{uid}, Integer.class);
        if (balance < price) {
            throw new MyException("余额不足");
        } else {
            jdbcTemplate.update("update test.money set balance = balance - ? where uid = ? ", price, uid);
        }
    }
}
