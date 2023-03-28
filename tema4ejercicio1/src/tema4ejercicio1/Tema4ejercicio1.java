package tema4ejercicio1;

import java.util.Scanner;

public class Tema4ejercicio1 {

	static int sumar(int a, int b) {
		int z;
		z = a + b;
		return z;
	}

	static int restar(int a, int b) {
		int z;
		z = a - b;
		return z;
	}

	static int multiplicar(int a, int b) {
		int z;
		z = a * b;
		return z;
	}

	static int dividir(int a, int b) {
		int z;
		z = a / b;
		return z;
	}

	static int restoDivision(int a, int b) {
		int z;
		z = a % b;
		return z;
	}

	public static void main(String[] args) {
		int num1, num2, suma, resta, producto, division, resto;
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca primer número: ");
		num1 = s.nextInt();
		System.out.print("Introduzca segundo número: ");
		num2 = s.nextInt();
		suma = Tema4ejercicio1.sumar(num1, num2);
		resta = Tema4ejercicio1.restar(num1, num2);
		producto = Tema4ejercicio1.multiplicar(num1, num2);
		division = Tema4ejercicio1.dividir(num1, num2);
		resto = Tema4ejercicio1.restoDivision(num1, num2);
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		System.out.println("El producto es " + producto);
		System.out.println("La división es " + division);
		System.out.println("El resto de la división entera es " + resto);
	}

}
