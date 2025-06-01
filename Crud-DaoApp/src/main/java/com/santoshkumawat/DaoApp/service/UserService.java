package com.santoshkumawat.DaoApp.service;

import com.santoshkumawat.DaoApp.dao.UserDao;
import com.santoshkumawat.DaoApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Optional<User> getUserById(Long id){
        return userDao.getUserById(id);
    }
}
