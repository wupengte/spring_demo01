package com.mgspring.book.serivce.impl;

import com.mgspring.book.dao.BookDao;
import com.mgspring.book.serivce.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.book.serivce.impl
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 15:13
 * Description:TODO
 * Modify: TODO
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    @Transactional
    public void buyBook(String bid, String uid) {
        Integer price = dao.selectPrice(bid);
        dao.updateSt(bid);
        dao.updateBalance(uid, price);
    }
}
