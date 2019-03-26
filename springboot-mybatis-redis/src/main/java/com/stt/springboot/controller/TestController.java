package com.stt.springboot.controller;


import com.stt.springboot.mapper.CityMapper;
import com.stt.springboot.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestController {

    @Autowired
    CityMapper cityMapper;


    @RequestMapping("/getCity")
    public City getCity(){
        City city = cityMapper.selectByPrimaryKey(1);
        return city;
    }
}
