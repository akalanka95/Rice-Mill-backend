package com.akalanka.riceMill.controller;

import com.akalanka.riceMill.model.Labour;
import com.akalanka.riceMill.model.LabourSalaryToPaid;
import com.akalanka.riceMill.repository.LabourSalaryToPaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "api/labourSalaryToPaid")
public class LabourSalaryToPaidController {
    @Autowired
    private LabourSalaryToPaidRepository labourSalaryToPaidRepository;

    @RequestMapping("/findAll")
    public List<LabourSalaryToPaid> findAll(){
        return  labourSalaryToPaidRepository.findAll();
    }

    @RequestMapping("/save")
    public LabourSalaryToPaid save(@RequestBody LabourSalaryToPaid labourSalaryToPaid){
        return labourSalaryToPaidRepository.save(labourSalaryToPaid);
    }

    @RequestMapping("/findByLabour/{labourId}")
    public LabourSalaryToPaid findOne(@PathVariable("labourId") Integer labourId){
        return  labourSalaryToPaidRepository.findByLabour_Id(labourId);
    }
}
