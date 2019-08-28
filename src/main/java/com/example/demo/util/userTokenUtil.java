package com.example.demo.util;


import org.apache.commons.collections.map.HashedMap;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


import java.io.IOException;
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
