package ejercicios.profe2;

public class Principal {

	public static void main(String[] args) {

		// creamos la persona que ejecutara el metodo
		Persona p = new Persona();
		// setear los valores nombre huella
		p.setNombres("Juanito");
		p.setHuella("huella1");

		// construimos el telefono luego a ese telefono le seteamo la huella y validamos

		// ocupamos el constructor heredado
		Iphone8x telefono = new Iphone8x("apple", p);
		// setear la huella1
		telefono.setHuella("huella1");
		System.out.println(telefono.validar(p));
	}

}
