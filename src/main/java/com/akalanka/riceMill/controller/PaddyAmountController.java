package com.akalanka.riceMill.controller;

import com.akalanka.riceMill.model.PaddyAmount;
import com.akalanka.riceMill.repository.PaddyAmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/paddyAmount")
public class PaddyAmountController {
    @Autowired
    private PaddyAmountRepository paddyAmountRepository;
    @RequestMapping("/findAll")
    public List<PaddyAmount> findAll(){
        return  paddyAmountRepository.findAll();
    }

    @RequestMapping("/save")
    public PaddyAmount save(@RequestBody PaddyAmount paddyAmount){
        return paddyAmountRepository.save(paddyAmount);
    }
}
