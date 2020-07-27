package clase12.ejercicio25;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CantidadRepiteCaracter {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		String cadena = "";
		System.out.println("Escriba algo ");
		cadena = lector.nextLine();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>();

		for (int i = 0; i < cadena.length(); ++i) {
			char charAt = cadena.charAt(i);

			if (!numChars.containsKey(charAt)) {
				numChars.put(charAt, 1);
			} else {

				numChars.put(charAt, numChars.get(charAt) + 1);
			}
		}

		Iterator it = numChars.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove();
		}

	}

}
