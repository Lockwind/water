package com.example.demo.Controller;

import com.example.demo.Service.DataService;
import com.example.demo.Service.Data_24hourService;
import com.example.demo.response.DataMsg;
import com.example.demo.response.Data_24hourMsg;
import com.example.demo.response.Message;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DataControllers {

    @Autowired
    private Data_24hourService data24hourService;

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

    //这是一个可以将"[[?,?]]"格式转为二维数组的方法
    private String[][] getAraays(String str){
        if (str.isEmpty()){
            throw new RuntimeException("字符串为空");
        }
        str=str.substring(0,str.length()-1).replace("[","");
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

    /*因为tomcat限制字符的缘故，只能使用post提交*/
    @RequestMapping("/history")
    public Message<Data_24hourMsg> history(@RequestBody Map<String,String> info){
        String ss= info.get("Fileter");
        String[][] infos;
        try {
            infos = getAraays(ss);
        }catch (Exception e){
            return new Message<Data_24hourMsg>(0,"参数异常",null);
        }
        switch ((String) info.get("Type")){
            case "1":               //24小时
                return data24hourService.selbyFilter(infos);
            default:
                return new Message<Data_24hourMsg>(0,"参数异常",null);
        }
    }

}
