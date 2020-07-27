package clase9.ejercicio19;

import java.util.Scanner;

public class AreaCirculos {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		double area;
		double radio;
		
		System.out.println("Ingresa el racio del circulo");
		radio = leer.nextInt();
		
		
		area = Math.PI * Math.pow(radio,2);
		
		System.out.println("El area del circulo es: " + area);
	}

}
