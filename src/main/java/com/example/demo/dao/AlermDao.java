package com.example.demo.dao;

import com.example.demo.domain.Alert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlermDao {
    int addAlerm(Alert alert);

    List<Alert> selById(Alert alert);
}
