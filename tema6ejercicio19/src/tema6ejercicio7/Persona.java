package tema6ejercicio7;

public class Persona {
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
