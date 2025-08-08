package com.example.mahTeck.Projeto.MahTeck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pesquisa-satisfacao")
public class PesquisaSatisfacaoController {
    
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("pesquisaSatisfacao/form-pesquisa-satisfacao");
        return model;
    }

}
