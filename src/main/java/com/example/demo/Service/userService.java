package com.example.demo.Service;

import com.example.demo.domain.user;
import com.example.demo.response.Message;
import com.example.demo.response.loginMsg;

import java.util.List;

public interface userService {
    Message<loginMsg> login(user user);

    Message<loginMsg> updatepwd(Integer uid, String oldPwd, String newPwd);

    Message<List<user>> selectAll(Integer uid);
}
