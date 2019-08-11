package com.example.demo.config.intercepors;

import com.example.demo.util.userTokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        response.setCharacterEncoding("utf-8");
        //获得请求头中的token
        String token=(String)request.getHeader("Token");
        if (token!=null){
            String userid=userTokenUtil.getStr(token).split("/")[0];
            String thistoken=userTokenUtil.Users.get(Integer.parseInt(userid));
            if (thistoken!=null) {
                if (thistoken.equals(token)) {
                    return true;
                }
            }
        }
        return false;
    }
}
