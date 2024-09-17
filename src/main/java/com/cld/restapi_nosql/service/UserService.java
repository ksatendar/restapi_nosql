package com.cld.restapi_nosql.service;

import com.cld.restapi_nosql.model.User;
import com.cld.restapi_nosql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public  User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String id, User user) {
 user.setId(id);
        return userRepository.save(user);
    }

    public User deleteUser(String id) {
        userRepository.deleteById(id);
        return null;
    }
}
