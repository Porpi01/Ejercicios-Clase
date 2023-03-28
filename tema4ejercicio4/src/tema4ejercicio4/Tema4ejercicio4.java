package tema4ejercicio4;

import java.util.Scanner;

public class Tema4ejercicio4 {
	boolean esMayorEdad(int edad) {// La funcion hace una cosa

		if (edad >= 18) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean mayorEdad;
		int edad;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu edad");
		edad = entrada.nextInt();
		Tema4ejercicio4 p = new Tema4ejercicio4();
		mayorEdad = p.esMayorEdad(edad);
		if (mayorEdad == true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}

	}

}
