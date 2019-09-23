package com.example.demo;

import com.example.demo.Service.DataService;
import com.example.demo.Service.Data_24hourService;
import com.example.demo.domain.Buoy;
import com.example.demo.util.userTokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Data_24hourService service;
    @Autowired
    DataService dataService;

    private Buoy olddata = new Buoy();

    private boolean isRepeat(Buoy buoy) {
        return olddata.equals(buoy) == true ? false : true;
    }


    @Test
    public void contextLoads() throws IllegalAccessException{
        System.out.println(userTokenUtil.getToken("123456"));
    }


}
