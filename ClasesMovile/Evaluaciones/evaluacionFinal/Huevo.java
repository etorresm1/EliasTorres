package evaluacionFinal;

public class Huevo {

	public String fila;
	public String columna;
	private int puntajeObtenido;

	/**
	 * 
	 */
	public Huevo() {
		super();
	}

	/**
	 * @param fila
	 * @param columna
	 * @param puntajeObtenido
	 */
	public Huevo(String fila, String columna, int puntajeObtenido) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.puntajeObtenido = puntajeObtenido;
	}

	/**
	 * @return the fila
	 */
	public String getFila() {
		return fila;
	}

	/**
	 * @return the columna
	 */
	public String getColumna() {
		return columna;
	}

	/**
	 * @return the puntajeObtenido
	 */
	public int getPuntajeObtenido() {
		return puntajeObtenido;
	}

	/**
	 * @param fila the fila to set
	 */
	public void setFila(String fila) {
		this.fila = fila;
	}

	/**
	 * @param columna the columna to set
	 */
	public void setColumna(String columna) {
		this.columna = columna;
	}

	/**
	 * @param puntajeObtenido the puntajeObtenido to set
	 */
	public void setPuntajeObtenido(int puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	@Override
	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntajeObtenido=" + puntajeObtenido + "]";
	}

}
