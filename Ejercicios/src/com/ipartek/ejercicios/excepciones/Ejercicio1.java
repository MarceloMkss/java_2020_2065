package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”. <br>
 * Pruebe a introducir b=0 y ver que hace el programa con la división por
 * cero.<br>
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa.<br>
 * Añada excepciones para recoger estas excepciones y avisar del problema al
 * usuario.<br>
 * 
 * 
 * @author Marcelo Kleibson
 * @version 1.0
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int a;
		int b;
		int resultado = 0;
		boolean isError = false;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("introduzca el primero numero: ");
			a = Integer.parseInt(sc.nextLine());

			System.out.println("introduzca el segundo numero: ");
			b = Integer.parseInt(sc.nextLine());

			resultado = (a / b);
			System.out.println(a + "/" + b + "=" + resultado);

		} catch (Exception e) {
			System.out.println("no se puede dividir entre cero");

		} finally {
			sc.close();
		}

	} // main

}
