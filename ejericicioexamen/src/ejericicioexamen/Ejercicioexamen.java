package ejericicioexamen;

import java.util.Scanner;

public class Ejercicioexamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcion, longitud,i;
		String cadena,encriptar="", desencriptar="";
		char letra;

		do {
			System.out.println("Escoja un número de opción ");
			System.out.println("1. Introduce una cadena ");
			System.out.println("2. Encriptar ");
			System.out.println("3. Desencriptar ");
			System.out.println("4. Salir ");
			opcion = entrada.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("Escribe una cadena");
				cadena = entrada.next();
				System.out.println("La cadena es " + cadena);
				break;

			case 2:
				System.out.println("Escribe una cadena");
				cadena = entrada.next();
				longitud = cadena.length();
				for(i=0;i<longitud;i++) {
				letra = cadena.charAt(i);
				letra=(char) (letra+3);
				encriptar=encriptar+letra;
				
				}
				System.out.println("La cadena encriptada es " + encriptar);
				break;

			case 3:System.out.println("Escribe una cadena");
			cadena = entrada.next();
				longitud = cadena.length();
				letra = cadena.charAt(0);
				for(i=0;i<longitud;i++) {
					letra = cadena.charAt(i);
					letra-=3;
					desencriptar=desencriptar+letra;
					
					}
				System.out.println("La cadena desencriptada es " + desencriptar);
				break;
			case 4:
				System.out.println("Salir");
				break;
				default:System.out.println("Error introduce un número del 1 al 4 ");
			}
		} while (opcion !=4 );
		

	}

}
