package ejercicios.profe;

public class Masajista extends Seleccion_futbol {

	private String titulacion;
	private int anioExperiencia;

	// constructor vacio
	public Masajista() {
		super();
	}

	// constructor con parametros
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int anioExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.anioExperiencia = anioExperiencia;
	}

	public void darMasaje() {
	}
}
