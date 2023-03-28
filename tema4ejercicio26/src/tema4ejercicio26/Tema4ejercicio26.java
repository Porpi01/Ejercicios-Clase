package tema4ejercicio26;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Tema4ejercicio26 {

	public static void main(String[] args) {
		String fecha;
		int mes, dia;

		Scanner e = new Scanner(System.in);
		try {
			System.out.println("Introduce una fecha");
			fecha = e.next();
			LocalDate ld1 = LocalDate.parse(fecha);
			mes = ld1.getMonthValue();
			System.out.println("El mes es " + mes);

			LocalDate ld2 = ld1.plusYears(1);
			DayOfWeek semana = ld2.getDayOfWeek();
			System.out.println("El dia de la semana del año que viene es" + semana);

			mes = ld1.lengthOfMonth();
			System.out.println("El mes tiene " + mes + " dias");

		} catch (DateTimeParseException error) {
			System.out.println("Error en el formato");
		}

	}

}
