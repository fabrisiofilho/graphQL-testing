package com.bluty.graphbear.controller;

import com.bluty.graphbear.entity.EmployerEntity;
import com.bluty.graphbear.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployerGraphQLController {

    @Autowired
    private EmployerService employerService;

    @QueryMapping
    public List<EmployerEntity> getEmployers() {
        return employerService.findAll();
    }


}
