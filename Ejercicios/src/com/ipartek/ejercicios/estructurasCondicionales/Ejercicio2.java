package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero
 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
 * valido y seguir pedindolo
 * 
 * @author Marcelo kleibson
 *
 *         version 1.0
 *
 */

public class Ejercicio2 {

	public static final int NUMERO_MAXIMO = 0;
	public static final int NUMERO_MINIMO = 50;
	static private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		int i = 0;
		int contador = 0;

		int num1 = 0;

		// capturador de errores

		try { // Procedemos a capturar los valores.
			System.out.println("Ingrese un numero entre 0 y 50: ");
			num1 = Integer.parseInt(scan.nextLine());

			if (num1 > 50 || num1 < 0) {
				System.out.println("el numero introducido no es valido! el numero es: " + num1);
				num1 = Integer.parseInt(scan.nextLine());
			} else {
				System.out.println("numero introducido en la posicion: " + i + "-" + num1);
			}

		} catch (Exception e) {
			System.out.println("Error de datos: " + e);
		}

		scan.close();

	}// main

}
