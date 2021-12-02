package dev.naman.controller;

import dev.naman.models.User;
import dev.naman.service.UserService;

public class UserController {
    private UserService userService = new UserService();

    public User registerUser(String phoneNumber, String password) {
        return userService.registerUser(phoneNumber, password);
    }
}
