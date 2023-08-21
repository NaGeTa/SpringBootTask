package com.example.springboottask.services;

import com.example.springboottask.entityes.User;
import com.example.springboottask.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;

    private BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    public void saveUser(User user) {
        user.setPassword(encoder().encode(user.getPassword()));
        userRepository.save(user);
    }
}
