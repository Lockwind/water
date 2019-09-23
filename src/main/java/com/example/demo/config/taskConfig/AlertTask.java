package com.example.demo.config.taskConfig;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class AlertTask {

    @Async
    @Scheduled(cron = "2/10 * * * * ? ")
    public void setAlert(){

    }
}
