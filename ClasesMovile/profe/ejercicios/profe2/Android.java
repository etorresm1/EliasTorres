package ejercicios.profe2;

public abstract class Android extends Telefono implements Validar {

	public Android(String marca, Persona persona) {
		super(marca, persona);
	}

	private String patron;

	//get y set
	public String getPatron() {
		return patron;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}
	
	//metodo de la interfaz
	@Override
	public boolean validar(Persona persona) {
		return persona.getPatron().equals(patron);
	}

}
