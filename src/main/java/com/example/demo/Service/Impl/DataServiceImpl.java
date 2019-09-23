package com.example.demo.Service.Impl;

import com.example.demo.Service.DataService;
import com.example.demo.dao.Buoydao;
import com.example.demo.dao.StationDao;
import com.example.demo.dao.VirulenceDao;
import com.example.demo.domain.Buoy;
import com.example.demo.domain.Station;
import com.example.demo.domain.Virulence;
import com.example.demo.response.DataMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private Buoydao buoydao;
    @Autowired
    private StationDao stationDao;
    @Autowired
    private VirulenceDao virulenceDao;

    private LocalDateTime oldtime=LocalDateTime.now().minusMinutes(10);

    @Override
    @Transactional
    public DataMsg findByNewTime() {
        List<Buoy> newbuoy = buoydao.findByNewTime(oldtime);
        if (!newbuoy.isEmpty()) {
            List<Station> newstation = stationDao.findByNewTime(oldtime);
            if (!newstation.isEmpty()) {
                List<Virulence> newvirul = virulenceDao.findByNewTime(oldtime);
                if (!newvirul.isEmpty()) {
                    oldtime=newbuoy.get(0).getbTime();
                    DataMsg data = new DataMsg();
                    data.setBuoy(newbuoy);
                    data.setStation(newstation);
                    data.setVirulence(newvirul);
                    return data;
                }
            }
        }
        return null;
    }

}
