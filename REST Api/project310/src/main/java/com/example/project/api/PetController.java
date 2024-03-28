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

import com.example.project.model.Pet;
import com.example.project.repository.PetRepository;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@RestController
public class PetController {

	@Autowired
	PetRepository petRepository;

	@GetMapping("/get-all-pet")
	public List<Pet> getAllPet() {
		return petRepository.findAll();
	}

	@GetMapping("/get-all-pet/{identity}")
	public Pet getSiglePet(@PathVariable("identity") Integer idPet) {
		return petRepository.findById(idPet).get();
	}

	@DeleteMapping("/removePet/{idPet}")
	public boolean deletePetRow(@PathVariable("idPet") Integer idPet) {
		if (!petRepository.findById(idPet).equals(Optional.empty())) {
			petRepository.deleteById(idPet);
			return true;
		}
		return false;
	}

	@PutMapping("updatePet/{idPet}")
	public Pet updateOwner(@PathVariable("idPet") Integer idPet, @RequestBody Map<String, String> body) {
		Pet current = petRepository.findById(idPet).get();
		current.setAge(Integer.parseInt(body.get("age")));
		current.setHeight(body.get("height"));
		current.setGender(body.get("gender"));
		current.setHistory(body.get("history"));
		current.setIdentification(body.get("identification"));
		current.setImg(body.get("img"));
		current.setName(body.get("name"));
		current.setPetType((body.get("petType")));
		current.setVaccine(body.get("vaccine"));
		current.setWeight(body.get("weight"));
		petRepository.save(current);
		return current;

	}

	@PostMapping("/addPet")
	public Pet addPet(@RequestBody Map<String, String> body) {

		String img = body.get("img");
		String petType = body.get("petType");
		String name = body.get("name");
		Integer age = Integer.parseInt(body.get("age"));
		String weight = body.get("weight");
		String height = body.get("height");
		String gender = body.get("gender");
		String identification = body.get("identification");
		String vaccine = (body.get("vaccine"));
		String history = (body.get("history"));

		Pet pet = new Pet(img, gender, petType, name, age, weight, height, identification, vaccine, history);
		return petRepository.save(pet);
	}

}
