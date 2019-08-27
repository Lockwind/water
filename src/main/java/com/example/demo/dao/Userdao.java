package com.example.demo.dao;

import com.example.demo.domain.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Userdao {
    user selectbyName(@Param("uName") String uName);
    user selectbyId(@Param("uId")int uId);
    int updatepwd(user user);
    List<user> selectAll();
}
