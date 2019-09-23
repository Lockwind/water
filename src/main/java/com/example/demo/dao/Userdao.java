package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Userdao {
    User selectbyName(@Param("uName") String uName);

    User selectbyId(@Param("uId") int uId);

    int updatepwd(User user);

    List<User> selectAll();
}
