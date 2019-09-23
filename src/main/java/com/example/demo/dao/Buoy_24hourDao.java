package com.example.demo.dao;

import com.example.demo.domain.Buoy;
import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.Buoy_Avg_24Hour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Buoy_24hourDao {

    //清空表
    int trunBuoy_24hour();

    //增加24小时数据
    int addBuoy_24hour(TimeUtil time);

    //增加最新一条数据
    int saveNewBuoy(Buoy buoy);

    //查询24小时表条数
    int selCount();

    //删除最旧数据
    int delOldBuoy(int end);

    //根据字段查找历史记录
    List<Buoy_Avg_24Hour> selbyFilter(@Param("sql") String sql);
}
