package pareseimpares;

import java.util.Scanner;

public class Pareseimpares {

	public static void sonPares() {
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("El numero de pares es: " + i);
			}

		}
	}

	public static void sonImpares() {
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println("El numero de impares es:" + i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero = 1;

		System.out.println("Introduce un numero del 1 al 50: ");
		numero = entrada.nextInt();

	}
}

