package tema6ejercicio3;

import java.util.Random;

public class Tema6ejercicio3 {

	public static void main(String[] args) {

		int notas [] = new int [20];
		
		int estadisticas [] = new int [10];
		
		Random azar = new Random();
		
		for(int i = 0; i< notas.length; i++) {
			
			notas[i] = azar.nextInt(10) ;
			
		}
			for(int j=0;j< estadisticas.length; j++) {
				estadisticas[notas[j]]++; //Estás usando notas como índice
			
				System.out.println("El número de personas con la nota " + j + " son " + estadisticas[notas[j]]);
				}
			}
			
		

	

}
