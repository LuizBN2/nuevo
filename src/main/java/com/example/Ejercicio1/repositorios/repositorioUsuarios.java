package com.example.Ejercicio1.repositorios;

import com.example.Ejercicio1.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface repositorioUsuarios extends JpaRepository<Usuario, Long > {
    Usuario findByEmail(String email);

}
