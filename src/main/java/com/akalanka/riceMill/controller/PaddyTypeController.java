package com.akalanka.riceMill.controller;


import com.akalanka.riceMill.model.LabourSalary;
import com.akalanka.riceMill.model.PaddyType;
import com.akalanka.riceMill.repository.LabourSalaryRepository;
import com.akalanka.riceMill.repository.PaddyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/paddyType")
public class PaddyTypeController {
    @Autowired
    private PaddyTypeRepository PaddyTypeRepository;

    @RequestMapping("/findAll")
    public List<PaddyType> findAll(){
        return  PaddyTypeRepository.findAll();
    }

    @RequestMapping("/save")
    public PaddyType save(@RequestBody PaddyType paddyType){
        return PaddyTypeRepository.save(paddyType);
    }
}
