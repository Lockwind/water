package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Alias("viru")
public class virulence {
    private Integer vId;
    private Float vVirus;
    private LocalDateTime vTime;

    public virulence(LocalDateTime vTime) {
        this.vTime = vTime;
    }

    public virulence() {
    }

    public virulence(Float vVirus, LocalDateTime vTime) {
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    public virulence(Integer vId, Float vVirus, LocalDateTime vTime) {
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
        return "virulence{" +
                "vId=" + vId +
                ", vVirus=" + vVirus +
                ", vTime=" + vTime +
                '}';
    }
}
