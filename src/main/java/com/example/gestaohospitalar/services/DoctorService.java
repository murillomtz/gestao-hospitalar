package com.example.gestaohospitalar.services;

import com.example.gestaohospitalar.models.DoctorModel;
import org.springframework.stereotype.Component;

import java.util.List;


public interface DoctorService {

	List<DoctorModel> findAll();
	DoctorModel findById(long id);
	DoctorModel save(DoctorModel doctor);
}
