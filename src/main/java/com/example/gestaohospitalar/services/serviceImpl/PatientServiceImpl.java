package com.example.gestaohospitalar.services.serviceImpl;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.models.Patient;
import com.example.gestaohospitalar.services.DoctorService;
import com.example.gestaohospitalar.services.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService {
    @Override
    public List<Patient> findAll() {

        //return REPOSITORI.findAll();
        return null;
    }

    @Override
    public Patient findById(long id) {
        // return codeblogRepository.findById(id).get();
        return null;
    }

    @Override
    public Patient save(Patient doctor) {
        //return codeblogRepository.save(post);
        return null;
    }
}
