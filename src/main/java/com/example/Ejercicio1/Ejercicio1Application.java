package com.example.Ejercicio1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {

		SpringApplication.run(Ejercicio1Application.class, args);

		/*
		Servicio serv1 = new Servicio(true, "Enfermedad estomacal",
				"Hioscina 10mg/250ml", "001");

		Profesional prof1 = new Profesional("Mario", 123,
				"Ginecólogo", null );

		Profesional prof2 = new Profesional("Beatriz", 568,
				"Gastroenterólogo", serv1 );


		Paciente paciente1 = new Paciente("María", 25, 10358786,
				31025586, "Embarazo", prof1);

		Paciente paciente2 = new Paciente("José", 30, 123456,
				898978,"Gastroenterítis", prof2);

		List<Paciente> listaPacientes = new ArrayList<>();
		List<Profesional> listaProfesionales = new ArrayList<>();

		listaPacientes.add(paciente1);
		listaPacientes.add(paciente2);

		listaProfesionales.add(prof1);
		listaProfesionales.add(prof2);

		System.out.println("Pacientes");

		for (int i = 0; i < listaPacientes.size(); i++){
			System.out.println(listaPacientes.get(i).toString());
		}
		System.out.println("Profesionales de la salud");

		for (int i = 0; i < listaProfesionales.size(); i++){
			System.out.println(listaProfesionales.get(i).toString());
		}

		 */


	}

}
