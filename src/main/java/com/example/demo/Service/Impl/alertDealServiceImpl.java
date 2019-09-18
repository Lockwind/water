package com.example.demo.Service.Impl;

import com.example.demo.Service.alertDealService;
import com.example.demo.dao.alertDealDao;
import com.example.demo.domain.alertDeal;
import org.springframework.beans.factory.annotation.Autowired;

public class alertDealServiceImpl implements alertDealService {

    @Autowired
    private alertDealDao dealDao;

    @Override
    public boolean saveAlertDeal(alertDeal deal) {
        return dealDao.addAlertDeal(deal)>0?true:false;
    }
}
