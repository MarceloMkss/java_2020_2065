package com.ipartek.pojo;

public class Perro extends Mamifero implements Comparable<Perro> {

	public static final String RAZA_POR_DEFECTO = "cruce";

	// Atributos, deben ser siempre privados
	// la forma de manipular estos atributos es a traves de los getteres y settres
	///////////////////////////////////////
	private int id;
	private String raza;
	private float peso;
	private boolean isVacunado;
	private String historia;

	// Constructores
	///////////////////////////////////////
	public Perro() {
		super("Sin nombre");
		this.id = 0;
		this.raza = "Cruce";
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez....";
	}

	// otro constructor sobrecargado

	public Perro(String nombre) {
		super(nombre);
		this.id = 0;
		this.raza = RAZA_POR_DEFECTO;
		this.peso = 0f;
		this.isVacunado = false;
		this.historia = "Erase una vez....";
	}

	public Perro(int id, String nombre) {
		super(nombre);
		this.id = id;

	}

	public Perro(String nombre, String raza, float peso) {
		super(nombre);
		// CUIDADO si tienen algo especial los settres usarlos

		this.setRaza(raza); // aqui usamos los seters por ser especial y haver puesto datos en el set
		this.setPeso(peso);

	}

	// Getters y setters
	///////////////////////////////////////

	public String getRaza() {
		return raza;
	}

	/**
	 * Comprobamos que sea una raza valida, si es null o vacio usamos la constante
	 * RAZA_POR_DEFECTO
	 * 
	 * @param raza
	 */

	public void setRaza(String raza) {

		if (raza != null) {

			this.raza = RAZA_POR_DEFECTO;

			if (raza.trim().isEmpty()) {

				raza = RAZA_POR_DEFECTO;
			}
		}
		this.raza = raza;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso < 0) {
			this.peso = 0;
		} else {
			this.peso = peso;
		}
	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Perro [id=" + id + ", raza=" + raza + ", peso=" + peso + ", isVacunado=" + isVacunado + ", historia="
				+ historia + ", getNombre()=" + getNombre() + ", getPatas()=" + getPatas() + "]";
	}

	@Override
	public int compareTo(Perro o) {

		return (int) (this.peso - o.getPeso());
	}
}
