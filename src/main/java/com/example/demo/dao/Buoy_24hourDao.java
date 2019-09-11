package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.buoy;
import com.example.demo.domain.buoy_Avg_24Hour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Buoy_24hourDao {
    //清空表
    int trunBuoy_24hour();

    //
    int addBuoy_24hour(TimeUtil time);

    //
    int saveNewBuoy(buoy buoy);

    int selCount();

    int delOldBuoy(int end);

    List<buoy_Avg_24Hour> selbyFilter(@Param("sql") String sql);
}
