package tema6ejercicio5;
//Monica Alcañiz Puig

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tema6ejercicio5 {

	static final int TAMAÑO = 20;

	public static void main(String[] args) {

		Alumno alum = new Alumno();

		int nota1, nota2, nota3;
		String nombre;
		double media;

		List<Alumno> listaAlumnos = new ArrayList<>();

		try {
			FileReader fr = new FileReader("notas");
			BufferedReader br = new BufferedReader(fr);
			Scanner s = new Scanner(br);
			for (int i = 0; i < TAMAÑO; i++) {

				nombre = s.next();
				nota1 = s.nextInt();
				nota2 = s.nextInt();
				nota3 = s.nextInt();
				listaAlumnos.add(new Alumno(nombre, nota1, nota2, nota3));

			}

			Iterator<Alumno> iter = listaAlumnos.iterator();

			while (iter.hasNext()) {
				alum = iter.next();

				media = (alum.getNota1() + alum.getNota2() + alum.getNota3()) / 3.0;
				System.out.println(media);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: fichero no encontrado");
		}
	}

}
