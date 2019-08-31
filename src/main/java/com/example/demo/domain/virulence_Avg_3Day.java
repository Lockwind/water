package com.example.demo.domain;

import java.time.LocalDateTime;

public class virulence_Avg_3Day {
    private int vId;
    private float vVirus;
    private LocalDateTime vTime;

    public virulence_Avg_3Day() {
    }

    public virulence_Avg_3Day(float vVirus, LocalDateTime vTime) {
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    public virulence_Avg_3Day(int vId, float vVirus, LocalDateTime vTime) {
        this.vId = vId;
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    @Override
    public String toString() {
        return "virulence_Avg_3Day{" +
                "vId=" + vId +
                ", vVirus=" + vVirus +
                ", vTime=" + vTime +
                '}';
    }

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    public float getvVirus() {
        return vVirus;
    }

    public void setvVirus(float vVirus) {
        this.vVirus = vVirus;
    }

    public LocalDateTime getvTime() {
        return vTime;
    }

    public void setvTime(LocalDateTime vTime) {
        this.vTime = vTime;
    }
}
