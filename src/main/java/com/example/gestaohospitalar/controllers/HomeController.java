package com.example.gestaohospitalar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("/home")
	public String index() {

		return "index";

	}

	@RequestMapping(value = "/newpaciente", method = RequestMethod.GET)
	public String getPacienteForm() {
		return "usuarioForm";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@RequestMapping(value = "/newconsulta", method = RequestMethod.GET)
	public String getConsultaForm() {
		return "consultaForm";
	}

	@RequestMapping(value = "/newfuncionario", method = RequestMethod.POST)
	public String createDoctor() {
		return "funcionarioForm";
	}
}