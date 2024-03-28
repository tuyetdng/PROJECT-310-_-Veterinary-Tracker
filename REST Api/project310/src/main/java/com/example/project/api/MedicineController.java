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
import com.example.project.model.Medicine;
import com.example.project.repository.MedicineRepository;
import com.example.project.repository.VaccineRepository;

@RestController
public class MedicineController {
	@Autowired
	MedicineRepository medicineRepository;

	@GetMapping("/get-all-medicine")
	public List<Medicine> getAllMedicine() {
		return medicineRepository.findAll();
	}

	@GetMapping("/get-all-medicine/{identity}")
	public Medicine getSigleMedicine(@PathVariable("identity") Integer idMed) {
		return medicineRepository.findById(idMed).get();
	}

	@DeleteMapping("/removeMedicine/{id}")
	public boolean deleteMedicine(@PathVariable("id") Integer idMed) {
		if (!medicineRepository.findById(idMed).equals(Optional.empty())) {
			medicineRepository.deleteById(idMed);
			return true;
		}

		return false;
	}

	@PutMapping("/updateMedicine/{id}")
	public Medicine updateMedicine(@PathVariable("id") Integer idMed, @RequestBody Map<String, String> body) {
		Medicine current = medicineRepository.findById(idMed).get();
		current.setMedName(body.get("medName"));
		current.setAmount(body.get("amount"));
		current.setDosage(body.get("dosage"));
		current.setNotice(body.get("notice"));
		current.setTotal(Double.parseDouble(body.get("total")));
		medicineRepository.save(current);

		return current;
	}

	@PostMapping("/addMedicine")
	public Medicine addMedicine(@RequestBody Map<String, String> body) {
		String medName = body.get("medName");
		String amount = body.get("amount");
		String dosage = body.get("dosage");
		String notice = body.get("notice");
		double total = Double.parseDouble(body.get("total"));

		Medicine newVaccine = new Medicine(medName, amount, dosage, notice, total);

		return medicineRepository.save(newVaccine);

	}

}
