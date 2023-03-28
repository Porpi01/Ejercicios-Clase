package tema6ejercicio13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tema6ejercicio13 {
static final int TAMAÑO = 10;
	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);

		int total = 0;
		for (int i = 0; i < TAMAÑO ; i++) {

			System.out.print("Introduce número: ");
			lista.add(entrada.nextInt());
		}

		Iterator<Integer> iter = lista.iterator();

		while (iter.hasNext()) {
			total += iter.next();
		}
		System.out.println("La suma total es " + total);

	}

}
