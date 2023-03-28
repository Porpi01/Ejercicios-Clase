package tema6ejercicio9;

//Monica Alcañiz Puig
import java.util.Random;
import java.util.Scanner;

public class Tema6ejercicio9 {

	static final int FILA = 4;
	static final int COLUMNA = 3;

	static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < FILA; i++) {
			for (int j = 0; j < COLUMNA; j++) {

				System.out.println("Fila " + i + " Columna " + j + " : " + matriz[i][j]);
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Random azar = new Random();

		int[][] mat = new int[FILA][COLUMNA];
		int[][] mat2 = new int[FILA][COLUMNA];
		int[][] mat3 = new int[FILA][COLUMNA];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = azar.nextInt(10);

			}

		}
		imprimirMatriz(mat);

		for (int i = 0; i < mat2.length; i++) {

			for (int j = 0; j < mat2[i].length; j++) {
				System.out.println("Introduce un número");
				mat2[i][j] = entrada.nextInt();

			}

		}
		imprimirMatriz(mat2);
		
		for (int i = 0; i < mat3.length; i++) {

			for (int j = 0; j < mat3[i].length; j++) {

				mat3[i][j] = mat[i][j] + mat2[i][j];

			}

		}
		imprimirMatriz(mat3);

	}

}
