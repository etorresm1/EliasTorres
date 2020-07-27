package clase9.ejerciciogrupal6;

import java.util.Scanner;

public class MayorQueCero {

	public static void main(String[] args) {

		Scanner leerNumero = new Scanner(System.in);
		int numero;

		do {

			System.out.println("****BIENVENIDO****");
			System.out.print("Por Favor ingrese un numero cualquiera: ");
			numero = leerNumero.nextInt();

			if (numero < 0) {
				System.out.println(" ");
				System.out.println("Debes ingresar un numero mayor que cero");
				System.out.println(" ");
			} else {
				System.out.println("Has ingresado un numero mayor que cero");
			}

		} while (numero <= 0);

		System.out.println("****FIN DE LA EJECUCION****");

	}

}
