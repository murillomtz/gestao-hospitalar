package com.example.gestaohospitalar;

import com.example.gestaohospitalar.enums.RoleEnum;
import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication

public class GestaoHospitalarApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private DoctorRepository doctorRepository;

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
				("Taz", "12358", LocalDate.now(),
						null, RoleEnum.MEDICO, null, 500.0,
						"Cirurgiao", 252525, null);

		doctorRepository.save(d1);
	}
}
