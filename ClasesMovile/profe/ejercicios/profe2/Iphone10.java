package ejercicios.profe2;

public class Iphone10 extends Iphone8x {

	// atributo propio
	private String patronRostro;

	// get y set
	public String getPatronRostro() {
		return patronRostro;
	}

	public void setPatronRostro(String patronRostro) {
		this.patronRostro = patronRostro;
	}

	// constructor
	public Iphone10(String marca, Persona persona) {
		super(marca, persona);
	}

	// metodo heredado de la interface
	@Override
	public boolean validar(Persona persona) {

		if (persona.getPatronRostro() != null) {
			return persona.getPatronRostro().equals(patronRostro);
		}

		return false;

	}

}
