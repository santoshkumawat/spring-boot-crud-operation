package com.santoshkumawat.DaoApp.dao;

import com.santoshkumawat.DaoApp.entity.User;
import com.santoshkumawat.DaoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDao {

    @Autowired
    private UserRepository userRepository;


    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
}
