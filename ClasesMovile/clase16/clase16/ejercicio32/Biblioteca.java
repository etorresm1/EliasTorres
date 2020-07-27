package clase16.ejercicio32;

public class Biblioteca {

	String Titulo;
	int año;
	String tipo;
	int cantidad;

	public Biblioteca(String titulo, int año, String tipo, int cantidad) {
		super();
		Titulo = titulo;
		this.año = año;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}

	// getters and setters

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Titulo: " + Titulo + "\n Año= " + año + "\n Tipo= " + tipo;

	}

}
