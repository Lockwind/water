package com.example.demo.Service;

import com.example.demo.domain.user;

import java.util.List;

public interface userService {
    user signin(String uName);
    user signin(Integer uId);
    boolean updatepwd(user user);
    List<user> selectAll();
}
