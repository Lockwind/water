package com.example.demo.Service.Impl;

import com.example.demo.Service.DataService;
import com.example.demo.dao.Buoydao;
import com.example.demo.dao.StationDao;
import com.example.demo.dao.VirulenceDao;
import com.example.demo.domain.buoy;
import com.example.demo.domain.station;
import com.example.demo.domain.virulence;
import com.example.demo.response.DataMsg;
import com.example.demo.response.Message;
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
        List<buoy> newbuoy = buoydao.findByNewTime(oldtime);
        if (!newbuoy.isEmpty()) {
            List<station> newstation = stationDao.findByNewTime(oldtime);
            if (!newstation.isEmpty()) {
                List<virulence> newvirul = virulenceDao.findByNewTime(oldtime);
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
