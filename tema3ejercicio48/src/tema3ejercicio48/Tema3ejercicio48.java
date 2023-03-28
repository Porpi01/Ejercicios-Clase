package tema3ejercicio48;

import java.util.Scanner;

public class Tema3ejercicio48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		String cadena;
		int longitud;
		char caracter;
		System.out.println("Introduce una palabra");
		cadena = e.nextLine();
		longitud = cadena.length();
		caracter = cadena.charAt(0);

		for (int numero = 0; numero <= longitud; numero++) {
			caracter = cadena.charAt(numero);
			System.out.println("El caracter " + numero + " es " + caracter);
		}
	}

}
