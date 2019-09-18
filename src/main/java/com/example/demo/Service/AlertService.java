package com.example.demo.Service;

import com.example.demo.domain.alert;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AlertService {
    boolean saveAlert(alert alert);

    alert selByAlert(alert alert);
}
