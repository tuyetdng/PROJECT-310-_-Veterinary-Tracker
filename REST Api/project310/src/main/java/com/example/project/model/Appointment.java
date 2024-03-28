package com.example.project.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointment")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Appointment {
	// Data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAppointment;

	private String time;
	private String ownerName;
	private String veterinarian;

	public Appointment() {
		idAppointment = 0;
	}

	public Appointment( String time, String ownerName, String veterinarian) {

		this.time = time;
		this.ownerName = ownerName;
		this.veterinarian = veterinarian;
	}

	public Integer getIdAppointment() {
		return idAppointment;
	}

	public void setIdAppointment(Integer idAppointment) {
		this.idAppointment = idAppointment;
	}

	public String getTime() {
		return  time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVeterinarian() {
		return veterinarian;
	}

	public void setVeterinarian(String veterinarian) {
		this.veterinarian = veterinarian;
	}

}
