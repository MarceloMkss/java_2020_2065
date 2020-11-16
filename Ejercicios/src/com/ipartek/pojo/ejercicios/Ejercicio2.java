package com.ipartek.pojo.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Persona;

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<Persona>();
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int edad;
		boolean isValid = false;
		for (int i = 0; i < 6; i++) {
			personas.add(new Persona());
			System.out.println("Introduzca el nombre de la persona: ");
			nombre = entrada.nextLine();
			personas.get(i).setNombre(nombre);

		}

		// si todo no funciona

		do {

			try {
				System.out.println("Introduzca la edad de la persona: ");
				edad = Integer.parseInt(entrada.nextLine());
				personas.get(edad).setEdad(edad);
				isValid = true;

			} catch (Exception e) {
				System.out.println(e.getMessage());
				isValid = false;

			}

		} while (!isValid);

		System.out.println(personas.get(1).getNombre() + "El nombre ha sido agregado:");
		entrada.close();

	} // Main

}
