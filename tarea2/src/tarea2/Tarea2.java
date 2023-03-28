//Monica Alcañiz Puig

package tarea2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tarea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String cadena1, cadena2;
		double porcentaje;
		int adenina = 0, diferencias = 0, posicion, longitud, posicion2,longitud2;

		System.out.println("Introduce una cadena: ");
		cadena1 = entrada.next();
		for (int i = 0; i < cadena1.length(); i++) {
			if (cadena1.charAt(i) == 'A') {
				adenina++;
			}
		}
		System.out.println("El numero de adeninas es:" + adenina + " A");
		porcentaje = (adenina / 5) * 100;
		System.out.println("El porentaje de adenina es:" + porcentaje);

		System.out.println("Introduce otra cadena:");
		cadena2 = entrada.next();
		posicion2 =0;
		longitud = cadena1.length();
		longitud2 = cadena2.length();
		for (int i = 0; i < cadena2.length(); i++) {

			diferencias++;

		}System.out.println("El numero de diferencias es:");

		Pattern pat = Pattern.compile("[A,T,C,G]\\\\w{1,}");
		Matcher mat = pat.matcher("cadena1");
		if (mat.matches()) {
			System.out.println("Cumple el patrón");
		} else {
			System.out.println("No cumple el patrón");
		}
		Pattern patt = Pattern.compile("[A,T,C,G]\\w{1,}");
		Matcher matt = patt.matcher("cadena2");
		if (matt.matches()) {
			System.out.println("Cumple el patrón");
		} else {
			System.out.println("No cumple el patrón");
		}
	}

}


