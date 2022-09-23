package com.example.Ejercicio1.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registroAtencion;
    /*

    private long Id;

     */

    @Column(name="atencion")
    private Boolean atencion;
    @Column(name="valoracion")
    private String valoracion;
    @Column(name="tratamiento")
    private String tratamiento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registroMedico", nullable = false)
    @JsonIgnoreProperties(value = "servicios") //se lo agregué para no ver ese ciclo infinito en Json
    private Profesional profesionales;

    //constructor
    public Servicio(){

    }
    /*
    public Servicio(Boolean atencion, String valoracion, String tratamiento, String registroAtencion){
        this.atencion = atencion;
        this.valoracion = valoracion;
        this.tratamiento = tratamiento;
        this.registroAtencion = registroAtencion;
    }

     */


    //getters and setters


    public Profesional getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(Profesional profesionales) {
        this.profesionales = profesionales;
    }

    public Boolean getAtencion() {
        return atencion;
    }

    public void setAtencion(Boolean atencion) {
        this.atencion = atencion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Long getRegistroAtencion() {
        return registroAtencion;
    }

    public void setRegistroAtencion(Long registroAtencion) {
        this.registroAtencion = registroAtencion;
    }


    @Override
    public String toString() {
        return "Servicio{" +
                "atencion=" + atencion +
                ", valoracion='" + valoracion + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", registroAtencion='" + registroAtencion + '\'' +
                '}';
    }

}
