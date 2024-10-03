package com.junda.springbootmall.service;

import com.junda.springbootmall.dto.UserRegisterRequest;
import com.junda.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
