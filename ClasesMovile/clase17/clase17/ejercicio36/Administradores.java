package clase17.ejercicio36;

public class Administradores extends Usuario {

	// Atributos
	private int baneos;
	private int eliminados;

	public Administradores(String Unick, String Uemail) {
		super(Unick, Uemail);
		baneos = 0;
		eliminados = 0;
	}

	public void incrementaEliminados() {
		eliminados++;
	}

	public void incrementaBaneados() {
		baneos++;
	}
}
