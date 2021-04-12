package com.example.gestaohospitalar.services;

import java.util.List;

import com.example.gestaohospitalar.models.DoctorModel;

public interface DoctorService {

	List<DoctorModel> findAll();

	DoctorModel findById(long id);

	DoctorModel save(DoctorModel doctor);

	void deleteById(Long id);
}
