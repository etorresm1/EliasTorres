package evaluacion2;

public class Lavadora extends Electrodomestico {

	// constante
	private final static int CARGA_POR_DEFECTO = 5;

	// atributo
	private int carga;

	// constructor por defecto
	public Lavadora() {
		this(PRECIO_BASE_POR_DEF, PESO_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO,
				CARGA_POR_DEFECTO);
	}

	// contructor precio y peso
	public Lavadora(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO, CARGA_POR_DEFECTO);
	}

	// constructor carga
	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
		super(precioBase, peso, consumoEnergetico, color);
		this.carga = carga;
	}

	// get
	public int getCarga() {
		return carga;
	}
	// fin get

	// metodo
	public double precioFinal() {
		double plus = super.precioFinal();

		if (carga > 30) {
			plus = plus + 50000;
		}

		return plus;
	}

}
