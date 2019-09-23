package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.Virulence;
import com.example.demo.domain.Virulence_Avg_24Hour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface virulence_24hourDao {

    //清空表
    int trunviru_24hour();

    //增加24小时数据
    int addviru_24hour(TimeUtil time);

    //增加最新一条数据
    int saveViru_24hour(Virulence virulence);

    //查询24小时表条数
    int selCount();

    //删除最旧数据
    int delOldviru(int end);

    //根据字段查找历史记录
    List<Virulence_Avg_24Hour> selbyFilter(@Param("sql") String sql);
}