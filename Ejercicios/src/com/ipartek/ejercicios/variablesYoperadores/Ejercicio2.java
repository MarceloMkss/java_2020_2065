package com.ipartek.ejercicios.variablesYoperadores;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de
 * distintos tipos numéricos. Una vez creadas dichas variables y asignadas desde
 * código valores (se recomienda valores entre -10 y 10) realizar las siguientes
 * operaciones:
 * <ul>
 * <li>La suma de todos los números</li>
 * <li>La resta de todos los números</li>
 * <li>La media de todos los números</li>
 * </ul>
 *
 * @author Marcelo version 1.0
 * 
 * 
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// manera 1

		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, suma, resta;
		double media = 0.0;
		n1 = 9;
		n2 = 5;
		n3 = 6;
		n4 = 2;
		n5 = 7;
		n6 = -8;
		n7 = -4;
		n8 = -1;
		n9 = -3;
		n10 = -10;
		suma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
		resta = n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9 - n10;
		media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10f;

		System.out.println("La suma   es: " + suma);
		System.out.println("La resta  es: " + resta);
		System.out.println("La media  es: " + media);

		// Sacar Media

		int array[] = { 9, 5, 6, 2, 7, -8, -4, -1, -3, -10 };

		for (int i = 0; i < array.length; i++) {

			media = media + array[i];
		}

		media = media / array.length;

		// saber temperatura de la semana

		int temperaturaSemana[] = { 10, 16, 19, 20, 23, 21, 20 };
		String diasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		float mediaSemana = 0;
		float sumatorioSemana = 0;

		for (int i = 0; i < temperaturaSemana.length; i++) {

			System.out.println(diasSemana[i] + " hace " + temperaturaSemana[i] + " grados");

			// mediaSemana += temperaturaSemana[i]; // mediaSemana = mediaSemana +
			// mediaSemana se abrevia +=

			System.out.printf("%s hace %s grados \n", diasSemana[i], temperaturaSemana[i]);
		} // for
// calcular media con 2 decimales

		mediaSemana = sumatorioSemana / temperaturaSemana.length;

		System.out.println("Media de la semana es: " + (mediaSemana / temperaturaSemana.length));

	}
}
