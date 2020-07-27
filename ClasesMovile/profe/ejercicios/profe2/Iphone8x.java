package ejercicios.profe2;

public class Iphone8x extends Telefono implements Validar {

	private int codigo;
	private String huella;

	// get y set
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getHuella() {
		return huella;
	}

	public void setHuella(String huella) {
		this.huella = huella;
	}

	//constructor
	public Iphone8x(String marca, Persona persona) {
		super(marca, persona);
	}

	// metodo de la interface
	@Override
	public boolean validar(Persona persona) {

		if (persona.getHuella() != null) {
			return persona.getHuella().equals(huella);
		}

		if (persona.getCodigo() != 0) {
			return persona.getCodigo() == codigo;
		}

		return false;
	}

}
