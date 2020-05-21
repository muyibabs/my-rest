package com.muyi.myrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muyi.myrest.dao.PhoneRepository;
import com.muyi.myrest.entity.Phone;
import com.muyi.myrest.exception.PhoneException;

@Service
public class PhoneServiceImpl implements PhoneService{

	@Autowired
	private PhoneRepository repo;
	
	public PhoneServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Phone getById(int id) throws PhoneException {
		// TODO Auto-generated method stub
		Optional<Phone> optFind = repo.findById(id);
		if(optFind.isPresent())
			return optFind.get();
		else
			throw new PhoneException("Not found");
	}

	@Override
	public List<Phone> getAllPhones() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Phone> getPhonesByBrandName(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) throws PhoneException {
		// TODO Auto-generated method stub
		Optional<Phone> opt = repo.findById(id);
		if(opt.isPresent())
			repo.deleteById(id);
		else
			throw new PhoneException("Not found");
	}

	@Override
	public Phone update(Phone phone) throws PhoneException {
		// TODO Auto-generated method stub
		Optional<Phone> opt = repo.findById(phone.getId());
		if(opt.isPresent())
			return repo.save(phone);
		else
			throw new PhoneException("Not found");
	}

	@Override
	public Phone create(Phone phone) {
		// TODO Auto-generated method stub
		return repo.save(phone);
	}

}
