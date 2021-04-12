package com.example.gestaohospitalar.services;

import java.util.List;

import com.example.gestaohospitalar.models.Appointmet;

public interface AppointmetService {

  List<Appointmet> findAll();

  Appointmet findById(long id);

  Appointmet save(Appointmet doctor);

  void deleteById(Long id);
}
