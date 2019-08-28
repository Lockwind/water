package com.example.demo.Service;

import com.example.demo.domain.buoy;
import com.example.demo.domain.station;
import com.example.demo.domain.virulence;

import java.util.List;

public interface DataService {
    List<buoy> findByBuoyNewTime();
    List<station> findByStationNewTime();
    List<virulence> findByVirulenceNewTime();
}
