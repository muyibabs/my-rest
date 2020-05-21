package com.muyi.myrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Phone {

	@Id
	@GeneratedValue
	private int id;
	
	@NotEmpty
	private String name;
	private String model;
	private String brand;
	private String releaseYear;
	private String category;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, String model, String brand, String releaseYear, String category) {
		super();
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.releaseYear = releaseYear;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
