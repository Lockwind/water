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

    private String[][] getAraays(String str){
        if (str.isEmpty()){
            throw new RuntimeException("字符串为空");
        }
        str=str.substring(0,str.length()-2).replace("[","");
        String[] strings=str.split("],");
        String[][] strs=new String[strings.length][];
        for (int i=0;i<strings.length;i++){
            int _s=strings[i].lastIndexOf(",");
            String[] strings2=new String[2];
            strings2[0]=strings[i].substring(0,_s);
            strings2[1]=strings[i].substring(_s+1,strings[i].length());
            strs[i]=new String[strings2.length];
            for (int j=0;j<strings2.length;j++){
                strs[i][j]=strings2[j];
            }
        }
        return strs;
    }


    @Test
    public void contextLoads(){
        String ss="[[b001,b002,1],[s1,2]]";
        String[][] sss=getAraays(ss);
        for (String[] strings : sss) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }


}
