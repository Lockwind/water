package com.example.demo.Service;

import com.example.demo.domain.Alert;


public interface AlertService {
    boolean saveAlert(Alert alert);

    Alert selByAlert(Alert alert);
}
