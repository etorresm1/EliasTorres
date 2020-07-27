package clase14.ejercicio29;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String editorial, titulo, autor;
		int paginas;

		String editorial2, titulo2, autor2;
		int paginas2;

		// PRIMER LIBRO
		System.out.println("Ingresa la editorial del primer libro");
		editorial = entrada.nextLine();

		System.out.println("Ingresar titulo del primer libro");
		titulo = entrada.nextLine();

		System.out.println("Ingresa el autor del primer libro");
		autor = entrada.nextLine();

		System.out.println("Ingresa cantidad de paginas del primer libro");
		paginas = entrada.nextInt();

		Libro a = new Libro(editorial, titulo, autor, paginas);
		a.MostrarLibro();

		// SEGUNDO LIBRO
		System.out.println("Ingresa la editorial del segundo libro");
		editorial2 = entrada.nextLine();

		System.out.println("Ingresar titulo del segundo libro");
		titulo2 = entrada.nextLine();

		System.out.println("Ingresa el autor del segundo libro");
		autor2 = entrada.nextLine();

		System.out.println("Ingresa cantidad de paginas del segundo libro");
		paginas2 = entrada.nextInt();

		Libro e = new Libro(editorial2, titulo2, autor2, paginas2);
		e.MostrarLibro();
		
	}

}
