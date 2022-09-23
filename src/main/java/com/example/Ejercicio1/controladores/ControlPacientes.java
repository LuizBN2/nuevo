package com.example.Ejercicio1.controladores;

import com.example.Ejercicio1.entidades.Paciente;
import com.example.Ejercicio1.servicios.ServiciosPacientes;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControlPacientes {

    //esto es lo nuevo, implementando las herramientas del JPA

    ServiciosPacientes servicesP;

    //constructor
    public ControlPacientes(ServiciosPacientes servicesP){
        this.servicesP = servicesP;
    }

    /*
    @GetMapping("/pacientes")
    public List<Paciente> listaPacientes(){
        return this.servicesP.getListaPacientes();
    }



    @GetMapping("/pacientes/{id}")
    public Paciente LlamarPacientes(@PathVariable Long id){
        return this.servicesP.getLlamarPacientes(id);
    }

 */

/*
    @PostMapping("/pacientes")
    public Paciente crearPaciente(@ModelAttribute Paciente p, Model model){
        model.addAttribute(p);
        return this.servicesP.crearPaciente(p);
    }

 */

    @PostMapping("/pacientes")
    public RedirectView crearPaciente(@ModelAttribute Paciente p, Model model){
        model.addAttribute((p));
        this.servicesP.crearPaciente(p);
        return new RedirectView("/pacientes");
    }




    //editar un registro
    @PutMapping("/pacientes/{id}")
    public RedirectView actualizarPaciente(@PathVariable Long id, Paciente actPaciente){
        this.servicesP.actualizarP(id, actPaciente);
        return new RedirectView("/pacientes");
    }

    /*
    @PutMapping("/pacientes/{id}")
    public Paciente actualizarPaciente(@PathVariable Long id, @RequestBody Paciente actPaciente){
        return this.servicesP.actualizarP(id, actPaciente);
    }

     */

    //borrar un registro

    @DeleteMapping("/pacientes/{id}")
    public RedirectView eliminarPaciente(@PathVariable(value = "id") Long id){
        this.servicesP.eliminarP(id);
        return new RedirectView("/pacientes");
    }

    /*
    @DeleteMapping("/pacientes/{id}")
    public Paciente eliminarPaciente(@PathVariable(value = "id") Long id){
        return this.servicesP.eliminarP(id);
    }

     */







}
