package clase14.ejercicio28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		double totalCuenta = 250000.00;
		double ingreso;
		double retirar;
		boolean salir = false;
		int opcion;
		Scanner sn = new Scanner(System.in);
		Scanner leer = new Scanner(System.in);

        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(11111, 2500.70);
        
        try {
	        while(!salir){
	            
	        	System.out.println("Ingrea una de las siguientes opciones; ");
	            System.out.println("1. Ingresar Dinero");
	            System.out.println("2. Retirar Dinero");
	            System.out.println("3. Salir");
	             
	            opcion = sn.nextInt();
		        switch (opcion) {
				case 1:
					
					System.out.println("Monto a ingresar: ");
			        ingreso = leer.nextDouble();
			        
			        System.out.println("Se ingresan en la cuenta: " + "$" + ingreso);
			        Cuenta1.ingresar(ingreso);

			        totalCuenta = totalCuenta + Cuenta1.cantidad();
			        System.out.println("Total actual en la cuenta: " + "$" + totalCuenta);
			        
			        System.out.println("************************************************");
			        System.out.println(" ");
					
					break;
				case 2:
					
					System.out.println("Ingresa monto a retirar");
					retirar = leer.nextDouble();
					
					System.out.println("Se retiraron de la cuenta: " + "$" + retirar);
			        Cuenta1.retirar(retirar);

			        totalCuenta = totalCuenta - Cuenta1.cantidad();
			        System.out.println("Total actual en la cuenta: " + "$" + totalCuenta);
			        
			        System.out.println("************************************************");
			        System.out.println(" ");
					
					break;
				
				case 3:
					salir=true;
					break;
					
				default:
					System.out.println("Solo números entre 1 y 3");
				}
	        }
		} catch (InputMismatchException e) {
	        System.out.println("Debes insertar un número");
	        sn.next();
	    }

	}

}
