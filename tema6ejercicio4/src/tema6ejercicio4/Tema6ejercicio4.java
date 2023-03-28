package tema6ejercicio4;

import java.util.Random;

public class Tema6ejercicio4 {

	public static void main(String[] args) {

		Random azar = new Random();
		
		int enteros [] = new int [30];
		int pares[]= new int [30];
		int contador=0;
		
		for(int i=0; i< enteros.length; i++) {
			enteros[i] = azar.nextInt(100);
				if(enteros[i]%2==0) {
				 pares[contador] = enteros[i];
				
				 System.out.println(pares[contador]);
				}
			}
		}

	

}
