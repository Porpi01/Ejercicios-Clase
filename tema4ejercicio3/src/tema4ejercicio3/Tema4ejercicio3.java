package tema4ejercicio3;

import java.util.Scanner;

public class Tema4ejercicio3 {
	double calcularDescuento(double precio, double descuento) {
		double multiplicar, preciof;
		multiplicar = precio * (descuento / 100);
		preciof = precio - multiplicar;
		return preciof;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio, descuento, preciof;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el precio del producto:");
		precio = entrada.nextDouble();
		System.out.println("Introduce el descuento del producto:");
		descuento = entrada.nextDouble();

		Tema4ejercicio3 d = new Tema4ejercicio3();
		preciof = d.calcularDescuento(precio, descuento);

		System.out.println("El resultado del precio descontado es " + preciof + " euros");

	}

}
