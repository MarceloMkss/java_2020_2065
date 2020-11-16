package com.ipartek.ejercicio.carro;

/**
 * Realizar un programa que nos cree una lista de coches.<br>
 * para ello deberá almacenarse dentro de esta lista los objetos de tipo coche
 * que crearemos en la clase coche.<br>
 * tendrá los siguientes atributos:<br>
 * <ul>
 * <li>matricula</li>
 * <li>marca</li>
 * <li>modelo</li>
 * <li>color</li>
 * <li>potencia</li>
 * <li>cilindrada</li>
 * </ul>
 * Para rellenar la lista se creara un menú que nos solicitara introducir los
 * datos por teclado, y una vez leídos todos, se guardaran en un objeto que se
 * añadirá a la lista y nos pedirá que indiquemos si queremos introducir un
 * vehículo más o no.<br>
 * Una vez que no queramos introducir más coches, nos mostrara todo el contenido
 * en pantalla.<br>
 * Realizar el ejercicio en base a las reglas de programación orientada a
 * objetos.<br>
 * 
 * @author Marcelo Kleibson de Souza Silva
 *
 */

public class Coche implements IVehiculo {

	// Atributos

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int potencia;
	private int cilindrada;

	// Construtor

	public Coche() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.potencia = 0;
		this.cilindrada = 0;

	}

	public Coche(String matricula, String marca, String modelo, String color, int potencia, int cilindrada) {

		this();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

//Geters y Seters

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	// toString

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}

	@Override
	public void menu() {

	}

	@Override
	public void pedirDatos() {

	}

	@Override
	public void mostrarDatos() {

	}

	@Override
	public void continuar() {

	}

}
