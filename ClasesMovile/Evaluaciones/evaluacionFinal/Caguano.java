package evaluacionFinal;

public class Caguano extends Carro {

	// atributos
	private int alcanceTiro;
	private String colorConfeti;

	/**
	 * 
	 */
	public Caguano() {
		super();
	}

	/**
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param fila
	 * @param columna
	 * @param alcanceTiro
	 * @param colorConfeti
	 */
	public Caguano(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int alcanceTiro,
			String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	/**
	 * @return the alcanceTiro
	 */
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	/**
	 * @return the colorConfeti
	 */
	public String getColorConfeti() {
		return colorConfeti;
	}

	/**
	 * @param alcanceTiro the alcanceTiro to set
	 */
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	/**
	 * @param colorConfeti the colorConfeti to set
	 */
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	
	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}


}
