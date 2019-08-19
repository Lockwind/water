package com.example.demo.response;


import com.example.demo.domain.buoy;
import com.example.demo.domain.station;
import com.example.demo.domain.virulence;

import java.util.List;

public class Message<T> {
    private int Code;
    private String Msg;
    private T Date;
    private List<buoy> buoy;
    private List<station> station;
    private List<virulence> virulence;

    public Message() {
    }

    public Message(int code, String msg, T date) {
        Code = code;
        Msg = msg;
        Date = date;
    }

    public Message(String msg, T date, List<com.example.demo.domain.buoy> buoy, List<com.example.demo.domain.station> station, List<com.example.demo.domain.virulence> virulence) {
        Msg = msg;
        Date = date;
        this.buoy = buoy;
        this.station = station;
        this.virulence = virulence;
    }

    public Message(int code, String msg, T date, List<com.example.demo.domain.buoy> buoy, List<com.example.demo.domain.station> station, List<com.example.demo.domain.virulence> virulence) {
        Code = code;
        Msg = msg;
        Date = date;
        this.buoy = buoy;
        this.station = station;
        this.virulence = virulence;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public T getDate() {
        return Date;
    }

    public void setDate(T date) {
        Date = date;
    }

    public List<com.example.demo.domain.buoy> getBuoy() {
        return buoy;
    }

    public void setBuoy(List<com.example.demo.domain.buoy> buoy) {
        this.buoy = buoy;
    }

    public List<station> getStation() {
        return station;
    }

    public void setStation(List<station> station) {
        this.station = station;
    }

    public List<virulence> getVirulence() {
        return virulence;
    }

    public void setVirulence(List<virulence> virulence) {
        this.virulence = virulence;
    }

    @Override
    public String toString() {
        return "Message{" +
                "Code=" + Code +
                ", Msg='" + Msg + '\'' +
                ", Date=" + Date +
                ", buoy=" + buoy +
                ", station=" + station +
                ", virulence=" + virulence +
                '}';
    }
}
