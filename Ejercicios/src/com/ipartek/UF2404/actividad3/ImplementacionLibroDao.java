package com.ipartek.UF2404.actividad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ImplementacionLibroDao implements LibroDao {

	// Definir un HashMap
	private static HashMap<Integer, Libro> hmLibros; // es como un array list perro mas
														// rapido, lo buscamos por un
														// indice
	ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	private int indice = 0;
	private static ImplementacionLibroDao INSTANCE = null;

	private ImplementacionLibroDao() {
		super();
		hmLibros = new HashMap<Integer, Libro>();
		hmLibros.put(1, new Libro(1, "La bruma verde", 500)); // en el hasMap usamos put para agregar un libro, ya en
																// array list usamos add
		hmLibros.put(2, new Libro(2, "A prueba de fuego", 600));
		hmLibros.put(3, new Libro(3, "Liberación", 300));
		hmLibros.put(4, new Libro(4, "El trueno en el reino", 400));
		indice = 5;
	}

	public static synchronized ImplementacionLibroDao GetInstance() {

		if (INSTANCE == null) {
			INSTANCE = new ImplementacionLibroDao();
		}

		return INSTANCE;
	}

	@Override
	public List<Libro> getAll() {

		ArrayList<Libro> libros = new ArrayList<Libro>(hmLibros.values());
		// ordenacion por defecto que hemos definido en el Libro implements Comparable
		// Collections.sort(libros);

		// ordenacion por paginas que hemos creado una nueva Clase que implements
		// Comparator<Libro>
		libros.sort(new LibroComparatorPaginas());// Aqui llamamos la clase Libro con sort y ordenamos por numero de
													// paginas.
		return libros;
	}

	@Override
	public Libro getById(int id) {

		return null;
	}

	@Override
	public boolean delete(int id) {

		return (hmLibros.remove(id) == null) ? false : true; // si remove(id) es igual a nulo sera false, pero si
																// hay dato es igual a true
	}

	@Override
	public boolean insert(Libro l) {

		boolean resultado = false; // sirve para comprobar si existe el nombre.
		boolean encontrado = false;
		String nombreLibro = l.getNombre();

		// buscar si existe el nombre en hashmap, recorriendo uno a uno todos los libros

		for (Iterator<Libro> iterator = hmLibros.values().iterator(); iterator.hasNext();) {

			Libro libroIteracion = iterator.next();
			if (nombreLibro.equalsIgnoreCase(libroIteracion.getNombre())) {
				encontrado = true;
				break; // salimos del if si es encontrado
			}

		} // for

		// si no existe, insertalo y actualizar id

		if (!encontrado) {
			l.setId(indice); // setear el id en el objeto
			hmLibros.put(indice, l); // guardar objeto en hasmap
			indice++; // aqctualizar el indice para la sigueinte insercción
			resultado = true;
		}

		return resultado;

	}// insert

}
