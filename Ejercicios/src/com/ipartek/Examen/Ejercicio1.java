package com.ipartek.Examen;

import java.util.Scanner;

/**
 * Realizar un programa en java que realice la siguiente función:<br>
 * <ul>
 * <li>Crear un array de 5 notas que almacenara en formato double.</li>
 * <li>Una vez creado dicho array se rellenaran dichos elementos leyéndolo desde
 * el teclado.</li>
 * <li>Una vez creado el contenido, se calculara la media de las notas.</li>
 * <li>así como se mostraran las notas más altas y más bajas de dicho
 * array.</li>
 * <ul>
 * 
 * @author Marcelo Kleibson de Souza Silva
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notas[]; // creo un Array del tipo double, que almacenara las calificaciones
		double calificacion = 0; // inicializo
		double media; // variable para hacer la media
		double notaMayor = 0;
		double notaMenor = 10;

		notas = new double[5]; // crecion de arreglo cinco espacio en un arreglo

		System.out.println("ingrese las 5 notas: \n");

		for (int i = 0; i < 5; i++) {
			System.out.println("nota " + (i + 1 + ":"));
			notas[i] = Double.valueOf(entrada.nextDouble());

		} // for

		// calcular medidas

		for (int i = 0; i < 5; i++) {
			calificacion += notas[i];

		}

		// sacamos la media

		System.out.println("la media es: " + calificacion / 5 + "\r");

		// saber la nota mas alta Y la mas baja

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > notaMayor) {

				notaMayor = notas[i];

			}

			if (notas[i] < notaMenor) {

				notaMenor = notas[i];

			}

		} // for

		System.out.print("La nota mayor es: " + notaMayor + "\n");

		System.out.print("La nota menor es: " + notaMenor);

		entrada.close();

	}

}
