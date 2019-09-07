package com.example.demo.config.taskConfig;

import com.example.demo.Service.DataService;
import com.example.demo.Service.Data_24hourService;
import com.example.demo.dao.Buoydao;
import com.example.demo.domain.buoy;
import com.example.demo.response.DataMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class dataTask {

    @Autowired
    private Data_24hourService data_24hourServiceservice;

    @Autowired
    private DataService dataService;

    private boolean isDataNull;

    private DataMsg olddata = new DataMsg();

    private boolean isRepeat(DataMsg data) {
        int i = olddata.compareTo(data);
        if (i != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Async
    @Scheduled(cron = "0/30 * * * * ? ")
    public void set_24hour() {
        if (isDataNull == false) {
            if (data_24hourServiceservice.fistUpd()) {
                isDataNull = true;
            } else {
                throw new RuntimeException("首次启动出错");
            }
        } else {
            DataMsg data = dataService.findByNewTime();
            if (isRepeat(data) == false) {
                olddata=data;
                System.out.println(data);
                boolean flag = data_24hourServiceservice.saveData_24hour(data);
                if (flag == false) {
                    throw new RuntimeException("定时任务出错");
                }
            } else {
                throw new RuntimeException("数据相同");
            }
        }
    }
}
