package clase10.ejercicio20;

import javax.swing.JOptionPane;

public class Array14Posiciones {

	public static void main(String[] args) {

		final int TAMANIO = 14;
		int num[] = new int[TAMANIO];

		rellenarArray(num);

		mostrarArray(num);
	}

	public static void rellenarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			String texto = JOptionPane.showInputDialog("Introduce un n�mero");
			lista[i] = Integer.parseInt(texto);
		}
	}

	public static void mostrarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En el indice " + i + " esta el valor " + lista[i]);
		}
	}

}
