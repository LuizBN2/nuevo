package com.example.Ejercicio1.servicios;

import com.example.Ejercicio1.entidades.Paciente;
import com.example.Ejercicio1.entidades.Profesional;
import com.example.Ejercicio1.repositorios.repositorioPacientes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiciosPacientes {
    //atributos? del tipo paciente lo que quiere decir que esto es un objeto
   /*
    Paciente paciente1;
    Paciente paciente2;
    List<Paciente> listaPacientes;

    ServiciosProfesionales prof = new ServiciosProfesionales();

    */

    //constructor

    /*
    public ServiciosPacientes(){
        Profesional medico1 = this.prof.m1;
        this.paciente1 = new Paciente("María", 25, 10358786,
                31025586.0, "Embarazo", medico1);
        this.paciente2 = new Paciente("Marcela", 36, 1234587, 4545.23,
                "Dolor de cabeza", null);
        this.listaPacientes = new ArrayList<>();
        listaPacientes.add(paciente1);
        listaPacientes.add(paciente2);
    }

     */

    //utilizando el repositorio

    private repositorioPacientes repositorioPa;

    //constructor
    public ServiciosPacientes(repositorioPacientes repositorioPa){
        this.repositorioPa = repositorioPa;
    }


    //método getter para obtener los datos de la lista de pacientes

    //método para visualizar a partir del GET
    public List<Paciente> getListaPacientes(){
        return this.repositorioPa.findAll();
    }

    //llamar uno solo
    public Paciente getLlamarPacientes(Long id){
        return this.repositorioPa.findById(id).orElseThrow();
    }



    //método para crear a partir del POST
    public Paciente crearPaciente(Paciente nuevoPaciente){
        return this.repositorioPa.save(nuevoPaciente);
    }




    //método para actualizar
    public Paciente actualizarP(Long id, Paciente p){
        Paciente pacienteActual = repositorioPa.findById(id).orElseThrow();
        pacienteActual.setNombre(p.getNombre());
        pacienteActual.setDescripcionEnfermedad(p.getDescripcionEnfermedad());
        pacienteActual.setEdad(p.getEdad());
        pacienteActual.setTelefono(p.getTelefono());
        pacienteActual.setProfesionales(p.getProfesionales());
        //pacienteActual.setDocumentoIdentidad(p.getDocumentoIdentidad());
        return this.repositorioPa.save(pacienteActual);
    }

    //método para eliminar

    public Paciente eliminarP(Long id){
        Paciente pacienteActual = repositorioPa.findById(id).orElseThrow(); //pero esta, muestra lo que se borró
        this.repositorioPa.deleteById(id);  //solo con esta línea funciona
        return pacienteActual;
    }

}
