package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOArrayList;
import com.ipartek.modelo.PerroDao;
import com.ipartek.pojo.Perro;

/**
 * App para la gestion de una perrera:
 * 
 * <ul>
 * <li>Listar todos los perros.</li>
 * <li>Crear un perro.</li>
 * <li>Mofifica un perro.</li>
 * <li>Dar de baja un Perro.</li>
 * <li>salir.</li>
 * </ul>
 * 
 * @author Marcelo
 * @version 1.0
 */

public class AppPerrera {

	static final private String OP_LISTAR = "1";
	static final private String OP_CREAR = "2";
	static final private String OP_MODIFICAR = "3";
	static final private String OP_ELIMINAR = "4";
	static final private String OP_SALIR = "S";

	/** variables globales para esta Clase */
	static Scanner sc = null; // scanner para poder recibir los datos digitados por el usuario

	/**
	 * si encargara de hacer todas las operaciones.<br>
	 * como listar, crear, Modificar y Eliminar.
	 */

	static private PerroDao modelo = PerroDAOArrayList.getInstance();
	// static private PerroDao modelo = new PerroDAOSqlite(); // me da acceso a
	// modelo perroDAOSqlite
	static private String opcion = ""; // opcion seleccionada en el menu por el usuario
	static private boolean repetir = true; // esa variable me sirve para repetir el bucle do while y para cerrar el menu

	public static void main(String[] args) {

		System.out.println("***********  APP  PERRERA   **************");
		sc = new Scanner(System.in);

		do {

			pintarMenu(); // llama el metodo pintarMenu y imprime el menu en pantalla

			switch (opcion) {

			case OP_LISTAR:
				listar(); // modulo listar base de datos
				break;

			case OP_CREAR:
				crearPerro();
				break;

			case OP_ELIMINAR:
				eliminarPerro();
				break;

			case OP_MODIFICAR:
				// modificar();
				recuperarPerro();

				break;

			case OP_SALIR:
				repetir = false;
				System.out.println("has salido del Programa.....\n");

				break;

			default:
				System.out.println(" Opcion no valida digite un numero del menu QUE TE APARECE....");
				break;
			}

		} while (repetir); // con el booleano repetir quedaremos en el bucle hasta que sea selecionada la
							// opcion salir, si salimos desaparece el menu.

		System.out.println("***********  ADIOS, nos vemos pronto   **************");

		sc.close(); // cerramos el scanner

	}// main

	private static void recuperarPerro() {

		int id = 0;
		boolean flag = true;
		Perro pRecuperar = null;
		System.out.println("Dime el ID del perro para eliminar:"); // pedimos la id del perro
		id = Integer.parseInt(sc.nextLine());

		pRecuperar = modelo.recuperar(id);
		if (pRecuperar == null) {

			System.out.println("*Lo sentimos pero no existe ese perro");

		} else {

			flag = false; // lo ponemos a false para que salga del bucle
		}

	}

	private static void modificar() {

		listar();

		ArrayList<Perro> perros = modelo.listar();

		System.out.println("\nEscriba el nombre del perro: ");
		String nombre = sc.nextLine(); // guardamos el nombre del perro que queremos modificar en la variable "nome"...

		for (Perro perro : perros) { // hago un for each a la lista de perros
			String buscarPerro = perro.getNombre(); // guardo la busqueda del nombre del perro y la guardo en la
													// variable "buscarPerro"

			if (buscarPerro.equalsIgnoreCase(nombre)) {

				System.out.println("Escriba el nuevo nombre del perro: ");
				String nuevoNombre = sc.nextLine(); // guardamos el nuevo nombre digitado en la variable "nuevoNombre".

				perro.setNombre(nuevoNombre); // remplazamos el nombre del perro con set y le indicamos nuevoNombre.

			} // if

		} // for

		System.out.println("el perro ha sido modificado ....\n");
		listar();

	}

