package tema3ejercicio13;

import java.util.Scanner;

public class Tema3ejercicio13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultados;
		int dividir;
		Scanner r = new Scanner(System.in);
		System.out.println("Introduce un número:");
		resultados = r.nextInt();
		dividir = resultados / 10;
		System.out.println("El número de páginas es " + dividir + "páginas");

	}
}
