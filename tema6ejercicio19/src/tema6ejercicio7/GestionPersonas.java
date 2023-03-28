package tema6ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import tema6ejercicio5;

public class GestionPersonas {

	static final int TAMAÑO = 2;

	static void mostrarPersona(Persona p) {
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
		int opcion, indicePersona;
		List<Persona> listaPersonas = new ArrayList<>();

		do {
			System.out.println("----------");
			g.mostrarMenu();
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				for (int i = 0; i < TAMAÑO; i++) {
					System.out.print("Introduce nombre de la persona: ");
					nombre = s.next();
					System.out.print("Introduce edad de la persona: ");
					edad = s.nextInt();
					listaPersonas.add(new Persona(nombre, edad));
				}

				break;

			case 2:
				System.out.println("¿De cuál persona quieres cambiar los datos?");
				indicePersona = s.nextInt();
				System.out.print("Introduce nombre de la persona: ");
				nombre = s.next();
				listaPersonas.get(indicePersona).setNombre(nombre);
				break;
			case 3:
				System.out.println("¿De cuál persona quieres cambiar los datos?");
				indicePersona = s.nextInt();
				System.out.print("Introduce edad de la persona: ");
				edad = s.nextInt();
				listaPersonas.get(indicePersona).setEdad(edad);
				break;
			case 4:
				Iterator<Persona> iter = listaPersonas.iterator();

				while (iter.hasNext()) {
					p = iter.next();
					mostrarPersona(p);

				}
				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 0);

	}

}
