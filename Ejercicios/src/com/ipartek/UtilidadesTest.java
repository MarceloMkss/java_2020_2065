package com.ipartek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.ipartek.ejercicios.excepciones.Utilidades;
import com.ipartek.pojo.Serie;

class UtilidadesTest {

	@Test
	void testCalcularVueltas() throws Exception {

		Utilidades util = new Utilidades(); // llamo a la clase Utilidades a la cual hare los testes, le damos un nombre
											// "util" y creamos con new Utilidades();

		assertEquals(50, util.calcularVueltas(100, 50));
		assertEquals(0, util.calcularVueltas(100, 100));

		try {
			util.calcularVueltas(50, 150);
			fail("deberia haber lanzado Exception");
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	@Test
	void testImprimirNumeroLoteria() {

		Utilidades util = new Utilidades();
		try {
			util.imprimirNumeroLoteria(1);
			util.imprimirNumeroLoteria(2);
			util.imprimirNumeroLoteria(3);
			assertTrue(true);
		} catch (Exception e) {
			fail("No deberia haber lanzado exception");
		}

		try {
			util.imprimirNumeroLoteria(4); // exception
			fail("Deberia haber lanzado exception");
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	public Serie pedirDatosPorConsola() {
		Serie serie = new Serie("");
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre:");
		serie.setNombre(sc.nextLine());

		System.out.println("Duración en minutos:");
		serie.setDuracion(Integer.parseInt(sc.nextLine()));

		System.out.println("Número de temporadas:");
		serie.setNumTemporadas(Integer.parseInt(sc.nextLine()));

		System.out.println("Plataforma en la que esta disponble:");
		serie.setPlataforma(sc.nextLine());

		sc.close();
		return serie;
	}

}
