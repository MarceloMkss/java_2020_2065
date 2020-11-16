package com.ipartek.UF2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static final int ADICIONAR_VEHICULO = 1;
	private static final int MOSTRAR_VEHICULO = 2;
	private static final int ELIMINAR_VEHICULO = 3;
	private static final int BUSCAR_VEHICULO = 4;
	private static final int SALIR = 5;

	private static int opc = 0;
	private static boolean isValid = true;
	private static Scanner entrada = null;
	private static ArrayList<Coche> listaCoches = new ArrayList<Coche>(); // creo la lista de coche

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		Vehiculo v = new Vehiculo();
		v.arrancar();

		do {

			menu();

			switch (opc) {

			case ADICIONAR_VEHICULO:

				adicionar();

				break;

			case MOSTRAR_VEHICULO:
				mostrar();

				break;

			case ELIMINAR_VEHICULO:
				eliminar(0);

				break;

			case BUSCAR_VEHICULO:
				buscarVehiculo(0);

				break;

			case SALIR:
				isValid = false;

				break;

			default:
				System.out.println("no has introducido una Opcion Valida!!!!! Vuele a introducir el numero: \n");
				break;
			}

		} while (isValid);

		entrada.close();

	}

	private static void buscarVehiculo(int id) {

		for (int i = 0; i < listaCoches.size(); i++) {
			if (id == listaCoches.get(i).getId()) {
				System.out.println(listaCoches.get(i).toString());
			}
		}

	}

	// metodo para eliminar un elemento de la tabla
	private static void eliminar(int id) {

		for (int i = 0; i < listaCoches.size(); i++) {

			if (id == listaCoches.get(i).getId()) {

				listaCoches.remove(i);

				System.out.println("Coche eliminado!!!!!");
				mostrar();

			}

		}

	}

	/**
	 * Pinta un menu, paea que el usuario pueda elegir una opcion.
	 */

	private static void menu() {

		System.out.println(
				"*................................BIEN VENIDO AL PROGRAMA.....................................*");
		System.out.println(
				"*............................................................................................*");
		System.out.println("1. Adicionar un Vehiculo ");
		System.out.println("2. Mostrar Vehiculo ");
		System.out.println("3. Eliminar Vehiculo ");
		System.out.println("4. Buscar Vehiculo ");
		System.out.println("5. Salir\n");

		System.out.println("Introdusca una Opcion del Menu: \n\r");
		opc = Integer.parseInt(entrada.nextLine());

	}

	/**
	 * Metodo para pedir datos al usuario para que ingrese por teclado
	 */

	private static void adicionar() {

		String continuar = "Si";

		while (continuar.equalsIgnoreCase("Si")) {

			// creo un nuevo coche
			Coche c1 = new Coche();

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

			try {
				System.out.println("Introduzca la potencia del Coche: ");
				int potencia = Integer.parseInt(entrada.nextLine());
				c1.setPotencia(potencia);

				System.out.println("Introduzca las cilindrada del Coche: ");
				int cilindrada = Integer.parseInt(entrada.nextLine());
				c1.setCilindrada(cilindrada);

			} catch (NumberFormatException e) {
				System.out.println("Deberias introducir un Numero!!!");

			}

			System.out.println("Desea Introducir otro Coche: (Si/No)");
			continuar = entrada.nextLine();

			// Guardamos c1 en la lista de Coches..estando guardada en la lista, la
			// mostraremos por pantalla con un forEach en otro metodo que se llama
			// mostrar().
			listaCoches.add(c1);

		}

		System.out.println("\r\n");

	}

	/**
	 * Metodo para mostrar la lista de coches
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
