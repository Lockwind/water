package com.example.demo.Controller;

import com.example.demo.Service.userService;
import com.example.demo.domain.User;
import com.example.demo.response.Message;
import com.example.demo.response.loginMsg;
import com.example.demo.util.userTokenUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@RestController
public class waterController {

    @Autowired
    userService userService;

    private Map<String,String> toMap(String str){
        return new Gson().fromJson(str,new TypeToken<Map<String,String>>(){}.getType());
    }

    @RequestMapping("/login")
    public String Login(String logininfo){
        Map<String,String> userinfo=toMap(logininfo);
        User user=userService.signin(userinfo.get("Username"));
        if (user!=null) {
            if (userTokenUtil.getStr(user.getUserpwd()).equals(userinfo.get("Password"))) {
                String token=userTokenUtil.getToken(user.getUserid()+"/"+ System.currentTimeMillis());
                userTokenUtil.Users.put(user.getUserid(),token);
                return new Gson().toJson(new Message<loginMsg>(1,"success",new loginMsg(token,user.getPart(),user.getUserid())));
            } else {
                return new Gson().toJson(new Message(0, "密码错误", null));
            }
        }else {
            return new Gson().toJson(new Message(0,"用户不存在",null));
        }
    }

    @RequestMapping("/monitor")
    public String monitor(Map<String,String> map){
        return map.get("test");
    }

    @RequestMapping("/login_out")
    public String login_out(String Token){
        int uId=Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
        if (userTokenUtil.Users.remove(uId,Token)){
            return new Gson().toJson(new Message(1,"success",null));
        }else {
            return new Gson().toJson(new Message(0,"退出错误",null));
        }
    }

    @RequestMapping("/change_pwd")
    public String change_pwd(String changeInfo) {
        Map<String, String> info = toMap(changeInfo);
        Integer userid = Integer.parseInt(info.get("Userid"));
        String old_pwd = info.get("Old_pwd");
        String new_pwd = info.get("New_pwd");
        User user = new User();
        user.setUserid(userid);
        user.setUserpwd(new_pwd);
        User u = userService.signin(userid);
        if (u != null) {
            if (u.getUserpwd().equals(old_pwd)){
                if (userService.updatepwd(user)) {
                    return new Gson().toJson(new Message(1, "success", null));
                } else {
                   return new Gson().toJson(new Message(0, "更改失败", null));
                }
            }else {
                return new Gson().toJson(new Message(0, "密码错误", null));
            }
        }else {
            return new Gson().toJson(new Message(0, "用户id不存在", null));
        }
    }

    @RequestMapping("/list_users")
    public String list_users(String Token){
        int uId=Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
        User user=userService.signin(uId);
        if (user!=null) {
            if (user.getPart().equals("root") || user.getPart().equals("admin")) {
                return new Gson().toJson(new Message<List<User>>(1, "success", userService.selectAll()));
            } else {
                return new Gson().toJson(new Message(0, "无权访问", null));
            }
        }else {
            return new Gson().toJson(new Message(0, "无此用户", null));
        }
    }
}
