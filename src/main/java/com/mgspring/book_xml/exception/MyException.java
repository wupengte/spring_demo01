package com.mgspring.book_xml.exception;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.book.exception
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 15:04
 * Description:TODO
 * Modify: TODO
 */
public class MyException extends RuntimeException {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
