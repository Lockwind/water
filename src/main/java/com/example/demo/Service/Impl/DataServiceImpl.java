package com.example.demo.Service.Impl;

import com.example.demo.Service.DataService;
import com.example.demo.dao.Buoydao;
import com.example.demo.dao.StationDao;
import com.example.demo.dao.VirulenceDao;
import com.example.demo.domain.buoy;
import com.example.demo.domain.station;
import com.example.demo.domain.virulence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private Buoydao buoydao;
    @Autowired
    private StationDao stationDao;
    @Autowired
    private VirulenceDao virulenceDao;
    @Override
    public List<buoy> findByBuoyNewTime() {
        return buoydao.findByNewTime();
    }

    @Override
    public List<station> findByStationNewTime() {
        return stationDao.findByNewTime();
    }

    @Override
    public List<virulence> findByVirulenceNewTime() {
        return virulenceDao.findByNewTime();
    }
}
