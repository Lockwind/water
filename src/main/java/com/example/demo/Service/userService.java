package com.example.demo.Service;

import com.example.demo.domain.User;
import com.example.demo.response.Message;
import com.example.demo.response.loginMsg;

import java.util.List;

public interface userService {
    Message<loginMsg> login(User user);

    Message<loginMsg> updatepwd(Integer uid, String oldPwd, String newPwd);

    Message<List<User>> selectAll(Integer uid);
}
