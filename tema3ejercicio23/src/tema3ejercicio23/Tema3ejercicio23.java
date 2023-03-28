package tema3ejercicio23;

import java.util.Scanner;

public class Tema3ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner e = new Scanner(System.in);
		System.out.println("Escribe tu edad");
		edad = e.nextInt();
		if (edad >=18)
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");
	
	}

}
