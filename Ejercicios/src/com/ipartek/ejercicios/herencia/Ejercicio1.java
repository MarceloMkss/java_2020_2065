package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.pojo.Estudiante;
import com.ipartek.pojo.Persona;
import com.ipartek.pojo.Profesor;

public class Ejercicio1 {

	static ArrayList<Persona> listaEstudiante = new ArrayList<Persona>();
	static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	static ArrayList<Persona> listaProfesores = new ArrayList<Persona>();

	public static void main(String[] args) throws Exception {

		Persona p = new Persona();
		p.setNombre("Marcelo");
		p.setApellido("de souza silva");
		p.setEdad(38);
		p.setDni("16108733Q");
		listaPersonas.add(p);
		System.out.println(listaPersonas);

		Estudiante estu = new Estudiante();

		estu.setNombre("Marcelo");
		estu.setEdad(38);
		estu.setNotaMedia(8.5f);
		listaEstudiante.add(estu);
		System.out.println(listaEstudiante);

		// crear profesor bacterio

		Profesor profesor = new Profesor();
		profesor.setNombre("dr. Bacterio");
		profesor.setEdad(45);
		profesor.setAsignatura("quimica avanzada");
		listaProfesores.add(profesor);
		System.out.println(listaProfesores);

	}

}
