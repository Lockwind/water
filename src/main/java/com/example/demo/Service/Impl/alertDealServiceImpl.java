package com.example.demo.Service.Impl;

import com.example.demo.Service.alertDealService;
import com.example.demo.dao.alertDealDao;
import com.example.demo.domain.AlertDeal;
import com.example.demo.response.alertDealMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class alertDealServiceImpl implements alertDealService {

    @Autowired
    private alertDealDao dealDao;

    @Override
    public boolean saveAlertDeal(AlertDeal deal) {
        return dealDao.addAlertDeal(deal)>0?true:false;
    }



    @Override
    public List<alertDealMsg> findAlertDeal() {
        List<AlertDeal> deals=dealDao.selAlertDeal(15);
        if (!deals.isEmpty()) {
            List<alertDealMsg> msgs = new LinkedList<>();
            for (AlertDeal deal : deals) {
                StringBuilder sql = new StringBuilder(deal.getTime().toString());
                sql.append("-");
                sql.append(deal.getTypeName(deal.getType()));
                alertDealMsg msg = new alertDealMsg(deal.getId(), sql.toString());
                msgs.add(msg);
            }
            return msgs;
        }else {
            return null;
        }

    }

    @Override
    public AlertDeal findById(Integer id) {
        return dealDao.selById(id);
    }


}
