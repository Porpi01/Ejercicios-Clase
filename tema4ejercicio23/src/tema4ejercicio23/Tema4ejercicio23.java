package tema4ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema4ejercicio23 {

	public static void main(String[] args) {

		double eva1, eva2, eva3, media;
		Scanner e = new Scanner(System.in);
		try {
			System.out.println("Introduce nota 1:");

			eva1 = e.nextDouble();
			System.out.println("Introduce nota 2:");
			eva2 = e.nextDouble();
			System.out.println("Introduce nota 3:");
			eva3 = e.nextDouble();
			media = (eva1 + eva2 + eva3) / 3;
			System.out.println("El resultado es " + media);
		} catch (InputMismatchException error1) {
			System.out.println("Error de escritura en los datos");

		}

	}

}
