package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.station;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface station_24hourDao {
    //清空表
    int trunstat_24hour();

    int addstat_24hour(TimeUtil time);

    int saveNewStat(station station);
}
