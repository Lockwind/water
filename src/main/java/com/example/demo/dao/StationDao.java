package com.example.demo.dao;

import com.example.demo.domain.station;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface StationDao {

    /*最新查询*/
    List<station> findByNewTime(@Param("time") LocalDateTime oldtime);

}
