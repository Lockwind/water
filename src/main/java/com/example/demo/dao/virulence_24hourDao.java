package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.virulence;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface virulence_24hourDao {
    //清空表
    int trunviru_24hour();

    int addviru_24hour(TimeUtil time);

    int saveViru_24hour(virulence virulence);
}