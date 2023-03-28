package tema3ejercicio46;

import java.util.Scanner;

public class Tema3ejercicio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int saldo=10000, intDinero, extDinero,saldofinal, numero;//saldo ya está declarado no volver a declarar

		System.out.println("Menú:1)Consultar saldo " + "2)Introducir dinero " + "3)Extraer dinero " + "4)Salir");
		do {
			System.out.println("Escoja un número de opción");
			numero = e.nextInt();
			if (numero > 4)
				System.out.println("Error opción no valida");

			switch (numero) {
			case 1:
				System.out.println("Su saldo actual es " + saldo);
				break;
			case 2:
				System.out.println("Introducir dinero");
				intDinero = e.nextInt();
				saldo= saldo + intDinero;
				System.out.println("Su saldo actual es " + saldo);
				break;
			case 3:
				System.out.println("Extraer dinero");
				extDinero = e.nextInt();
				saldofinal = saldo - extDinero;
				System.out.println("Su saldo actual es " + saldofinal);
				if (saldofinal <= 0) {
					System.out.println("Su cuenta está vacía");break;
				}
				
			}
		} while (numero < 4);
		if (numero == 4) {
			System.out.println("Salir");
		}
	}
}
