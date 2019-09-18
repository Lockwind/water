package com.example.demo.Controller;

import com.example.demo.Service.AlertService;
import com.example.demo.domain.alert;
import com.example.demo.domain.alertDeal;
import com.example.demo.response.Message;
import com.example.demo.util.checkObject;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertControllers {

    @Autowired
    private AlertService alertService;

    @RequestMapping("/get_alarm")
    public Message<alert> getAlarm(String Alarmid) throws IllegalAccessException {
        int alarmid;
        try{
            alarmid=Integer.parseInt(Alarmid);
        }catch (NumberFormatException e){
            return new Message<>(0,"参数异常",null);
        }
        alert alert=new alert();
        alert.setId(alarmid);
        alert=alertService.selByAlert(alert);
        if (checkObject.check(alert)){
            return new Message<alert>(1,"success",alert);
        }else {
            return new Message<>(0,"查询出错",null);
        }
    }

    @RequestMapping("/submit")
    public Message submit(String submitinfo) throws IllegalAccessException{
          alertDeal deal=new Gson().fromJson(submitinfo, alertDeal.class);
          if (checkObject.Nocheck(deal,"id")){
            return null;
          }else {
              return new Message<>(0,"参数异常",null);
          }
    }
}
