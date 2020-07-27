package ejercicios.profe;

public class Entrenador extends Seleccion_futbol {

	private String idFederacion;

	// constructor
	public Entrenador() {
		super();
	}

	// constructor con parametros
	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
	}

	public void dirigirEntrenamiento() {
	}
	
	public void entrenar() {
	}
}
