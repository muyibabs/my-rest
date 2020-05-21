package com.muyi.myrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muyi.myrest.dao.CityRepository;
import com.muyi.myrest.entity.City;
import com.muyi.myrest.exception.CityNotFoundException;
import com.muyi.myrest.exception.NoDataFoundException;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City findById(Long id) {

        return cityRepository.findById(id)
                .orElseThrow(() -> new CityNotFoundException(id));
    }

    @Override
    public City save(City city) {

        return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {

    	List<City> cities = (List<City>) cityRepository.findAll();

        if (cities.isEmpty()) {

            throw new NoDataFoundException();
        }

        return cities;
    }
}