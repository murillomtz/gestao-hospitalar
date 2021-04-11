package com.example.gestaohospitalar.controllers;

import com.example.gestaohospitalar.models.DoctorModel;
import com.example.gestaohospitalar.services.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/doctor", method = RequestMethod.GET)
    public ModelAndView getDoctor() {

        ModelAndView mv = new ModelAndView("doctorList");
        List<DoctorModel> doctors = doctorService.findAll();
        mv.addObject("doctors", doctors);
        return mv;
    }

    @RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
    public ModelAndView getDoctorDetails(@PathVariable("id") long id) {

        ModelAndView mv = new ModelAndView("doctorDetails");
        DoctorModel doctor = doctorService.findById(id);
        mv.addObject("doctor", doctor);
        return mv;
    }

    @RequestMapping(value = "/doctor/new")
    public ModelAndView createDoctor() {

        ModelAndView mv = new ModelAndView("funcionarioForm");

        return mv;
    }

    @Transactional // Por conta da transição de usuario e tarefa
    @RequestMapping(value = "/doctor", method = RequestMethod.POST)
    public String saveDoctor(@Valid DoctorModel doctor, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preechidos!");
            return "redirect:/doctor";
        }

        doctorService.save(doctor);
        return "redirect:/doctor";

    }

    /*
     * @RequestMapping(value = "/editardoctor/{id}", method = RequestMethod.GET)
     * public ModelAndView getEditarDoctor(@PathVariable("id") long id) {
     * ModelAndView mv = new ModelAndView("editarDoctor");
     * 
     * Doctor doctor = doctorService.findByid(id); mv.addObject("doctor", doctor);
     * return mv; }
     */

}
