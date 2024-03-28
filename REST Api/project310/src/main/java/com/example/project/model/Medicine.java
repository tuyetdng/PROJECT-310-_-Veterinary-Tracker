package com.example.project.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Medicine {
	private String medName;
	private String amount;
	private String dosage;
	private String notice;
	private double total;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMed;

	public Medicine() {
		idMed = 0;
	}

	public Medicine(String medName, String amount, String dosage, String notice, double total) {
		this.medName = medName;
		this.amount = amount;
		this.dosage = dosage;
		this.notice = notice;
		this.total = total;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Integer getIdMed() {
		return idMed;
	}

	public void setIdMed(Integer idMed) {
		this.idMed = idMed;
	}


	
	
	
}
