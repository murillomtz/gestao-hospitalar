package com.example.gestaohospitalar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestaohospitalar.models.DoctorModel;

public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {

}
