package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.JeissonCasallasModel;
import co.edu.eci.cvds.service.JeissonCasallasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/JeissonCasallas")
public class JeissonCasallasController {

    private final JeissonCasallasService jeissonCasallasService;

    @Autowired
    public JeissonCasallasController(JeissonCasallasService jeissonCasallasService) {
        this.jeissonCasallasService = jeissonCasallasService;
    }

     @GetMapping("/jeisson_casallas")
    public String getPreguntas(Model model){
        model.addAttribute("list", jeissonCasallasService.getAllPreguntas());
        return "jeisson_casallas";
    }
}
