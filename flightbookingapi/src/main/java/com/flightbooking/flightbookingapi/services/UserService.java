package com.flightbooking.flightbookingapi.services;

import com.flightbooking.flightbookingapi.entity.User;
import com.flightbooking.flightbookingapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User signup(User user) {
        return userRepository.save(user);
    }

    public boolean login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if(user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
