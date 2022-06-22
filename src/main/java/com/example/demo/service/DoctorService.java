package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;

public interface DoctorService {
	
	public String save(Doctor doctor);
	
	public List<Doctor> getAllDoctor();
	
	public Doctor getDoctorById(int id);
	
	
	
}
