package tema4ejercicio2;

import java.util.Scanner;

public class Tema4ejercicio2 {

	static double calcularMedia(double eva1, double eva2, double eva3) {
		double media;
		media = (eva1 + eva2 + eva3) / 3;
		return media;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double eva1, eva2, eva3, media;
		Scanner e = new Scanner(System.in);
		System.out.println("Introduce nota 1:");
		eva1 = e.nextDouble();
		System.out.println("Introduce nota 2:");
		eva2 = e.nextDouble();
		System.out.println("Introduce nota 3:");
		eva3 = e.nextDouble();
		media = Tema4ejercicio2.calcularMedia(eva1, eva2, eva3);// Invoco al método
		System.out.println("El resultado de la media es: " + media);

	}

}
