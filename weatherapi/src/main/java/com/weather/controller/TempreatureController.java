package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.entity.Temprature;
import com.weather.service.ClimateService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/")
public class TempreatureController {
	
	
	@Autowired
    private ClimateService climateService;


    @GetMapping("/{lat}/{lon}")
    @ApiOperation("Returns list of all weather data in the system.")
    public Temprature getTemprature(@PathVariable("lat") String lat,@PathVariable("lon") String lon)
    {
     return climateService.getTemprature(lat,lon);
    }

}
