package com.mgspring.book.dao;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.book.dao
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/10 14:21
 * Description:TODO
 * Modify: TODO
 */
public interface BookDao {

    //    根据书本id查询价格
    Integer selectPrice(String bid);

    //    根据书本id更新库存
    void updateSt(String bid);

    //根据用户id,查询剩余余额
    void updateBalance(String uid, Integer price);

}
