package com.example.demo.domain;

public class buoy {
    private Integer bId;
    private Double PH;
    private Integer Wen;


    @Override
    public String toString() {
        return "buoy{" +
                "bId=" + bId +
                ", PH=" + PH +
                ", Wen=" + Wen +
                '}';
    }

    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public Double getPH() {
        return PH;
    }

    public void setPH(Double PH) {
        this.PH = PH;
    }

    public Integer getWen() {
        return Wen;
    }

    public void setWen(Integer wen) {
        Wen = wen;
    }
}
