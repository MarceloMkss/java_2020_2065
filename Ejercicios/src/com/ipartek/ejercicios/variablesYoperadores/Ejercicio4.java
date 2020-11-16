package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que realice la siguiente operaci�n: crear tres variables
 * de tipo Byte, llamadas num1, num2, resultado. Asignar los valores 255 y 223.
 * Sumarlas y guardarlo en resultado. Comprueba si el resultado da 478. Si no lo
 * da, buscar una soluci�n al problema para solucionarlo
 * 
 * Es un Ejercicio para aprender a declarar variables en java
 * 
 * @author Marcelo Kleibson version 1.0
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		byte num1 = -1;
		int num1entero = (num1 & 0xFF); // 255
		// System.out.println(num1entero);

		byte num2 = -33;
		int num2entero = (num2 & 0xFF); // 223
		// System.out.println(num2entero);

		int resultado = num1entero + num2entero;

		System.out.println("El resultado es " + resultado);

	}

}
