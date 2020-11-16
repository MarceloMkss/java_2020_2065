package com.ipartek.UF2404.actividad2;

public class Coche extends Vehiculo {

	// Atributos

	private int id;
	private String marca;
	private String modelo;
	private int potencia;
	private int cilindrada;

	public Coche() {
		super();
		this.id = 0;
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		this.cilindrada = 0;

	}

	public Coche(String color, String matricula) {
		super(color, matricula);

	}

	public Coche(String color, String matricula, int id, String marca, String modelo, int potencia, int cilindrada) {

		super(color, matricula);
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia
				+ ", cilindrada=" + cilindrada + "]";
	}

	/*
	 * @Override public String toString() { return "Coche [id=" + id + ", marca=" +
	 * marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada=" +
	 * cilindrada + ", getId()=" + getId() + ", getMarca()=" + getMarca() +
	 * ", getModelo()=" + getModelo() + ", getPotencia()=" + getPotencia() +
	 * ", getCilindrada()=" + getCilindrada() + "]"; }
	 */

}
