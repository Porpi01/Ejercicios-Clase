package tema3ejercicio9;

import java.util.Scanner;

public class Tema3ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, suma, resta, multiplicacion, division, resto;
		Scanner n = new Scanner(System.in);
		System.out.println("Introduce un número");
		num1 = n.nextInt();
		System.out.println("Introduce otro número");
		num2 = n.nextInt();
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		resto = num1 % num2;
		System.out.println("El resultado de la suma es " + suma);
		System.out.println("El resultado de la resta es " + resta);
		System.out.println("El resultado de la multiplicación es " + multiplicacion);
		System.out.println("El resultado de la división  es " + division);
		System.out.println("El resultado del resto es " + resto);
	}

}
