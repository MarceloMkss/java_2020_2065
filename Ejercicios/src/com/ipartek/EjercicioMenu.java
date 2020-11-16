
package com.ipartek;

import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones.
 * <ul>
 * <li>Calcular la letra del dni</li>
 * <li>Calcular medida de cm a pulgadas</li>
 * <li>Salir</li>
 * </ul>
 * Hacer quedicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado.
 * 
 * @author Marcelo Kleibson
 *
 */

public class EjercicioMenu {

	static private Scanner entrada = new Scanner(System.in);
	static private int opc = 0;
	static private boolean repetir = true;
	static final private char LETRAS_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	static public char letra;
	static private int posicion;
	static public String dniNumeros;
	static public String dniCompleto;

	public static void main(String[] args) {

		do {
			menu();

			switch (opc) {

			case 1:

				break;

			case 2:
				Medida();

				break;

			case 3:
				repetir = false;
				break;

			default:
				break;
			}// Switch
		} while (repetir);

	}// Main

	private static String calculaDni(String numeros) throws Exception {

		System.out.println("Dime los 8 numeros de tu dni:");
		dniNumeros = entrada.nextLine();

		try {
			dniCompleto = (dniNumeros);
			System.out.println("Tu DNI copleto es: " + dniCompleto);
		} catch (Exception e) {
			System.out.println(" Lo sentimos pero tu dni no es valido " + dniNumeros);
		}

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		// posicion de la letra

		try {
			posicion = Integer.parseInt(numeros) % 23;
			letra = LETRAS_DNI[posicion];

		} catch (Exception e) {
			throw new Exception("No es un numero correcto " + numeros);
		}

		System.out.println(":" + numeros + letra);

		return numeros + letra;

	}// CalcularLetraDni

	private static void Medida() {

		System.out.println("2. Introduzca la medida em cm: ");
		double centimetro = entrada.nextDouble();
		double pulgadas;
		pulgadas = (centimetro * 0.39370);

		System.out.println("la conversion de: " + centimetro + "cm" + " = " + pulgadas + " Pulgadas" + "\n");

	}

	private static void menu() {

		System.out.println("................BIEN VENIDO AL PROGRAMA.................");
		System.out.println("........................................................");
		System.out.println("1. Calcular letra Dni");
		System.out.println("2. Calcular medida de cm a pulgadas");
		System.out.println("3. Salir\n");

		System.out.println("elija una Opcion del menu: ");
		opc = entrada.nextInt();

	}

}
