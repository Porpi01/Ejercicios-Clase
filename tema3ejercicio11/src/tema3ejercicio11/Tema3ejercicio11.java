package tema3ejercicio11;

import java.util.Scanner;

public class Tema3ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double segundos, min, hora, dia;
		Scanner s = new Scanner(System.in);//Solo declararlo una vez
		System.out.println("Introduce segundos:");
		segundos = s.nextDouble();
		min = segundos / 60;
		System.out.println("Los minutos son:" + min + "minutos");
		hora = min / 60;
		System.out.println("Las horas son:" + hora + "horas");
		dia = hora /24;
		System.out.println("Los dias son:" + dia + "dias");
	}

}
