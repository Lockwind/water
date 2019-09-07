package com.example.demo.domain;


import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("time")
public class TimeUtil {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public TimeUtil(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
