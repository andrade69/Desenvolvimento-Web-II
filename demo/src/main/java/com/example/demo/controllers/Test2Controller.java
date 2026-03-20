package com.example.demo.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ExempleService;

@RestController
@Scope("prototype")
public class Test2Controller {
    private ExempleService exempleService;


    public Test2Controller(ExempleService exempleService){
        this.exempleService=exempleService;
    }
    @GetMapping("/check2")
    public String check(){
        return "O id do check 2 é:" + exempleService.getId();
    }

    public void nascer(){
        exempleService.postConstruct();
    }
}
