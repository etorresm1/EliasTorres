package evaluacionFinal;

import java.util.Arrays;

public class Trupalla extends Carro {

	// Atributos
	int nivelArmadura[] = { 1, 2, 3, 4, 5 };
	private String nombreManipulador;

	/**
	 * 
	 */
	public Trupalla() {
		super();
	}

	/**
	 * @param cantidadOcupantes
	 * @param fechaIngreso
	 * @param fila
	 * @param columna
	 * @param nivelArmadura
	 * @param nombreManipulador
	 */
	public Trupalla(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int[] nivelArmadura,
			String nombreManipulador) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombreManipulador = nombreManipulador;
	}

	/**
	 * @return the nivelArmadura
	 */
	public int[] getNivelArmadura() {
		return nivelArmadura;
	}

	/**
	 * @return the nombreManipulador
	 */
	public String getNombreManipulador() {
		return nombreManipulador;
	}

	/**
	 * @param nivelArmadura the nivelArmadura to set
	 */
	public void setNivelArmadura(int[] nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	/**
	 * @param nombreManipulador the nombreManipulador to set
	 */
	public void setNombreManipulador(String nombreManipulador) {
		this.nombreManipulador = nombreManipulador;
	}

	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + Arrays.toString(nivelArmadura) + ", nombreManipulador=" + nombreManipulador
				+ "]";
	}

}
