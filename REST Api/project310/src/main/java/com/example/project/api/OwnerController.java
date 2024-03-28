package com.example.project.api;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Owner;
import com.example.project.repository.OwnerRepository;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@RestController
public class OwnerController {

	@Autowired
	OwnerRepository ownerRepository;

	@GetMapping("/get-all-owner")
	public List<Owner> getAllOwner() {
		return ownerRepository.findAll();
	}

	@GetMapping("/get-all-owner/{ientity}")
	public Owner getSigleOwner(@PathVariable("ientity") Integer idOw) {
		return ownerRepository.findById(idOw).get();
	}
	
	@DeleteMapping("/removeOwner/{id}")
	@CrossOrigin(origins = "http://127.0.0.1:3000", allowedHeaders = "*")
	public boolean deleteOwnerRow(@PathVariable("id") Integer idOw) {
		if (!ownerRepository.findById(idOw).equals(Optional.empty())) {
			ownerRepository.deleteById(idOw);
			return true;
		}

		return false;
	}

	@PutMapping("updateOwner/{id}")
	public Owner updateOwner(@PathVariable("id") Integer idOw, @RequestBody Map<String, String> body) {
		Owner current = ownerRepository.findById(idOw).get();
		current.setAge(Integer.parseInt(body.get("age")));
		current.setAppoinmentschedule(body.get("appoinmentschedule"));
		current.setEmail(body.get("email"));
		current.setFirstName(body.get("firstName"));
		current.setGender(body.get("gender"));
		current.setLastName(body.get("lastName"));
		current.setNumOfPets(Integer.parseInt(body.get("numOfPets")));
		current.setPassword(body.get("password"));
		current.setPhoneNum(body.get("phoneNum"));
		ownerRepository.save(current);
		return current;

	}

	@PostMapping("/addOwner")
	public Owner addOwner(@RequestBody Map<String, String> body) {

		String firstName = body.get("firstName");
		String lastName = body.get("lastName");
		String email = body.get("email");
		String gender = body.get("gender");
		String phoneNum = body.get("phoneNum");
		String password = body.get("password");
		String appoinmentschedule = body.get("appoinmentschedule");
		Integer age = Integer.parseInt(body.get("age"));
		Integer numOfPets = Integer.parseInt(body.get("numOfPets"));
		
		Owner newOwner = new Owner(firstName, lastName, email, gender, phoneNum, password, appoinmentschedule, age, numOfPets);
		
		return ownerRepository.save(newOwner);
	}

}
