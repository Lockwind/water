package com.example.demo.config.taskConfig;

import com.example.demo.Service.DataService;
import com.example.demo.Service.Data_24hourService;
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

    //此方法用于验证数据是否重复
    private boolean isRepeat(DataMsg data) {
        //compareTo方法比较最新数据和旧数据的id是否相同
        int i = olddata.compareTo(data);
        if (i != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Async
    @Scheduled(cron = "2/10 * * * * ? ")
    public void set_24hour() {
        //验证是否为第一次启动
        if (isDataNull == false) {
            //24小时表初始化
            if (data_24hourServiceservice.fistUpd()) {
                isDataNull = true;
            } else {
                throw new RuntimeException("首次启动出错");
            }
        } else {
            //得到最新一条数据
            DataMsg data = dataService.findByNewTime();
            //验证数据是否重复
            if (isRepeat(data) == false) {
                olddata=data;
                //保存最新数据
                boolean flag = data_24hourServiceservice.saveData_24hour(data);
                if (flag == false) {
                    throw new RuntimeException("定时任务出错");
                }
                //验证表内数据是否为144条
                if (data_24hourServiceservice.IsCountTrue()){
                    //删除最旧的数据
                    if (!data_24hourServiceservice.delOldData()){
                        throw new RuntimeException("定时任务出错");
                    }
                }
            } else {
                throw new RuntimeException("数据相同");
            }
        }
    }

}
