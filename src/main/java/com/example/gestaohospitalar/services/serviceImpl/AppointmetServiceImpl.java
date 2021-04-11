package com.example.gestaohospitalar.services.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.example.gestaohospitalar.models.Appointmet;
import com.example.gestaohospitalar.repository.AppointmetRepository;
import com.example.gestaohospitalar.services.AppointmetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmetServiceImpl implements AppointmetService {

  @Autowired
  private AppointmetRepository appointmentRepository;

  @Override
  public List<Appointmet> findAll() {
    return appointmentRepository.findAll();
  }

  @Override
  public Appointmet findById(long id) {
    return appointmentRepository.findById(id).get();
  }

  @Override
  public Appointmet save(Appointmet doctor) {
    return appointmentRepository.save(doctor);
  }

}
