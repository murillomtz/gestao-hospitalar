package com.example.gestaohospitalar.controllers;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.services.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.transaction.Transactional;
import javax.validation.Valid;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getDoctorDetails(@PathVariable("id") long id) {
        doctorService.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/new")
    public ModelAndView createDoctor(@ModelAttribute DoctorModel doctor) {

        ModelAndView mv = new ModelAndView("funcionarioForm");
        mv.addObject("doctor", doctor);

        return mv;
    }

    @Transactional // Por conta da transição de usuario e tarefa
    @PostMapping
    public String addDoctor(@Valid DoctorModel doctor, BindingResult result, RedirectAttributes attributes) {

        doctorService.save(doctor);

        return "redirect:/";
    }

}
