package com.spring.captcha.service;

import java.util.List;

import java.util.Optional;

import com.spring.captcha.entity.User;
import com.spring.captcha.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public void createUser(User user) {

        repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public Optional<User> getOneUser(Integer id) {
        return repo.findById(id);
    }

}
