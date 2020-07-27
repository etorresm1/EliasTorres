package clase12.grupal8;

public class ContadorDeCaracteres {

	public static void main(String[] args) {

		String s = "Hola, soy Sebastián Pìñera,y soy programador de la generación 2500, de Awakelab";
		conteo(s);

	}

	static void conteo(String cadena) {
		int numLetras = 0;
		int numDigitos = 0;
		int numEspacios = 0;

		for (char c : cadena.toCharArray()) {
			if (Character.isLetter(c)) {
				numLetras++;
			} else if (Character.isDigit(c)) {
				numDigitos++;
			} else if (Character.isWhitespace(c)) {
				numEspacios++;
			}

		}

		System.out.println("Letras: " + numLetras);
		System.out.println("Digitos: " + numDigitos);
		System.out.println("Espacios en blanco: " + numEspacios);
	}

}
