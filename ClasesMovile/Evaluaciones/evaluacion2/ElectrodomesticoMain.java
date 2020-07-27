package evaluacion2;

public class ElectrodomesticoMain {

	public static void main(String[] args) {

		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

		listaElectrodomesticos[0] = new Electrodomestico(60000, 36, 'B', "Azul");
		listaElectrodomesticos[1] = new Electrodomestico(86000, 15, 'E', "Gris");
		listaElectrodomesticos[2] = new Electrodomestico(89000, 54, 'F', "Naranjo");
		listaElectrodomesticos[3] = new Lavadora(60000, 36);
		listaElectrodomesticos[4] = new Television(60000, 36, 'J', "Gris", 21, false);
		listaElectrodomesticos[5] = new Electrodomestico(60000, 36, 'H', "Blanco");
		listaElectrodomesticos[6] = new Television(60000, 36);
		listaElectrodomesticos[7] = new Electrodomestico(60000, 36, 'B', "Negro");
		listaElectrodomesticos[8] = new Electrodomestico(60000, 36, 'Z', "Rojo");
		listaElectrodomesticos[9] = new Television(60000, 36, 'D', "Verde", 55, true);

		double totalElectrodomesticos = 0;
		double totalTelevisiones = 0;
		double totalLavadoras = 0;

		for (int i = 0; i < listaElectrodomesticos.length; i++) {

			if (listaElectrodomesticos[i] instanceof Electrodomestico) {
				totalElectrodomesticos = totalElectrodomesticos + listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i] instanceof Lavadora) {
				totalLavadoras = totalLavadoras + listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i] instanceof Television) {
				totalTelevisiones = totalTelevisiones + listaElectrodomesticos[i].precioFinal();
			}
		}

		System.out.println("El precio total de los electrodomesticos es de " + totalElectrodomesticos);
		System.out.println("El precio total de las lavadoras es de " + totalLavadoras);
		System.out.println("El precio total de los televisores es de " + totalTelevisiones);

	}

}
