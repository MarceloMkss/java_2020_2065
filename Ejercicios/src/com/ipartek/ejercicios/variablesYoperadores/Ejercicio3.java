package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor.<br>
 * Meterle valores enteros y positivos.<br>
 * Realizar la operación división y mostrar el resultado en pantalla <br>
 * Repetir el mismo código con estas variaciones: entero y real, real y entero,
 * real y real Por ultimo, intentar dividir en los cuatro casos anteriores entre
 * 0 y mostrar el resultado en pantalla
 * 
 * 
 * Es un Ejercicio para aprender a declarar variables en java
 * 
 * @author Marcelo version 1.0
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		int num1 = 24, num2 = 6;

		float fl1 = 6.5f, fl2 = (float) 9.4;
		float resultado1;
		float resultado2;
		float resultado3;
		float resultado4;

		resultado1 = num1 / num2;
		resultado2 = num1 / fl1;
		resultado3 = fl2 / num2;
		resultado4 = fl1 / fl2;
		// resultado0 = int1 / 0;

		System.out.println("Resultado de la división entre enteros: " + resultado1);
		System.out.println("Resultado de la división entero / real: " + resultado2);
		System.out.println("Resultado de la división real / entero" + resultado3);
		System.out.println("Resultado de la división real / entero" + resultado4);

	}

}
