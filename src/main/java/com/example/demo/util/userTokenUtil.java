package com.example.demo.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.apache.commons.collections.map.HashedMap;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class userTokenUtil {

    public static Map<Integer,String> Users=new HashedMap();

    public static String getToken(String idAndTime){
        return new BASE64Encoder().encode(idAndTime.getBytes());
    }

    public static String getStr(String token){
        byte[] str;
        try {
             str= new BASE64Decoder().decodeBuffer(token);
        }catch (IOException e){
            e.fillInStackTrace();
            throw  new RuntimeException("密码出错");
        }
        return new String(str);
    }
}
