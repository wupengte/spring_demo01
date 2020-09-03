package com.mgspring.UserMod.Service;

import com.mgspring.UserMod.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 * Project: spring_demo01
 * Package: com.mgspring.UserMod.Service
 * Version: 1.0
 * Created by WUPENGTE on 2020/9/3 10:31
 * Description:TODO
 * Modify: TODO
 */
@Service
public class UserServiceimpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser() {
        userDao.addUser();
    }


    public UserServiceimpl() {
        System.out.println("UserServiceimpl");
    }
}
