package com.example.demo.Controller;

import com.example.demo.Service.DataService;
import com.example.demo.response.DataMsg;
import com.example.demo.response.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataControllers {
    @Autowired
    private DataService dataService;
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

    /*最新数据*/
    @RequestMapping(value = "/monitor")
    public Message<DataMsg> newTime() {
        return new Message<>(1,"查询成功",new DataMsg(dataService.findByBuoyNewTime(),dataService.findByVirulenceNewTime(),dataService.findByStationNewTime()));
    }
}
