package clase16.ejercicio32;

public class Biblioteca {

	String Titulo;
	int a�o;
	String tipo;
	int cantidad;

	public Biblioteca(String titulo, int a�o, String tipo, int cantidad) {
		super();
		Titulo = titulo;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "Titulo: " + Titulo + "\n A�o= " + a�o + "\n Tipo= " + tipo;

	}

}
