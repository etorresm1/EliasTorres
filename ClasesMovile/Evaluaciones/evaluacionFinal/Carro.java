package evaluacionFinal;

import java.util.Arrays;

public class Carro {

	// atributos
	public int cantidadOcupantes;
	public String fechaIngreso;
	public int fila;
	public int columna;

	/**
	 * 
	 */
	public Carro() {
		super();
	}

	/**
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param fila
	 * @param columna
	 */
	public Carro(int cantidadOcupantes, String fechaIngreso, int fila, int columna) {
		super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.fila = fila;
		this.columna = columna;
	}

	/**
	 * @return the cantidadOcupantes
	 */
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	/**
	 * @param cantidadOcupantes the cantidadOcupantes to set
	 */
	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	/**
	 * @return the fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}

	/**
	 * @return the columna
	 */
	public int getColumna() {
		return columna;
	}

	/**
	 * @param columna the columna to set
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", fila=" + fila
				+ ", columna=" + columna + "]";
	}

}
