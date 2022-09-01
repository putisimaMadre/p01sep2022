package com.formatoweb.proyecto01sep22.controller;

import com.formatoweb.proyecto01sep22.entity.Persona;
import com.formatoweb.proyecto01sep22.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("persona")
    public List<Persona> getPersonas(){
        return personaService.personas();
    }

    @PostMapping("persona")
    public Persona savePersona(@RequestBody Persona persona){
        return personaService.savePersona(persona);
    }
}
