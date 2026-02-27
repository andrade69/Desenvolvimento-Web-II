package edu.unipam.minhaAplicacaoGabrielSilva.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController{
  @Value("${app.mensagem}")
  private String mensagem;
  @GetMapping("/HelloWorld")
  public String helloWorld(){
        return mensagem;
    };
}