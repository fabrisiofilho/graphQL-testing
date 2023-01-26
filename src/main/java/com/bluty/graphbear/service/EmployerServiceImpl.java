package com.bluty.graphbear.service;

import com.bluty.graphbear.entity.EmployerEntity;
import com.bluty.graphbear.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerServiceImpl implements  EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    @Override
    public List<EmployerEntity> findAll() {
        return employerRepository.findAll();
    }

}
