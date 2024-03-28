package com.example.project.api;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.PetRecord;

import com.example.project.repository.RecordRepository;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@RestController
public class RecordController {

	@Autowired
	RecordRepository recordRepository;

	@GetMapping("/get-all-record")
	public List<PetRecord> getAllRecord() {
		return recordRepository.findAll();
	}

	@GetMapping("/get-all-record/{identity}")
	public PetRecord getSigleRecord(@PathVariable("identity") Integer idRecord) {
		return recordRepository.findById(idRecord).get();
	}

	@DeleteMapping("/removeRecord/{idRecord}")
	public boolean deleteRecordRow(@PathVariable("idRecord") Integer idRecord) {
		if (!recordRepository.findById(idRecord).equals(Optional.empty())) {
			recordRepository.deleteById(idRecord);
			return true;
		}
		return false;
	}

	@PutMapping("updateRecord/{idRecord}")
	public PetRecord updateRecord(@PathVariable("idRecord") Integer idRecord, @RequestBody Map<String, String> body) {
		PetRecord current = recordRepository.findById(idRecord).get();
		current.setIdPet(Integer.parseInt(body.get("idPet")));
		current.setMedicine(body.get("medicine"));
		current.setVaccine(body.get("vaccine"));
		current.setVeterinarian(body.get("veterinarian"));
		recordRepository.save(current);

		return current;

	}

	@PostMapping("/addRecord")
	public PetRecord addRecord(@RequestBody Map<String, String> body) {

		Integer idPet = Integer.parseInt(body.get("idPet"));
		String medicine = body.get("medicine");
		String vaccine = body.get("vaccine");
		String veterinarian = body.get("veterinarian");

		PetRecord record = new PetRecord(idPet, medicine, vaccine, veterinarian);
		return recordRepository.save(record);
	}

}
