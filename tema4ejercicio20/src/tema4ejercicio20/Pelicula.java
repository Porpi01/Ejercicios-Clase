package tema4ejercicio20;

enum Genero {
	DRAMA, COMEDIA, TERROR, MUSICAL
};

public class Pelicula {
	Genero genero;
	String titulo;
	int duracion;
	int año;

	Pelicula(String titulo, int duracion, int año, Genero genero) {// Constructor película
		this.año = año;
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
	}

	
	void mostrarPelicula1() {
		System.out.println("Año=" + this.año + " Titulo= " + this.titulo + " Duracion= " + this.duracion + " min" + " Genero= "+ this.genero.name());
	}

	void mostrarPelicula2() {
		System.out.println("Año=" + this.año + " Titulo= " + this.titulo + " Duracion= " + this.duracion + " min"+ " Genero= "+ this.genero.name());
	}

	public static void main(String[] args) {

		Pelicula p = new Pelicula("Todo a la vez en todas partes", 132, 2022, Genero.COMEDIA );
		p.mostrarPelicula1();
        Pelicula p2 = new Pelicula("Sonrisas y Lágrimas", 174, 1965, Genero.MUSICAL );
        p2.mostrarPelicula2();
	}

}
