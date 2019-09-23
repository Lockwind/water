package com.example.demo.Controller;

import com.example.demo.Service.AlertService;
import com.example.demo.Service.alertDealService;
import com.example.demo.domain.Alert;
import com.example.demo.domain.AlertDeal;
import com.example.demo.response.Message;
import com.example.demo.response.alertDealMsg;
import com.example.demo.util.checkObject;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlertControllers {

    @Autowired
    private AlertService alertService;

    @Autowired
    private alertDealService dealService;

    @RequestMapping("/get_alarm")
    public Message<Alert> getAlarm(String Alarmid) throws IllegalAccessException {
        int alarmid;
        try{
            alarmid=Integer.parseInt(Alarmid);
        }catch (NumberFormatException e){
            return new Message<>(0,"参数异常",null);
        }catch (NullPointerException e){
            return new Message<>(0,"参数异常",null);
        }
        Alert alert=new Alert();
        alert.setId(alarmid);
        alert=alertService.selByAlert(alert);
        if (checkObject.check(alert)){
            return new Message<Alert>(1,"success",alert);
        }else {
            return new Message<>(0,"查询出错",null);
        }
    }

    @RequestMapping("/submit")
    public Message submit(String submitinfo) throws IllegalAccessException{
          AlertDeal deal=new Gson().fromJson(submitinfo, AlertDeal.class);
          if (checkObject.Nocheck(deal,"id")){
             if (dealService.saveAlertDeal(deal)){
                return new Message<>(1,"success",null);
             }else {
                 return new Message<>(0,"增加错误",null);
             }
          }else {
              return new Message<>(0,"参数异常",null);
          }
    }

    @RequestMapping("/list_all_submit")
    public Message<List<alertDealMsg>> listAll(){
          List<alertDealMsg> msgs=dealService.findAlertDeal();
          if (!msgs.isEmpty()){
              return new Message<List<alertDealMsg>>(1,"success",msgs);
          }
          return new Message<>(0,"查询异常",null);
    }

    @RequestMapping("/get_one_submit")
    public Message<AlertDeal> getSubmit(String Aid) throws IllegalAccessException{
          int aid;
            try{
                aid=Integer.parseInt(Aid);
            }catch (NumberFormatException e){
                return new Message<>(0,"参数异常",null);
            }
            AlertDeal deal=dealService.findById(aid);
            if (checkObject.check(deal)){
                return new Message<AlertDeal>(1,"success",deal);
            }else {
                return new Message<>(0,"查询异常",null);
            }
    }


}
