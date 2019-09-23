package com.example.demo.response;

import com.example.demo.domain.Buoy;
import com.example.demo.domain.Station;
import com.example.demo.domain.Virulence;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataMsg implements Comparable<DataMsg> {
    private List<Buoy> buoy;
    private List<Virulence> virulence;
    private List<Station> station;

    public DataMsg() {
        LocalDateTime now=LocalDateTime.now();
        buoy = new ArrayList<>();
        virulence = new ArrayList<>();
        station = new ArrayList<>();
        buoy.add(0, new Buoy(now));
        virulence.add(0, new Virulence(now));
        station.add(0, new Station(now));
    }


    public DataMsg(List<Buoy> buoy, List<Virulence> virulence, List<Station> station) {
        this.buoy = buoy;
        this.virulence = virulence;
        this.station = station;
    }

    public DataMsg(Integer dataId, List<Buoy> buoy, List<Virulence> virulence, List<Station> station) {
        this.buoy = buoy;
        this.virulence = virulence;
        this.station = station;
    }

    public List<Buoy> getBuoy() {
        return buoy;
    }

    public void setBuoy(List<Buoy> buoy) {
        this.buoy = buoy;
    }

    public List<Virulence> getVirulence() {
        return virulence;
    }

    public void setVirulence(List<Virulence> virulence) {
        this.virulence = virulence;
    }

    public List<Station> getStation() {
        return station;
    }

    public void setStation(List<Station> station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "DataMsg{" +
                "Buoy=" + buoy +
                ", Virulence=" + virulence +
                ", Station=" + station +
                '}';
    }

    @Override
    public int compareTo(DataMsg o) {
        if (this.buoy.get(0).getbTime().compareTo(o.getBuoy().get(0).getbTime()) == 0) {
            if (this.station.get(0).getsTime().compareTo(o.getStation().get(0).getsTime()) == 0) {
                if (this.virulence.get(0).getvTime().compareTo(o.getVirulence().get(0).getvTime()) == 0) {
                    return 0;
                }
            }
        }
        return -1;
    }
}
