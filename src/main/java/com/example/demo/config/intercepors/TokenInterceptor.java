package com.example.demo.config.intercepors;

import com.example.demo.util.userTokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器 负责检查token
@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        response.setCharacterEncoding("utf-8");
        //获得请求头中的token
        String token=(String)request.getHeader("Token");
        if (token!=null){
            //取出id
            String userid=userTokenUtil.getStr(token).split("/")[0];
            //按id取出共有map的Token
            String thistoken=userTokenUtil.Users.get(Integer.parseInt(userid));
            if (thistoken!=null) {
                //比对token
                if (thistoken.equals(token)) {
                    return true;
                }
            }
        }
        return false;
    }
}
