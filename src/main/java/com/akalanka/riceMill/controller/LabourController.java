package com.akalanka.riceMill.controller;

import com.akalanka.riceMill.model.DailyExpense;
import com.akalanka.riceMill.model.Labour;
import com.akalanka.riceMill.repository.DailyExpenseRepository;
import com.akalanka.riceMill.repository.LabourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/labour")
public class LabourController {
    @Autowired
    private LabourRepository labourRepository;

    @RequestMapping("/findAll")
    public List<Labour> findAll(){
        return  labourRepository.findAll();
    }

    @RequestMapping("/save")
    public Labour save(@RequestBody Labour labour){
        return labourRepository.save(labour);
    }
}
