package com.example.demo.dao;

import com.example.demo.domain.alert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlermDao {
    int addAlerm(alert alert);

    List<alert> selById(alert alert);
}
