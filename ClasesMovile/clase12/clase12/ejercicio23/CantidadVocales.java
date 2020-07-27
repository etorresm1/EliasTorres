package clase12.ejercicio23;
import java.util.Scanner;

public class CantidadVocales {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		String palabra;
		int contador = 0;

		System.out.println("Escribe lo que quieras");
		palabra = leer.nextLine();

		for (int x = 0; x < palabra.length(); x++) {
			if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'i')
					|| (palabra.charAt(x) == 'o') || (palabra.charAt(x) == 'u')) {
				contador++;
			}
		}
		
		System.out.println("La palabra " + palabra + "contiene " + contador + " vocales");

	}

}
