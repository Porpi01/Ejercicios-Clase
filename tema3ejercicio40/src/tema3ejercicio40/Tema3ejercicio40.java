package tema3ejercicio40;

import java.util.Scanner;

public class Tema3ejercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		double numeros, suma = 0, c = 0, media;

		do {
			System.out.println("Introduce un número");
			numeros = e.nextDouble();
			suma = suma + numeros;// Vamos sumando los números que pedimos
			if (numeros > 0) {
				c = c + 1;
			} // Cuantos números fueron ingresados
		} while (numeros != 0);// numeros distintos de 0
		media = suma / c;
		System.out.println("La media final es: " + media);

	}

}
