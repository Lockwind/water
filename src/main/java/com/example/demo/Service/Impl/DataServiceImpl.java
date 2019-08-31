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
    public Message<DataMsg> findByNewTime() {
        List<buoy> newbuoy=buoydao.findByNewTime();
        if (newbuoy.isEmpty()){
            List<station> newstation=stationDao.findByNewTime();
            if (newstation!=null){
                List<virulence> newvirul=virulenceDao.findByNewTime();
                if (newvirul!=null){
                    Message<DataMsg> msg=new Message<>();
                    msg.setCode(0);
                    msg.setMsg("success");
                    msg.setDate(new DataMsg(newbuoy,newvirul,newstation));
                    return msg;
                }
            }
        }
        return new Message<>(0,"fail",null);
    }

}
