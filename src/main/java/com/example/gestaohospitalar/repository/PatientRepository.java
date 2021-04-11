package com.example.gestaohospitalar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestaohospitalar.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
