package com.example.Ejercicio1.repositorios;

import com.example.Ejercicio1.entidades.Profesional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioProfesionales extends JpaRepository<Profesional, Long> {

}
