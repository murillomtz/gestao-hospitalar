package com.example.gestaohospitalar.util;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.gestaohospitalar.repository.DoctorRepository;
import com.example.gestaohospitalar.repository.PatientRepository;


/**
 * Class para iniciar o sistema com alguns dados
 * */
//@Component
public class DummyData {

    @SuppressWarnings("unused")
	@Autowired
    private PatientRepository patientRepository;//TODO-FIX-ME reclama que não está sendo usado
    @SuppressWarnings("unused")
	@Autowired
    private DoctorRepository doctorRepository;//TODO-FIX-ME reclama que não está sendo usado



    //@PostConstruct
    public void savePosts(){

    }

}
