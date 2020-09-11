package com.mgspring.book_xml.controller;

import com.mgspring.book_xml.serivce.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.book.controller
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 15:20
 * Description:TODO
 * Modify: TODO
 */

@Controller
public class BookController {

    @Autowired
    private BookService service;

    public void buyBook(){
        service.buyBook("1001", "1");
    }


}
