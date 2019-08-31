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

        return dataService.findByNewTime();
    }
}
