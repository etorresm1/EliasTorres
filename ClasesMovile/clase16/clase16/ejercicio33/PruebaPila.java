package clase16.ejercicio33;


import java.util.Stack;

public class PruebaPila {

	static Stack pila1 = new Stack();

	public static void rellenar() {

		for (int i = 1; i <= 10; i++) {
			pila1.push(i);
		}

	}

	public void imprimirYvaciar() {

		while (pila1.empty() != true)
			System.out.println(pila1.pop());

	}

}
