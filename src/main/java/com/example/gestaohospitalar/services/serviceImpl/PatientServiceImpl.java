package com.example.gestaohospitalar.services.serviceImpl;

import java.util.List;

import com.example.gestaohospitalar.models.Patient;
import com.example.gestaohospitalar.services.PatientService;

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
