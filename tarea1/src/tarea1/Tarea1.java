//Monica Alcañiz Puig
package tarea1;

import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int sueldobase = 1000;
		int sueldo, productoVendido, cobro;
		int dias, rebaja, sueldofinal;
		System.out.println("¿Cuánto productos has vendido? ");
		productoVendido = entrada.nextInt();

		if (productoVendido > 20) {
			cobro = productoVendido * 13;
			sueldo = cobro + sueldobase;
			System.out.println("El cobro es " + sueldo);
		} else (productoVendido < 20) {
			cobro = productoVendido * 10;
			sueldo = cobro + sueldobase;
			System.out.println("El cobro es " + sueldo);
		}

		System.out.println("¿Cuántos dias has faltado? ");
		dias = entrada.nextInt();
		if (dias > 5) {
			
			rebaja = (15 / 100) * sueldo;
			sueldofinal = sueldo - rebaja;

			System.out.println("El sueldofinal es " + sueldofinal);
		}

	}
}







	


