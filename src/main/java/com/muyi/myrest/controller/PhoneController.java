package com.muyi.myrest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.muyi.myrest.entity.Phone;
import com.muyi.myrest.exception.PhoneException;
import com.muyi.myrest.service.PhoneService;

@RestController
public class PhoneController {

	@Autowired
	private PhoneService phoneService;
	
	public PhoneController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/phone/{id}")
	public ResponseEntity<Phone> getById(@PathVariable int id) {
		try {
			Phone ph = phoneService.getById(id);
				return new ResponseEntity<>(ph, HttpStatus.OK);
		} catch (PhoneException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/phone")
	public List<Phone> getAll(){
		return phoneService.getAllPhones();
	}
	
	@DeleteMapping("/phone/{id}")
	public ResponseEntity<?> deleteById(@PathVariable int id) {
		try {
			phoneService.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (PhoneException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/phone")
	public ResponseEntity<Phone> create(@RequestBody @Valid Phone phone) {
		System.out.println("============================ Got here..........");
		return new ResponseEntity<Phone>(phoneService.create(phone), HttpStatus.CREATED);
	}
	
	@PutMapping("/phone")
	public ResponseEntity<Phone> update(@RequestBody Phone phone) {
		try {
			Phone ph = phoneService.update(phone);
			return new ResponseEntity<Phone>(ph, HttpStatus.OK);
		} catch (PhoneException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
