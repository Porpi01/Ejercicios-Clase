package tema3ejercicio39;

import java.util.Scanner;

public class Tema3ejercicio39 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		String cadena;
		int longitud, numero;
		char caracter;
		System.out.println("Introduce una palabra");
		cadena = e.nextLine();
		longitud = cadena.length();
		caracter = cadena.charAt(0);
		numero = 0;
		while (numero<longitud) {
			caracter = cadena.charAt(numero);
			System.out.println("El caracter "+ numero+" es "+ caracter);
			numero++;
		}
	}
}