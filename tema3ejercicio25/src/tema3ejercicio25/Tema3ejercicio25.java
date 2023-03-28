package tema3ejercicio25;

import java.util.Scanner;

public class Tema3ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int año;
		Scanner a = new Scanner(System.in);
		System.out.println("Introduce un año");
		año = a.nextInt();
		if (año % 400 == 0) {
			System.out.println("Es un año bisiesto");

		} else if ((año%4==0)&&(año%100!=0)) {
			System.out.println("Es un año bisiesto");
		}
		else {
			System.out.println("No es un año bisiesto");

	}
	}
	}
