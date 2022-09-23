package com.example.Ejercicio1.servicios;

import com.example.Ejercicio1.entidades.Paciente;
import com.example.Ejercicio1.entidades.Profesional;
import com.example.Ejercicio1.entidades.Servicio;
import com.example.Ejercicio1.repositorios.repositorioPacientes;
import com.example.Ejercicio1.repositorios.repositorioProfesionales;
import org.springframework.stereotype.Service;

@Service
public class ServiciosProfesionales {

    /*
    Profesional m1;
    ServiciosServicios ss1 = new ServiciosServicios();


    public ServiciosProfesionales(){
        Servicio servicioPrestado = this.ss1.s1;
        this.m1 = new Profesional("Mario", 123,
                "Ginecólogo", servicioPrestado );
    }

    public Profesional getProfesionales(){
        return m1;
    }

     */
    private repositorioProfesionales repositorioProf;

    //constructor
    public ServiciosProfesionales(repositorioProfesionales repositorioProf){
        this.repositorioProf = repositorioProf;
    }



    //llamar uno solo
    public Profesional getLlamarProf(Long id){
        return this.repositorioProf.findById(id).orElseThrow();
    }

    //método para crear a partir del POST
    public Profesional crearProf(Profesional nuevoProf){
        return this.repositorioProf.save(nuevoProf);
    }

    //método para actualizar
    public Profesional actualizarProf(Long id, Profesional prof){
        Profesional profActual = repositorioProf.findById(id).orElseThrow();
        profActual.setNombreMedico(prof.getNombreMedico());
        profActual.setProfesion(prof.getProfesion());
        return this.repositorioProf.save(profActual);
    }

    //método para eliminar

    public Profesional eliminarProf(Long id){
        Profesional profActual = repositorioProf.findById(id).orElseThrow(); //pero esta, muestra lo que se borró
        this.repositorioProf.deleteById(id);  //solo con esta línea funciona
        return profActual;
    }




}
