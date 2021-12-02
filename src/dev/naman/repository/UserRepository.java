package dev.naman.repository;

import dev.naman.models.User;
import dev.naman.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users = new ArrayList<>();

    public User save(User user) {
        users.add(user);
        System.out.println("User Saved");
        return user;
    }
}
