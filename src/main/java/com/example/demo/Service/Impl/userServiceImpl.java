package com.example.demo.Service.Impl;

import com.example.demo.Service.userService;
import com.example.demo.dao.Userdao;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private Userdao userdao;

    @Override
    public Integer signin(User user) {
        return userdao.Login(user);
    }
}
