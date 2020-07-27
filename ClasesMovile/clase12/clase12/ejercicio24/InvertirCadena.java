package clase12.ejercicio24;
import java.util.Scanner;

public class InvertirCadena {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String palabra;
		String sCadenaInvertida;
		
		System.out.println("Escriba algo");
		palabra = leer.nextLine();
		
		StringBuilder builder=new StringBuilder(palabra);

		sCadenaInvertida=builder.reverse().toString();
		
		System.out.println(sCadenaInvertida);

	}

}
