package com.akalanka.riceMill.controller;

import com.akalanka.riceMill.model.PaddyStock;
import com.akalanka.riceMill.model.PaddyType;
import com.akalanka.riceMill.repository.PaddyStockRepository;
import com.akalanka.riceMill.repository.PaddyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/paddyStock")
public class PaddyStockController {
    @Autowired
    private PaddyStockRepository paddyStockRepository;

    @RequestMapping("/findAll")
    public List<PaddyStock> findAll(){
        return  paddyStockRepository.findAll();
    }

    @RequestMapping("/save")
    public PaddyStock save(@RequestBody PaddyStock paddyStock){
        return paddyStockRepository.save(paddyStock);
    }
}
