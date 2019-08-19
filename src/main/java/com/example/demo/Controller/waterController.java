package com.example.demo.Controller;

import com.example.demo.Service.userService;
import com.example.demo.domain.User;
import com.example.demo.response.Message;
import com.example.demo.response.loginMsg;
import com.example.demo.util.userTokenUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.omg.CORBA.Request;
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
        User userinfo=new Gson().fromJson(logininfo,User.class);
        //按名字查用户
        User user=userService.signin(userinfo.getUsername());
        if (user!=null) {
            //将logininfo中密码与数据库密码进行比对
            if (userTokenUtil.getStr(user.getUserpwd()).equals(userinfo.getUserpwd())) {
                //创建token
                String token=userTokenUtil.getToken(user.getUserid()+"/"+ System.currentTimeMillis());
                //将userid和token存入一个共有的map
                userTokenUtil.Users.put(user.getUserid(),token);
                return new Message<loginMsg>(1,"success",new loginMsg(token,user.getPart(),user.getUserid()));
            } else {
                return new Message<>(0, "密码错误", null);
            }
        }else {
            return new Message<>(0,"用户不存在",null);
        }
    }

    @RequestMapping(value = "/monitor")
    public String monitor(){
        return "";
    }

    @RequestMapping("/login_out")
    public Message login_out(String Token){
        //从token中取得用户id
        int uId=Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
        System.out.println(uId);
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
        User user = new User();
        user.setUserid(userid);
        user.setUserpwd(new_pwd);
        //根据id查用户
        User u = userService.signin(userid);
        if (u != null) {
            //比对密码
            if (u.getUserpwd().equals(old_pwd)){
                //更新密码
                if (userService.updatepwd(user)) {
                    return new Message<>(1, "success", null);
                } else {
                   return new Message<>(0, "更改失败", null);
                }
            }else {
                return new Message<>(0, "密码错误", null);
            }
        }else {
            return new Message<>(0, "用户id不存在", null);
        }
    }

    @RequestMapping("/list_users")
    public Message<List<User>> list_users(String Token){
        int uId=Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
        //取出id
        User user=userService.signin(uId);
        if (user!=null) {
            //比对用户身份
            if (user.getPart().equals("root") || user.getPart().equals("admin")) {
                //返回所有用户
                return new Message<List<User>>(1, "success", userService.selectAll());
            } else {
                return new Message<>(0, "无权访问", null);
            }
        }else {
            return new Message<>(0, "无此用户", null);
        }
    }
}
