package evaluacionFinal;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		 Tablero tableroFinal = new Tablero();

	        tableroFinal.mostrarMatriz();
	        tableroFinal.crearCarro();
	        int menu = 0;
	        do {
	            System.out.println();
	            System.out.println();
	            System.out.println("================");
	            System.out.println("||----Menu----||" + "\n================");

	            System.out.println("[    1.- Lanzar Huevo     ]");
	            System.out.println("[    2.- Mostrar Matriz   ]");
	            System.out.println("[    3.- Mostrar puntaje  ]");

	            System.out.println("{    0.- Salir del programa  }");

	            System.out.println("Ingresa tu Opción");
	            menu = sc.nextInt();


	            switch (menu) {

	                case 1:
	                    System.out.println("-------Lanzar Huevo--------" + "\n______________________");
	                    System.out.println("Ingresa las coordenadas donde lanzaras el huevo" + "\n recuerda que las coordenadas son del 0 al 14");
	                    System.out.println();


	                    System.out.println("Ingresa el numero de la fila: ");
	                    int fila = sc.nextInt();
	                    System.out.println("Ingresa el numero de la columna: ");
	                    int columna = sc.nextInt();


	                    if (tableroFinal.golpeaCarro(fila, columna)) {
	                        System.out.println("¡Felicidades le diste! :)");
	                    } else {
	                        System.out.println("Lo siento, No le diste a nada :(");
	                    }
	                    tableroFinal.lanzarHuevo(fila, columna);

	                    break;

	                case 2:

	                    tableroFinal.mostrarMatriz();
	                    break;

	                case 3:
	                    tableroFinal.puntajeTotal();
	                    break;
	            }
	        }
	        while (menu != 0);

    }

}
