package tema6ejercicio16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tema6ejercicio16 {

	static final int TAMAÑO = 1;
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	    List<String> listaNumeros = new ArrayList<>();
		
		for (int i = 0; i < TAMAÑO; i++) {
			System.out.print("Introduce palabra: ");
			listaNumeros.add(entrada.next());
		}
		
		Iterator<String> iter = listaNumeros.iterator();

		while (iter.hasNext()) {
		
			String numLetras = iter.next();
			numLetras =

			 System.out.println(numLetras);

		}
		

	}

}
