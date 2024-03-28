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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.model.Veterinarianuser;
import com.example.project.repository.VeterinarianuserRepository;

@RestController
public class VeterinarianuserController {
	
	@Autowired
	VeterinarianuserRepository verinarianuserRepository;
	
	@GetMapping("/get-all-veterinarianuser")
		public List<Veterinarianuser> getAllVeterinarianuser() {
		return verinarianuserRepository.findAll();
	}
	
	@GetMapping("/get-all-veterinarianuser/{identity}")
	public Veterinarianuser getSigleVeterinarianuser(@PathVariable("identity") Integer idVer) {
		return verinarianuserRepository.findById(idVer).get();
	}

	@DeleteMapping("/removeVeterinarianuser/{id}")
	public boolean deleteVeterinarianuserrRow(@PathVariable("id") Integer idVer) {
		if (!verinarianuserRepository.findById(idVer).equals(Optional.empty())) {
			verinarianuserRepository.deleteById(idVer);
			return true;
		}

		return false;
	}
	
	@PutMapping("/updateVeterinarianuser/{id}")
	public Veterinarianuser updateVeterinarianuser(@PathVariable("id") Integer idVer, @RequestBody Map<String, String> body) {
		Veterinarianuser current = verinarianuserRepository.findById(idVer).get();
		current.setAge(Integer.parseInt(body.get("age")));
		current.setAppoinmentschedule(body.get("appoinmentschedule"));
		current.setEmail(body.get("email"));
		current.setFirstName(body.get("firstName"));
		current.setGender(body.get("gender"));
		current.setLastName(body.get("lastName"));
		current.setPassword(body.get("password"));
		current.setPhoneNum(body.get("phoneNum"));
		current.setNameOfConsulatingRoom(body.get("nameOfConsulatingRoom"));
		current.setQuanlification(body.get("quanlification"));
		current.setExperience(body.get("experience"));
		current.setIdentification(body.get("identification"));
		current.setCheckVaccine(body.get("checkVaccine"));
		current.setHistory(body.get("history"));

		verinarianuserRepository.save(current);
		return current;

	}

	@PostMapping("/addVeterinarianuser")
	public Veterinarianuser addVeterinarianuser(@RequestBody Map<String, String> body) {

		String firstName = body.get("firstName");
		String lastName = body.get("lastName");
		String email = body.get("email");
		String gender = body.get("gender");
		String phoneNum = body.get("phoneNum");
		String password = body.get("password");
		String appoinmentschedule = body.get("appoinmentschedule");
		Integer age = Integer.parseInt(body.get("age"));
		String nameOfConsulatingRoom = body.get("nameOfConsulatingRoom");
		String quanlification = body.get("quanlification");
		String experience = body.get("experience");
		String identification = body.get("identification");
		String checkVaccine = body.get("checkVaccine");
		String history = body.get("history");
		
		Veterinarianuser newVeterinarianuser = new Veterinarianuser(firstName, lastName, email, gender, phoneNum, password, appoinmentschedule, age, nameOfConsulatingRoom, quanlification, experience, identification, checkVaccine, history);
		
		return verinarianuserRepository.save(newVeterinarianuser);
	}
}
