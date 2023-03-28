package tema4ejercicio29;

import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Tema4ejercicio29 {

	public static void main(String[] args) {

		String hora;

		Scanner entrada = new Scanner(System.in);

		try {
		System.out.println("Introduce una hora");
		hora = entrada.next();

		LocalTime lt1 = LocalTime.parse(hora);

		int minuto = lt1.getMinute();
		System.out.println("Los minutos son " + minuto);
		
		LocalTime horaanterior = lt1.minusMinutes(320);
		int ld4 = horaanterior.getHour();
		System.out.println("La hora hace 320 min fue "+ ld4);
		
		LocalTime ahora = LocalTime.now();
        if(lt1.isBefore(ahora)) {
        	System.out.println("La hora anterior es " + lt1);
        }else {
        	System.out.println("La hora anterior es " + ahora);
        }
		}catch(DateTimeParseException error1) {
			System.out.println("Error en el formato de los datos");
		}

	}

}
