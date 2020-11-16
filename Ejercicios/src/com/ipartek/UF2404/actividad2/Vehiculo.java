package com.ipartek.UF2404.actividad2;

public class Vehiculo implements IConducible {

	// Atributos

	private String color;
	private String matricula;
	private boolean iSestaArrancado = false;
	private boolean iSParado = false;

	// Construtor

	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
	}

	public Vehiculo(String color, String matricula) {
		this();
		this.color = color;
		this.matricula = matricula;
	}

	// Geters y Seters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isiSestaArrancado() {
		return iSestaArrancado;
	}

	public void setiSestaArrancado(boolean iSestaArrancado) {
		this.iSestaArrancado = iSestaArrancado;
	}

	public boolean isiSParado() {
		return iSParado;
	}

	public void setiSParado(boolean iSParado) {
		this.iSParado = iSParado;
	}

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + ", iSestaArrancado=" + iSestaArrancado
				+ ", iSParado=" + iSParado + ", getColor()=" + getColor() + ", getMatricula()=" + getMatricula()
				+ ", isiSestaArrancado()=" + isiSestaArrancado() + ", isiSParado()=" + isiSParado() + "]";
	}

	@Override
	public void arrancar() {

		if (!this.iSestaArrancado) {
			this.iSestaArrancado = true;
			System.out.println("\n el coche esta arrancado \n");
		}

	}

	@Override
	public void parar() {

		if (this.iSestaArrancado) {
			System.out.println("Deberias parar");
		} else {
			this.iSestaArrancado = false;
		}

	}

}
