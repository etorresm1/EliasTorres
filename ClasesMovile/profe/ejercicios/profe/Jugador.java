package ejercicios.profe;

public class Jugador extends Seleccion_futbol {

	// atributos propios
	private int posicion;
	private String demarcacion;

	// constructor vacio
	public Jugador() {
		super();
	}

	public Jugador(int id, String nombre, String apellidos, int edad, int posicion, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.posicion = posicion;
		this.demarcacion = demarcacion;
	}

	public void entrenar() {
	}

	public void jugarPartido() {
	}
}