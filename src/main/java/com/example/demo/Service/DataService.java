package com.example.demo.Service;

import com.example.demo.domain.buoy;
import com.example.demo.domain.station;
import com.example.demo.domain.virulence;
import com.example.demo.response.DataMsg;
import com.example.demo.response.Message;

import java.util.List;

public interface DataService {
    DataMsg findByNewTime();
}
