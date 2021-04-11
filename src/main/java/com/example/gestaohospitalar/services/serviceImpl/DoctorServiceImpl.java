package com.example.gestaohospitalar.services.serviceImpl;

import java.util.List;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.repository.DoctorRepository;
import com.example.gestaohospitalar.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<DoctorModel> findAll() {

        return doctorRepository.findAll();

    }

    @Override
    public DoctorModel findById(long id) {
        return doctorRepository.findById(id).get();

    }

    @Override
    public DoctorModel save(DoctorModel doctor) {

        DoctorModel doctorToSave = new DoctorModel(doctor.getName(), doctor.getCpf(), doctor.getBirthDate(), doctor.getEspecialidade(), doctor.getRMS(), null);

        return doctorRepository.save(doctorToSave);

    }

    @Override
    public void delete(DoctorModel doctor) {
        DoctorModel toRemove = doctorRepository.findById(doctor.getId()).get();

        doctorRepository.delete(toRemove);

    }
}
