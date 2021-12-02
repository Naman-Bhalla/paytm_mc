package dev.naman.service;

import dev.naman.models.User;
import dev.naman.repository.UserRepository;

public class UserService {
    UserRepository userRepository = new UserRepository();

    public User registerUser(String phoneNo, String password) {
        User user = new User();
        user.setPhoneNo(phoneNo);
        user.setHashedPassword(password);
        userRepository.save(user);
        return user;
    }
}
