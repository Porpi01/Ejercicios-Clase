package tema6ejercicio15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tema6ejercicio15 {
	static final int TAMAÑO = 10;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random azar = new Random();

		List<Integer> listaNumeros = new ArrayList<>();

		for (int i = 0; i < TAMAÑO; i++) {

			listaNumeros.add(azar.nextInt(50));

		}

		Iterator<Integer> iter = listaNumeros.iterator();

		while (iter.hasNext()) {
			Integer cuadrado = iter.next();
			Integer cubo = iter.next();

			System.out.println(Math.pow(cuadrado, 2));
			System.out.println(Math.pow(cubo, 3));

		}

	}

}
