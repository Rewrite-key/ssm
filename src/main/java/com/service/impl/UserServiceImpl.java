package com.service.impl;

import com.domain.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service");
    }
}
