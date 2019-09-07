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

    /*最新数据*/
    @RequestMapping(value = "/monitor")
    public Message<DataMsg> newTime() {
        DataMsg dataMsg = dataService.findByNewTime();
        if (dataMsg != null) {
            return new Message<>(1, "成功", dataMsg);
        }
        return new Message<>(0, "查无数据", null);
    }

}
