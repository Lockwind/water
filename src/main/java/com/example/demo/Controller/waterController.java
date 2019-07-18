package com.example.demo.Controller;

import com.example.demo.Service.userService;
import com.example.demo.domain.User;
import com.example.demo.util.JWTutil;
import com.google.gson.Gson;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@RestController
public class waterController {

    @Autowired
    userService userService;

    @RequestMapping("/login")
    public String Login(String LoginInfo){
        Map<String,String> info=JSONObject.fromObject(LoginInfo);
        Integer uid=userService.signin(new User(info.get("uName"),info.get("uPwd")));
        return uid==null?"请求失败":JWTutil.getToken(uid);
    }

    @RequestMapping("/")
    public int add(HttpServletRequest request){
        return JWTutil.getId(request.getHeader("token"));
    }
}
