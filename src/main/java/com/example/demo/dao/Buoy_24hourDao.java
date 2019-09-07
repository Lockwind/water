package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.buoy;
import com.example.demo.domain.buoy_Avg_24Hour;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Buoy_24hourDao {
    //清空表
    int trunBuoy_24hour();

    //
    int addBuoy_24hour(TimeUtil time);

    //
    int saveNewBuoy(buoy buoy);

    int delOldBuoy();
}
