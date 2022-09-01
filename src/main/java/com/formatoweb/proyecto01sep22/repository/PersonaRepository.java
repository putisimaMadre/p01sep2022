package com.formatoweb.proyecto01sep22.repository;

import com.formatoweb.proyecto01sep22.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
