package ejercicios.profe2;

public abstract class Telefono implements Activar {

	// atributos
	private String marca;
	private Persona persona;

	// get y set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	// constructor agrego super para geredar de donde quiera
	public Telefono(String marca, Persona persona) {
		super();
		this.marca = marca;
		this.persona = persona;
	}

	//sobreescribo los metodos
	@Override
	public void on() {
		System.out.println("Telefono encendido");
	}

	@Override
	public void off() {
		System.out.println("Telefono apagado");
	}
}
