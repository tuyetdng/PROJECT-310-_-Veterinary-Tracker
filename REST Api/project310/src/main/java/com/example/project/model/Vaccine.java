package com.example.project.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vaccine")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Vaccine {
	private String vacName;
	private String date;
	private String dose;
	private double total;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVac;

	public Vaccine() {
		idVac = 0;
	}
	public Vaccine(String vacName, String date, String dose, double total) {
		this.vacName = vacName;
		this.date = date;
		this.dose = dose;
		this.total = total;
	}

	
	public Integer getIdVac() {
		return idVac;
	}
	public void setIdVac(Integer idVac) {
		this.idVac = idVac;
	}
	public String getVacName() {
		return vacName;
	}

	public void setVacName(String vacName) {
		this.vacName = vacName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}
