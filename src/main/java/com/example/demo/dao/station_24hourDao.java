package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.buoy_Avg_24Hour;
import com.example.demo.domain.station;
import com.example.demo.domain.station_Avg_24Hour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface station_24hourDao {
    //清空表
    int trunstat_24hour();

    int addstat_24hour(TimeUtil time);

    int saveNewStat(station station);

    int selCount();

    int delOldstat(int end);

    List<station_Avg_24Hour> selbyFilter(@Param("sql") String sql);
}
