package ejercicios.profe3;

public class Auto {

	public String patente;
	public String marca;
	public String modelo;
	public int km;

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	// constructor vacio
	public Auto() {

	}

	// constructor
	public Auto(String patente, String marca, String modelo, int km) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}

	@Override
	public String toString() {
		// para imprimir tenemos clase Scanner, StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();

		sb.append("\nPatente");
		sb.append(patente);
		sb.append("\nMarca");
		sb.append(marca);
		sb.append("\nModelo");
		sb.append(modelo);
		sb.append("\nKm");
		sb.append(km);
		return sb.toString();
	}

}
