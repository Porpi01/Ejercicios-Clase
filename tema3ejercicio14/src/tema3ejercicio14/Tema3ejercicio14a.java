package tema3ejercicio14;

import java.util.Scanner; // nos permite obtener la entrada de datos primitivos.


public class Tema3ejercicio14a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio, multiplicar, descuento,preciof;// Atributos
		Scanner p = new Scanner(System.in); //Declarar objeto y crear variable Scanner.
		System.out.println("Introduce el precio del producto:");
		precio = p.nextDouble(); //Entrada de datos numéricos de tipo decimal

		System.out.println("Introduce el descuento del producto:");//Imprimiendo
		descuento = p.nextDouble();
		multiplicar = precio * (descuento / 100);
		System.out.println("El resultado del descuento son " + multiplicar + " euros");
		
		preciof = precio - multiplicar;
		System.out.println("El resultado del precio descontado es" + preciof + " euros");
	}
}
