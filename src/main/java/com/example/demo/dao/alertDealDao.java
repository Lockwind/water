package com.example.demo.dao;

import com.example.demo.domain.AlertDeal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface alertDealDao {
    int addAlertDeal(AlertDeal deal);

    List<AlertDeal> selAlertDeal(Integer limit);

    AlertDeal selById(Integer id);
}
