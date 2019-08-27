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

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Userdao userdao;
    @Autowired
    Buoydao buoydao;
    @Autowired
    StationDao stationDao;
    @Autowired
    VirulenceDao virulenceDao;

    @Test
    public void contextLoads() {
        System.out.println(userTokenUtil.getToken("123456"));
    }

    @Test
    public void demo(){
        System.out.println(userdao.selectbyName("hjc"));
    }
    @Test
    public void test(){
        System.out.println(buoydao.findByNewTime());
    }

    @Test
    public void test1(){
        System.out.println(stationDao.findByNewTime());
    }

    @Test
    public void test2(){
        System.out.println(virulenceDao.findByNewTime());
    }

}
