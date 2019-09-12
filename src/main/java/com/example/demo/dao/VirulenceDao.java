package com.example.demo.dao;

import com.example.demo.domain.virulence;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface VirulenceDao {

    List<virulence> findByNewTime(@Param("time") LocalDateTime oldtime);


}
