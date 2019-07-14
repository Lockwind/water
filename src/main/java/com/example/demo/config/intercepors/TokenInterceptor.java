package com.example.demo.config.intercepors;

import com.example.demo.util.JWTutil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.handler.Handler;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        response.setCharacterEncoding("utf-8");
        //获得请求头中的token
        String token=request.getHeader("token");
        if (token!=null){
            //解码验证
            if (JWTutil.verify(token)){
                return true;
            }
        }
        return false;
    }
}
