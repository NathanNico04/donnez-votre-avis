package com.nathan.donnez_votre_avis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "test")
public class TestController {

    @GetMapping(path = "string")
    public String getString (){
        return "Chaine de caractere transmise par NT";
    }
    @GetMapping
    public List<String> getList (){
        return List.of("Chaine de caractere", "transmise par NT");
    }
}
