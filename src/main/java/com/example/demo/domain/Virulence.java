package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Alias("viru")
public class Virulence {
    private Integer vId;
    private Float vVirus;
    private LocalDateTime vTime;

    public Virulence(LocalDateTime vTime) {
        this.vTime = vTime;
    }

    public Virulence() {
    }

    public Virulence(Float vVirus, LocalDateTime vTime) {
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    public Virulence(Integer vId, Float vVirus, LocalDateTime vTime) {
        this.vId = vId;
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Float getvVirus() {
        return vVirus;
    }

    public void setvVirus(Float vVirus) {
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
        return "Virulence{" +
                "vId=" + vId +
                ", vVirus=" + vVirus +
                ", vTime=" + vTime +
                '}';
    }
}
