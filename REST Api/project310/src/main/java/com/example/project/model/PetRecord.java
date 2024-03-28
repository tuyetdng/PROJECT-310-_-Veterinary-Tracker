package com.example.project.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "record")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class PetRecord {
	// Data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRecord;

	private Integer idPet;
	private String medicine;

	private String vaccine;

	private String veterinarian;

	public PetRecord() {
		idRecord = 0;
	}

	public PetRecord(Integer idPet, String medicine, String vaccine, String veterinarian) {

		this.idPet = idPet;
		this.medicine = medicine;
		this.vaccine = vaccine;
		this.veterinarian = veterinarian;
	}

	public Integer getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(Integer idRecord) {
		this.idRecord = idRecord;
	}

	public Integer getIdPet() {
		return idPet;
	}

	public void setIdPet(Integer idPet) {
		this.idPet = idPet;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public String getVeterinarian() {
		return veterinarian;
	}

	public void setVeterinarian(String veterinarian) {
		this.veterinarian = veterinarian;
	}

}
