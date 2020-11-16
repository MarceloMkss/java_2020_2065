package com.ipartek.ejercicios.interfaces.app.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PatineteTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testArrancar() {

		Patinete p = new Patinete();
		assertFalse(p.isEstaArrancado(), "deberia estar parado");

		p.setEstaArrancado(true);
		assertTrue(p.isEstaArrancado(), "deberia poder arrancarse");

	}

	@Test
	void testAcelerar() {

		Patinete p = new Patinete();
		p.Acelerar(20);
		assertFalse(p.isEstaArrancado(), "deberia estar parado");
		assertEquals(0, p.getVelocidadActual(), "no deberia haber incrementado la velocidad");

		p.setEstaArrancado(true);
		p.Acelerar(20);
		assertEquals(20, p.getVelocidadActual(), "deberia haber incrementado la velocidad");

		p.Acelerar(IVehiculo.VEL_MAX_PATINETE);
		assertEquals(IVehiculo.VEL_MAX_PATINETE, p.getVelocidadActual(), "deberia estar a tope");

		p.Acelerar(500);
		assertEquals(IVehiculo.VEL_MAX_PATINETE, p.getVelocidadActual(), "deberia estar a tope");

	}

	@Test
	void testFrenar() {

		// creo el Patinete
		Patinete p = new Patinete();

		// Arranco y acelero
		p.setEstaArrancado(true);
		p.Acelerar(50);

		// descelerar
		p.Frenar(10);
		assertEquals(40, p.getVelocidadActual(), "Deberia haber reducido la velocidad ");

		// decelerar
		p.Frenar(50);
		assertEquals(0, p.getVelocidadActual(), "Deberia haber reducido la velocidad a 0");

	}

	@Test
	void testApagar() {

		// creamos patinete
		// arrancar y acelarar
		Patinete p = new Patinete();
		p.setEstaArrancado(true);
		p.Acelerar(20);

		// probar arrancar estando en marcha
		try {
			p.Apagar();
			fail("deberia haber lanzado Exception");
		} catch (Exception e) {
			assertTrue(true);
		}

		// decelerar hasta cero
		p.Frenar(20);

		// probar de nuevo a parar
		try {
			p.Apagar();
			assertEquals(0, p.getVelocidadActual());
			assertFalse(p.isEstaArrancado());
		} catch (Exception e) {
			fail("deberia haber lanzado Exception");
		}

	}

}
