package com.ipartek.Examen;

import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones.<br>
 * <ul>
 * <li>Calcular la letra del dni.</li>
 * <li>Calcular medida de cm a pulgadas.</li>
 * <li>Salir.</li>
 * </ul>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado.
 * 
 * @author Marcelo Kleibson de Souza Silva
 *
 */

public class Ejercicio2 {

	static private Scanner entrada = new Scanner(System.in);
	static private int opc = 0; //
	static private boolean repetir = true; // para que me repita en bucle do while usare esa variable

	static final char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
			'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static void main(String[] args) {

		do {
			menu();

			switch (opc) {

			case 1:
				calculaDni();

				break;

			case 2:
				medida();
				break;

			case 3:
				repetir = false;
				break;

			default:
				System.out.println(" Opcion invalida.....Elija una Opcion del menu \n");
				break;
			}// Switch
		} while (repetir);
		// String letra = calculaDni("11111111");
		entrada.close();

	}

	private static void calculaDni() {

		System.out.println("Dime los 8 numeros de tu dni: \n");
		String dniNumeros = entrada.nextLine();

		try {

			String dniCompleto = calcularLetraDni(dniNumeros);
			System.out.println("Tu DNI copleto es: " + dniCompleto + "\n");

		} catch (Exception e) {

			System.out.println(" Lo sentimos pero tu dni no es valido \n" + dniNumeros + e.getMessage());
		}

	}

	/**
	 * Calcula Medida de cm a Pulgadas...
	 * 
	 */

	private static void medida() {

		System.out.println("2. Introduzca la medida em cm: ");
		double centimetro = Double.parseDouble(entrada.nextLine());
		double pulgadas;
		pulgadas = (centimetro * 0.39370);

		System.out.println("la conversion de: " + centimetro + "cm" + " = " + pulgadas + " Pulgadas" + "\n");

	}

	/**
	 * calcula la letra del dni
	 * 
	 * @param numeros los 7 numeros del dni
	 * @return dni completo, numero mas letras.... (numero + letras) = 11111111H
	 */

	static public String calcularLetraDni(String numeros) throws Exception {

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		char letra;

		int posicion = Integer.parseInt(numeros) % 23;
		letra = LETRAS_DNI[posicion];

		return numeros + letra;

	}// calcularLetraDni

	private static void menu() {

		System.out.println("................BIEN VENIDO AL PROGRAMA.................");
		System.out.println("........................................................");
		System.out.println("1. Calcular letra Dni");
		System.out.println("2. Calcular medida de cm a pulgadas");
		System.out.println("3. Salir\n");

		System.out.println("elija una Opcion del menu: ");
		opc = Integer.parseInt(entrada.nextLine());

	}

}
