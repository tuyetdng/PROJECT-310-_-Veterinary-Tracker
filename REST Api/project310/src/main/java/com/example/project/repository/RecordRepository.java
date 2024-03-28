package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.PetRecord;

public interface RecordRepository extends JpaRepository<PetRecord, Integer> {

}
