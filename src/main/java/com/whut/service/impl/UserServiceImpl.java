package com.whut.service.impl;


import com.whut.dao.UserDao;
import com.whut.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements com.whut.service.UserService
{
    @Autowired
    UserDao userDao;

    @Override
    public boolean insertUser(User user)
    {
        return userDao.insert(user);
    }

    @Override
    public User getByUsername(String username) {
        return userDao.getByUsername(username);
    }
}
