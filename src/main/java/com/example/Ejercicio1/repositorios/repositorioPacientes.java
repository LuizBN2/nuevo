package com.example.Ejercicio1.repositorios;

import com.example.Ejercicio1.entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioPacientes extends JpaRepository<Paciente, Long> {

}
