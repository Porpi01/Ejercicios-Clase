package tema6ejercicio14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tema6ejercico14 {

	static final int TAMAÑO = 10;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random azar = new Random();

		List<Integer> listaNumeros = new ArrayList<>();
		for (int i = 0; i < TAMAÑO; i++) {
			listaNumeros.add(azar.nextInt(50));
			System.out.println(listaNumeros);
		}

		int total = 0;

		Iterator<Integer> iter = listaNumeros.iterator();

		while (iter.hasNext()) {
			total += iter.next();
		}

		System.out.println("La suma total es " + total);

	}

}
