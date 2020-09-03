package com.mgspring.UserMod.dao;

import org.springframework.stereotype.Repository;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.UserMod.dao
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/3 10:20
 * Description:TODO
 * Modify: TODO
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl:添加成功!");
    }

    public UserDaoImpl(){
        System.out.println("UserDaoImpl");
    }

}
