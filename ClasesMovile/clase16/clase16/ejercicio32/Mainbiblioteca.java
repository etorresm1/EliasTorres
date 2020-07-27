package clase16.ejercicio32;

import java.util.Scanner;

public class Mainbiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leer=new Scanner(System.in);
		
		
		String titulo;
		int año;
		String tipo;
		int cantidad;
		
		
		System.out.print("INTRODUZCA LA CANTIDAD DE PUBLICACIONES: ");
		cantidad=leer.nextInt();
		
		
		
		Biblioteca publicaciones[]=new Biblioteca[cantidad]; 
		
		for (int i = 0; i < publicaciones.length; i++) {
			
			leer.nextLine(); //TRUQUILLO PARA QUE NO SE SALTE	
			
			System.out.println("INTRODUZCA LA PUBLICACION "+(i+1));
			
			
			System.out.print("INTRODUZCA EL TÍTULO: ");
			titulo=leer.nextLine();	
			
			System.out.print("INTRODUZCA EL AÑO: ");
			año=leer.nextInt();	
			
			System.out.print("INTRODUZCA EL TIPO: ");
			tipo=leer.next();
			
			System.out.print("INTRODUZCA ESTADO:(1.-PRESTADO, 2.-EN LA BIBLIOTECA:   ");
			cantidad=leer.nextInt();	
			
			 System.out.println("");
			publicaciones[i]= new Biblioteca(titulo,año,tipo,cantidad); //rellenar  el arreglo de objetos
		
		}
		
		
		
		
		// PARA IMPRIMIR UN ARREGLO NECESITAMOS UN CICLO
		for (int i = 0; i < publicaciones.length; i++) {
			
			System.out.println(publicaciones[i].toString());
			System.out.println("");
		}
		
		//LLAMO novia1
		
		int cp=cuentaPrestados(publicaciones);
		System.out.println("CANTIDAD DE PRESTADO: "+ cp);

		//LLAMO novia2
	
		int cpp=publicacionesAnteriores(publicaciones,1990);
		System.out.println("PUBLICACIONES ANTERIORES A 1990: "+ cpp);
		
	
		
	} // END MAIN
	
	
	
	// METDOS QUE ME PIDEN EJERCICIO
	
	
	//NOVIA1
	public static int cuentaPrestados( Biblioteca publicaciones[]) {
		int prestados=0;
		
		
		for (int i = 0; i < publicaciones.length; i++) {
			
			if (publicaciones[i].cantidad==1) {
				prestados++;	
			}
				 
				 
				
				 
			} 
					
		return prestados;
	}

	
	// NOVIA 2
	public static int publicacionesAnteriores( Biblioteca publicaciones[], int año) {
		int cantpublicaciones=0;
		
		for (int i = 0; i < publicaciones.length; i++) {
			
			if (publicaciones[i].año<año) {
				cantpublicaciones++;
			}
				 
		}		 
		
				
		
		return cantpublicaciones;
	}
	
	
	

}
