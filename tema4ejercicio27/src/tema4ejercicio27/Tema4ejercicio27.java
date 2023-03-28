package tema4ejercicio27;

import java.time.LocalDate;
import java.util.Scanner;

public class Tema4ejercicio27 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int opcion;

		System.out.println("Escoge un producto: 1 FRUTA 2 YOGURES o 3 CONGELADOS");
		opcion = entrada.nextInt();

		switch (opcion) {
		case 1:
			LocalDate ld1 = LocalDate.now();// Utilzar misma variable
			LocalDate ld4 = ld1.plusDays(5);
			System.out.println("La fruta caduca " + ld4);
			break;
		case 2:
			LocalDate ld2 = LocalDate.now();
			LocalDate ld5 = ld2.plusDays(15);
			System.out.println("Los yogures caducan " + ld5);
			break;
		case 3:
			LocalDate ld3 = LocalDate.now();
			LocalDate ld6 = ld3.plusMonths(3);
			System.out.println("Los congelados caducan " + ld6);
			break;
		}

	}

}
