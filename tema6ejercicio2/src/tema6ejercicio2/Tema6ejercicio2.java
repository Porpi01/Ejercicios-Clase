package tema6ejercicio2;

import java.util.Scanner;

public class Tema6ejercicio2 {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	
	String palabra;
	
	String palabras [] = new String [7];
	
	for (int i = 0; i < palabras.length; i++) {
		
		System.out.println("Introduce una palabra");
		palabra = entrada.next();
		
		palabras [i] = palabra;

		System.out.println("La palabra es " + palabras[i]);
	      
		
		int numLetras = palabras.length;
		
		System.out.println(numLetras);
		
	
		
	}

	}

}
