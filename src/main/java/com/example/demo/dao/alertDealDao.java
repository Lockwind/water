package com.example.demo.dao;

import com.example.demo.domain.alertDeal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface alertDealDao {
    int addAlertDeal(alertDeal deal);

    List<alertDeal> selAlertDeal(Integer limit);

    alertDeal selById(Integer id);
}
