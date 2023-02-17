package com.flightbooking.flightbookingapi.controller;


import com.flightbooking.flightbookingapi.entity.User;
import com.flightbooking.flightbookingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/flightreservation")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userService.signup(user);
    }

    @PostMapping("/login")
    public boolean login(@RequestParam("username") String email,@RequestParam("password") String password) {
        return userService.login(email, password);
    }
}
