package com.ipartek.ejercicios.excepciones;

/**
 /**
 * Crea una clase Persona con los atributos nombre y edad. <br>
 * En el m�todo setEdad lanzar una excepci�n si la edad introducida es menor que 0 o mayor que 120.<br>
 * Realiza un programa que al comienzo cree una lista de personas haciendo uso del constructor vac�o, y lea los datos por teclado y los asigne a los objetos creados. Solo introducir� las personas en la lista si est�n en el rango de edad indicado, comprob�ndolo mediante el uso de excepciones.
 * <br>
 * Ej: probar a crear las siguientes personas: 
 * <ol>   
 *   <li>�pepe� con 56 a�os</li>
 *   <li>�matusalem� con 199 a�os</li>
 *  </ol> 
 *
 * @author ur00
 * @version 1.0 
 * 
 * @author Marcelo
 * 
 */

import java.util.ArrayList;

import com.ipartek.pojo.Persona;

public class Ejercicio4 {

	public static void main(String[] args) throws Exception {

		// Lo que aparece entre <> se llama CASTEAR y sirve para indicar el tipo de
		// Objetos que tenemos dentro del Array

		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {

			Persona p1 = new Persona();
			p1.setNombre("pepe");
			p1.setEdad(56);

			personas.add(p1);

			Persona p2 = new Persona();
			p2.setNombre("MAtusalem");
			p2.setEdad(300); // CUIDADO lanza una Exception y va directo al Catch, no ejecuta las lineas de
								// abajo

			personas.add(p2);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {

			// foreach para iterar sobre el ArrayList<Perona>

			for (Persona p : personas) {
				System.out.println(p);
			}

			// for de toda la vida
			/*
			 * for (int i = 0; i < personas.size(); i++) { // ejemplo for normal
			 * System.out.println( personas.get(i)); }
			 */

		} // main
	}
}
