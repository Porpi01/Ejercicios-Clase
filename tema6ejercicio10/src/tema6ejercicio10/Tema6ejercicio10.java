package tema6ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class Tema6ejercicio10 {

	static final int FILAS = 3;
	static final int COLUMNAS = 5;

	static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {

				System.out.println("Fila " + i + " Columna " + j + " : " + matriz[i][j]);
			}
			System.out.println();
		}	
	

	}

	static void mostrarMenu() {
		System.out.println("Escoge una opción:");
		System.out.println("1. Ver ventas");
		System.out.println("2. Cual es el producto más vendido, de una tienda en concreto");
		System.out.println(
				"3. Averiguar, de un producto concreto, cuál es la tienda que más unidades ha vendido de ese producto.");
		System.out.println(
				"4. Averiguar, de cada tienda, las ganancias obtenidas, sabiendo que los precios de los 5 productos son, respectivamente: 3 €, 5 €, 1 €, 10 € y 2 €.");
		System.out.println("5. Salir");
	}

	public static void main(String[] args) {

		Random azar = new Random();

		Scanner entrada = new Scanner(System.in);

		int opcion, columnaProducto, filaTienda;
		int[][] matrizEmpresa = new int[FILAS][COLUMNAS];
		int[] precios = { 3, 5, 1, 10, 2 };
		int mayor = 0;
		int tienda = 0;
		int precio = 0;
		int contador = 0;

		for (int i = 0; i < matrizEmpresa.length; i++) {

			for (int j = 0; j < matrizEmpresa[i].length; j++) {
				matrizEmpresa[i][j] = azar.nextInt(1000);

			}

		}

		do {
			mostrarMenu();
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:

				for (int i = 0; i < matrizEmpresa.length; i++) {

					for (int j = 0; j < matrizEmpresa[i].length; j++) {

					}

				}
				System.out.println("Las ventas totales son: ");
				imprimirMatriz(matrizEmpresa);

				break;

			case 2:
				System.out.println("¿Cuál tienda quieres mirar?");
				filaTienda = entrada.nextInt();

				for (int i = 0; i < matrizEmpresa.length; i++) {

					if (matrizEmpresa[i] == matrizEmpresa[filaTienda]) {

						for (int j = 0; j < matrizEmpresa[i].length; j++) {
							if (matrizEmpresa[i][j] > mayor) {
								mayor = matrizEmpresa[i][j];

							}

						}
					}

				}
				System.out.println("El producto más vendido es " + mayor);

				break;

			case 3:
				System.out.println("¿Cuál producto quieres mirar?");
				columnaProducto = entrada.nextInt();

				for (int i = 0; i < matrizEmpresa.length; i++) {

					if (matrizEmpresa[i][columnaProducto] > mayor) {
						mayor = matrizEmpresa[i][columnaProducto];
						tienda = i;

					}

				}
				System.out.println("La tienda que más vende es " + tienda);

				break;

			case 4:
				for (int i = 0; i < matrizEmpresa.length; i++) {
					precio = 0;

					for (int j = 0; j < matrizEmpresa[i].length; j++) {

						precio = matrizEmpresa[i][j] * precios[j];
						contador += precio;

					}
					System.out.println("El precio total es: " + contador + " euros");

				}

				break;

			case 5:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 5);

	}

}
