package com.example.demo.Service;

import com.example.demo.domain.alertDeal;
import com.example.demo.response.alertDealMsg;

import java.util.List;

public interface alertDealService {

    boolean saveAlertDeal(alertDeal deal);

    List<alertDealMsg> findAlertDeal();

    alertDeal findById(Integer id);
}
