package com.example.gestaohospitalar.repository;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    //Aqui temos metodos prontos, ocultos
/*
findAll
findById
delete
*/


}
