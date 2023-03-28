package tema5ejercicio5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

	
class Persona {
	String nombre;
	int edad;

	Persona() {
	}

	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	String getNombre() {
		return this.nombre;
	}

	int getEdad() {
		return this.edad;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}
}

class GestionPersonas {
	void mostrarPersona(Persona p) {
		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad:" + p.getEdad());
	}

	void mostrarMenu() {
		System.out.println("Seleccione opción:");
		System.out.println("1. Crear nueva persona");
		System.out.println("2. Cambiar nombre de persona");
		System.out.println("3. Cambiar edad de persona");
		System.out.println("4. Mostrar persona");
		System.out.println("0. Salir");
	}

	public static void main(String[] args) {

		GestionPersonas g = new GestionPersonas();
		Scanner s = new Scanner(System.in);
		Persona p = new Persona();
		String nombre;
		int edad;
		int opcion;
		
		try {
			
			FileInputStream reader = new FileInputStream ("gestionpersonas.txt");
		    Scanner entrada = new Scanner (reader);
	
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	do {
		System.out.println("----------");
		g.mostrarMenu();
		opcion = s.nextInt();
		switch (opcion) {
		case 1:
			System.out.print("Introduce nombre de la persona: ");
			nombre = s.next();
			System.out.print("Introduce edad de la persona: ");
			edad = s.nextInt();
			p = new Persona(nombre, edad);
			break;

		case 2:
			System.out.print("Introduce nombre de la persona: ");
			nombre = s.next();
			p.setNombre(nombre);
			break;
		case 3:
			System.out.print("Introduce edad de la persona: ");
			edad = s.nextInt();
			p.setEdad(edad);
			break;
		case 4:
			g.mostrarPersona(p);
			break;
		case 0:
			try {
				FileOutputStream writer = new FileOutputStream ("gestionpersonas.txt");
				PrintWriter pw = new PrintWriter (writer);
				pw.print( p.getNombre() + " " + p.getEdad() + " años");
				pw.close();
			} catch (FileNotFoundException e) {
		
				e.printStackTrace();
			}
			
			System.out.println("Fin del programa");
			break;
		default:
			System.out.println("Opción no válida");

		}
	} while (opcion != 0);
}

}
