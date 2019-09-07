package com.example.demo.Service.Impl;

import com.example.demo.Service.Data_24hourService;
import com.example.demo.dao.Buoy_24hourDao;
import com.example.demo.dao.station_24hourDao;
import com.example.demo.dao.virulence_24hourDao;
import com.example.demo.domain.*;
import com.example.demo.response.DataMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class Data_24hourServiceImpl implements Data_24hourService {

    @Autowired
    private Buoy_24hourDao buoy_24hourDao;

    @Autowired
    private station_24hourDao stat_24hourDao;

    @Autowired
    private virulence_24hourDao viru_24hourDao;

    @Transactional
    @Override
    public boolean fistUpd() {
        int _b = buoy_24hourDao.trunBuoy_24hour();
        int _s = stat_24hourDao.trunstat_24hour();
        int _v = viru_24hourDao.trunviru_24hour();
        if (_b == 0 && _s == 0 && _v == 0) {
            LocalDateTime now = LocalDateTime.now();
            int _badd = buoy_24hourDao.addBuoy_24hour(new TimeUtil(now.minusDays(Long.valueOf(1)), now));
            int _sadd = stat_24hourDao.addstat_24hour(new TimeUtil(now.minusDays(Long.valueOf(1)), now));
            int _vadd = viru_24hourDao.addviru_24hour(new TimeUtil(now.minusDays(Long.valueOf(1)), now));
            if (_badd > 0 && _sadd > 0 && _vadd > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional
    public boolean saveData_24hour(DataMsg data) {
        buoy buoy = data.getBuoy().get(0);
        station station = data.getStation().get(0);
        virulence virulence = data.getVirulence().get(0);
        int _b = buoy_24hourDao.saveNewBuoy(buoy);
        int _s = stat_24hourDao.saveNewStat(station);
        int _v = viru_24hourDao.saveViru_24hour(virulence);
        if (_b > 0 && _s > 0 && _v > 0) {
            return true;
        }
        return false;
    }
}
