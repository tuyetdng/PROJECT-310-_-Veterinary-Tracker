package com.example.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Pet {
	// Data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPet;

	private String img;
	private String gender;
	
	

	private String petType;

	private String name;

	private Integer age;

	private String weight;

	private String height;

	private String identification;

	private String vaccine;
	private String history;

	public Pet() {
		idPet=0;
	}

	public Pet(String img, String gender, String petType, String name, Integer age, String weight, String height,
			String identification, String vaccine, String history) {
	
		this.img = img;
		this.gender = gender;
		this.petType = petType;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.identification = identification;
		this.vaccine = vaccine;
		this.history = history;
	}

	public Integer getIdPet() {
		return idPet;
	}

	public void setIdPet(Integer idPet) {
		this.idPet = idPet;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	
	

}
