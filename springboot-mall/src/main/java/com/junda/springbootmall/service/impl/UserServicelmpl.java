package com.junda.springbootmall.service.impl;

import com.junda.springbootmall.dao.UserDao;
import com.junda.springbootmall.dto.UserRegisterRequest;
import com.junda.springbootmall.model.User;
import com.junda.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServicelmpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
