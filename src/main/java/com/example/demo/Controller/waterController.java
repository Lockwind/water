package com.example.demo.Controller;

import com.example.demo.Service.userService;
import com.example.demo.domain.user;
import com.example.demo.response.Message;
import com.example.demo.response.loginMsg;
import com.example.demo.util.userTokenUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class waterController {

    @Autowired
    userService userService;

    @RequestMapping("/login")
    public Message<loginMsg> Login(String logininfo){
        //将json转为map
        user userinfo=new Gson().fromJson(logininfo, user.class);
        return userService.login(userinfo);
    }

    @RequestMapping("/login_out")
    public Message login_out(String Token){
        //从token中取得用户id
        int uId=Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
        //在共有map中移除token和id
        if (userTokenUtil.Users.remove(uId,Token)){
            return new Message<>(1,"success",null);
        }else {
            return new Message<>(0,"退出错误",null);
        }
    }

    @RequestMapping("/change_pwd")
    public Message change_pwd(String changeInfo) {
        //json转为map
        Map<String, String> info = new Gson().fromJson(changeInfo,new TypeToken<Map<String,String>>(){}.getType());
        Integer userid = Integer.parseInt(info.get("Userid"));
        String old_pwd = info.get("Old_pwd");
        String new_pwd = info.get("New_pwd");
        //根据id查用户
        return userService.updatepwd(userid,old_pwd,new_pwd);
    }

    @RequestMapping("/list_users")
    public Message<List<user>> list_users(String Token){
        int uId=Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
        //取出id
       return userService.selectAll(uId) ;
    }
}
