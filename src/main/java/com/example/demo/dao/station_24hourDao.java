package com.example.demo.dao;

import com.example.demo.domain.TimeUtil;
import com.example.demo.domain.Station;
import com.example.demo.domain.Station_Avg_24Hour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface station_24hourDao {

    //清空表
    int trunstat_24hour();

    //增加24小时数据
    int addstat_24hour(TimeUtil time);

    //增加最新一条数据
    int saveNewStat(Station station);

    //查询24小时表条数
    int selCount();

    //删除最旧数据
    int delOldstat(int end);

    //根据字段查找历史记录
    List<Station_Avg_24Hour> selbyFilter(@Param("sql") String sql);
}
