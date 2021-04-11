package com.example.gestaohospitalar;

import com.example.gestaohospitalar.enums.TypeAppointmentEnum;
import com.example.gestaohospitalar.models.Appointmet;
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
	private DoctorRepository doctorRepository;

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

	@Override
	public void run(String... args) throws Exception {
		DoctorModel d1 = new DoctorModel
				("Taz", "12358", LocalDate.now(), null, 500.0,
						"Cirurgiao", 252525, null);

		Patient p1 = new Patient("Luiz", "02712781538", LocalDate.now(), null, "41820180",
		null);
		Patient p2 = new Patient("Berman", "02712781538", LocalDate.now(), null, "41820180",
		null);

		Appointmet ap1 = new Appointmet(TypeAppointmentEnum.CIRURGIA, 3D, "A", 50D,
		"Ok", d1, p1, null, null,
		LocalDate.now(), null);

		doctorRepository.save(d1);
		patientRepository.save(p1);
		patientRepository.save(p2);
		appointmentRepository.save(ap1);
		
	}
}
