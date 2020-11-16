package com.ipartek.ejercicios.colecciones;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class Perros {

	public static void main(String[] args) {

		ArrayList<Perro> lista = new ArrayList<Perro>();

		// insertar datos en el array lista

		lista.add(new Perro("Bubba"));
		lista.add(new Perro("Laika"));
		lista.add(new Perro("Rintintin"));
		lista.add(new Perro("goffy"));
		lista.add(new Perro("raza"));

		// vamos a recorrer el array para buscar a "Rintintin"
		for (int i = 0; i < lista.size(); i++) {

			Perro pIteracion = lista.get(i); // llamamos la clase Perro y creamos una variable, luego la asignamos la
												// primera posicion del array. nesse caso mediante un for entra en lista
												// con get y coge la primera pocicion del for que es 0.

			if ("Rintintin".equals(pIteracion.getNombre())) { // aqui si rintintin es igual a lo que hay en pInteracion,
																// o sea que rintintin = rintintin. si es asi lo
																// removemos.
				lista.remove(i);
				break; // salir del if
			}

		} // for

		System.out.println("Agur Venur");

	}

}
