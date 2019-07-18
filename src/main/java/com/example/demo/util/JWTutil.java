package com.example.demo.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class JWTutil {
    //过期时间
    private static final long OVERTIME=60*1000;
    //秘钥
    private static final String CIPHER="jjjjjjjjj";

    //此为获得token
    public static String getToken(Integer userid) {
        try {
            //获得时间,这个时间指该token过期时间
            Timestamp time = new Timestamp(System.currentTimeMillis() + OVERTIME);
            //此为token头
            Map head = new HashMap(2);
            head.put("type", "JWT");
            head.put("alg", "HS256");
            //算法加密
            Algorithm algorithm = Algorithm.HMAC256(CIPHER);
            return JWT.create().withHeader(head).withClaim("userid", userid)
                    .withClaim("time",new Timestamp(System.currentTimeMillis()))
                    .withExpiresAt(time).sign(algorithm);
        }catch (UnsupportedEncodingException e){
            return null;
        }
    }

    //此为解码验证
    public static boolean verify(String token){
        try {
            //算法密钥
            Algorithm algorithm = Algorithm.HMAC256(CIPHER);
            //按照密钥解密
            JWTVerifier verifier = JWT.require(algorithm).build();
            //验证是否正确token
            DecodedJWT jwt = verifier.verify(token);
            return true;
        }catch (Exception e){
            return false;
        }
    }

   public static int getId(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(CIPHER);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return jwt.getClaims().get("userid").asInt();
        }catch (Exception e){
            return 0;
        }
   }
}
