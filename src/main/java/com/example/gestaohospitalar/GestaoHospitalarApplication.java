package com.example.gestaohospitalar;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.models.Patient;
import com.example.gestaohospitalar.repository.AppointmetRepository;
import com.example.gestaohospitalar.repository.DoctorRepository;
import com.example.gestaohospitalar.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@SpringBootApplication

public class GestaoHospitalarApplication extends SpringBootServletInitializer implements CommandLineRunner {


	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private AppointmetRepository appointmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestaoHospitalarApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}

	public void run(String... args) throws Exception {
	}
}
