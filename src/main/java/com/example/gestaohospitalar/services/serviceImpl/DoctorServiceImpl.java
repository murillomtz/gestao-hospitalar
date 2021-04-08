package com.example.gestaohospitalar.services.serviceImpl;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.services.DoctorService;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {
    @Override
    public List<DoctorModel> findAll() {

        //return REPOSITORI.findAll();
        return null;
    }

    @Override
    public DoctorModel findById(long id) {
        // return codeblogRepository.findById(id).get();
        return null;
    }

    @Override
    public DoctorModel save(DoctorModel doctor) {
        //return codeblogRepository.save(post);
        return null;
    }
}
