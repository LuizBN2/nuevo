package com.example.Ejercicio1.repositorios;

import com.example.Ejercicio1.entidades.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioServicios extends JpaRepository<Servicio, Long> {
}
