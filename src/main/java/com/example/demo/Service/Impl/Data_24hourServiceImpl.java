package com.example.demo.Service.Impl;

import com.example.demo.Service.Data_24hourService;
import com.example.demo.dao.Buoy_24hourDao;
import com.example.demo.dao.station_24hourDao;
import com.example.demo.dao.virulence_24hourDao;
import com.example.demo.domain.*;
import com.example.demo.response.DataMsg;
import com.example.demo.response.Data_24hourMsg;
import com.example.demo.response.Message;
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
            int _badd = buoy_24hourDao.addBuoy_24hour(new TimeUtil(now.minusDays(1), now));
            int _sadd = stat_24hourDao.addstat_24hour(new TimeUtil(now.minusDays(1), now));
            int _vadd = viru_24hourDao.addviru_24hour(new TimeUtil(now.minusDays(1), now));
            if (_badd > 0 && _sadd > 0 && _vadd > 0) {
                int _bminus=_badd-144;
                int _sminus=_sadd-144;
                int _vminus=_vadd-144;
                    if (_bminus>0){
                        buoy_24hourDao.delOldBuoy(_bminus);
                    }
                    if (_sminus>0){
                        stat_24hourDao.delOldstat(_sminus);
                    }
                    if (_vminus>0){
                        viru_24hourDao.delOldviru(_vminus);
                    }
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional
    public boolean saveData_24hour(DataMsg data) {
        Buoy buoy = data.getBuoy().get(0);
        Station station = data.getStation().get(0);
        Virulence virulence = data.getVirulence().get(0);
        int _b = buoy_24hourDao.saveNewBuoy(buoy);
        int _s = stat_24hourDao.saveNewStat(station);
        int _v = viru_24hourDao.saveViru_24hour(virulence);
        if (_b > 0 && _s > 0 && _v > 0) {
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean IsCountTrue() {
        int _b=buoy_24hourDao.selCount();
        int _s=stat_24hourDao.selCount();
        int _v=viru_24hourDao.selCount();
        if (_b>144 && _s>144 && _v>144){
            return true;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delOldData() {
        int _b=buoy_24hourDao.delOldBuoy(1);
        int _s=stat_24hourDao.delOldstat(1);
        int _v=viru_24hourDao.delOldviru(1);
        if (_b>0 && _s>0 && _v>0){
            return true;
        }
        return false;
    }

    private String getsql(String[] filter){
        StringBuilder sql=new StringBuilder("select ");
        sql.append(filter[0]);
        switch (filter[1]){
            case "1":
                sql.append(",time from buoy_avg_24hour;");
                break;
            case "2":
                sql.append(",time from station_avg_24hour;");
                break;
            case "3":
                sql.append(",time from virulence_avg_24hour;");
                break;
        }
        return sql.toString();
    }

    @Override
    @Transactional
    public Message<Data_24hourMsg> selbyFilter(String[][] filters) {
        Data_24hourMsg data=new Data_24hourMsg();
        for (String[] filter:filters){
            switch (filter[1]){
                case "1":
                    String sql=getsql(filter);
                    data.setBuoy24Hours(buoy_24hourDao.selbyFilter(sql));
                    break;
                case "2":
                    String sql1=getsql(filter);
                    data.setStation24Hours(stat_24hourDao.selbyFilter(sql1));
                    break;
                case "3":
                    String sql2=getsql(filter);
                    data.setVirulence24Hours(viru_24hourDao.selbyFilter(sql2));
                    break;
            }
        }
        return new Message<>(1,"success",data);
    }


}
