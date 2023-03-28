package tema3ejercicio51;

import java.util.Scanner;

public class Tema3ejercicio51 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		String cadena;
		int caracter,vocal=0,longitud;
        
		System.out.println("Introduce una palabra ");
		cadena = e.next();
		longitud=cadena.length();
		for (int numero = 0; numero <= longitud; numero++) {
			caracter=cadena.charAt(numero);
		if(caracter=='a') 
			      vocal++;
		}
		
		System.out.println("El numero de a que tiene tu palabra es " + vocal);
	}
}