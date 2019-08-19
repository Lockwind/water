package com.example.demo.domain;

import java.time.LocalDateTime;

public class buoy {
    private int bId;                        //浮标数据id
    private double bPH;                     //酸碱度
    private double bTotalSuspendedSolids;   //总悬浮物
    private double bBOD;                    //生化需氧量
    private double bCOD;                    //化学需氧量
    private double bTOC;                    //总有机碳
    private double bAmmoniaNitrogen;        //氨氮
    private double bPhosphate;              //磷酸盐
    private double bWaterTemperature;       //水温
    private double bConductivity;           //电导率
    private double bTurbidity;              //浊度
    private double bDissolvedOxygen;        //溶解氧
    private double bPetroleum;              //石油类
    private double bBlueGreenAlgae;         //蓝藻
    private double bChlorophyll;            //叶绿素
    private double bNitrateNitrogen;        //硝氮
    private double bNitrousNitrogen;        //亚硝氮
    private double bRainfall;               //降雨量
    private double bAirTemperature;         //气温
    private double bPressure;               //气压
    private double bRelativeHumidity;       //相对湿度
    private double bCumulativeRainfall;     //累计雨量
    private double bAverageWindSpeed;       //平均风速
    private double bAverageWindDirection;   //平均风向
    private LocalDateTime bTime;            //记录时间

    public buoy() {
    }

    public buoy(double bPH, double bTotalSuspendedSolids, double bBOD, double bCOD, double bTOC, double bAmmoniaNitrogen, double bPhosphate, double bWaterTemperature, double bConductivity, double bTurbidity, double bDissolvedOxygen, double bPetroleum, double bBlueGreenAlgae, double bChlorophyll, double bNitrateNitrogen, double bNitrousNitrogen, double bRainfall, double bAirTemperature, double bPressure, double bRelativeHumidity, double bCumulativeRainfall, double bAverageWindSpeed, double bAverageWindDirection, LocalDateTime bTime) {
        this.bPH = bPH;
        this.bTotalSuspendedSolids = bTotalSuspendedSolids;
        this.bBOD = bBOD;
        this.bCOD = bCOD;
        this.bTOC = bTOC;
        this.bAmmoniaNitrogen = bAmmoniaNitrogen;
        this.bPhosphate = bPhosphate;
        this.bWaterTemperature = bWaterTemperature;
        this.bConductivity = bConductivity;
        this.bTurbidity = bTurbidity;
        this.bDissolvedOxygen = bDissolvedOxygen;
        this.bPetroleum = bPetroleum;
        this.bBlueGreenAlgae = bBlueGreenAlgae;
        this.bChlorophyll = bChlorophyll;
        this.bNitrateNitrogen = bNitrateNitrogen;
        this.bNitrousNitrogen = bNitrousNitrogen;
        this.bRainfall = bRainfall;
        this.bAirTemperature = bAirTemperature;
        this.bPressure = bPressure;
        this.bRelativeHumidity = bRelativeHumidity;
        this.bCumulativeRainfall = bCumulativeRainfall;
        this.bAverageWindSpeed = bAverageWindSpeed;
        this.bAverageWindDirection = bAverageWindDirection;
        this.bTime = bTime;
    }

