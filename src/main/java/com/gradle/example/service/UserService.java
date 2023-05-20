package com.gradle.example.service;

import com.gradle.example.dao.UserDao;
import com.gradle.example.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> findAll() {
        return userDao.findAll();
    }
}
