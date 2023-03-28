package tema4ejercicio21;

import java.util.Scanner;

enum Nota {
	DEFICIENTE, INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE, MATRICULA_DE_HONOR, NOTA_NO_VALIDA
};

public class Tema4ejercicio21 {

	public static void main(String[] args) {

		Nota n;
		int nota;

		Scanner e = new Scanner(System.in);
		System.out.println("Dime una nota entera entre el 0 y el 10");
		nota = e.nextInt();
		switch (nota) {
		case 0, 1, 2:
			n = Nota.DEFICIENTE;
			break;
		case 3, 4:
			n = Nota.INSUFICIENTE;
			break;
		case 5:
			n = Nota.SUFICIENTE;
			break;
		case 6:
			n = Nota.BIEN;
			break;
		case 7, 8:
			n = Nota.NOTABLE;
			break;
		case 9:
			n = Nota.SOBRESALIENTE;
			break;
		case 10:
			n = Nota.MATRICULA_DE_HONOR;
			break;
		default:
			n = Nota.NOTA_NO_VALIDA;
			break;

		}
		System.out.println(n);
	}
}
