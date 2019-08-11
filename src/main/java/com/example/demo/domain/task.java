    package com.example.demo.domain;

import com.example.demo.Service.BuoyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Configuration
/*@EnableScheduling*/
@EnableAsync
public class task {

    @Autowired
    private BuoyService buoyService;

    @Async
    @Scheduled(cron = "*/5 * * * * ?")
    public void test() {
            buoy bu = buoyService.check();
            if (bu!=null) {
                String name;
                Class<? extends buoy> buclass = bu.getClass();
                Map<String, Object> namemap = new HashMap<>();
                Field[] names = buclass.getDeclaredFields();
                for (int i = 0; i < names.length; i++) {
                    name = names[i].getName();
                    if (name == "bId") {
                        continue;
                    }
                    name = name.substring(0, 1).toUpperCase() + name.substring(1);
                    try {
                        Method m = buclass.getMethod("get" + name);
                        Object value = m.invoke(bu);
                        if (value != null) {
                            namemap.put(name, value);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (namemap.size() > 0) {
                    StringBuffer buffer = new StringBuffer("出现异常,");
                    Iterator<String> iterator = namemap.keySet().iterator();
                    while (iterator.hasNext()) {
                        String S = iterator.next();
                        buffer.append("异常因子为：" + S + ",值为:" + namemap.get(S));
                    }
                    System.out.println(buffer.toString());
                }
            }
    }
}