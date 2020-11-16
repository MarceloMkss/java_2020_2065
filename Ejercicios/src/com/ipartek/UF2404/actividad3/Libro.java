package com.ipartek.UF2404.actividad3;

/**
 * Realizar un programa para gestionar una librería.<br>
 * Un libro se compone de los siguientes campos ( id, nombre y número de páginas
 * ).<br>
 * Hay que realizar una interfaz gráfica donde se muestre un menú con las
 * siguientes opciones:
 * <ol>
 * <li>Listar todos los libros.</li>
 * <li>dar de baja un libro.</li>
 * <li>modificar un libro.</li>
 * <li>añadir uno nuevo.</li>
 * </ol>
 * 
 * @author Marcelo Kleibson de Souza Silva
 *
 */

// pojo Libro

public class Libro implements Comparable<Libro> { // usamos comparable para hacer la ordenacion de una lista

	int id;
	String nombre;
	int numeroPaginas;

	public Libro() {
		super();
		this.id = 0;
		this.nombre = "";
		this.numeroPaginas = 0;
	}

	public Libro(String nombre, int numeroPaginas) {
		this();
		this.nombre = nombre;
		this.numeroPaginas = numeroPaginas;
	}

	public Libro(int id, String nombre, int numeroPaginas) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.numeroPaginas = numeroPaginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Libro [id = " + id + ", nombre = " + nombre + ", numeroPaginas = " + numeroPaginas + "]";
	}

	@Override
	public int compareTo(Libro arg0) {

		return this.nombre.compareTo(nombre);
	}

}
