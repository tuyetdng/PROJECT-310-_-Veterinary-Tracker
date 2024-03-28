package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
