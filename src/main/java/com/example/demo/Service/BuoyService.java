package com.example.demo.Service;

import com.example.demo.domain.buoy;

import java.util.List;


public interface BuoyService {
    buoy check();

    //根据是时间显示最新的一条数据
    List<buoy> findByNewTime();
}
