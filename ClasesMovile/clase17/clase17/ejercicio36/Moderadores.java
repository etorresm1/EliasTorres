package clase17.ejercicio36;

public class Moderadores extends Usuario {

	// Atributos
	private int eliminados;

	public Moderadores(String Unick, String Uemail) {
		super(Unick, Uemail);
		eliminados = 0;
	}

	public void incrementaEliminados() {
		eliminados++;
	}

}
