package tema4ejercicio11;

import java.util.Scanner;

class Persona {
	String nombre;
	int edad;
	static String ciudad ="Valencia";

	Persona() {// constructor sin parametros

	}

	Persona(String nombre, int edad) { // constructor con parametros
		this.nombre = nombre;
		this.edad = edad;
		

	}

	public static String getCiudad() {
		return ciudad;
	}

	public static void setCiudad(String ciudad) {
		Persona.ciudad = ciudad;
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

public class Tema4ejercicio11 {

	static void mostrarMenu() {
		System.out.println("Escoge una opcion: ");
		System.out.println("1. Crear una nueva persona");
		System.out.println("2. Cambiar el nombre");
		System.out.println("3. Cambiar edad");
		System.out.println("4. Mostrar datos");
		System.out.println("5. Salir");
	}

	static void mostrarPersona(Persona p) {
		System.out.println(p.getEdad());
		System.out.println(p.getNombre());
		System.out.println(Persona.getCiudad());//Invoco a Ciudad desde la clase Persona
		
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int opcion, edad;
		String nombre;
		
		
		Persona p = new Persona();// creando objeto

		do {
			Tema4ejercicio11.mostrarMenu();
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduce tu nombre: ");
				nombre = entrada.next();
				System.out.println("Introduce tu edad: ");
				edad = entrada.nextInt();
				p = new Persona(nombre, edad);// no volver a poner persona pq estoy invocando no creando
				break;

			case 2:
				System.out.println("Introduce un nuevo nombre:");
				nombre = entrada.next();
				p.setNombre(nombre);

				break;
			case 3:
				System.out.println("Introduce tu nueva edad:");
				edad = entrada.nextInt();
				p.setEdad(edad);
				break;
			case 4:
				Tema4ejercicio11.mostrarPersona(p);

				break;
			case 5:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Error");

			}

		} while (opcion != 5);

	}

}
