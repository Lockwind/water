package com.example.demo.Service.Impl;

import com.example.demo.Service.userService;
import com.example.demo.dao.Userdao;
import com.example.demo.domain.User;
import com.example.demo.response.Message;
import com.example.demo.response.loginMsg;
import com.example.demo.util.userTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private Userdao userdao;


    @Override
    public Message<loginMsg> login(User webuser) {
        //按名字查用户
        User user = userdao.selectbyName(webuser.getUserName());
        if (user != null) {
            //将logininfo中密码与数据库密码进行比对
            if (userTokenUtil.getStr(user.getUserPwd()).equals(webuser.getUserPwd())) {
                //创建token
                String token = userTokenUtil.getToken(user.getUserId() + "/" + System.currentTimeMillis());
                //将userid和token存入一个共有的map
                userTokenUtil.Users.put(user.getUserId(), token);
                return new Message<>(1, "success", new loginMsg(token, user.getPart(), user.getUserId()));
            } else {
                return new Message<>(0, "密码错误", null);
            }
        } else {
            return new Message<>(0, "用户不存在", null);
        }
    }

    @Override
    public Message<loginMsg> updatepwd(Integer uid, String oldPwd, String newPwd) {
        User u = userdao.selectbyId(uid);
        if (u != null) {
            //比对密码
            if (userTokenUtil.getStr(u.getUserPwd()).equals(oldPwd)) {
                //更新密码
                if (userdao.updatepwd(new User(uid,userTokenUtil.getToken(newPwd))) > 0) {
                    return new Message<>(1, "success", null);
                } else {
                    return new Message<>(0, "更改失败", null);
                }
            } else {
                return new Message<>(0, "密码错误", null);
            }
        } else {
            return new Message<>(0, "用户id不存在", null);
        }
    }

    @Override
    public Message<List<User>> selectAll(Integer uId) {
        User user = userdao.selectbyId(uId);
        if (user != null) {
            //比对用户身份
            if (user.getPart().equals("root") || user.getPart().equals("admin")) {
                //返回所有用户
                return new Message<List<User>>(1, "success", userdao.selectAll());
            } else {
                return new Message<>(0, "无权访问", null);
            }
        } else {
            return new Message<>(0, "无此用户", null);
        }
    }
}
