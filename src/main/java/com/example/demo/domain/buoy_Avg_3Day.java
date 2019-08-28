package com.example.demo.domain;

import java.time.LocalDateTime;

public class buoy_Avg_3Day {
    private int bId;                       //浮标数据id
    private LocalDateTime bTime;           //记录时间
    private float b001;                     //酸碱度
    private float b003;                     //总悬浮物
    private float b010;                     //生化需氧量
    private float b011;                     //化学需氧量
    private float b015;                     //总有机碳
    private float b060;                     //氨氮
    private float bA00;              //磷酸盐
    private float bA01;       //水温
    private float bA02;           //电导率
    private float bA03;              //浊度
    private float bA04;        //溶解氧
    private float bA05;              //石油类
    private float bA06;         //蓝藻
    private float bA07;            //叶绿素
    private float bA08;        //硝氮
    private float bA09;        //亚硝氮
    private float bA10;               //降雨量
    private float bA11;         //气温
    private float bA12;               //气压
    private float bA13;       //相对湿度
    private float bA14;     //累计雨量
    private float bA15;       //平均风速
    private float bA16;   //平均风向

    public buoy_Avg_3Day() {
    }

    public buoy_Avg_3Day(LocalDateTime bTime, float b001, float b003, float b010, float b011, float b015, float b060, float bA00, float bA01, float bA02, float bA03, float bA04, float bA05, float bA06, float bA07, float bA08, float bA09, float bA10, float bA11, float bA12, float bA13, float bA14, float bA15, float bA16) {
        this.bTime = bTime;
        this.b001 = b001;
        this.b003 = b003;
        this.b010 = b010;
        this.b011 = b011;
        this.b015 = b015;
        this.b060 = b060;
        this.bA00 = bA00;
        this.bA01 = bA01;
        this.bA02 = bA02;
        this.bA03 = bA03;
        this.bA04 = bA04;
        this.bA05 = bA05;
        this.bA06 = bA06;
        this.bA07 = bA07;
        this.bA08 = bA08;
        this.bA09 = bA09;
        this.bA10 = bA10;
        this.bA11 = bA11;
        this.bA12 = bA12;
        this.bA13 = bA13;
        this.bA14 = bA14;
        this.bA15 = bA15;
        this.bA16 = bA16;
    }

    public buoy_Avg_3Day(int bId, LocalDateTime bTime, float b001, float b003, float b010, float b011, float b015, float b060, float bA00, float bA01, float bA02, float bA03, float bA04, float bA05, float bA06, float bA07, float bA08, float bA09, float bA10, float bA11, float bA12, float bA13, float bA14, float bA15, float bA16) {
        this.bId = bId;
        this.bTime = bTime;
        this.b001 = b001;
        this.b003 = b003;
        this.b010 = b010;
        this.b011 = b011;
        this.b015 = b015;
        this.b060 = b060;
        this.bA00 = bA00;
        this.bA01 = bA01;
        this.bA02 = bA02;
        this.bA03 = bA03;
        this.bA04 = bA04;
        this.bA05 = bA05;
        this.bA06 = bA06;
        this.bA07 = bA07;
        this.bA08 = bA08;
        this.bA09 = bA09;
        this.bA10 = bA10;
        this.bA11 = bA11;
        this.bA12 = bA12;
        this.bA13 = bA13;
        this.bA14 = bA14;
        this.bA15 = bA15;
        this.bA16 = bA16;
    }

    @Override
    public String toString() {
        return "buoy_Avg_3Day{" +
                "bId=" + bId +
                ", bTime=" + bTime +
                ", b001=" + b001 +
                ", b003=" + b003 +
                ", b010=" + b010 +
                ", b011=" + b011 +
                ", b015=" + b015 +
                ", b060=" + b060 +
                ", bA00=" + bA00 +
                ", bA01=" + bA01 +
                ", bA02=" + bA02 +
                ", bA03=" + bA03 +
                ", bA04=" + bA04 +
                ", bA05=" + bA05 +
                ", bA06=" + bA06 +
                ", bA07=" + bA07 +
                ", bA08=" + bA08 +
                ", bA09=" + bA09 +
                ", bA10=" + bA10 +
                ", bA11=" + bA11 +
                ", bA12=" + bA12 +
                ", bA13=" + bA13 +
                ", bA14=" + bA14 +
                ", bA15=" + bA15 +
                ", bA16=" + bA16 +
                '}';
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

    public float getB001() {
        return b001;
    }

    public void setB001(float b001) {
        this.b001 = b001;
    }

    public float getB003() {
        return b003;
    }

    public void setB003(float b003) {
        this.b003 = b003;
    }

    public float getB010() {
        return b010;
    }

    public void setB010(float b010) {
        this.b010 = b010;
    }

    public float getB011() {
        return b011;
    }

    public void setB011(float b011) {
        this.b011 = b011;
    }

    public float getB015() {
        return b015;
    }

    public void setB015(float b015) {
        this.b015 = b015;
    }

    public float getB060() {
        return b060;
    }

    public void setB060(float b060) {
        this.b060 = b060;
    }

    public float getbA00() {
        return bA00;
    }

    public void setbA00(float bA00) {
        this.bA00 = bA00;
    }

    public float getbA01() {
        return bA01;
    }

    public void setbA01(float bA01) {
        this.bA01 = bA01;
    }

    public float getbA02() {
        return bA02;
    }

    public void setbA02(float bA02) {
        this.bA02 = bA02;
    }

    public float getbA03() {
        return bA03;
    }

    public void setbA03(float bA03) {
        this.bA03 = bA03;
    }

    public float getbA04() {
        return bA04;
    }

    public void setbA04(float bA04) {
        this.bA04 = bA04;
    }

    public float getbA05() {
        return bA05;
    }

    public void setbA05(float bA05) {
        this.bA05 = bA05;
    }

    public float getbA06() {
        return bA06;
    }

    public void setbA06(float bA06) {
        this.bA06 = bA06;
    }

    public float getbA07() {
        return bA07;
    }

    public void setbA07(float bA07) {
        this.bA07 = bA07;
    }

    public float getbA08() {
        return bA08;
    }

    public void setbA08(float bA08) {
        this.bA08 = bA08;
    }

    public float getbA09() {
        return bA09;
    }

    public void setbA09(float bA09) {
        this.bA09 = bA09;
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
}
