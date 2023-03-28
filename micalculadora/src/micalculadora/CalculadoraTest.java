package micalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora c = new Calculadora(20, 10,0);
		int resultado = c.suma();
		assertEquals(resultado, 30);
	}

	@Test
	public void testResta() {
		Calculadora c = new Calculadora(20, 10,0);
		int resultado = c.resta();
		assertEquals(resultado, 10);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora c = new Calculadora(20, 2,0);
		int resultado = c.multiplicacion();
		assertEquals(resultado, 40);
	}

	@Test
	public void testDivision() {
		Calculadora c = new Calculadora(20, 2,0);
		int resultado = c.division();
		assertEquals(resultado, 10);
	}
	
	@Test
	public void testCartesiano() {
		Calculadora c = new Calculadora(20, 2,5);
		int resultado = c.cartesiano();
		assertEquals(resultado, 200);
	}
	@Test
	public void testSumatriple() {
		Calculadora c = new Calculadora(20, 2,5);
		int resultado = c.sumatriple();
		assertEquals(resultado, 27);
	}
	@Test
	public void testMedia() {
		Calculadora c = new Calculadora(20, 2,5);
		float resultado = c.media();
		assertEquals(resultado, 9,0.0005);
	}
	@Test
	public void testMayordelostres() {
		Calculadora c = new Calculadora(20, 2,5);
		int resultado = c.mayordelostres();
		assertEquals(resultado, 20);

	
	}
}
