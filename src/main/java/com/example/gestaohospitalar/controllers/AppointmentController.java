package com.example.gestaohospitalar.controllers;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.example.gestaohospitalar.models.Appointmet;
import com.example.gestaohospitalar.services.AppointmetService;

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

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmetService appointmentService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getAppointment(){
        ModelAndView mv = new ModelAndView("patientList");
        List<Appointmet> appointments = appointmentService.findAll();
        mv.addObject("patientes", appointments);
        return mv;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView getAppointmentDetails(@PathVariable("id") long id) {

        ModelAndView mv = new ModelAndView("appointmentDetails");
        Appointmet appointment = appointmentService.findById(id);
        mv.addObject("appointment", appointment);
        return mv;
    }
    
    @RequestMapping(value = "/new")
    public ModelAndView createAppointment(@ModelAttribute Appointmet appointment) {

        ModelAndView mv = new ModelAndView("usuarioForm");
        mv.addObject("appointment", appointment);

        return mv;
    }

    @Transactional // Por conta da transição de usuario e tarefa
    @PostMapping
    public String addAppointment(@Valid Appointmet appointment, BindingResult result, RedirectAttributes attributes) {

        appointmentService.save(appointment);

        return "redirect:/";
    }
}
