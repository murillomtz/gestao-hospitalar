package com.example.gestaohospitalar.controllers;

import javax.validation.Valid;

import com.example.gestaohospitalar.models.Patient;
import com.example.gestaohospitalar.services.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getPatientDetails(@PathVariable("id") long id) {
        patientService.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/new")
    public ModelAndView createPatient(@ModelAttribute Patient patient) {

        ModelAndView mv = new ModelAndView("usuarioForm");
        mv.addObject("patient", patient);

        return mv;
    }

    @Transactional // Por conta da transição de usuario e tarefa
    @PostMapping
    public String addPatient(@Valid Patient patient, BindingResult result, RedirectAttributes attributes) {

        patientService.save(patient);

        return "redirect:/";
    }

}
