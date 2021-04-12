package com.example.gestaohospitalar.services.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.example.gestaohospitalar.enums.TypeAppointmentEnum;
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
  public Appointmet save(Appointmet appointmet) {

    Appointmet appointmentToSave = new Appointmet(appointmet.getTypeAppointment(), appointmet.getDuration(),
        appointmet.getOccasion(), appointmet.getCost(), appointmet.getDiagnosis(), null, null, null, null, null, null);

    return appointmentRepository.save(appointmentToSave);
  }

  @Override
    public void deleteById(Long id) {
        appointmentRepository.deleteById(id);
        return;
    }

}
