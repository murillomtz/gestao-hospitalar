package com.example.gestaohospitalar.repository;

import com.example.gestaohospitalar.models.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {

    //Aqui temos metodos prontos, ocultos
/*
findAll
findById
delete
*/


}
