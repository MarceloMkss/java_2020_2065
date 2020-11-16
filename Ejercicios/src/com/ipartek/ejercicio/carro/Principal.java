package com.ipartek.ejercicio.carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static Scanner entrada = new Scanner(System.in);
	private static int opc = 0;
	private static boolean isValid = true;
	private static ArrayList<Coche> listaCoches = new ArrayList<Coche>(); // creo la lista de coche

	public static void main(String[] args) {

		do {

			menu();

			switch (opc) {

			case 1:
				pedirDatos();

				break;

			case 2:
				mostrar();

				break;

			case 3:
				isValid = false;

				break;

			default:
				System.out.println("no has introducido una Opcion Valida!!!!! Vuele a introducir el numero: \n");
				break;
			}

		} while (isValid);

	}

	/**
	 * se Muestra un Menu, para que el usuario adicione datos
	 * 
	 * @author Marcelo
	 * 
	 */
	private static void menu() {

		System.out.println(
				"*................................BIEN VENIDO AL PROGRAMA.....................................*");
		System.out.println(
				"*............................................................................................*");
		System.out.println("1. Adicionar un Vehiculo ");
		System.out.println("2. Mostrar Vehiculo ");
		System.out.println("3. Salir\n");

		System.out.println("Introdusca una Opcion del Menu: \n\r");
		opc = entrada.nextInt();

	}

	/**
	 * Pedimos los datos al usuario y lo guardamos en una lista de coches
	 * 
	 * @author Marcelo
	 */

	private static void pedirDatos() {

		Coche c1 = new Coche();

		listaCoches = new ArrayList<Coche>();
		entrada = new Scanner(System.in);

		System.out.println("Introduzca la Matricula: ");
		String matricula = entrada.nextLine();
		c1.setMatricula(matricula);

		System.out.println("Introduzca la Marca del Coche: ");
		String marca = entrada.nextLine();
		c1.setMarca(marca);

		System.out.println("Introduzca el Modelo del Coche: ");
		String modelo = entrada.nextLine();
		c1.setModelo(modelo);

		System.out.println("Introduzca el Color del Coche: ");
		String color = entrada.nextLine();
		c1.setColor(color);

		System.out.println("Introduzca la potencia del Coche: ");
		int potencia = entrada.nextInt();
		c1.setPotencia(potencia);

		System.out.println("Introduzca las cilindrada del Coche: ");
		int cilindrada = entrada.nextInt();
		c1.setCilindrada(cilindrada);

		listaCoches.add(c1);

		System.out.println("\r\n");

	}

	/**
	 * 
	 * mostramos los datos adicionados por el usuario
	 * 
	 * @author Marcelo
	 * 
	 */

	private static void mostrar() {

		System.out.println("\n.................Lista de Coches................................... \r\n");

		for (Coche coches : listaCoches) {

			System.out.printf("Matricula: %s \n", coches.getMatricula());
			System.out.printf("Marca: %s \n", coches.getMarca());
			System.out.printf("Modelo: %s \n", coches.getModelo());
			System.out.printf("Color: %s \n", coches.getColor());
			System.out.printf("Potencia: %s \n", coches.getPotencia());
			System.out.printf("Cilindrada: %s \n", coches.getCilindrada());
			System.out.printf("\n");

		} // forEach

	}

}
