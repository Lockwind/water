package com.example.demo.Service.Impl;

import com.example.demo.Service.BuoyService;
import com.example.demo.dao.Buoydao;
import com.example.demo.domain.buoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuoyServiceImpl implements BuoyService {

    @Autowired
    private Buoydao buoydao;

    @Override
    public buoy check() {
        buoy buoy=buoydao.findB().size()!=0?buoydao.findB().get(0):null;
        if (buoy!=null) {
            buoy.setPH(buoy.getPH() > 2 ? buoy.getPH() : null);
            buoy.setWen(buoy.getWen() > 20 ? buoy.getWen() : null);
            return buoy;
        }else {
            return null;
        }
    }
}
