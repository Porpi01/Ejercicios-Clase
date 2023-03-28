package tema3ejercicio43;

import java.util.Scanner;
import java.util.Random;

public class Tema3ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		Random azar = new Random();
		int numero, numeroAzar = azar.nextInt(50);// Guardar numero aleatorio
		int suma = 0;
		do {
			System.out.println("Introduce un número");
			numero = e.nextInt();
			if (numeroAzar > numero) {
				System.out.println("El número es mayor");
				suma++;
			} else if (numeroAzar < numero) {
				System.out.println("El número es menor");
				suma++;
			}

		} while (numeroAzar != numero);
		System.out.println("Has acertado");
		suma++;
		System.out.println("El numero de intentos ha sido " + suma);

	}

}

