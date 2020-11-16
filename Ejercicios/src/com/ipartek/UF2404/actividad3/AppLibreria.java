package com.ipartek.UF2404.actividad3;

import java.util.Scanner;

/**
 * 
 * @author Marcelo Kleibson de Souza Silva
 *
 */

public class AppLibreria extends AppGestion {

	private static Scanner entrada = null;
	private static String opc = "";
	private static boolean isValid = false;
	private static AppLibreria app = new AppLibreria(); // creamos "app" para tener acceso a la clase abstracta de
														// appGestion

	/**
	 * si lo que he recebido en la variable continuar es igual a (si). <br>
	 * y ademas ignorando mayusculas y minusculas.<br>
	 * me pide para ingresar outro livro.<br>
	 * caso no quiera adicionar otro libro.<br>
	 * escribe (no), para volver al menu Principal.
	 */
	private String continuar = "Si";

	// aqui acceso a LibroDao le pongo de nombre modelo que recibira la clase
	// ImplementacionLibroDao con GetInstance.
	static private LibroDao modelo = ImplementacionLibroDao.GetInstance();

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		do {

			pintarMenu("Libro");
			System.out.println("Introduzca una opcion del menu: \n");
			opc = entrada.nextLine();

			switch (opc) {

			case OP_LISTAR:

				app.listar();

				break;

			case OP_CREAR:
				app.crear();

				break;

			case OP_ELIMINAR:
				app.eliminar();

				break;

			case OP_MODIFICAR:
				app.modificar();

				break;

			case OP_SALIR:
				isValid = true;
				System.out.println("Has salido del programa, gracias...");

				break;

			default:
				System.out.println("no has introducido una Opcion Valida!!!!! Vuele a introducir el numero: \n");
				break;
			}

		} while (!isValid);
		entrada.close();
	}

	@Override
	protected void modificar() {
		// TODO falta terminar
		System.out.println("Introduzca el Id del libro que desea Modificar: ");
		int id = Integer.parseInt(entrada.nextLine());

	}

	@Override
	protected void eliminar() {

		System.out.println("Introduzca el Id del libro que desea eliminar: ");
		int id = Integer.parseInt(entrada.nextLine());

		System.out.println("Quieres Eliminar ese Libro: (Si/No)");
		continuar = entrada.nextLine();

		while (continuar.equalsIgnoreCase("Si")) {

			// llamar la modelo
			if (modelo.delete(id)) {
				System.out.println("Libro Eliminado");
				break;
			} else {
				System.out.println("* No se puede eliminar Libro con ID " + id);
				break;
			}
		} // while

	}// eliminar

	@Override
	protected void listar() {

		for (Libro l : modelo.getAll()) {

			// con el syso de abajo podemos sacar la lista de los libros acesando el
			// toString de Libro.java
			// System.out.println(libro);
			System.out.printf("[%s] %-35s %4s paginas \n", l.getId(), l.getNombre(), l.getNumeroPaginas());
		}

	}

	@Override
	final protected void crear() {

		int numPaginas = 0;

		System.out.println("-----Crear Nuevo Libro-----\n ");

		while (continuar.equalsIgnoreCase("Si")) {

			// pedir datos por consola
			System.out.println("Introduzca el nombre del libro: ");
			String nombre = entrada.nextLine();

			try {
				System.out.println("Introduzca el numero de paginas del libro: ");
				numPaginas = Integer.parseInt(entrada.nextLine());

			} catch (Exception e) {
				System.out.println("Error! Introduzca un numero valido ");

			}

			// crear objeto Libro, el ID no se pide porque se genera al guardar en el modelo
			Libro l = new Libro(0, nombre, numPaginas);

			// llamar al modelo
			if (modelo.insert(l)) {
				System.out.println("Libro creado con Exito, su nuevo id es  " + l.getId());
			} else {
				System.out.println("** No se pudo crear Libro, el nombre ya existe " + l.getNombre());
			}

			System.out.println("Desea Introducir otro Libro: (Si/No)");
			continuar = entrada.nextLine();

		} // while

	}

}
