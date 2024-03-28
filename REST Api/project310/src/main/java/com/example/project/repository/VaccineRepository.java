package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Vaccine;

public interface VaccineRepository extends JpaRepository<Vaccine, Integer> {

}
