package com.example.demo.Service.Impl;

import com.example.demo.Service.AlertService;
import com.example.demo.dao.AlermDao;
import com.example.demo.domain.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {

    @Autowired
    private AlermDao alermDao;

    @Override
    public boolean saveAlert(Alert alert) {
        return alermDao.addAlerm(alert)>0?true:false;
    }

    @Override
    public Alert selByAlert(Alert alert) {
        List<Alert> Alerts = alermDao.selById(alert);
        return Alerts.get(0);
    }
}
