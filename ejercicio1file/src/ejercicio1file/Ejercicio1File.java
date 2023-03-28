package ejercicio1file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1File {

	static double calcularMedia(int nota1, int nota2, int nota3) {
		double media;
		media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	public static void main(String[] args) {

		int nota1, nota2, nota3;
		double media;
		String nombre;

		File f = new File("notas.txt"); // Creacion del objeto File
		File fmedia = new File("media.txt");

		try {
			PrintWriter p = new PrintWriter(fmedia);

			try {

				Scanner entrada = new Scanner(f);

				while (entrada.hasNextLine()) {
					nombre = entrada.next();
					nota1 = entrada.nextInt();
					nota2 = entrada.nextInt();
					nota3 = entrada.nextInt();
                    media = calcularMedia (nota1, nota2, nota3);
					p.println(nombre + String.format("%.2f", media));

				}
				p.close();
			} catch (FileNotFoundException excepcion1) {
				excepcion1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
