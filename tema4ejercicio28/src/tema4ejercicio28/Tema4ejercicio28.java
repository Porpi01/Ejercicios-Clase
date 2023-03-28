package tema4ejercicio28;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Tema4ejercicio28 {

	public static void main(String[] args) {

		LocalDate hoy = LocalDate.now();
		LocalDate inicioclases = LocalDate.of(2022, 9, 10);

		Period p = Period.between(inicioclases, hoy);
		System.out.println("Han transcurrido " + p.getYears() + " años, " + p.getMonths() + " meses, y " + p.getDays()
				+ " días desde que empezó el curso");

		// Uso de ChronoUnit para calcular el total de días
		long p2 = ChronoUnit.DAYS.between(inicioclases, hoy);
		System.out.println("Han transcurrido " + p2 + " días en total");

		LocalDate finclases = LocalDate.of(2023, 6, 30);

		Period p3 = Period.between(hoy, finclases);
		System.out.println("Faltan " + p3.getYears() + " años, " + p3.getMonths() + " meses, y " + p3.getDays()
				+ " días para que acabe el curso");

		// Uso de ChronoUnit para calcular el total de días
		long p4 = ChronoUnit.DAYS.between(hoy, finclases);
		System.out.println("Han transcurrido " + p4 + " días en total");

		LocalDate cumple = LocalDate.of(2023, 05, 04);

		Period p5 = Period.between(hoy, cumple);
		System.out.println("Faltan " + p5.getYears() + " años, " + p5.getMonths() + " meses, y " + p5.getDays()
				+ " días para mi cumpleaños");

		// Uso de ChronoUnit para calcular el total de días
		long p6 = ChronoUnit.DAYS.between(hoy, cumple);
		System.out.println("Han transcurrido " + p6 + " días en total");

	}

}
