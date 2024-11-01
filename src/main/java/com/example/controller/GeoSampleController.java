package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.GeoSample;
import com.example.service.GeoSampleService;

@RestController
@RequestMapping("/geo-sample")
public class GeoSampleController {

    @Autowired
    private GeoSampleService geoSampleService;

    @GetMapping("/{id}")
    public GeoSample getGeoSample(@PathVariable Long id) {
        return geoSampleService.getGeoSampleById(id);
    }
}
