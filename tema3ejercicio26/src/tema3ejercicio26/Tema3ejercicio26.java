package tema3ejercicio26;

import java.util.Scanner;

public class Tema3ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			double eva1, eva2, eva3, media;
			Scanner e = new Scanner(System.in);
			System.out.println("Introduce nota 1:");
			eva1 = e.nextDouble();
			System.out.println("Introduce nota 2:");
			eva2 = e.nextDouble();
			System.out.println("Introduce nota 3:");
			eva3 = e.nextDouble();
			media = (eva1 + eva2 + eva3) / 3;
			System.out.println("El resultado es " + media);
			if (media>=5)
				System.out.println("El alumno ha aprobado");
			else
				System.out.println("El alumno ha suspendido");
		}

	}
}
	


