package com.example.demo.domain;

import java.time.LocalDateTime;

public class buoy_Avg_7Day {
    private int bId;                       //浮标数据id
    private LocalDateTime bTime;           //记录时间
    private float bA0;                     //酸碱度
    private float bA1;                     //总悬浮物
    private float bA2;                     //生化需氧量
    private float bA3;                     //化学需氧量
    private float bA4;                     //总有机碳
    private float bA5;                     //氨氮
    private float bA6;              //磷酸盐
    private float bA7;       //水温
    private float bA8;           //电导率
    private float bA9;              //浊度
    private float bA10;        //溶解氧
    private float bA11;              //石油类
    private float bA12;         //蓝藻
    private float bA13;            //叶绿素
    private float bA14;        //硝氮
    private float bA15;        //亚硝氮
    private float bA16;               //降雨量
    private float bA17;         //气温
    private float bA18;               //气压
    private float bA19;       //相对湿度
    private float bA20;     //累计雨量
    private float bA21;       //平均风速
    private float bA22;   //平均风向

    public buoy_Avg_7Day() {
    }

    public buoy_Avg_7Day(LocalDateTime bTime, float bA0, float bA1, float bA2, float bA3, float bA4, float bA5, float bA6, float bA7, float bA8, float bA9, float bA10, float bA11, float bA12, float bA13, float bA14, float bA15, float bA16, float bA17, float bA18, float bA19, float bA20, float bA21, float bA22) {
        this.bTime = bTime;
        this.bA0 = bA0;
        this.bA1 = bA1;
        this.bA2 = bA2;
        this.bA3 = bA3;
        this.bA4 = bA4;
        this.bA5 = bA5;
        this.bA6 = bA6;
        this.bA7 = bA7;
        this.bA8 = bA8;
        this.bA9 = bA9;
        this.bA10 = bA10;
        this.bA11 = bA11;
        this.bA12 = bA12;
        this.bA13 = bA13;
        this.bA14 = bA14;
        this.bA15 = bA15;
        this.bA16 = bA16;
        this.bA17 = bA17;
        this.bA18 = bA18;
        this.bA19 = bA19;
        this.bA20 = bA20;
        this.bA21 = bA21;
        this.bA22 = bA22;
    }

    public buoy_Avg_7Day(int bId, LocalDateTime bTime, float bA0, float bA1, float bA2, float bA3, float bA4, float bA5, float bA6, float bA7, float bA8, float bA9, float bA10, float bA11, float bA12, float bA13, float bA14, float bA15, float bA16, float bA17, float bA18, float bA19, float bA20, float bA21, float bA22) {
        this.bId = bId;
        this.bTime = bTime;
        this.bA0 = bA0;
        this.bA1 = bA1;
        this.bA2 = bA2;
        this.bA3 = bA3;
        this.bA4 = bA4;
        this.bA5 = bA5;
        this.bA6 = bA6;
        this.bA7 = bA7;
        this.bA8 = bA8;
        this.bA9 = bA9;
        this.bA10 = bA10;
        this.bA11 = bA11;
        this.bA12 = bA12;
        this.bA13 = bA13;
        this.bA14 = bA14;
        this.bA15 = bA15;
        this.bA16 = bA16;
        this.bA17 = bA17;
        this.bA18 = bA18;
        this.bA19 = bA19;
        this.bA20 = bA20;
        this.bA21 = bA21;
        this.bA22 = bA22;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public LocalDateTime getbTime() {
        return bTime;
    }

    public void setbTime(LocalDateTime bTime) {
        this.bTime = bTime;
    }

    public float getbA0() {
        return bA0;
    }

    public void setbA0(float bA0) {
        this.bA0 = bA0;
    }

    public float getbA1() {
        return bA1;
    }

    public void setbA1(float bA1) {
        this.bA1 = bA1;
    }

    public float getbA2() {
        return bA2;
    }

    public void setbA2(float bA2) {
        this.bA2 = bA2;
    }

    public float getbA3() {
        return bA3;
    }

    public void setbA3(float bA3) {
        this.bA3 = bA3;
    }

    public float getbA4() {
        return bA4;
    }

    public void setbA4(float bA4) {
        this.bA4 = bA4;
    }

    public float getbA5() {
        return bA5;
    }

    public void setbA5(float bA5) {
        this.bA5 = bA5;
    }

    public float getbA6() {
        return bA6;
    }

    public void setbA6(float bA6) {
        this.bA6 = bA6;
    }

    public float getbA7() {
        return bA7;
    }

    public void setbA7(float bA7) {
        this.bA7 = bA7;
    }

    public float getbA8() {
        return bA8;
    }

    public void setbA8(float bA8) {
        this.bA8 = bA8;
    }

    public float getbA9() {
        return bA9;
    }

    public void setbA9(float bA9) {
        this.bA9 = bA9;
    }

    public float getbA10() {
        return bA10;
    }

    public void setbA10(float bA10) {
        this.bA10 = bA10;
    }

    public float getbA11() {
        return bA11;
    }

    public void setbA11(float bA11) {
        this.bA11 = bA11;
    }

    public float getbA12() {
        return bA12;
    }

    public void setbA12(float bA12) {
        this.bA12 = bA12;
    }

    public float getbA13() {
        return bA13;
    }

    public void setbA13(float bA13) {
        this.bA13 = bA13;
    }

    public float getbA14() {
        return bA14;
    }

    public void setbA14(float bA14) {
        this.bA14 = bA14;
    }

    public float getbA15() {
        return bA15;
    }

    public void setbA15(float bA15) {
        this.bA15 = bA15;
    }

    public float getbA16() {
        return bA16;
    }

    public void setbA16(float bA16) {
        this.bA16 = bA16;
    }

    public float getbA17() {
        return bA17;
    }

    public void setbA17(float bA17) {
        this.bA17 = bA17;
    }

    public float getbA18() {
        return bA18;
    }

    public void setbA18(float bA18) {
        this.bA18 = bA18;
    }

    public float getbA19() {
        return bA19;
    }

    public void setbA19(float bA19) {
        this.bA19 = bA19;
    }

    public float getbA20() {
        return bA20;
    }

    public void setbA20(float bA20) {
        this.bA20 = bA20;
    }

    public float getbA21() {
        return bA21;
    }

    public void setbA21(float bA21) {
        this.bA21 = bA21;
    }

    public float getbA22() {
        return bA22;
    }

    public void setbA22(float bA22) {
        this.bA22 = bA22;
    }

    @Override
    public String toString() {
        return "buoy_Avg_7Day{" +
                "bId=" + bId +
                ", bTime=" + bTime +
                ", bA0=" + bA0 +
                ", bA1=" + bA1 +
                ", bA2=" + bA2 +
                ", bA3=" + bA3 +
                ", bA4=" + bA4 +
                ", bA5=" + bA5 +
                ", bA6=" + bA6 +
                ", bA7=" + bA7 +
                ", bA8=" + bA8 +
                ", bA9=" + bA9 +
                ", bA10=" + bA10 +
                ", bA11=" + bA11 +
                ", bA12=" + bA12 +
                ", bA13=" + bA13 +
                ", bA14=" + bA14 +
                ", bA15=" + bA15 +
                ", bA16=" + bA16 +
                ", bA17=" + bA17 +
                ", bA18=" + bA18 +
                ", bA19=" + bA19 +
                ", bA20=" + bA20 +
                ", bA21=" + bA21 +
                ", bA22=" + bA22 +
                '}';
    }
}
