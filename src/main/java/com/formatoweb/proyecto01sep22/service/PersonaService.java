package com.formatoweb.proyecto01sep22.service;

import com.formatoweb.proyecto01sep22.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> personas();
    Persona savePersona(Persona persona);
}
