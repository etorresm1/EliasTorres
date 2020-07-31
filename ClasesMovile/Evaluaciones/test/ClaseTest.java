package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import evaluacion2.Electrodomestico;
import evaluacion2.Lavadora;
import evaluacion2.Television;

class ClaseTest {

	// Electrodomestico
	@Test
	public void precioFinalTest() {
		Electrodomestico electro = new Electrodomestico(100000, 5, 'F', "blanco");
		double precioFinal;
		precioFinal = electro.precioFinal();
		assertEquals((100000 + 20000), precioFinal);
	}

	// Lavadora
	@Test
	public void precioFinalLavTest() {
		Lavadora lavadora = new Lavadora(100000, 5, 'F', "blanco", 5);
		double precioFinal;
		precioFinal = lavadora.precioFinal();
		assertEquals(100000 + 20000, precioFinal);
	}
	
	//Television
	@Test
	public void isSintonizadorTDTTest() {
		Television television = new Television(100000, 5, 'F', "blanco", 20, false);
		boolean sintonizadorTDT;
		sintonizadorTDT = television.isSintonizadorTDT();
		assertEquals(false, sintonizadorTDT);
	}
	
	@Test
	public void precioFinalTelTest() {
		Television television = new Television(100000, 5, 'F', "blanco", 20, false);
		double precioFinal;
		precioFinal = television.precioFinal();
		assertEquals(100000 + 20000, precioFinal);
	}

}
