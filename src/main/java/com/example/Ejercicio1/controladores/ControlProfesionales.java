package com.example.Ejercicio1.controladores;

import com.example.Ejercicio1.entidades.Paciente;
import com.example.Ejercicio1.entidades.Profesional;
import com.example.Ejercicio1.servicios.ServiciosPacientes;
import com.example.Ejercicio1.servicios.ServiciosProfesionales;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControlProfesionales {
    /*

    ServiciosProfesionales servicesP;

    //constructor
    public ControlProfesionales(){
        this.servicesP = new ServiciosProfesionales();
    }

    @GetMapping("/verprofesionales")
    public Profesional ControlProfesionales(){
        return this.servicesP.getProfesionales();
    }

     */
    ServiciosProfesionales servicesProf;

    //cosntructor
    public ControlProfesionales(ServiciosProfesionales servicesProf){
        this.servicesProf = servicesProf;
    }

    @GetMapping("/profesionales/{id}")
    public Profesional LlamarProfesionales(@PathVariable Long id){
        return this.servicesProf.getLlamarProf(id);
    }

    @PostMapping("/profesionales")
    public Profesional crearProfesionales(@RequestBody Profesional p){
        return this.servicesProf.crearProf(p);
    }

    //editar un registro
    @PutMapping("/profesionales/{id}")
    public Profesional actualizarProfesionales(@PathVariable Long id, @RequestBody Profesional actProfesional){
        return this.servicesProf.actualizarProf(id, actProfesional);
    }

    //borrar un registro
    @DeleteMapping("/profesionales/{id}")
    public Profesional eliminarProfesionales(@PathVariable(value = "id") Long id){
        return this.servicesProf.eliminarProf(id);
    }

}
