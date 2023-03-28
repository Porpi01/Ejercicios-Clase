package tema6ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Tema6ejercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random azar = new Random();

		int numero[] = new int[10];

		for (int i = 0; i < numero.length; i++) {

			numero[i] = azar.nextInt(50);
			System.out.println(Math.pow(numero[i], 2));
			System.out.println(Math.pow(numero[i], 3));

		}

	}

}