	private static void eliminarPerro() {

		boolean flag = true;
		int id = 0;
		Perro pEliminar = null;

		// buscar perro por id
		do {

			System.out.println("Dime el ID del perro para eliminar:"); // pedimos la id del perro
			id = Integer.parseInt(sc.nextLine()); // se guarda la id del perro en la variable id......

			pEliminar = modelo.recuperar(id);
			if (pEliminar == null) {

				System.out.println("*Lo sentimos pero no existe ese perro");

			} else {

				flag = false; // lo ponemos a false para que salga del bucle
			}

		} while (flag);

		// pedir confirmacion de nombre para eliminar

		flag = true; // Activamos para poder hacer el segundo bucle

		// creamos un segundo bucle para pedir el nombre del perro a eliminar

		do {
			System.out.printf("Por favor escribe [%s] para eliminar o \"s\" para [S]alir\n", pEliminar.getNombre());
			String nombre = sc.nextLine();

			if (OP_SALIR.equalsIgnoreCase(nombre)) {
				break; // salimos del bucle

			} else { // comprobar nombre

				if (pEliminar.getNombre().equalsIgnoreCase(nombre)) {

					try {
						modelo.eliminar(id);
						flag = false;
						System.out.println("Hemos dado de baja al perro");

					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("**No coincide el nombre**");
				}
			}

		} while (flag);
		System.out.println("has salido del Programa.....\n");
		// Atualizo la lista de Perros
		listar();

	}

	private static void crearPerro() {

		// ArrayList<Perro> perros = modelo.listar();

		System.out.println("Escriba el nombre del perro: ");
		String nombre = sc.nextLine();

		System.out.println("Escriba la raza del perro: ");
		String raza = sc.nextLine(); // controlamos en el setter que si es vacia nos ponga 'cruce'

		boolean isError = true;
		float peso = 0;

		do {

			try {

				System.out.println("Escriba el peso del perro: ");
				peso = Float.parseFloat(sc.nextLine()); // hacer nexLine para que funcione y loego parchear
				isError = false;

			} catch (Exception e) {

				System.out.println("no es un peso adecuado, por favor escribe un numero y usa puntos en vez de comas");
			}

		} while (isError);

		System.out.println("¿ Esta vacunado ?  [Si/No]");
		boolean isVacunado = ("s".equalsIgnoreCase(sc.nextLine())) ? true : false;

		System.out.println("cuentame la historia del perro (no es obrigatorio): ");
		String historia = sc.nextLine();

		// crear un Perro y setear valores

		Perro p1 = new Perro(nombre, raza, peso);
		p1.setVacunado(isVacunado);
		p1.setHistoria(historia);

		isError = true;

		do {

			try {
				modelo.crear(p1); // llamar al modelo para guardar en la bbdd
				System.out.println("Perro guardado");
				System.out.println(p1);
				isError = false;

			} catch (Exception e) {
				System.out.println("** No se ha podido guardar el perro, el nombre ya existe, por favor dime otro: ");
				nombre = sc.nextLine();
				p1.setNombre(nombre);

			}
		} while (isError);

	} // crear perro

	private static void listar() {

		// relacionamos con modelo para aceder a la clase PerroDAOSqlite
		ArrayList<Perro> lista = modelo.listar();

		for (Perro perro : lista) {

			System.out.println(
					String.format("%s %15s [%s]  %4s Kg  %13s %s", perro.getId(), perro.getNombre(), perro.getRaza(),
							perro.getPeso(), (perro.isVacunado()) ? "vacunado" : "*Sin Vacunar*", perro.getHistoria()));
		}

	} // listar

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		try {
			System.out.println("************************************");
			System.out.println(" " + OP_LISTAR + " Listar todos los perros\r\n");
			System.out.println(" " + OP_CREAR + " Crear un perro\r\n");
			System.out.println(" " + OP_MODIFICAR + " Mofifica un perro\r\n");
			System.out.println(" " + OP_ELIMINAR + " Dar de baja un Perro\r\n");
			System.out.println(" " + OP_SALIR + " Salir");
			System.out.println("************************************");

			System.out.println("\n Selecciona una opcion del menu:");
			opcion = sc.nextLine(); // se guarda el dato en opcion
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	} // crea menu

} // appPerrera
