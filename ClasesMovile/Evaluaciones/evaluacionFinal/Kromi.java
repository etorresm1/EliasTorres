package evaluacionFinal;

public class Kromi extends Carro {

	// atributos
	private String anioFabricacion;
	private String marca;

	/**
	 * 
	 */
	public Kromi() {
		super();
	}

	/**
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param fila
	 * @param columna
	 * @param anioFabricacion
	 * @param marca
	 */
	public Kromi(int cantidadOcupantes, String fechaIngreso, int fila, int columna, String anioFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}

	/**
	 * @return the anioFabricacion
	 */
	public String getAnioFabricacion() {
		return anioFabricacion;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param anioFabricacion the anioFabricacion to set
	 */
	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}

}
