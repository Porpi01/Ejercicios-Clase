package tema3ejercicio34;

import java.util.Scanner;

public class Tema3ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota, valoración;
		Scanner e = new Scanner(System.in);
		System.out.println("Dime una nota entera entre el 0 y el 10");
		nota =e.nextInt();
		switch (nota) {// dentro de switch poner la variable
		case 0,1,2: System.out.println("La nota es muy deficiente");
		break;
		case 3,4: System.out.println("La nota es insuficiente");
		break;
		case 5: System.out.println("La nota es suficiente");
		break;
		case 6: System.out.println("Has sacado un bien");
		break;
		case 7,8: System.out.println("Has sacado un notable");
		break;
		case 9: System.out.println("Has sacado un sobresaliente");
		break;
		case 10: System.out.println("Has sacado matricula de honor");
		break;
		//default último caso por si el usuario cometiese algun error
		}
	}

}
