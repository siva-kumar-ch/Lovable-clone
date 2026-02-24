package com.personal.projects.lovableClone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.projects.lovableClone.DTO.UserDTO;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @PostMapping("/login")
    public String authenticateUser(@RequestBody(required = true) UserDTO userDto) {
        return "User Details: " + userDto.getName() + ", " + userDto.getEmail() + ", " + userDto.getPassword();
    }

    @PostMapping("/signUp")
    public String signUpUser(@RequestBody(required = true) UserDTO userDto) {
        return "User Details: " + userDto.getName() + ", " + userDto.getEmail() + ", " + userDto.getPassword();
    }

    @GetMapping("/profile/{userId}")
    public String getUserProfile(@PathVariable Integer userId) {
        return "User Profile for User ID: " + userId;
    }

}
