package tema4ejercicio30;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Tema4ejercicio30 {

	public static void main(String[] args) {

		String horaAlquiler; 
		double coste;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la hora en la que se obtuvo la bici");
		horaAlquiler = entrada.next();
		
		
		LocalTime lt1 = LocalTime.parse(horaAlquiler);
		LocalTime lt2 =  LocalTime.now();  //hora devolcuion es la hora actual
		
		Duration d = Duration.between(lt1, lt2);
		System.out.println("Han transcurrido " + d.toHours() + " horas");
		System.out.println("Han transcurrido " + d.toMinutes() + " minutos");
		
		if(d.toMinutes()<29) {
			System.out.println("La devolución es gratis ");
		}else if( d.toMinutes()<=60){
			coste = 0.52;
			System.out.println("El precio a pagar es " +coste);
			
		}else {
			coste = 2.08*d.toHours();
			System.out.println("El precio a pagar es "+ coste);
		}
		
		
	}

}
