package com.example.demo;

import com.example.demo.dao.Buoydao;
import com.example.demo.dao.StationDao;
import com.example.demo.dao.Userdao;
import com.example.demo.dao.VirulenceDao;
import com.example.demo.util.userTokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Test
    public void contextLoads()
    {
        LocalDateTime time=LocalDateTime.now();
        StringBuilder str=new StringBuilder();
            String s=str.append(time.plusHours(1)+":00").replace(10,11," ").toString();

        System.out.println(s);
    }


}
