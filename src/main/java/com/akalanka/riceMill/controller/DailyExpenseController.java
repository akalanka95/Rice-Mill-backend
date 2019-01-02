package com.akalanka.riceMill.controller;

import com.akalanka.riceMill.model.DailyExpense;
import com.akalanka.riceMill.repository.DailyExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/dailyExpense")
public class DailyExpenseController {
    @Autowired
    private DailyExpenseRepository dailyExpenseRepository;

    @RequestMapping("/findAll")
    public List<DailyExpense> findAll(){
        return  dailyExpenseRepository.findAll();
    }

    @RequestMapping("/save")
    public DailyExpense save(@RequestBody DailyExpense dailyExpense){
        return dailyExpenseRepository.save(dailyExpense);
    }

}
