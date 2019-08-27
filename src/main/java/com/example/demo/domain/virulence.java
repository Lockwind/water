package com.example.demo.domain;

import java.time.LocalDateTime;

public class virulence {
    private int vId;
    private float vVirus;
    private LocalDateTime vTime;

    public virulence() {

    }

    public virulence(float vVirus, LocalDateTime vTime) {
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    public virulence(int vId, float vVirus, LocalDateTime vTime) {
        this.vId = vId;
        this.vVirus = vVirus;
        this.vTime = vTime;
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

    @Override
    public String toString() {
        return "virulence{" +
                "vId=" + vId +
                ", vVirus=" + vVirus +
                ", vTime=" + vTime +
                '}';
    }
}
