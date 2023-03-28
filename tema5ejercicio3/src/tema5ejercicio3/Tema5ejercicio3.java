package tema5ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tema5ejercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int opc;
		int saldo = 0;
		int dinero;

		try {
			FileReader reader = new FileReader("saldo.txt");

			Scanner entrada = new Scanner(reader);
			saldo = entrada.nextInt();

		} catch (FileNotFoundException e) {

			try {
				File f = new File("saldo.txt");
				f.createNewFile();
			} catch (IOException e1) {

				e1.printStackTrace();
			}

			do {
				System.out.println("Selecciona opción (1-3): ");
				System.out.println("1. Consultar saldo ");
				System.out.println("2. Ingresar ");
				System.out.println("3. Extraer ");
				System.out.println("4. Salir ");
				opc = s.nextInt();

				switch (opc) {
				case 1:

					System.out.println("El saldo actual es " + saldo);
					break;

				case 2:

					System.out.print("¿Cuánto dinero desea ingresar?");
					dinero = s.nextInt();
					saldo = saldo + dinero;
					System.out.println("El saldo actual es " + saldo);
					break;
				case 3:

					System.out.print("¿Cuánto dinero desea extraer? ");
					dinero = s.nextInt();
					saldo = saldo - dinero;
					if (saldo < 0) {
						System.out.println("Cuenta en números rojos");
					} else {
						System.out.println("El saldo actual es " + saldo);
					}
					break;
				case 4:
					try {
						FileWriter writer = new FileWriter("saldo.txt");
						PrintWriter p = new PrintWriter(writer);

						p.println(saldo);
						writer.close();

					} catch (IOException e2) {
						System.out.println("Error E/S");
					}
					System.out.println("Final del programa");

					break;
				default:
					System.out.println("Opción no válida");
				}
			} while (opc != 4);
		}
	}
}
