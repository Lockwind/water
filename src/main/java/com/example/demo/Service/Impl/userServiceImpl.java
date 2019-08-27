package com.example.demo.Service.Impl;

import com.example.demo.Service.userService;
import com.example.demo.dao.Userdao;
import com.example.demo.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService  {

    @Autowired
    private Userdao userdao;

    @Override
    public user signin(String uName) {
        return userdao.selectbyName(uName);
    }

    @Override
    public user signin(Integer uId) {
        return userdao.selectbyId(uId);
    }

    @Override
    public boolean updatepwd(user user) {
        return userdao.updatepwd(user)!=0?true:false;
    }

    @Override
    public List<user> selectAll() {
        return userdao.selectAll();
    }
}
