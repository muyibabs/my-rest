package com.muyi.myrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muyi.myrest.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
