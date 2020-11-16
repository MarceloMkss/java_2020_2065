package com.ipartek.pojo.ejercicios;

import com.ipartek.pojo.Perro;

public class Ejercicio1 {

	public static void main(String[] args) {
		Perro p1 = new Perro(); // es un metodo que llamaremos perro()

		// snoppy.nombre = "Snoppy";
		p1.setNombre("Laika");
		// snoppy.peso = -12;
		p1.setPeso(12);
		p1.setHistoria("\nEsta famosa perrita soviética fue el primer ser vivo en viajar al espacio."
				+ "\nEn 1957 emprendió su viaje y desafortunadamente murió a las 5 horas de despegar por el estrés y la falta de oxígeno."
				+ "\nEste suceso puso en el punto de mira los experimentos con animales.\nDesde entonces Laika ha sido un icono en la historia.");

		Perro p2 = new Perro();
		p2.setNombre("Hachiko");
		p2.setPeso(60);
		p2.setRaza("Pastor");
		p2.setHistoria(
				"\nPocos perros han sido tan famosos como él, llegando incluso a traspasar la pantalla y hacernos soltar alguna que otra lagrimilla."
						+ "\nEste perro de raza Akita conmocionó al mundo con su historia de lealtad y amor por su amo."
						+ "\nSu historia se hizo famosa por estar durante 10 años esperando a su dueño en la estación de metro, a pesar de que éste había muerto en uno de los trayectos.");

		Perro p3 = new Perro();
		p3.setNombre("Balto");
		p3.setPeso(60);
		p3.setRaza("Pitbull");

		Perro p4 = new Perro();
		p4.setNombre("Rin tin tin");
		p4.setPeso(60);
		p4.setRaza("Pitbull");

		System.out.println("Historia de los perros famosos");
		System.out.println(p1.getNombre() + " " + p1.getPeso() + " kg" + p1.getHistoria());
		System.out.println(p2.getNombre() + " " + p1.getPeso() + " kg" + p1.getHistoria());
		System.out.println(p3.getNombre() + " " + p1.getPeso() + " kg" + p1.getHistoria());
		System.out.println(p4.getNombre() + " " + p1.getPeso() + " kg" + p1.getHistoria());

	}

}
