package evaluacionFinal;

public class Trupalla extends Carro {

	// Atributos
	private int nivelArmadura;
	private String nombreConductor;

	// Constructor
	public Trupalla() {
	}

	public Trupalla(int cantidadOcupantes, String fechaIngreso, int ubicacionFila, int ubicacionColumna,
			int nivelArmadura, String nombreConductor) {
		super(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna, 1);
		this.nivelArmadura = nivelArmadura;
		this.nombreConductor = nombreConductor;
	}

	// Getters & Setters
	public int getnivelArmadura() {
		return nivelArmadura;
	}

	public void setnivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getnombreConductor() {
		return nombreConductor;
	}

	public void setnombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	@Override
	public String toString() {
		return "Trupalla{" + "NivelArmadura=" + nivelArmadura + ", NombreConductor='" + nombreConductor + '\'' + '}';
	}

}
