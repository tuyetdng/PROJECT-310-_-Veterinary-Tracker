package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
