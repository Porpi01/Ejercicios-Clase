package tema3ejercicio18;

import java.util.Scanner;

public class Tema3ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, sol1, sol2, raiz;
		Scanner e = new Scanner(System.in);
		System.out.println("Introduce el valor de la variable a");
		a = e.nextDouble();
		System.out.println("Introduce el valor de la variable b");
		b = e.nextDouble();
		System.out.println("Introduce el valor de la variable c");
		c = e.nextDouble();
		raiz = Math.sqrt(b*b) -(4*a*c);
		sol1 = ((-b+raiz)/(2*a));
		sol2 =((-b-raiz)/(2*a));
		System.out.println("El resultado de la ecuación de segundo grado es "+ sol1);
		System.out.println("El resultado de la ecuación de segundo grado es "+ sol2);
	}

}
