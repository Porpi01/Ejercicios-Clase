package pelicula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Película {

	enum Genero {DRAMA, COMEDIA, TERROR, MUSICAL};

	class Pelicula {
		private String titulo;
		private Genero genero;
		
		Pelicula(String t, Genero g){
			this.titulo=t;
			this.genero=g;
		}

		String getTitulo() {
			return titulo;
		}

		void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		Genero getGenero() {
			return genero;
		}

		void setGenero(Genero genero) {
			this.genero = genero;
		}
	
	public static void main(String[] args) {
		//Igual que el ejercicio anterior, pero con HashMap
		
		HashMap<String,Integer> peliculas = new HashMap <>();
		
				//HUECO 6: declaraci�n de la variable "peliculas" con el HashMap


				//HUECO 7 (Dos l�neas de c�digo)
				//Introduce dos pel�culas en el HashMap
				//"Pesadilla en Elm Street", terror
				//"Ghost", drama
				
				peliculas.put("Pesadilla en ELm Street",1);
				
				for (String titulo: peliculas.keySet())  { 
					if ( //HUECO 9 ) {  
						System.out.println( peliculas.g ); 
							
					}
				}
	}

}
