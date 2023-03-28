package tema5ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import libro.*;

public class Tema5ejercicio4 {

	static void mostrarMenu() {
		System.out.println("Escoge una opcion");
		System.out.println("1. Introducir nuevo libro");
		System.out.println("2. Buscar libro");
		System.out.println("3. Mostrar contenido biblioteca");
		System.out.println("4. Salir");
	}
	
	
	static void crearLibro(int codigo, String titulo) {

		FileWriter escribir;

		try {
			escribir = new FileWriter("biblioteca.txt", true); //true para añadir al final 
			BufferedWriter bw = new BufferedWriter(escribir);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(codigo + " " + titulo); // Para imprimir en el fichero
			pw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	static void mostrarBiblioteca() {
		String linea;
		FileReader lectura;
		try {
			lectura = new FileReader("biblioteca.txt");
			BufferedReader br = new BufferedReader(lectura);
			Scanner entrada = new Scanner(br);
			linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			br.close();

		} catch (IOException e) {

			e.printStackTrace();
		} 
 }
	static void buscarLibro(int codigo) throws IOException  {
		
		    FileReader lectura = new FileReader("biblioteca.txt");
			BufferedReader br = new BufferedReader(lectura);
			Scanner entrada = new Scanner (br);
			codigo = br.read();
		
			while (codigo!= )  {
				if (codigo )) {
				codigo = br.readLine();
				}else {
					return titulo;
					break;
				}
			
			}

			br.close();
		
	}
	
	

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		Libro lib = new Libro();
		int opcion, codigo;
		String titulo;
		
		do {

			Tema5ejercicio4.mostrarMenu();
			
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el codigo");
				codigo = entrada.nextInt();
				System.out.println("Introduce el titulo");
				titulo = entrada.next();

				lib = new Libro(codigo, titulo); // Creando un objeto libro
				Tema5ejercicio4.crearLibro(codigo, titulo); // Invocación al metodo crearLibro

				break;

			case 2:
				
                System.out.println("Introduce el codigo del libro que desea buscar");
                codigo = entrada.nextInt();
                
				Tema5ejercicio4.buscarLibro(codigo);
				
				break;

			case 3:
              
				Tema5ejercicio4.mostrarBiblioteca();

				break;
			case 4:

				break;
			default:
				System.out.println("Error");
				break;
			}

		} while (opcion != 4);

	}

}
