package com.example.demo.Service;

import com.example.demo.domain.AlertDeal;
import com.example.demo.response.alertDealMsg;

import java.util.List;

public interface alertDealService {

    boolean saveAlertDeal(AlertDeal deal);

    List<alertDealMsg> findAlertDeal();

    AlertDeal findById(Integer id);
}
