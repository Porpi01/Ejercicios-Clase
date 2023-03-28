package tema4ejercicio5;

import java.util.Scanner;

public class tema3ejercicio5 {
	boolean esAñoBisiesto(int año) {
		if (año % 400 == 0) {
			return true;

		} else if ((año % 4 == 0) && (año % 100 != 0)) {
			return true;
		} else {
			return false;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean añoBisiesto;
		int año;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un año");
		año = entrada.nextInt();
		tema3ejercicio5 a = new tema3ejercicio5();
		añoBisiesto = a.esAñoBisiesto(año);
		if (añoBisiesto == true) {
			System.out.println("El año es bisiesto");
		} else {
			System.out.println("El año no es bisiesto");
		}

	}

}


