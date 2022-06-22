package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService service;
	
	@PostMapping("/doctor")
	public ResponseEntity<?> saveDoctor (@RequestBody Doctor doctor) {
		
	String message=	service.save(doctor);
	return  ResponseEntity.ok(message);
	}
	
	@GetMapping("/doctor/get-all")
	public ResponseEntity<?> getAllDoctors(){
		
		List<Doctor> list= service.getAllDoctor();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/doctor/{id}")
	public ResponseEntity<?> getDoctorById( @PathVariable int id){
		
		Doctor doctor = service.getDoctorById(id);
		return ResponseEntity.ok(doctor);
		
		
	}
	

}
