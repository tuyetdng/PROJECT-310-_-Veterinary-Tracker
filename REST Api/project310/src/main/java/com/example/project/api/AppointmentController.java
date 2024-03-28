package com.example.project.api;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

import com.example.project.model.Appointment;
import com.example.project.repository.AppointmentRepository;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentRepository appointmentRepository;

	@GetMapping("/get-all-appointment")
	public List<Appointment> getAllAppointment() {
		return appointmentRepository.findAll();
	}

	@GetMapping("/get-all-appointment/{identity}")
	public Appointment getSigleAppointment(@PathVariable("identity") Integer idAppointment) {
		return appointmentRepository.findById(idAppointment).get();
	}

	@DeleteMapping("/removeAppointment/{idAppointment}")
	public boolean deleteAppointmentRow(@PathVariable("idAppointment") Integer idAppointment) {
		if (!appointmentRepository.findById(idAppointment).equals(Optional.empty())) {
			appointmentRepository.deleteById(idAppointment);
			return true;
		}
		return false;
	}

	@PutMapping("updateAppointment/{idappointment}")
	public Appointment updateappointment(@PathVariable("idAppointment") Integer idAppointment,
			@RequestBody Map<String, String> body) throws ParseException {
		Appointment current = appointmentRepository.findById(idAppointment).get();
		current.setOwnerName((body.get("ownerName")));
		current.setTime(body.get("time"));
		current.setVeterinarian(body.get("veterinarian"));
		appointmentRepository.save(current);

		return current;

	}

	@PostMapping("/addAppointment")
	public Appointment addAppointment(@RequestBody Map<String, String> body) throws ParseException {
		
		String time = body.get("time");
		String ownerName = body.get("ownerName");
		String veterinarian = body.get("veterinarian");
		Appointment appointment = new Appointment(time, ownerName, veterinarian);
		return appointmentRepository.save(appointment);
	}

}
