package com.example.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "owneruser")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Owner {

	private String firstName;

	private String lastName;

	private String email;

	private String gender;

	private String phoneNum;

	private String password;

	private String appoinmentschedule;

	private Integer age;

	private Integer numOfPets;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOw;

	public Owner() {
		idOw = 0;
	}

	public Owner(String firstName, String lastName, String email, String gender, String phoneNum, String password,
			String appoinmentschedule, Integer age, Integer numOfPets) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.password = password;
		this.appoinmentschedule = appoinmentschedule;
		this.age = age;
		this.numOfPets = numOfPets;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAppoinmentschedule() {
		return appoinmentschedule;
	}

	public void setAppoinmentschedule(String appoinmentschedule) {
		this.appoinmentschedule = appoinmentschedule;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getNumOfPets() {
		return numOfPets;
	}

	public void setNumOfPets(Integer numOfPets) {
		this.numOfPets = numOfPets;
	}

	public Integer getIdOw() {
		return idOw;
	}

	public void setIdOw(Integer idOw) {
		this.idOw = idOw;
	}

}
