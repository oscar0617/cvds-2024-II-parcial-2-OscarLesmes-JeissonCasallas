package co.edu.eci.cvds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import co.edu.eci.cvds.model.OscarLesmes;
import co.edu.eci.cvds.service.OscarLesmesService;

import java.util.List;


@Controller
public class OscarLesmesController {
    @Autowired
    private OscarLesmesService oscarLesmesService;

    @GetMapping("/oscar_lesmes")
    public String getAnswers(Model model){
        model.addAttribute("preguntas", oscarLesmesService.getAllAnswers());
        return "oscar_lesmes";
    }
}

