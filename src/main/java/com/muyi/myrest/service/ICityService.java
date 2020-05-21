package com.muyi.myrest.service;

import java.util.List;

import com.muyi.myrest.entity.City;

public interface ICityService {
	City findById(Long id);
    City save(City city);
    List<City> findAll();
}
