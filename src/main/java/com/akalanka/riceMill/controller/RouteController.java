package com.akalanka.riceMill.controller;


import com.akalanka.riceMill.model.PaddyType;
import com.akalanka.riceMill.model.Route;
import com.akalanka.riceMill.repository.PaddyTypeRepository;
import com.akalanka.riceMill.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/route")
public class RouteController {
    @Autowired
    private RouteRepository routeRepository;

    @RequestMapping("/findAll")
    public List<Route> findAll(){
        return  routeRepository.findAll();
    }

    @RequestMapping("/save")
    public Route save(@RequestBody Route route){
        return routeRepository.save(route);
    }
}
