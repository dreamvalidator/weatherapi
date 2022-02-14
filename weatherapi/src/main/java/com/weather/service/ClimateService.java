package com.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.entity.Temprature;
import com.weather.repository.TempratureRepo;


@Service
public class ClimateService {
	
	private String apiid="06d0cbbe77ddda365601f6afa64c06fd";
    @Autowired
    TempratureRepo tempratureRepo;
    @Autowired
    RestTemplate restTemplate;
    public Temprature getTemprature(String lat,String lon)
    {
        Temprature temp = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+apiid, Temprature.class);
        System.out.println(temp);
        Temprature save = tempratureRepo.save(temp);
        System.out.println(save);
        return save;
//Praveen Gandu hai
    }

}
