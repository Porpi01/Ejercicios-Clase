package tema3ejercicio35;

import java.util.Scanner;

public class Tema3ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int mes;
		System.out.println("Introduce un mes del 1 al 12");
		mes = e.nextInt();
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("El mes tiene 31 dias");
			break;
		case 2:
			System.out.println("El mes tiene 28 dias");			
			break;
		case 4, 6, 9, 11:
			System.out.println("El mes tiene 30 dias");
			break;
		}
	}

}
