package tema4ejercicio31;

import java.time.Duration;
import java.time.LocalTime;

public class Tema4ejercicio31 {

	public static void main(String[] args) {

		int numero = 17;
		int doble; 
		
		//Apartado a
		LocalTime ahora = LocalTime.now();
		for(int i =1; i <1000000000; i++) {
		doble = 17*2;
		
		}
		LocalTime despues = LocalTime.now();
		Duration d = Duration.between(ahora, despues);
		System.out.println("El tiempo transcurrido ha sido "+ d.toNanos() + " nanosegundos");
		
		//Apartado b
				LocalTime ahora2 = LocalTime.now();
				for(int i =1; i <1000000000; i++) {
				doble = 17+17;
				
				}
				LocalTime despues2 = LocalTime.now();
				Duration d2 = Duration.between(ahora2, despues2);
				System.out.println("El tiempo transcurrido ha sido "+ d2.toNanos() + " nanosegundos");
				
		//Apartado c
				LocalTime ahora3 = LocalTime.now();
				for(int i =1; i <1000000000; i++) {
				doble = (int) Math.pow(numero, 2);
				
				
				}
				LocalTime despues3 = LocalTime.now();
				Duration d3 = Duration.between(ahora3, despues3);
				System.out.println("El tiempo transcurrido ha sido "+ d3.toNanos() + " nanosegundos");
		
	}

}
