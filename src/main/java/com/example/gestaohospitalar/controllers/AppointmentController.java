package com.example.gestaohospitalar.controllers;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.example.gestaohospitalar.models.Appointmet;
import com.example.gestaohospitalar.services.AppointmetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmetService appointmentService;


    @RequestMapping(value = "/consulta", method = RequestMethod.GET)
    public ModelAndView getAppointment(){
        ModelAndView mv = new ModelAndView("patientList");
        List<Appointmet> appointments = appointmentService.findAll();
        mv.addObject("patientes", appointments);
        return mv;
    }


    @RequestMapping(value = "/consulta/{id}", method = RequestMethod.GET)
    public ModelAndView getAppointmentDetails(@PathVariable("id") long id) {

        ModelAndView mv = new ModelAndView("appointmentDetails");
        Appointmet appointment = appointmentService.findById(id);
        mv.addObject("appointment", appointment);
        return mv;
    }
    
    @RequestMapping(value = "/consulta/new")
    public ModelAndView createAppointment() {

        ModelAndView mv = new ModelAndView("consultaForm");

        return mv;
    }

    @Transactional // Por conta da transição de usuario e tarefa
    @RequestMapping(value = "/consulta", method = RequestMethod.POST)
    public String saveAppointment(@Valid Appointmet appointment, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preechidos!");
            return "redirect:/consulta";
        }
        System.out.println(appointment);
        appointmentService.save(appointment);
        
        return "redirect:/consulta";

    }
}
