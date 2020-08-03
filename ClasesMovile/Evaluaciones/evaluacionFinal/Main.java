package evaluacionFinal;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Carro> listaCarros = new ArrayList<Carro>();

	public static void main(String[] args) {

		Kromi kromi1 = new Kromi(4, "03-08-2020", 3, 5, "15-12-2005", "Mercedez Benz");
		Caguano caguano1 = new Caguano(5, "03-08-2020", 2, 7, 10, "Rojo");
		Trupalla trupalla1 = new Trupalla(2, "03-08-2020", 7, 1, null, "Elias");

		listaCarros.add(kromi1);
		listaCarros.add(caguano1);
		listaCarros.add(trupalla1);

		for (Carro carros : listaCarros) {

			System.out.println("Cantidad de ocupantes: " + carros.getCantidadOcupantes() + " Fecha Ingreso: " + carros.getColumna()
					+ " " + carros.getFila() + " " + carros.getFechaIngreso());
		}

	}

}
