package tema3ejercicio42;

import java.util.Scanner;

public class Tema3ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double eva1, eva2, eva3, media;
		Scanner e = new Scanner(System.in);
		do {

			System.out.println("Introduce nota 1:");
			eva1 = e.nextDouble();
		} while ((eva1<0) || (eva1 >10));//Esta es la condición de permanencia si pongo && es la condición de salida
		
		do {
			System.out.println("Introduce nota 2:");
			eva2 = e.nextDouble();
		} while ((eva2 < 0)|| (eva2 >10));

		do {
			System.out.println("Introduce nota 3:");
			eva3 = e.nextDouble();
		} while ((eva3 < 0) || (eva3 >10));

		media = (eva1 + eva2 + eva3) / 3;
		System.out.println("El resultado es " + media);

	}

}
