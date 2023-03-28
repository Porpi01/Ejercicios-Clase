package tema3ejercicio29;

import java.util.Scanner;

public class Tema3ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso, altura, IMC;
		Scanner p = new Scanner(System.in);
		System.out.println("Introduce tu peso en kg");
		peso = p.nextDouble();
		System.out.println("Introduce tu altura en metros");
		altura = p.nextDouble();
		IMC = (peso / (altura * altura));
		if (IMC < 18.5) {
			System.out.println("Su nivel de peso es bajo");
		} else if ((IMC >= 18.5) && (IMC <= 24.9)) {
			System.out.println("Su nivel de peso es normal");
		} else if ((IMC >= 25) && (IMC <= 29.9)) {
			System.out.println("Usted tiene sobrepeso");
		} else if (IMC >= 30) {
			System.out.println("Usted tiene obesidad");
		}
	}

}

