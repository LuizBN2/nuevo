package com.example.Ejercicio1.entidades;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="profesionales")
public class Profesional {
    @Id
    private Long registroMedico;

    /*@GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
     */

    @Column(name="nombreMedico")
    private String nombreMedico;

    @Column(name="profesion")
    private String profesion;
    //nuevo
    @OneToMany(mappedBy = "profesionales")
    @JsonIgnoreProperties(value = "profesionales") //se lo agregué para no ver ese ciclo infinito en Json
    private Set<Servicio> servicios;


    public Profesional() {
    }
    /*
    public Profesional(String nombreMedico, Integer registroMedico, String profesion, Servicio servicios) {
        this.nombreMedico = nombreMedico;
        this.registroMedico = registroMedico;
        this.profesion = profesion;
        this.servicios = servicios;
    }

     */


//getters and setters

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Set<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Set<Servicio> servicios) {
        this.servicios = servicios;
    }
/*
    @Override
    public String toString() {
        return "Profesional{" +
                "nombreMedico='" + nombreMedico + '\'' +
                ", registroMedico=" + registroMedico +
                ", profesion='" + profesion + '\'' +
                ", servicios=" + servicios.getTratamiento() +
                '}';
    }

 */
}
