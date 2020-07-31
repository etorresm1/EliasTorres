package ejercicios.profe3;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	// crearemos arraylist
	static ArrayList<Auto> auto = new ArrayList<>();
	static ArrayList<Camioneta> camioneta = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerAutos();
		MostrarAutos();
		leerCamioneta();
		MostrarCamioneta();
	}

	// metodo para intrucir autos
	public static void leerCamioneta() {

		String patente;
		String marca;
		String modelo;
		int km;
		int cant_puertas;
		String tipo;

		// declaramos variables
		Camioneta aux;
		int i, N;

		// pedir al usuario que ingrese cuantas camionetas quieres ingresar
		do {

			System.out.println("Ingrese numero de camionetas a ingresar");
			N = sc.nextInt();

		} while (N < 0);
		sc.nextLine();

		// lectura de datos
		for (i = 1; i <= N; i++) {

			System.out.println("Camioneta: " + i);
			System.out.println("Patente: ");
			patente = sc.nextLine();
			System.out.println("Marca: ");
			marca = sc.nextLine();
			System.out.println("Modelo: ");
			modelo = sc.nextLine();
			System.out.println("Numero de kilometros: ");
			km = sc.nextInt();
			System.out.println("Cantidad de puertas: ");
			cant_puertas = sc.nextInt();
			System.out.println("Ingrese tipo de Camioneta ");
			tipo = sc.nextLine();
			// limpiar
			sc.nextLine();

			// creamos la camioneta
			aux = new Camioneta();

			aux.setPatente(patente);
			aux.setMarca(marca);
			aux.setModelo(modelo);
			aux.setKm(km);
			aux.setCant_puertas(cant_puertas);
			aux.setTipo(tipo);

			camioneta.add(aux);
		}

	}

	// metodo para imprimir todos las Camionetas
	public static void MostrarCamioneta() {
		for (int i = 0; i < auto.size(); i++) {

			System.out.println(auto.get(i).toString());

		}
	}
	
	public static void leerAutos() {

		String patente;
		String marca;
		String modelo;
		int km;

		// declaramos variables
		Auto aux;
		int i, N;

		// pedir al usuario que ingrese cuantos autos quieres ingresar
		do {

			System.out.println("Ingrese numero de autos a ingresar");
			N = sc.nextInt();

		} while (N < 0);
		sc.nextLine();

		// lectura de datos
		for (i = 1; i <= N; i++) {

			System.out.println("Auto: " + i);
			System.out.println("Patente: ");
			patente = sc.nextLine();
			System.out.println("Marca: ");
			marca = sc.nextLine();
			System.out.println("Modelo: ");
			modelo = sc.nextLine();
			System.out.println("Numero de kilometros: ");
			km = sc.nextInt();
			// limpiar
			sc.nextLine();

			// creamos el auto
			aux = new Auto();

			aux.setPatente(patente);
			aux.setMarca(marca);
			aux.setModelo(modelo);
			aux.setKm(km);

			auto.add(aux);
		}

	}

	// metodo para imprimir todos los auto
	public static void MostrarAutos() {
		for (int i = 0; i < auto.size(); i++) {

			System.out.println(auto.get(i).toString());

		}
	}

}
