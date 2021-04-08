package com.example.gestaohospitalar.util;


import com.example.gestaohospitalar.repository.DoctorRepository;
import com.example.gestaohospitalar.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Class para iniciar o sistema com alguns dados
 * */
//@Component
public class DummyData {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;



    //@PostConstruct
    public void savePosts(){

    }

}
