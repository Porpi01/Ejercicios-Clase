package tema6ejercicio9;
//Monica Alcañiz Puig
import java.util.Random;
import java.util.Scanner;

public class Tema6ejercicio9 {

	static final int FILA = 5;
	static final int COLUMNA = 2;

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

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = azar.nextInt(20);

				mat2[i][j] = mat[i][j] * 2;

			}

		}
		imprimirMatriz(mat);
		imprimirMatriz(mat2);

	}

}
