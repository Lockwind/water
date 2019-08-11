package com.example.demo.Service;

import com.example.demo.domain.User;

import java.util.List;

public interface userService {
    User signin(String uName);
    User signin(Integer uId);
    boolean updatepwd(User user);
    List<User> selectAll();
}
