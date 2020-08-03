package evaluacionFinal;

import java.util.ArrayList;

public class Tablero {

	private Carro[] listaCarro = new Carro[18];
	private ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>();
	public char[][] tablero = new char[15][15];

	/**
	 * 
	 */
	public Tablero() {
		super();
	}

// Metodos
	public void crearCarro() {

		crearKromi();
		crearCaguano();
		crearTrupalla();

	}

	public void lanzarHuevo() {
		int[][] disparo;
		Huevo coordenada = new Huevo();

	}

	public void mostrarMatriz() {

	}

	public int calcularPuntaje() {

		return 0;
	}

	private void crearKromi() {
		// Obtenemos una coordenada aleatoria
		int coordX = randomNumber();
		int coordY = randomNumber();
		validarKromi(coordX, coordY);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}

	private void crearCaguano() {
		int coordX = randomNumber();
		int coordY = randomNumber();
		validarCaguano(coordX, coordY);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}

	private void crearTrupalla() {
		// Obtenemos una coordenada aleatoria
		int coordX = randomNumber();
		int coordY = randomNumber();
		validarTrupalla(coordX, coordY);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}

	private int randomNumber() {

		return 0;
	}

	private boolean validarKromi(int coordX, int coordY) {

		boolean espacioLibre = false; // True si el espacio está disponible

		// Verifica que el objeto no salga de la matriz
		if (coordX + 2 < 15 && coordY < 15) {
			// Verifica que el objeto tenga espacio disponible
			for (int i = 0; i < 3; i++) {
				if (tablero[coordX + i][coordY] != '\u0000') {
					espacioLibre = false;
					break;
				} else {
					espacioLibre = true;
				}
			}
		}

		return espacioLibre;
	}

	private boolean validarCaguano(int coordX, int coordY) {

		boolean espacioLibre = false; // True si el espacio está disponible

		// Verifica que el objeto no salga de la matriz
		if (coordX < 15 && coordY + 1 < 15) {
			// Verifica que el objeto tenga espacio disponible
			for (int i = 0; i < 2; i++) {
				if (tablero[coordX][coordY + i] != '\u0000') {
					espacioLibre = false;
					break;
				} else {
					espacioLibre = true;
				}
			}
		}

		return espacioLibre;
	}

	private boolean validarTrupalla(int coordX, int coordY) {

		boolean espacioLibre = false; // True si el espacio está disponible

		// Verifica que el objeto no salga de la matriz
		if (coordX < 15 && coordY < 15) {
			// Verifica que el objeto tenga espacio disponible
			if (tablero[coordX][coordY] != '\u0000') {
				espacioLibre = false;
			} else {
				espacioLibre = true;
			}
		}

		return espacioLibre;
	}

	/**
	 * @return the listaCarro
	 */
	public Carro[] getListaCarro() {
		return listaCarro;
	}

	/**
	 * @param listaCarro the listaCarro to set
	 */
	public void setListaCarro(Carro[] listaCarro) {
		this.listaCarro = listaCarro;
	}

	/**
	 * @return the listaHuevos
	 */
	public ArrayList<Huevo> getListaHuevos() {
		return listaHuevos;
	}

	/**
	 * @param listaHuevos the listaHuevos to set
	 */
	public void setListaHuevos(ArrayList<Huevo> listaHuevos) {
		this.listaHuevos = listaHuevos;
	}
}
