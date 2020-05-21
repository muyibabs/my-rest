package com.muyi.myrest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muyi.myrest.entity.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
