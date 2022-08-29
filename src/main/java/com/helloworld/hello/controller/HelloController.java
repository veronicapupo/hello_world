package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/helloworld")
    public String hello(){
        return "Hello Generation!!";
    }

    @GetMapping("/bsm")
    public List<String> bsms(){

        return List.of("Mentalidade de crescimento","Persistência","Responsabilidade pessoal","Orientação ao fututo","Comunicação","Orientação ao detalhe","Proatividade","Trabalho em equipe");
    }

    @GetMapping("/objetivos")
    public String objetivos(){
        return "Aprender Spring, Criar Projetos";
    }
}
