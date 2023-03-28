package tema3ejercicio41;

import java.util.Scanner;

public class Tema3ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		double numeros, suma = 0, suma2 = 0;

		do {
			System.out.println("Introduce un número");
			numeros = e.nextInt();
			if (numeros % 2 == 0) {
				suma = suma + numeros;// Vamos sumando los números que pedimos

			} else {
				suma2 = suma2 + numeros;
			}

		} while (numeros != 0);// numeros distintos de 0

		System.out.println("La suma de todos los numeros pares es " + suma);
		System.out.println("La suma de todos los numeros impares es " + suma2);

	}

}
