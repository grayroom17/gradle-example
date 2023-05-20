package com.gradle.example.dao;

import com.gradle.example.model.User;

import java.util.List;

public class UserDao {
    public List<User> findAll() {
        return List.of(
                new User(1, "Ivan"),
                new User(2, "Petr"),
                new User(3, "Sergey")
        );
    }
}
