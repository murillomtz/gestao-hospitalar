package com.example.gestaohospitalar.services.serviceImpl;

import java.util.List;

import com.example.gestaohospitalar.models.Patient;
import com.example.gestaohospitalar.repository.PatientRepository;
import com.example.gestaohospitalar.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> findAll() {

        return patientRepository.findAll();

    }

    @Override
    public Patient findById(long id) {
        return patientRepository.findById(id).get();

    }

    @Override
    public Patient save(Patient patient) {

        Patient patientToSave = new Patient(patient.getName(), patient.getCpf(), patient.getBirthDate(),
         null, patient.getCep(),
        null);

        return patientRepository.save(patientToSave);

    }

    @Override
    public void deleteById(Long id) {
        patientRepository.deleteById(id);
        return;
    }
}
