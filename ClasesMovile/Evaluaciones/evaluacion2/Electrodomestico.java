package evaluacion2;

public class Electrodomestico {

	// constantes
	protected final static String COLOR_POR_DEFECTO = "blanco";
	protected final static char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
	protected final static double PRECIO_BASE_POR_DEF = 100000;
	protected final static double PESO_POR_DEFECTO = 5;

	// atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// constructor por defecto
	public Electrodomestico() {
		this(PRECIO_BASE_POR_DEF, PESO_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO);
	}

	// contructor precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO);
	}

	// constructor con todos los atributos
	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	// get
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	// fin get

	// metodos
	public void comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
		}

	}

	private void comprobarColor(String color) {

		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean existe = false;

		for (int i = 0; i < colores.length && !existe; i++) {
			if (colores[i].equals(color)) {
				existe = true;
			}
		}

		if (existe) {
			this.color = color;
		} else {
			this.color = COLOR_POR_DEFECTO;
		}
	}

	public double precioFinal() {
		double plus = 0;
		switch (consumoEnergetico) {
		case 'A':
			plus = plus + 100000;
			break;
		case 'B':
			plus = plus + 80000;
			break;
		case 'C':
			plus = plus + 60000;
			break;
		case 'D':
			plus = plus + 50000;
			break;
		case 'E':
			plus = plus + 30000;
			break;
		case 'F':
			plus = plus + 10000;
			break;
		}

		if (peso >= 0 && peso < 19) {
			plus = plus + 10000;
		} else if (peso >= 20 && peso < 49) {
			plus = plus + 50000;
		} else if (peso >= 50 && peso <= 79) {
			plus = plus + 80000;
		} else if (peso >= 80) {
			plus = plus + 100000;
		}

		return precioBase + plus;
	}
}
