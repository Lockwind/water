package com.example.demo.Service.Impl;

import com.example.demo.Service.StationService;
import com.example.demo.dao.StationDao;
import com.example.demo.domain.station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StationServiceImpl implements StationService {
    @Autowired
    private StationDao stationDao;
    @Override
    public List<station> findByNewTime() {
        return stationDao.findByNewTime();
    }
}
