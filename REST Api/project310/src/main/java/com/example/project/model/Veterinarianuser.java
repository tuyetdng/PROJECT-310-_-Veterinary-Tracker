package com.example.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "veterinarianuser")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Veterinarianuser {
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String phoneNum;
	private String password;
	private String appoinmentschedule;
	private Integer age;
	private String nameOfConsulatingRoom;
	private String quanlification;
	private String experience;
	private String identification;
	private String checkVaccine;
	private String history;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVer;

	public Veterinarianuser() {
		idVer = 0;
	}

	public Veterinarianuser(String firstName, String lastName, String email, String gender, String phoneNum,
			String password, String appoinmentschedule, Integer age, String nameOfConsulatingRoom,
			String quanlification, String experience, String identification, String checkVaccine, String history) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.password = password;
		this.appoinmentschedule = appoinmentschedule;
		this.age = age;
		this.nameOfConsulatingRoom = nameOfConsulatingRoom;
		this.quanlification = quanlification;
		this.experience = experience;
		this.identification = identification;
		this.checkVaccine = checkVaccine;
		this.history = history;
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

	public String getNameOfConsulatingRoom() {
		return nameOfConsulatingRoom;
	}

	public void setNameOfConsulatingRoom(String nameOfConsulatingRoom) {
		this.nameOfConsulatingRoom = nameOfConsulatingRoom;
	}

	public String getQuanlification() {
		return quanlification;
	}

	public void setQuanlification(String quanlification) {
		this.quanlification = quanlification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getCheckVaccine() {
		return checkVaccine;
	}

	public void setCheckVaccine(String checkVaccine) {
		this.checkVaccine = checkVaccine;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public Integer getIdVer() {
		return idVer;
	}

	public void setIdVer(Integer idVer) {
		this.idVer = idVer;
	}

	
	
}
