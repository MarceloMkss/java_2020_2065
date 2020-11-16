package com.ipartek.ejercicios.estructurasCondicionales;

import java.util.Scanner;

/**
 * Realizar un programa que realice la siguiente funcionalidad Se crearan 5
 * variables enteras con los nombres<br>
 * a, b, c, d y e con los valores 6, 8, 0, 8 y 9.
 *
 * <ul>
 * <li>Comparar las variables a y c, indicar por consola cual es mayor.</li>
 * <li>Indicar cual de las variables es la que tiene menor valor y la de mayor
 * valor.</li>
 * <li>Compara las variables b y d y comprueba si son iguales</li>
 * <li>Comprobar si se puede realizar la división de a/c. si no se puede
 * realizar, indicarlo y en caso contrario realizar la división</li>
 * 
 * </ul>
 *
 * @author Marcelo Kleibson
 *
 */

public class Ejercicio1 {

	public static final int MENOR_VALOR = 3;
	public static final int MAYOR_VALOR = 10;

	public static void main(String[] args) {

		int a, b, c, d, e, resultado;

		Scanner scan = new Scanner(System.in);

		a = 6;
		b = 8;
		c = 0;
		d = 8;
		e = 9;
		resultado = 0;

		// Comparacion variables a y c para saber cual es mayor

		System.out.println(
				"---------------------------Comparacion variables a y c para saber cual es mayor------------------------------------------\n");

		if (a > c) {

			System.out.println(a + " es mayor que : c " + c);

		} else {
			System.out.println("a: " + a + " es menor que c: " + c);
		}

		// Indicar cual de las variables es la que tiene menor valor y la de mayor valor

		System.out.println(
				"---------------------------cual variable tiene menor valor y cual tiene la de mayor mayor valor------------------------------------------\n");

		int num[] = { 6, 8, 0, 8, 9 };

		for (int i = 0; i < num.length; i++) {

			if (num[i] > MENOR_VALOR) {
				System.out.println("posicion " + (i + 1) + " : " + num[i]);
				num[i] = scan.nextInt();

			} // if
		} // for

		for (int i = 0; i < num.length; i++) {
			if (num[i] > MAYOR_VALOR) {

			} // if
		} // for

		System.out.println("El numero MENOR valor es: " + MENOR_VALOR);
		System.out.println("El numero MENOR valor es: " + MAYOR_VALOR);

		// Compara las variables b y d y comprueba si son iguales

		System.out.println(
				"---------------------------comprueba si son iguales------------------------------------------\n");

		if (b == d) {

			System.out.println("o valor de b es: " + b + " y o valor de d es: " + d + " \n \n b y d son iguales \n");

		} else {
			System.out.println("o valor de b es: " + b + " y o valor de d es: " + d + " \n \n b y d  no son iguales");
		}

		// Comprobar si se puede realizar la división de a/c

		System.out.println(
				"---------------------------Comprobar si se puede realizar la división de a/c------------------------------------------\n");

		if (a % c == 0) {

			resultado = a / c;

			System.out.println("el resultado es: " + resultado + " \n \n se puede realizar la division! ");

		} else {
			System.out.println("el resultado es: " + resultado + " \n \n no se puede realizar la division! ");
		}

		scan.close();

	} // MAIN

}
