package com.example.demo.response;

import com.example.demo.domain.buoy_Avg_24Hour;
import com.example.demo.domain.station_Avg_24Hour;
import com.example.demo.domain.virulence_Avg_24Hour;

import java.util.List;

public class Data_24hourMsg {
    List<buoy_Avg_24Hour> buoy24Hours;
    List<station_Avg_24Hour> station24Hours;
    List<virulence_Avg_24Hour> virulence24Hours;

    public Data_24hourMsg() {
    }

    public Data_24hourMsg(List<buoy_Avg_24Hour> buoy24Hours, List<station_Avg_24Hour> station24Hours, List<virulence_Avg_24Hour> virulence24Hours) {
        this.buoy24Hours = buoy24Hours;
        this.station24Hours = station24Hours;
        this.virulence24Hours = virulence24Hours;
    }

    public List<buoy_Avg_24Hour> getBuoy24Hours() {
        return buoy24Hours;
    }

    public void setBuoy24Hours(List<buoy_Avg_24Hour> buoy24Hours) {
        this.buoy24Hours = buoy24Hours;
    }

    public List<station_Avg_24Hour> getStation24Hours() {
        return station24Hours;
    }

    public void setStation24Hours(List<station_Avg_24Hour> station24Hours) {
        this.station24Hours = station24Hours;
    }

    public List<virulence_Avg_24Hour> getVirulence24Hours() {
        return virulence24Hours;
    }

    public void setVirulence24Hours(List<virulence_Avg_24Hour> virulence24Hours) {
        this.virulence24Hours = virulence24Hours;
    }
}
