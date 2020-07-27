package ejercicios.profe;

public class Seleccion_futbol {

	// atributos
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;

	// get y set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// constructor vacio
	public Seleccion_futbol() {
	}

	// constructor con parametros
	public Seleccion_futbol(int id, String nombre, String apellidos, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	// metodos generales
	public void concentrarse() {
	}

	public void viajar() {
	}

}