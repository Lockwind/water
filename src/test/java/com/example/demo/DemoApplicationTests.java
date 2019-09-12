package com.example.demo;

import com.example.demo.Service.DataService;
import com.example.demo.Service.Data_24hourService;
import com.example.demo.dao.*;
import com.example.demo.domain.buoy;
import com.example.demo.domain.buoy_Avg_24Hour;
import com.example.demo.response.DataMsg;
import com.example.demo.response.Data_24hourMsg;
import com.example.demo.response.Message;
import com.example.demo.util.userTokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Data_24hourService service;
    @Autowired
    DataService dataService;

    private buoy olddata = new buoy();

    private boolean isRepeat(buoy buoy) {
        return olddata.equals(buoy) == true ? false : true;
    }


    @Test
    public void contextLoads(){
        System.out.println(LocalDateTime.now().minusMinutes(10));
    }


}
