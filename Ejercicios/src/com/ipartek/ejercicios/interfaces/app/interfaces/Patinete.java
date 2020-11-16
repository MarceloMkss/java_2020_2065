package com.ipartek.ejercicios.interfaces.app.interfaces;

public class Patinete implements IVehiculo, AutoCloseable {

	// Atributos

	int velocidadActual;
	boolean estaArrancado;

	// Construtores

	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
	}

	public Patinete(int velocidadActual, boolean estaArrancado) {
		super();
		this.velocidadActual = velocidadActual;
		this.estaArrancado = estaArrancado;
	}

	// Geters y Seters

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	// toString

	@Override
	public String toString() {
		return "Patinete [velocidadActual=" + velocidadActual + ", estaArrancado=" + estaArrancado + "]";
	}

	@Override
	public void arrancar() {

		if (!this.estaArrancado) {
			this.estaArrancado = true;
		}

	}

	@Override
	public void Acelerar(int incrementoVel) {

		if (this.isEstaArrancado()) {
			int nuevaVelocidad = this.getVelocidadActual() + incrementoVel;
			if (nuevaVelocidad < VEL_MAX_PATINETE) {
				this.setVelocidadActual(nuevaVelocidad);
			} else {
				this.setVelocidadActual(VEL_MAX_PATINETE);
			}
		}

	}

	@Override
	public void Frenar(int decrementoVel) {

		if (this.isEstaArrancado()) {
			int nuevaVelocidad = this.getVelocidadActual() - decrementoVel;
			if (nuevaVelocidad > 0) {
				this.setVelocidadActual(nuevaVelocidad);
			} else {
				this.setVelocidadActual(0);
			}
		}

	}

	@Override
	public void Apagar() throws Exception {

		if (this.estaArrancado && this.velocidadActual > 0) {
			throw new Exception("No se puede apagar estando acelerado " + this.velocidadActual + " km/h");
		} else {
			this.estaArrancado = false;
		}
	}

	@Override
	public void close() throws Exception {

		System.out.println("Cerramos el patinete");
		Apagar();

	}

}
