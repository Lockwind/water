package com.example.demo.domain;

import java.time.LocalDateTime;

public class station {
    private int sId;
    private double  sRainfall;
    private double  sAirTemperature;
    private double  sPressure;
    private double  sRelativeHumidity;
    private double  sCumulativeRainfall;
    private double  sAverageWindSpeed;
    private double  sAverageWindDirection;
    private LocalDateTime  sTime;

    public station() {
    }

    public station(double sRainfall, double sAirTemperature, double sPressure, double sRelativeHumidity, double sCumulativeRainfall, double sAverageWindSpeed, double sAverageWindDirection, LocalDateTime sTime) {
        this.sRainfall = sRainfall;
        this.sAirTemperature = sAirTemperature;
        this.sPressure = sPressure;
        this.sRelativeHumidity = sRelativeHumidity;
        this.sCumulativeRainfall = sCumulativeRainfall;
        this.sAverageWindSpeed = sAverageWindSpeed;
        this.sAverageWindDirection = sAverageWindDirection;
        this.sTime = sTime;
    }

    public station(int sId, double sRainfall, double sAirTemperature, double sPressure, double sRelativeHumidity, double sCumulativeRainfall, double sAverageWindSpeed, double sAverageWindDirection, LocalDateTime sTime) {
        this.sId = sId;
        this.sRainfall = sRainfall;
        this.sAirTemperature = sAirTemperature;
        this.sPressure = sPressure;
        this.sRelativeHumidity = sRelativeHumidity;
        this.sCumulativeRainfall = sCumulativeRainfall;
        this.sAverageWindSpeed = sAverageWindSpeed;
        this.sAverageWindDirection = sAverageWindDirection;
        this.sTime = sTime;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public double getsRainfall() {
        return sRainfall;
    }

    public void setsRainfall(double sRainfall) {
        this.sRainfall = sRainfall;
    }

    public double getsAirTemperature() {
        return sAirTemperature;
    }

    public void setsAirTemperature(double sAirTemperature) {
        this.sAirTemperature = sAirTemperature;
    }

    public double getsPressure() {
        return sPressure;
    }

    public void setsPressure(double sPressure) {
        this.sPressure = sPressure;
    }

    public double getsRelativeHumidity() {
        return sRelativeHumidity;
    }

    public void setsRelativeHumidity(double sRelativeHumidity) {
        this.sRelativeHumidity = sRelativeHumidity;
    }

    public double getsCumulativeRainfall() {
        return sCumulativeRainfall;
    }

    public void setsCumulativeRainfall(double sCumulativeRainfall) {
        this.sCumulativeRainfall = sCumulativeRainfall;
    }

    public double getsAverageWindSpeed() {
        return sAverageWindSpeed;
    }

    public void setsAverageWindSpeed(double sAverageWindSpeed) {
        this.sAverageWindSpeed = sAverageWindSpeed;
    }

    public double getsAverageWindDirection() {
        return sAverageWindDirection;
    }

    public void setsAverageWindDirection(double sAverageWindDirection) {
        this.sAverageWindDirection = sAverageWindDirection;
    }

    public LocalDateTime getsTime() {
        return sTime;
    }

    public void setsTime(LocalDateTime sTime) {
        this.sTime = sTime;
    }

    @Override
    public String toString() {
        return "station{" +
                "sId=" + sId +
                ", sRainfall=" + sRainfall +
                ", sAirTemperature=" + sAirTemperature +
                ", sPressure=" + sPressure +
                ", sRelativeHumidity=" + sRelativeHumidity +
                ", sCumulativeRainfall=" + sCumulativeRainfall +
                ", sAverageWindSpeed=" + sAverageWindSpeed +
                ", sAverageWindDirection=" + sAverageWindDirection +
                ", sTime=" + sTime +
                '}';
    }
}
