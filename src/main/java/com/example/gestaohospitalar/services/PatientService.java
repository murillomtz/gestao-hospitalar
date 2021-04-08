package com.example.gestaohospitalar.services;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.models.Patient;

import java.util.List;


public interface PatientService {

	List<Patient> findAll();
	Patient findById(long id);
	Patient save(Patient post);
}
