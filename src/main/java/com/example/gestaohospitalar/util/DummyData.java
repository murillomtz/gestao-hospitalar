package com.example.gestaohospitalar.util;


import com.example.gestaohospitalar.enums.RoleEnum;
import com.example.gestaohospitalar.models.Appointmet;
import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.models.Unit;
import com.example.gestaohospitalar.repository.DoctorRepository;
import com.example.gestaohospitalar.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


/**
 * Class para iniciar o sistema com alguns dados
 */
//@Component
public class DummyData {

    @SuppressWarnings("unused")
    @Autowired
    private PatientRepository patientRepository;//TODO-FIX-ME reclama que não está sendo usado
    @SuppressWarnings("unused")
    @Autowired
    private DoctorRepository doctorRepository;//TODO-FIX-ME reclama que não está sendo usado


    //@PostConstruct
    public void savePosts() {
        Unit u1 = new Unit("Bairro da paz", "123456-85", "spot??", "3333-6666");









    }
}
