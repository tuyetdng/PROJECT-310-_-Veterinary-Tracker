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
import com.example.project.model.Vaccine;
import com.example.project.model.Veterinarianuser;
import com.example.project.repository.VaccineRepository;

@RestController
public class VaccineController {
	@Autowired
	VaccineRepository vaccineRepository;

	@GetMapping("/get-all-vaccine")
	public List<Vaccine> getAllVaccine() {
		return vaccineRepository.findAll();
	}

	@GetMapping("/get-all-vaccine/{identity}")
	public Vaccine getSigleVaccine(@PathVariable("identity") Integer idVac) {
		return vaccineRepository.findById(idVac).get();
	}

	@DeleteMapping("/removeVaccine/{id}")
	public boolean deleteVaccine(@PathVariable("id") Integer idVac) {
		if (!vaccineRepository.findById(idVac).equals(Optional.empty())) {
			vaccineRepository.deleteById(idVac);
			return true;
		}

		return false;
	}

	@PutMapping("/updateVaccine/{id}")
	public Vaccine updateVaccine(@PathVariable("id") Integer idVac, @RequestBody Map<String, String> body) {
		Vaccine current = vaccineRepository.findById(idVac).get();
		current.setVacName(body.get("vacName"));
		current.setDate(body.get("date"));
		current.setDose(body.get("dose"));
		current.setTotal(Double.parseDouble(body.get("total")));
		vaccineRepository.save(current);

		return current;
	}

	@PostMapping("/addVaccine")
	public Vaccine addVaccine(@RequestBody Map<String, String> body) {
		String vacName = body.get("vacName");
		String date = body.get("date");
		String dose = body.get("dose");
		double total = Double.parseDouble(body.get("total"));

		Vaccine newVaccine = new Vaccine(vacName, date, dose, total);

		return vaccineRepository.save(newVaccine);

	}

}
