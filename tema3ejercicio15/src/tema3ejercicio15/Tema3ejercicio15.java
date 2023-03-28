package tema3ejercicio15;

import java.util.Scanner;

public class Tema3ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double añonacimiento, edad, mes, dia, añoactual;// Atributos
		
		Scanner e = new Scanner(System.in); // Declarar objeto y crear variable Scanner.
		System.out.println("Introduce tu año de nacimiento:");
		añonacimiento = e.nextDouble();// Entrada de datos numéricos de tipo decimal
		System.out.println("Introduce el año actual:");
		añoactual= e.nextDouble();
	    edad = añoactual - añonacimiento;
		mes = edad * 12;
		dia = mes * 24;
		System.out.println("Su edad actual es " +  edad + " años" +  mes + " meses" +  dia + " dias");

	}

}

