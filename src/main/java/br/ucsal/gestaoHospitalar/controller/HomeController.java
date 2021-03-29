package br.ucsal.gestaoHospitalar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
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

   /* @RequestMapping(value = "/newpaciente", method = RequestMethod.POST)
    public String savePost(@Valid Paciente paceinte, BindingResult result, RedirectAttributes attributes) {
        // BindingResult e RedirectAttributes

        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatorios foram preechidos!");
            return "redirect:/newpaciente";
        }
        post.setData(LocalDate.now());
        codeblogService.save(post);
        return "redirect:/home";
    }*/

    @RequestMapping(value = "/newconsulta", method = RequestMethod.GET)
    public String getConsultaForm() {
        return "consultaForm";
    }

    @RequestMapping(value = "/newfuncionario", method = RequestMethod.GET)
    public String getFuncionarioForm() {
        return "funcionarioForm";
    }
}
