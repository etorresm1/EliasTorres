package ejercicios.profe3;

public class Camioneta extends Auto {

	int cant_puertas;
	String tipo;

	public Camioneta() {

	}

	public int getCant_puertas() {
		return cant_puertas;
	}

	public void setCant_puertas(int cant_puertas) {
		this.cant_puertas = cant_puertas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// constructor
	public Camioneta(String patente, String marca, String modelo, int km, int cant_puertas, String tipo) {
		super(patente, marca, modelo, km);
		this.cant_puertas = cant_puertas;
		this.tipo = tipo;
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
