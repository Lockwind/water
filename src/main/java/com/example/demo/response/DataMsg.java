package com.example.demo.response;

import com.example.demo.domain.buoy;
import com.example.demo.domain.station;
import com.example.demo.domain.virulence;

import java.util.List;

public class DataMsg {
    private Integer DataId;
    private List<buoy> buoy;
    private List<virulence> virulence;
    private List<station> station;

    public DataMsg() {
    }

    public DataMsg(List<com.example.demo.domain.buoy> buoy, List<com.example.demo.domain.virulence> virulence, List<com.example.demo.domain.station> station) {
        this.buoy = buoy;
        this.virulence = virulence;
        this.station = station;
    }

    public DataMsg(Integer dataId, List<com.example.demo.domain.buoy> buoy, List<com.example.demo.domain.virulence> virulence, List<com.example.demo.domain.station> station) {
        DataId = dataId;
        this.buoy = buoy;
        this.virulence = virulence;
        this.station = station;
    }

    public Integer getDataId() {
        return DataId;
    }

    public void setDataId(Integer dataId) {
        DataId = dataId;
    }

    public List<com.example.demo.domain.buoy> getBuoy() {
        return buoy;
    }

    public void setBuoy(List<com.example.demo.domain.buoy> buoy) {
        this.buoy = buoy;
    }

    public List<com.example.demo.domain.virulence> getVirulence() {
        return virulence;
    }

    public void setVirulence(List<com.example.demo.domain.virulence> virulence) {
        this.virulence = virulence;
    }

    public List<com.example.demo.domain.station> getStation() {
        return station;
    }

    public void setStation(List<com.example.demo.domain.station> station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "DataMsg{" +
                "buoy=" + buoy +
                ", virulence=" + virulence +
                ", station=" + station +
                '}';
    }
}
