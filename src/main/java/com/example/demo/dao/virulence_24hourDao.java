package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.virulence;
import com.example.demo.domain.virulence_Avg_24Hour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface virulence_24hourDao {
    //清空表
    int trunviru_24hour();

    int addviru_24hour(TimeUtil time);

    int saveViru_24hour(virulence virulence);

    int selCount();

    int delOldviru(int end);

    List<virulence_Avg_24Hour> selbyFilter(@Param("sql") String sql);
}