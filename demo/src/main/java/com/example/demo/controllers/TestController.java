package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ExempleService;

@RestController
public class TestController {
    @Value("${treinamento.nome: Valor Padrão}")
    public String curso;

    private ExempleService exempleService;
    public TestController (ExempleService exempleService){
        this.exempleService = exempleService;
    }
    @GetMapping("/check")
    public String check (){
        return "O id é: " + exempleService.getId();
    }
    @GetMapping("/curso")
    public String curso(){
        return curso;
    }
}
