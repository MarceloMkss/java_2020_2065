package com.ipartek.apps.cartas;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja.<br>
 * Para crear dicha lista se creara una clase de tipo carta, que tendr� un
 * n�mero entero para el valor de la carta.<br>
 * as� como un string con el palo de la baraja (copas, espadas, oros,
 * bastos).<br>
 * <ul>
 * <li>Crear la baraja con las cartas</li>
 * <li>ordenadas por palos.</li>
 * <li>ordenadas por n�meros.</li>
 * <li>Barajar dicha baraja.
 * <li>mostrar las cartas.</li>
 * </ul>
 * 
 * @author Marcelo Kleibson de Souza Silva
 *
 */

public class Carta {

	private Palo palo;
	Numero numero;

	public Carta(Palo palo, Numero numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}

}
