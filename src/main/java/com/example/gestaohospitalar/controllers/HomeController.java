package com.example.gestaohospitalar.controllers;

import java.util.List;

import com.example.gestaohospitalar.models.Appointmet;
import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.models.Patient;
import com.example.gestaohospitalar.services.AppointmetService;
import com.example.gestaohospitalar.services.PatientService;
import com.example.gestaohospitalar.services.serviceImpl.AppointmetServiceImpl;
import com.example.gestaohospitalar.services.serviceImpl.DoctorServiceImpl;
import com.example.gestaohospitalar.services.serviceImpl.PatientServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	DoctorServiceImpl doctorService;

	@Autowired
	PatientServiceImpl patientService;

	@Autowired
	AppointmetServiceImpl appointmentService;

	@GetMapping("/")
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("index");
		List<DoctorModel> doctors = doctorService.findAll();
		List<Patient> patients = patientService.findAll();
		List<Appointmet> appointments = appointmentService.findAll();

		mv.addObject("doctors", doctors);
		mv.addObject("patients", patients);
		mv.addObject("appointments", appointments);
		return mv;
	}

	// @RequestMapping(value = "/newpaciente")
	// public ModelAndView getPacienteForm() {

	// 	ModelAndView mv = new ModelAndView("usuarioForm");

	// 	return mv;
	// }

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@RequestMapping(value = "/newconsulta", method = RequestMethod.GET)
	public ModelAndView getConsultaForm() {

		ModelAndView mv = new ModelAndView("consultaForm");

		return mv;
	}

}