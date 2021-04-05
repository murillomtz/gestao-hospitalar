package br.ucsal.gestaoHospitalar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class GestaoHospitalarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoHospitalarApplication.class, args);
	}

}
