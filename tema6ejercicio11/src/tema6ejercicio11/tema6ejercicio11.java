package tema6ejercicio11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class tema6ejercicio11 {

	static final int COLUMNAS = 10;
	static final int FILAS = 15;
	static final int RESPUESTA_CORRECTA = 1;
	static final double RESPUESTA_INCORRECTA = 0.5;

	static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {

				System.out.println("Fila " + i + " Columna " + j + " : " + matriz[i][j]);
			}
			System.out.println();
		}

	}

	static void imprimirMenu() {
		System.out.println("Escoge una opcion");
		System.out.println("1. Mostrar respuestas alumno");
		System.out.println("2. Mostrar respuestas examenes");
		System.out.println("3. Mostrar nota de un alumno");
		System.out.println("4. Mostrar nota todos los alumnos");
		System.out.println("5. Averiguar cuántos alumnos han fallado la pregunta");
		System.out.println("6. Averiguar cuál es la pregunta en la que ha habido más fallos");
		System.out.println("7. Averiguar cuál es la pregunta que más alumnos han dejado en blanco");

	}

	static double[] calcularNotaAlumno(int respuestasCorrectas[], int matrizAlumnos[][], int índiceAlumno) {

		double[] notas = new double[FILAS];

		for (int i = 0; i < matrizAlumnos.length; i++) {
			double notaAlumno = 0;
			if (matrizAlumnos[índiceAlumno] == matrizAlumnos[i]) {
				for (int j = 0; j < matrizAlumnos[i].length; j++) {
					if (matrizAlumnos[i][j] == respuestasCorrectas[j]) {
						notaAlumno = +RESPUESTA_CORRECTA;
					} else {
						notaAlumno = -RESPUESTA_INCORRECTA;
					}
				}
				notas[i] = notaAlumno;
			}
		}

		return notas;
	}

	static double[] calcularNotas(int respuestasCorrectas[], int matrizAlumnos[][]) {

		double[] notas = new double[FILAS];

		for (int i = 0; i < matrizAlumnos.length; i++) {

			double notaAlumno = 0;
			for (int j = 0; j < matrizAlumnos[i].length; j++) {
				if (matrizAlumnos[i][j] == respuestasCorrectas[j]) {
					notaAlumno = +RESPUESTA_CORRECTA;
				} else {
					notaAlumno = -RESPUESTA_INCORRECTA;
				}
			}
			notas[i] = notaAlumno;
		}

		return notas;
	}
	static int[] calcularAlumnosHanFallado(int respuestasCorrectas[], int matrizAlumnos[][], int índiceAlumno) {

		double[] notas = new double[FILAS];

		for (int i = 0; i < matrizAlumnos.length; i++) {
			double notaAlumno = 0;
			if (matrizAlumnos[índiceAlumno] == matrizAlumnos[i]) {
				for (int j = 0; j < matrizAlumnos[i].length; j++) {
					if (matrizAlumnos[i][j] != respuestasCorrectas[j]) {
						notaAlumno = +RESPUESTA_CORRECTA;
					} else {
						notaAlumno = -RESPUESTA_INCORRECTA;
					}
				}
				notas[i] = notaAlumno;
			}
		}

		return notas;
	}
	
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random azar = new Random();
		int respuestasCorrectas[] = new int[FILAS];
		int matrizAlumnos[][] = new int[FILAS][COLUMNAS];
		double[] notas = new double[FILAS];
		int opcion;
		int índiceAlumno;
		double notaAlumno = 0;

		for (int i = 0; i < matrizAlumnos.length; i++) {

			for (int j = 0; j < matrizAlumnos[i].length; j++) {
				matrizAlumnos[i][j] = azar.nextInt(4);
			}
		}

		for (int i = 0; i < respuestasCorrectas.length; i++) {
			respuestasCorrectas[i] = azar.nextInt(4);
		}

		do {

			imprimirMenu();
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("¿De cuál alumno quieres mirar la nota?");
				índiceAlumno = entrada.nextInt();
				for (int i = 0; i < matrizAlumnos.length; i++) {
					if (matrizAlumnos[i] == matrizAlumnos[índiceAlumno]) {
						for (int j = 0; j < matrizAlumnos[i].length; j++) {
							índiceAlumno = matrizAlumnos[i][j];
							System.out.println(índiceAlumno);
						}

					}
				}

				break;

			case 2:

				for (int i = 0; i < matrizAlumnos.length; i++) {

					for (int j = 0; j < matrizAlumnos[i].length; j++) {

					}
				}
				imprimirMatriz(matrizAlumnos);

				break;
			case 3:
				System.out.println("¿De cuál alumno quieres mirar la nota?");
				índiceAlumno = entrada.nextInt();

				notas = calcularNotaAlumno(respuestasCorrectas, matrizAlumnos, índiceAlumno);

				System.out.println(notas[índiceAlumno]);

				break;
			case 4:
				notas = calcularNotas(respuestasCorrectas, matrizAlumnos);
				for (int i = 0; i < notas.length; i++) {
					System.out.println(notas[i]);

				}

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:
				System.out.println("Fin del programa");

				break;
			default:
				System.out.println("Error");

			}

		} while (opcion != 8);

	}

}
