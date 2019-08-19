package com.example.demo.Service.Impl;

import com.example.demo.Service.VirulenceService;
import com.example.demo.dao.VirulenceDao;
import com.example.demo.domain.virulence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VirulenceServiceDao implements VirulenceService {
    @Autowired
    private VirulenceDao virulenceDao;
    @Override
    public List<virulence> findByNewTime() {
        return virulenceDao.findByNewTime();
    }
}
