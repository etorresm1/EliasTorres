package clase13.ejercicio26;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		String password;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("introduzca contraseña");
		password=leer.nextLine();
		
		GenerarPassword password1 = new GenerarPassword();
		System.out.println((password1.esFuerte(password)));
		
	}
}
