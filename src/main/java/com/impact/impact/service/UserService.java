package com.impact.impact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.impact.impact.model.User;

@Service
public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    
}
