package com.example.demo.response;

import com.example.demo.domain.buoy;
import com.example.demo.domain.station;
import com.example.demo.domain.virulence;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataMsg implements Comparable<DataMsg> {
    private List<buoy> buoy;
    private List<virulence> virulence;
    private List<station> station;

    public DataMsg() {
        LocalDateTime now=LocalDateTime.now();
        buoy = new ArrayList<>();
        virulence = new ArrayList<>();
        station = new ArrayList<>();
        buoy.add(0, new buoy(now));
        virulence.add(0, new virulence(now));
        station.add(0, new station(now));
    }


    public DataMsg(List<com.example.demo.domain.buoy> buoy, List<com.example.demo.domain.virulence> virulence, List<com.example.demo.domain.station> station) {
        this.buoy = buoy;
        this.virulence = virulence;
        this.station = station;
    }

    public DataMsg(Integer dataId, List<com.example.demo.domain.buoy> buoy, List<com.example.demo.domain.virulence> virulence, List<com.example.demo.domain.station> station) {
        this.buoy = buoy;
        this.virulence = virulence;
        this.station = station;
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

    @Override
    public int compareTo(DataMsg o) {
        if (this.buoy.get(0).getbTime().compareTo(o.getBuoy().get(0).getbTime()) == 0) {
            System.out.println("buoy");
            if (this.station.get(0).getsTime().compareTo(o.getStation().get(0).getsTime()) == 0) {
                System.out.println("stat");
                if (this.virulence.get(0).getvTime().compareTo(o.getVirulence().get(0).getvTime()) == 0) {
                    System.out.println("viru");
                    return 0;
                }
            }
        }
        return -1;
    }
}