    public buoy(int bId, double bPH, double bTotalSuspendedSolids, double bBOD, double bCOD, double bTOC, double bAmmoniaNitrogen, double bPhosphate, double bWaterTemperature, double bConductivity, double bTurbidity, double bDissolvedOxygen, double bPetroleum, double bBlueGreenAlgae, double bChlorophyll, double bNitrateNitrogen, double bNitrousNitrogen, double bRainfall, double bAirTemperature, double bPressure, double bRelativeHumidity, double bCumulativeRainfall, double bAverageWindSpeed, double bAverageWindDirection, LocalDateTime bTime) {
        this.bId = bId;
        this.bPH = bPH;
        this.bTotalSuspendedSolids = bTotalSuspendedSolids;
        this.bBOD = bBOD;
        this.bCOD = bCOD;
        this.bTOC = bTOC;
        this.bAmmoniaNitrogen = bAmmoniaNitrogen;
        this.bPhosphate = bPhosphate;
        this.bWaterTemperature = bWaterTemperature;
        this.bConductivity = bConductivity;
        this.bTurbidity = bTurbidity;
        this.bDissolvedOxygen = bDissolvedOxygen;
        this.bPetroleum = bPetroleum;
        this.bBlueGreenAlgae = bBlueGreenAlgae;
        this.bChlorophyll = bChlorophyll;
        this.bNitrateNitrogen = bNitrateNitrogen;
        this.bNitrousNitrogen = bNitrousNitrogen;
        this.bRainfall = bRainfall;
        this.bAirTemperature = bAirTemperature;
        this.bPressure = bPressure;
        this.bRelativeHumidity = bRelativeHumidity;
        this.bCumulativeRainfall = bCumulativeRainfall;
        this.bAverageWindSpeed = bAverageWindSpeed;
        this.bAverageWindDirection = bAverageWindDirection;
        this.bTime = bTime;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public double getbPH() {
        return bPH;
    }

    public void setbPH(double bPH) {
        this.bPH = bPH;
    }

    public double getbTotalSuspendedSolids() {
        return bTotalSuspendedSolids;
    }

    public void setbTotalSuspendedSolids(double bTotalSuspendedSolids) {
        this.bTotalSuspendedSolids = bTotalSuspendedSolids;
    }

    public double getbBOD() {
        return bBOD;
    }

    public void setbBOD(double bBOD) {
        this.bBOD = bBOD;
    }

    public double getbCOD() {
        return bCOD;
    }

    public void setbCOD(double bCOD) {
        this.bCOD = bCOD;
    }

    public double getbTOC() {
        return bTOC;
    }

    public void setbTOC(double bTOC) {
        this.bTOC = bTOC;
    }

    public double getbAmmoniaNitrogen() {
        return bAmmoniaNitrogen;
    }

    public void setbAmmoniaNitrogen(double bAmmoniaNitrogen) {
        this.bAmmoniaNitrogen = bAmmoniaNitrogen;
    }

    public double getbPhosphate() {
        return bPhosphate;
    }

    public void setbPhosphate(double bPhosphate) {
        this.bPhosphate = bPhosphate;
    }

    public double getbWaterTemperature() {
        return bWaterTemperature;
    }

    public void setbWaterTemperature(double bWaterTemperature) {
        this.bWaterTemperature = bWaterTemperature;
    }

    public double getbConductivity() {
        return bConductivity;
    }

    public void setbConductivity(double bConductivity) {
        this.bConductivity = bConductivity;
    }

    public double getbTurbidity() {
        return bTurbidity;
    }

    public void setbTurbidity(double bTurbidity) {
        this.bTurbidity = bTurbidity;
    }

    public double getbDissolvedOxygen() {
        return bDissolvedOxygen;
    }

    public void setbDissolvedOxygen(double bDissolvedOxygen) {
        this.bDissolvedOxygen = bDissolvedOxygen;
    }

    public double getbPetroleum() {
        return bPetroleum;
    }

    public void setbPetroleum(double bPetroleum) {
        this.bPetroleum = bPetroleum;
    }

    public double getbBlueGreenAlgae() {
        return bBlueGreenAlgae;
    }

    public void setbBlueGreenAlgae(double bBlueGreenAlgae) {
        this.bBlueGreenAlgae = bBlueGreenAlgae;
    }

    public double getbChlorophyll() {
        return bChlorophyll;
    }

    public void setbChlorophyll(double bChlorophyll) {
        this.bChlorophyll = bChlorophyll;
    }

    public double getbNitrateNitrogen() {
        return bNitrateNitrogen;
    }

    public void setbNitrateNitrogen(double bNitrateNitrogen) {
        this.bNitrateNitrogen = bNitrateNitrogen;
    }

    public double getbNitrousNitrogen() {
        return bNitrousNitrogen;
    }

    public void setbNitrousNitrogen(double bNitrousNitrogen) {
        this.bNitrousNitrogen = bNitrousNitrogen;
    }

    public double getbRainfall() {
        return bRainfall;
    }

    public void setbRainfall(double bRainfall) {
        this.bRainfall = bRainfall;
    }

    public double getbAirTemperature() {
        return bAirTemperature;
    }

    public void setbAirTemperature(double bAirTemperature) {
        this.bAirTemperature = bAirTemperature;
    }

    public double getbPressure() {
        return bPressure;
    }

    public void setbPressure(double bPressure) {
        this.bPressure = bPressure;
    }

    public double getbRelativeHumidity() {
        return bRelativeHumidity;
    }

    public void setbRelativeHumidity(double bRelativeHumidity) {
        this.bRelativeHumidity = bRelativeHumidity;
    }

    public double getbCumulativeRainfall() {
        return bCumulativeRainfall;
    }

    public void setbCumulativeRainfall(double bCumulativeRainfall) {
        this.bCumulativeRainfall = bCumulativeRainfall;
    }

    public double getbAverageWindSpeed() {
        return bAverageWindSpeed;
    }

    public void setbAverageWindSpeed(double bAverageWindSpeed) {
        this.bAverageWindSpeed = bAverageWindSpeed;
    }

    public double getbAverageWindDirection() {
        return bAverageWindDirection;
    }

    public void setbAverageWindDirection(double bAverageWindDirection) {
        this.bAverageWindDirection = bAverageWindDirection;
    }

    public LocalDateTime getbTime() {
        return bTime;
    }

    public void setbTime(LocalDateTime bTime) {
        this.bTime = bTime;
    }

    @Override
    public String toString() {
        return "buoy{" +
                "bId=" + bId +
                ", bPH=" + bPH +
                ", bTotalSuspendedSolids=" + bTotalSuspendedSolids +
                ", bBOD=" + bBOD +
                ", bCOD=" + bCOD +
                ", bTOC=" + bTOC +
                ", bAmmoniaNitrogen=" + bAmmoniaNitrogen +
                ", bPhosphate=" + bPhosphate +
                ", bWaterTemperature=" + bWaterTemperature +
                ", bConductivity=" + bConductivity +
                ", bTurbidity=" + bTurbidity +
                ", bDissolvedOxygen=" + bDissolvedOxygen +
                ", bPetroleum=" + bPetroleum +
                ", bBlueGreenAlgae=" + bBlueGreenAlgae +
                ", bChlorophyll=" + bChlorophyll +
                ", bNitrateNitrogen=" + bNitrateNitrogen +
                ", bNitrousNitrogen=" + bNitrousNitrogen +
                ", bRainfall=" + bRainfall +
                ", bAirTemperature=" + bAirTemperature +
                ", bPressure=" + bPressure +
                ", bRelativeHumidity=" + bRelativeHumidity +
                ", bCumulativeRainfall=" + bCumulativeRainfall +
                ", bAverageWindSpeed=" + bAverageWindSpeed +
                ", bAverageWindDirection=" + bAverageWindDirection +
                ", bTime=" + bTime +
                '}';
    }


}
