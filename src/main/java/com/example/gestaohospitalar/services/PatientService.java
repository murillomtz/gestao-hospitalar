package com.example.gestaohospitalar.services;

import java.util.List;

import com.example.gestaohospitalar.models.Patient;


public interface PatientService {

	List<Patient> findAll();
	Patient findById(long id);
	Patient save(Patient post);
}
