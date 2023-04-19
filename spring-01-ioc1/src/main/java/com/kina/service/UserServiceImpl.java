package com.kina.service;

import com.kina.dao.UserDao;
import com.kina.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao UserDao) {
        this.userDao = UserDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
