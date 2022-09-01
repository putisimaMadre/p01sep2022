package com.formatoweb.proyecto01sep22.service.Impl;

import com.formatoweb.proyecto01sep22.entity.Persona;
import com.formatoweb.proyecto01sep22.repository.PersonaRepository;
import com.formatoweb.proyecto01sep22.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> personas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }
}
