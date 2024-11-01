package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.GeoSample;
import com.example.repository.GeoSampleRepository;

@Service
public class GeoSampleService {

    @Autowired
    private GeoSampleRepository geoSampleRepository;
    
    public GeoSample getGeoSampleById(Long id) {
        return geoSampleRepository.findGeoSampleById(id);
    }
}
