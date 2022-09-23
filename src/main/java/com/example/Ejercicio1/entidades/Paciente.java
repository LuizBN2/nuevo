package com.example.Ejercicio1.entidades;


import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {

    //atributos

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
     */

    @Id
    private Long documentoIdentidad;

    @Column(name="nombre")
    private String nombre;
    @Column(name="edad")
    private Integer edad;

    @Column(name="telefono")
    private Double telefono;
    @Column(name="descripcionEnfermedad")
    private String descripcionEnfermedad;

    //nuevo
    @ManyToOne(optional = false)
    @JoinColumn(name = "registroMedico")
    private Profesional profesionales;


    //constructor


    public Paciente() {
    }

    /*
    public Paciente(String nombre, Integer edad, Integer documentoIdentidad, Double telefono,
                    String descripcionEnfermedad, Profesional profesionales) {
        this.nombre = nombre;
        this.edad = edad;
        this.documentoIdentidad = documentoIdentidad;
        this.telefono = telefono;
        this.descripcionEnfermedad = descripcionEnfermedad;
        this.profesionales = profesionales;
    }

     */


    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public Double getTelefono() {
        return telefono;
    }

    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }

    public String getDescripcionEnfermedad() {
        return descripcionEnfermedad;
    }

    public void setDescripcionEnfermedad(String descripcionEnfermedad) {
        this.descripcionEnfermedad = descripcionEnfermedad;
    }

    public Profesional getProfesionales(){
        return profesionales;
    }

    public void setProfesionales(Profesional profesionales){
        this.profesionales = profesionales;
    }

    /*
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", documentoIdentidad=" + documentoIdentidad +
                ", telefono=" + telefono +
                ", descripcionEnfermedad='" + descripcionEnfermedad + '\'' +
                ", profesionales=" + profesionales.getNombreMedico() +
                ", profesionales=" + profesionales.getServicios() +
                '}';
    }

     */
}
