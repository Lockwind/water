package com.example.demo.dao;

import com.example.demo.domain.buoy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Buoydao {
     List<buoy> findB();
}
