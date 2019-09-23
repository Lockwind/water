package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Buoy_Avg_3Day {
    private Integer bId;                       //浮标数据id
    private LocalDateTime bTime;           //记录时间
    private Float b001;                     //酸碱度
    private Float b003;                     //总悬浮物
    private Float b010;                     //生化需氧量
    private Float b011;                     //化学需氧量
    private Float b015;                     //总有机碳
    private Float b060;                     //氨氮
    private Float bA00;              //磷酸盐
    private Float bA01;       //水温
    private Float bA02;           //电导率
    private Float bA03;              //浊度
    private Float bA04;        //溶解氧
    private Float bA05;              //石油类
    private Float bA06;         //蓝藻
    private Float bA07;            //叶绿素
    private Float bA08;        //硝氮
    private Float bA09;        //亚硝氮
    private Float bA10;               //降雨量
    private Float bA11;         //气温
    private Float bA12;               //气压
    private Float bA13;       //相对湿度
    private Float bA14;     //累计雨量
    private Float bA15;       //平均风速
    private Float bA16;   //平均风向

    public Buoy_Avg_3Day() {
    }

    public Buoy_Avg_3Day(Integer bId, LocalDateTime bTime, Float b001, Float b003, Float b010, Float b011, Float b015, Float b060, Float bA00, Float bA01, Float bA02, Float bA03, Float bA04, Float bA05, Float bA06, Float bA07, Float bA08, Float bA09, Float bA10, Float bA11, Float bA12, Float bA13, Float bA14, Float bA15, Float bA16) {
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

    public Buoy_Avg_3Day(LocalDateTime bTime, Float b001, Float b003, Float b010, Float b011, Float b015, Float b060, Float bA00, Float bA01, Float bA02, Float bA03, Float bA04, Float bA05, Float bA06, Float bA07, Float bA08, Float bA09, Float bA10, Float bA11, Float bA12, Float bA13, Float bA14, Float bA15, Float bA16) {
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

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public LocalDateTime getbTime() {
        return bTime;
    }

    public void setbTime(LocalDateTime bTime) {
        this.bTime = bTime;
    }

    public Float getB001() {
        return b001;
    }

    public void setB001(Float b001) {
        this.b001 = b001;
    }

    public Float getB003() {
        return b003;
    }

    public void setB003(Float b003) {
        this.b003 = b003;
    }

    public Float getB010() {
        return b010;
    }

    public void setB010(Float b010) {
        this.b010 = b010;
    }

    public Float getB011() {
        return b011;
    }

    public void setB011(Float b011) {
        this.b011 = b011;
    }

    public Float getB015() {
        return b015;
    }

    public void setB015(Float b015) {
        this.b015 = b015;
    }

    public Float getB060() {
        return b060;
    }

    public void setB060(Float b060) {
        this.b060 = b060;
    }

    public Float getbA00() {
        return bA00;
    }

    public void setbA00(Float bA00) {
        this.bA00 = bA00;
    }

    public Float getbA01() {
        return bA01;
    }

    public void setbA01(Float bA01) {
        this.bA01 = bA01;
    }

    public Float getbA02() {
        return bA02;
    }

    public void setbA02(Float bA02) {
        this.bA02 = bA02;
    }

    public Float getbA03() {
        return bA03;
    }

    public void setbA03(Float bA03) {
        this.bA03 = bA03;
    }

    public Float getbA04() {
        return bA04;
    }

    public void setbA04(Float bA04) {
        this.bA04 = bA04;
    }

    public Float getbA05() {
        return bA05;
    }

    public void setbA05(Float bA05) {
        this.bA05 = bA05;
    }

    public Float getbA06() {
        return bA06;
    }

    public void setbA06(Float bA06) {
        this.bA06 = bA06;
    }

    public Float getbA07() {
        return bA07;
    }

    public void setbA07(Float bA07) {
        this.bA07 = bA07;
    }

    public Float getbA08() {
        return bA08;
    }

    public void setbA08(Float bA08) {
        this.bA08 = bA08;
    }

    public Float getbA09() {
        return bA09;
    }

    public void setbA09(Float bA09) {
        this.bA09 = bA09;
    }

    public Float getbA10() {
        return bA10;
    }

    public void setbA10(Float bA10) {
        this.bA10 = bA10;
    }

    public Float getbA11() {
        return bA11;
    }

    public void setbA11(Float bA11) {
        this.bA11 = bA11;
    }

    public Float getbA12() {
        return bA12;
    }

    public void setbA12(Float bA12) {
        this.bA12 = bA12;
    }

    public Float getbA13() {
        return bA13;
    }

    public void setbA13(Float bA13) {
        this.bA13 = bA13;
    }

    public Float getbA14() {
        return bA14;
    }

    public void setbA14(Float bA14) {
        this.bA14 = bA14;
    }

    public Float getbA15() {
        return bA15;
    }

    public void setbA15(Float bA15) {
        this.bA15 = bA15;
    }

    public Float getbA16() {
        return bA16;
    }

    public void setbA16(Float bA16) {
        this.bA16 = bA16;
    }
}
