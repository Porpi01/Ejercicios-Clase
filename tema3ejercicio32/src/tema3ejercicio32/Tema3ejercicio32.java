package tema3ejercicio32;

import java.util.Scanner;

public class Tema3ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int numeroSeguidores, boton;
		System.out.println("Escribe el numero de seguidores que tienes actualmente:");
		numeroSeguidores = e.nextInt();
		System.out.println("¿Cuál es el botón que aparecerá?");
		boton = e.nextInt();

		if (boton == 0) {
			System.out.println("Aparecerá el botón seguir");
			numeroSeguidores++;
		} else if (boton == 1)
			System.out.println("Aparecerá el botón no seguir");
		numeroSeguidores--;
	}

}
