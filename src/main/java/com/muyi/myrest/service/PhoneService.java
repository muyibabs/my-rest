package com.muyi.myrest.service;

import java.util.List;

import com.muyi.myrest.entity.Phone;
import com.muyi.myrest.exception.PhoneException;

public interface PhoneService {
	Phone getById(int id) throws PhoneException;
	List<Phone> getAllPhones();
	List<Phone> getPhonesByBrandName(String brand);
	void deleteById(int id) throws PhoneException;
	Phone update(Phone phone) throws PhoneException;
	Phone create(Phone phone);
}
