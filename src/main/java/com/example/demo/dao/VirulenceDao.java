package com.example.demo.dao;

import com.example.demo.domain.Virulence;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface VirulenceDao {

    List<Virulence> findByNewTime(@Param("time") LocalDateTime oldtime);


}
