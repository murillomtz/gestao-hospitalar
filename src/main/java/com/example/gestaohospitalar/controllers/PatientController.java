package com.example.gestaohospitalar.controllers;

import java.util.List;

import javax.validation.Valid;

import com.example.gestaohospitalar.models.Patient;
import com.example.gestaohospitalar.repository.PatientRepository;
import com.example.gestaohospitalar.services.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class PatientController{

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/patient", method = RequestMethod.GET)
    public ModelAndView getPatient(){
        
        ModelAndView mv = new ModelAndView("patientList");
        List<Patient> patients = patientService.findAll();
        mv.addObject("patientes", patients);
        return mv;
    }


    @RequestMapping(value = "/patient/{id}", method = RequestMethod.GET)
    public String getPatientDetails(@PathVariable("id") long id) {
        patientService.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/patient/new")
    public ModelAndView createPatient() {

        ModelAndView mv = new ModelAndView("usuarioForm");

        return mv;
    }

    @Transactional // Por conta da transição de usuario e tarefa
    @RequestMapping(value = "/patient", method = RequestMethod.POST)
    public String savePatient(@Valid Patient patient, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preechidos!");
            return "redirect:/patient";
        }

        patientService.save(patient);
        return "redirect:/patient";

    }
    
}
