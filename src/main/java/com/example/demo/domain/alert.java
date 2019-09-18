package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("alert")
public class alert {
    private Integer id;
    private LocalDateTime time;
    private Integer type;
    private String normal;
    private String name;
    private float unormal;

    @Override
    public String toString() {
        return "alert{" +
                "id=" + id +
                ", time=" + time +
                ", type=" + type +
                ", normal='" + normal + '\'' +
                ", name='" + name + '\'' +
                ", unormal=" + unormal +
                '}';
    }

    public alert(Integer id, LocalDateTime time, Integer type, String normal, String name, float unormal) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.normal = normal;
        this.name = name;
        this.unormal = unormal;
    }

    public alert() {
    }

    public alert(LocalDateTime time, Integer type, String normal, String name, float unormal) {
        this.time = time;
        this.type = type;
        this.normal = normal;
        this.name = name;
        this.unormal = unormal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnormal() {
        return unormal;
    }

    public void setUnormal(float unormal) {
        this.unormal = unormal;
    }
}
