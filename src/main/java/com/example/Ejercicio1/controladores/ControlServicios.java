package com.example.Ejercicio1.controladores;

import com.example.Ejercicio1.entidades.Profesional;
import com.example.Ejercicio1.entidades.Servicio;
import com.example.Ejercicio1.servicios.ServiciosProfesionales;
import com.example.Ejercicio1.servicios.ServiciosServicios;
import org.springframework.web.bind.annotation.*;


@RestController
public class ControlServicios {


    ServiciosServicios servicesSer;

    //cosntructor
    public ControlServicios(ServiciosServicios servicesSer){
        this.servicesSer = servicesSer;
    }

    @GetMapping("/servicios/{id}")
    public Servicio LlamarServicios(@PathVariable Long id){
        return this.servicesSer.getLlamarSer(id);
    }

    @PostMapping("/servicios")
    public Servicio crearProfesionales(@RequestBody Servicio s){
        return this.servicesSer.crearSer(s);
    }

}
