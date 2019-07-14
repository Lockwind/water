package com.example.demo;

import com.example.demo.dao.Userdao;
import com.example.demo.domain.User;
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

    @Test
    public void contextLoads() {
        System.out.println(userdao.Login(new User("宁","123456",null)));
    }

}
