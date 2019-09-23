package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("alert")
public class Alert {
    private Integer id;
    private LocalDateTime time;
    private Integer type;
    private String normal;
    private String name;
    private float unormal;

    @Override
    public String toString() {
        return "Alert{" +
                "id=" + id +
                ", time=" + time +
                ", type=" + type +
                ", normal='" + normal + '\'' +
                ", name='" + name + '\'' +
                ", unormal=" + unormal +
                '}';
    }

    public Alert(Integer id, LocalDateTime time, Integer type, String normal, String name, float unormal) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.normal = normal;
        this.name = name;
        this.unormal = unormal;
    }

    public Alert() {
    }

    public String getTypeName(int type){
        switch (type){
            case 1:
                return "值异常";
            case 2:
                return "值丢失";
            case 3:
                return "值无效";
            default:
                return null;
        }
    }

    public Alert(LocalDateTime time, Integer type, String normal, String name, float unormal) {
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
