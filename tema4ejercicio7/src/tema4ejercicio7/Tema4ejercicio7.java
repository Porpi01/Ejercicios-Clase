package tema4ejercicio7;

import java.util.Scanner;

public class Tema4ejercicio7 {
	
	static void imprimirBucle(int limite) {
		for (int i = 1; i <= limite; i++) {
		System.out.println(i);
		}
		}

	public static void main(String[] args) {
		int i, num;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce número final: ");
		num = s.nextInt();
		Tema4ejercicio7.imprimirBucle(num);

	}

}
