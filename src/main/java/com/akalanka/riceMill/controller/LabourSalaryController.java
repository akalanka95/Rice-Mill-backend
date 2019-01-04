package com.akalanka.riceMill.controller;

import com.akalanka.riceMill.model.LabourSalary;
import com.akalanka.riceMill.model.LabourSalaryToPaid;
import com.akalanka.riceMill.repository.LabourSalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/labourSalary")
public class LabourSalaryController {
    @Autowired
    private LabourSalaryRepository labourSalaryRepository;

    @RequestMapping("/findAll")
    public List<LabourSalary> findAll(){
        return  labourSalaryRepository.findAll();
    }

    @RequestMapping("/save")
    public LabourSalary save(@RequestBody LabourSalary labourSalary){
        return labourSalaryRepository.save(labourSalary);
    }

    @RequestMapping("/findByLabour/{labourId}")
    public Iterable<LabourSalary> findOne(@PathVariable("labourId") Integer labourId){
        return  labourSalaryRepository.findByLabour_Id(labourId);
    }
}
