package com.ipartek.pojo;

public class Persona {

	// constantes
	public static final int EDAD_MIN = 0;
	public static final int EDAD_MAX = 120;

	// atributos
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	// Metodo construtor

	public Persona() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.edad = 0;

	}

	public Persona(String nombre, String apellido, String dni, int edad) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getEdadMin() {
		return EDAD_MIN;
	}

	public static int getEdadMax() {
		return EDAD_MAX;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + "]";
	}

} // Class Persona
