package evaluacion2;

public class Television extends Electrodomestico {

	// constantes
	private final static int RESOLUCION_POR_DEFECTO = 20;

	// atributos
	private int resolucion;
	private boolean sintonizadorTDT;

	// constructor por defecto
	public Television() {
		this(PRECIO_BASE_POR_DEF, PESO_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO,
				RESOLUCION_POR_DEFECTO, false);
	}

	// constructor precio y peso
	public Television(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO_POR_DEFECTO, COLOR_POR_DEFECTO, RESOLUCION_POR_DEFECTO, false);
	}

	// constructor resolución y sintonizador TDT
	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, peso, consumoEnergetico, color);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// get
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	// fin get

	public double precioFinal() {
		double plus = super.precioFinal();

		if (resolucion > 40) {
			plus = plus + precioBase * 0.3;
		}
		if (sintonizadorTDT) {
			plus = plus + 50;
		}

		return plus;
	}

}
