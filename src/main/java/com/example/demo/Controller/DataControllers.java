package com.example.demo.Controller;

import com.example.demo.Service.BuoyService;
import com.example.demo.Service.StationService;
import com.example.demo.Service.VirulenceService;
import com.example.demo.dao.StationDao;
import com.example.demo.dao.VirulenceDao;
import com.example.demo.response.DataMsg;
import com.example.demo.response.Message;
import com.example.demo.response.loginMsg;
import com.example.demo.util.userTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

@RestController
public class DataControllers {
    @Autowired
    private BuoyService buoyService;
    @Autowired
    private VirulenceService virulenceService;
    @Autowired
    private StationService stationService;
    /*@RequestMapping(value = "/findNewTime")
    public Message<loginMsg> findNewTime(String Token) {
        if (Token!=null){
            int id = Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
            if (id == 0) {
                return new Message<>(0, "用户不存在", null);
            }
        }
        return new Message<>(1,"查询成功",null,
                buoyService.findByNewTime(),
                stationService.findByNewTime(),
                virulenceService.findByNewTime());
    }*/


    @RequestMapping(value = "/NewTime")
    public Message<DataMsg> newTime(String Token) {
        if (Token!=null){
            int Id = Integer.parseInt(userTokenUtil.getStr(Token).split("/")[0]);
            if (Id == 0) {
                return new Message<>(0, "用户不存在", null);
            }
        }
        return new Message<>(1,"查询成功",new DataMsg(buoyService.findByNewTime(),virulenceService.findByNewTime(),stationService.findByNewTime()));
    }
}
