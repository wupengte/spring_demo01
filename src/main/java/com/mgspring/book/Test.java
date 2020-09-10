package com.mgspring.book;

import com.mgspring.book.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.book
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 15:28
 * Description:TODO
 * Modify: TODO
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext cap = new ClassPathXmlApplicationContext("META-INF/book.xml");
        BookController bookController = cap.getBean("bookController", BookController.class);
        bookController.buyBook();
    }
}
