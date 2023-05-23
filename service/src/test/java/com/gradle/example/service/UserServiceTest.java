package com.gradle.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    private final UserService service = new UserService();

    @Test
    void findAll() {
        var users = service.findAll();
        assertEquals(3, users.size());
    }
}