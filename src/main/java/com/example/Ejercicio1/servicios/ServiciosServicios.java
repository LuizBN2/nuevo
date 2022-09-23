package com.example.Ejercicio1.servicios;

import com.example.Ejercicio1.entidades.Profesional;
import com.example.Ejercicio1.entidades.Servicio;
import com.example.Ejercicio1.repositorios.repositorioServicios;
import org.springframework.stereotype.Service;

@Service
public class ServiciosServicios {

    /*
    Servicio s1;

    public ServiciosServicios(){
        this.s1 = new Servicio(true, "Enfermedad estomacal",
                "Hioscina 10mg/250ml", "001");
    }

    public Servicio getServicios(){
        return this.s1;
    }

     */

    private repositorioServicios repositorioSer;

    public ServiciosServicios(repositorioServicios repositorioSer){
        this.repositorioSer = repositorioSer;
    }

    //mostrar servicios
    public Servicio getLlamarSer(Long id){
        return this.repositorioSer.findById(id).orElseThrow();
    }

    //crear servicios
    public Servicio crearSer(Servicio nuevoServicio){
        return this.repositorioSer.save(nuevoServicio);
    }

}
