package tema6ejercicio7;

import java.util.Scanner;

public class GestionPersonas {

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
		int opcion, indicePersona;
		Persona personas[] = new Persona[5];
		do {
			System.out.println("----------");
			g.mostrarMenu();
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				for(int i = 0;i<personas.length; i++) {
					System.out.print("Introduce nombre de la persona: ");
					nombre = s.next();
					System.out.print("Introduce edad de la persona: ");
					edad = s.nextInt();
					personas[i] = new Persona(nombre, edad);		
					}
			
				break;
				
			case 2:
				System.out.println("¿De cuál persona quieres cambiar los datos?");
				indicePersona = s.nextInt();	
				System.out.print("Introduce nombre de la persona: ");
				nombre = s.next();
				personas[indicePersona].setNombre(nombre);
				break;
			case 3:
				System.out.println("¿De cuál persona quieres cambiar los datos?");
				indicePersona = s.nextInt();
				System.out.print("Introduce edad de la persona: ");
				edad = s.nextInt();
				personas[indicePersona].setEdad(edad);
				break;
			case 4:
				for(int i=0; i<personas.length;i++) {
					
					System.out.println("El nombre de la personas es "+ personas[i].getNombre());
					System.out.println("La edad de la personas es "+ personas[i].getEdad());
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
