package com.example.demo.dao;

import com.example.demo.domain.alertDeal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface alertDealDao {
    int addAlertDeal(alertDeal deal);
}
