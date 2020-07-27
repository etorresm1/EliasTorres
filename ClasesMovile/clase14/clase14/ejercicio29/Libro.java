package clase14.ejercicio29;

import java.util.Scanner;

class Libro {

	private String editorial, titulo, autor;
	private int NumeroPaginas;
	
	Libro(String editorial, String titulo, String autor, int numeroPaginas) {
		super();
		this.editorial = editorial;
		this.titulo = titulo;
		this.autor = autor;
		NumeroPaginas = numeroPaginas;
	}
	
	

	//metodo get
	public String getEditorial() {
		return editorial;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumeroPaginas() {
		return NumeroPaginas;
	}

//metodo set
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		NumeroPaginas = numeroPaginas;
	}

	public void MostrarLibro() {

		System.out.println("El libro de la editorial " + getEditorial() + " fue creado por el autor " + getAutor()
				+ " y tiene un total de " + getNumeroPaginas() + " paginas");

	}

}
