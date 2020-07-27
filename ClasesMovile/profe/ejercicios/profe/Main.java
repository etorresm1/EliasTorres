package ejercicios.profe;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Seleccion_futbol> integrantes = new ArrayList<Seleccion_futbol>();

	public static void main(String[] args) {

		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284k");
		Jugador Messi = new Jugador(2, "Leonel", "Messi", 33, 10, "Delantero");
		Masajista RaulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(Messi);
		integrantes.add(RaulMartinez);

		// concentracion
		System.out.println("Todos los integrantes comienzan la concentracion.(Todos ejecutan el mismo metodo)");

		for (Seleccion_futbol integrante : integrantes) {

			System.out.println(integrante.getNombre() + " " + integrante.getApellidos());
			integrante.concentrarse();
		}

		// viajar
		System.out.println("Todos los integrantes comienzan con el viaje.(Todos ejecutan el mismo metodo)");

		for (Seleccion_futbol integrante : integrantes) {

			System.out.println(integrante.getNombre() + " " + integrante.getApellidos());
			integrante.viajar();
		}

		// entrenamiento
		System.out.println("Todos los integrantes comienzan con el viaje.(Todos ejecutan el mismo metodo)");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
		delBosque.dirigirEntrenamiento();
		System.out.println(Messi.getNombre() + " " + Messi.getApellidos() + " -> ");
		Messi.entrenar();
	}

}
