package com.ipartek.ejercicios.herencia;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.Television;
import com.ipartek.pojo.TelevisionPlana;

public class PruebaElectrodomestico {

	private static boolean isValue = false;
	private static int opc = 0;
	private static Scanner entrada = new Scanner(System.in);
	private static ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();

	public static void main(String[] args) {

		do {
			menu();

			System.out.println("Introduzca una opcion del menu: ");
			opc = Integer.parseInt(entrada.nextLine());

			switch (opc) {
			case 1:
				pedirDatos();
				break;

			case 2:
				editarDatos();

				break;

			default:
				break;
			}

		} while (!isValue);

		System.out.println("fin");

		/*
		 * for (Electrodomestico electro : lista) { // hacemos un foreach
		 * 
		 * /* if (electro instanceof Television) {
		 * 
		 * // podemos castear usando (Television) y asi nos permite acceder a los
		 * metodos // de esa clase ((Television) electro).getPulgadas();
		 * 
		 * }./
		 * 
		 * if (electro instanceof TelevisionPlana) {
		 * 
		 * // tambien podemos castear y asignarlo a una variable nueva TelevisionPlana
		 * tvp = (TelevisionPlana) electro; tvp.getTipoPantalla(); }
		 */

	}

	private static void editarDatos() {

		lista = new ArrayList<Electrodomestico>();

		entrada = new Scanner(System.in);
		System.out.println("ingrese el nombre del Televisor: ");
		String nombre = entrada.nextLine();

		System.out.println("ingrese el Precio del Televisor: ");
		int precio = Integer.parseInt(entrada.nextLine());

		System.out.println("ingrese las Pulgadas del Televisor: ");
		int pulgadas = Integer.parseInt(entrada.nextLine());

		System.out.println("ingrese el Tipo de Pantalla del Televisor: ");
		String tipoPantalla = entrada.nextLine();

		Electrodomestico lavadora = new Electrodomestico();
		lavadora.setNombre("lavadora balay");
		lavadora.setPrecio(300);
		lista.add(lavadora);

		Electrodomestico microondas = new Electrodomestico();
		microondas.setNombre(nombre);
		microondas.setPrecio(precio);
		lista.add(microondas);

		TelevisionPlana tvp = new TelevisionPlana();
		tvp.setNombre(nombre);
		tvp.setPrecio(precio);
		tvp.setPulgadas(pulgadas);
		tvp.setTipoPantalla(tipoPantalla);

	}

	private static void menu() {
		System.out.println("*.*.....................Bien Venido al Programa................*.*");
		System.out.println("*.*............................................................*.*\n");
		System.out.println("1.Adicionar un Electrodomestico");
		System.out.println("2.Editar un Electrodomestico");
		System.out.println("3.Eliminar un Electrodomestico");
		System.out.println("4.Salir");

	}

	private static void pedirDatos() {

		lista = new ArrayList<Electrodomestico>();

		entrada = new Scanner(System.in);
		// Integer.parseInt(JOptionPane.showInputDialog("ingrese el nombre del
		// Televisor: "));
		System.out.println("ingrese el nombre del Televisor: ");
		String nombre = entrada.nextLine();

		System.out.println("ingrese el Precio del Televisor: ");
		int precio = Integer.parseInt(entrada.nextLine());

		System.out.println("ingrese las Pulgadas del Televisor: ");
		int pulgadas = Integer.parseInt(entrada.nextLine());

		System.out.println("ingrese el Tipo de Pantalla del Televisor: ");
		String tipoPantalla = entrada.nextLine();

		Electrodomestico lavadora = new Electrodomestico();
		lavadora.setNombre("lavadora balay");
		lavadora.setPrecio(300);
		lista.add(lavadora);

		Electrodomestico microondas = new Electrodomestico();
		microondas.setNombre(nombre);
		microondas.setPrecio(precio);
		lista.add(microondas);

		TelevisionPlana tvp = new TelevisionPlana();
		tvp.setNombre(nombre);
		tvp.setPrecio(precio);
		tvp.setPulgadas(pulgadas);
		tvp.setTipoPantalla(tipoPantalla);

		;
		// ejemplo 1 pedindo datos por consola

		Television tele = new Television();
		tele.setNombre(nombre);
		tele.setPrecio(precio);
		tele.setPulgadas(pulgadas);
		lista.add(tele);

		// ejemplo 2 con los datos colocados

		TelevisionPlana tele2 = new TelevisionPlana();
		tele2.setNombre("LG");
		tele2.setPrecio(600);
		tele2.setPulgadas(100);
		tele2.setTipoPantalla("XL");
		lista.add(tele2);

		for (Electrodomestico electro : lista) {

			// TODO en vez de usar syso, castear y mostrar datos con getters

			System.out.printf("Nombre: %s \n", electro.getNombre());
			System.out.printf("Nombre: %s \n", electro.getPrecio());

			if (electro instanceof Television) {

				// podemos castear usando (Television) y asi nos permite acceder a los metodos
				// de esa clase

			}

			if (electro instanceof Television) {

			}

			if (electro instanceof TelevisionPlana) {

				// tambien podemos castear y asignarlo a una variable nueva
				TelevisionPlana tvp1 = (TelevisionPlana) electro;
				tvp1.getNombre();
				tvp1.getPrecio();
				tvp1.getPulgadas();
				tvp1.getTipoPantalla();

				System.out.println(tvp1.getNombre() + tvp1.getPrecio() + tvp1.getPulgadas() + tvp1.getTipoPantalla());

			}
		}
	}

}
