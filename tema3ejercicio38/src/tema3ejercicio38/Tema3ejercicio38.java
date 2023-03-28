package tema3ejercicio38;

import java.util.Scanner;

public class Tema3ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, x,n;
		Scanner e = new Scanner(System.in);

		System.out.println("Introduce un numero");
		x = e.nextInt();//x es numero
		System.out.println("Introduce otro numero");
		n=e.nextInt();
		while (i <= x) {
			System.out.println(i);
			i = i+n;
		}
	}

}
