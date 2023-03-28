package tema3ejercicio52;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tema3ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner entrada = new Scanner(System.in);
		        String fecha;

		        System.out.println("Introduce la fecha ");
		        fecha = entrada.next();
		        Pattern pat = Pattern.compile("([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})");
		        Matcher mat = pat.matcher(fecha);
		        if (mat.matches()) {
		            System.out.println("Cumple el patrón");
		        } else {
		            System.out.println("No cumple el patrón");
		        }

		    }

		}
