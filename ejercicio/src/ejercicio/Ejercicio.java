package ejercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Random azar = new Random();
	

		FileReader lectura;

		List<String> nombres = new ArrayList<>();
		try {
			lectura = new FileReader("nombres.txt");
			BufferedReader br = new BufferedReader(lectura);
			Scanner entrada = new Scanner(br);
		
			while (entrada.hasNext()) {
				nombres.add(entrada.next());

			}

		int numPareja = nombres.size()/2;
		for (int i = 0; i < numPareja; i ++) {
			String nombre1 = nombres.get(azar.nextInt(nombres.size()));
			nombres.remove(nombre1);
			String nombre2 = nombres.get(azar.nextInt(nombres.size()));
			nombres.remove(nombre2);
			System.out.println(nombre1 + " " + nombre2);
		}

		} catch (IOException e) {

			e.printStackTrace();
		}

		

		

	}

}
