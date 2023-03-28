package tema3ejercicio37;

import java.util.Scanner;

public class Tema3ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cobro, personas, precio, noche;
		Scanner e = new Scanner(System.in);
		System.out.println("Introduzca el número de personas");
		personas = e.nextInt();
		System.out.println("Introduzca el numero de noches que se va a alojar en el hotel");
		noche = e.nextInt();
		switch (personas) {
		case 1:
			precio = 80 * noche;
			System.out.println("El precio final es " + precio + " euros");
			break;
		case 2:
			precio = 150 * noche;
			System.out.println("El precio final es " + precio + " euros");
			break;
		case 3:
			precio = 200 * noche;
			System.out.println("El precio final es " + precio + " euros");
			break;
		}

	}

}
