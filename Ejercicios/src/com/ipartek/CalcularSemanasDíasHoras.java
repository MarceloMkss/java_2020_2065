package com.ipartek;

/**
 * Construir un programa que, dado un número total de horas.
 *  devuelve el número de semanas, días y horas  equivalentes.
 * Por ejemplo: dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 * 
 * 
 * @author Marcelo Kleibson
 * @version 1.0 
 * 
 */

import java.util.Scanner;

public class CalcularSemanasDíasHoras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horasTotales;
		int semanas;
		int dias;
		int horas;

		try {
			System.out.println("Digite el numero de horas: ");
			horasTotales = entrada.nextInt();
			semanas = horasTotales / 168; // 1 dia tiene 24 horas, multiplicamos por 7 dias que tiene una semana, nos
											// sale
			// // 168
			dias = horasTotales % 168 / 24; // el % sacamos el resto de la division anterior dividido por 24 horas
			horas = horasTotales % 24;

			System.out.println("El Equivalente es: \n");
			System.out.println("Semanas: " + semanas);
			System.out.println("dias: " + dias);
			System.out.println("horas: " + horas);

		} catch (Exception e) {

			System.out.println("no has puesto un numero correcto: \n");

		}
		entrada.close();

	} // Main

}
