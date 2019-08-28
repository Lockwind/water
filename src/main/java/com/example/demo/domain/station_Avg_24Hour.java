package com.example.demo.domain;

import java.time.LocalDateTime;

public class station_Avg_24Hour {
    private int sId;
    private float  s1;
    private float  s2;
    private float  s3;
    private float  s4;
    private float  s5;
    private float  s6;
    private float  s7;
    private float  s8;
    private float  s9;
    private LocalDateTime sTime;

    public station_Avg_24Hour() {
    }

    public station_Avg_24Hour(float s1, float s2, float s3, float s4, float s5, float s6, float s7, float s8, float s9, LocalDateTime sTime) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.sTime = sTime;
    }

    public station_Avg_24Hour(int sId, float s1, float s2, float s3, float s4, float s5, float s6, float s7, float s8, float s9, LocalDateTime sTime) {
        this.sId = sId;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.sTime = sTime;
    }

    @Override
    public String toString() {
        return "station_Avg_24Hour{" +
                "sId=" + sId +
                ", s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                ", s4=" + s4 +
                ", s5=" + s5 +
                ", s6=" + s6 +
                ", s7=" + s7 +
                ", s8=" + s8 +
                ", s9=" + s9 +
                ", sTime=" + sTime +
                '}';
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public float getS1() {
        return s1;
    }

    public void setS1(float s1) {
        this.s1 = s1;
    }

    public float getS2() {
        return s2;
    }

    public void setS2(float s2) {
        this.s2 = s2;
    }

    public float getS3() {
        return s3;
    }

    public void setS3(float s3) {
        this.s3 = s3;
    }

    public float getS4() {
        return s4;
    }

    public void setS4(float s4) {
        this.s4 = s4;
    }

    public float getS5() {
        return s5;
    }

    public void setS5(float s5) {
        this.s5 = s5;
    }

    public float getS6() {
        return s6;
    }

    public void setS6(float s6) {
        this.s6 = s6;
    }

    public float getS7() {
        return s7;
    }

    public void setS7(float s7) {
        this.s7 = s7;
    }

    public float getS8() {
        return s8;
    }

    public void setS8(float s8) {
        this.s8 = s8;
    }

    public float getS9() {
        return s9;
    }

    public void setS9(float s9) {
        this.s9 = s9;
    }

    public LocalDateTime getsTime() {
        return sTime;
    }

    public void setsTime(LocalDateTime sTime) {
        this.sTime = sTime;
    }
}
