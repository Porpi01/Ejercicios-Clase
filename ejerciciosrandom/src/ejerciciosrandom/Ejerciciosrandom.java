package ejerciciosrandom;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejerciciosrandom {


	public class Tema3ejercicio62 {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner entrada = new Scanner(System.in);
	        String nombreCompleto;

	        System.out.println("Introduce tu nombre completo: ");
	        nombreCompleto = entrada.nextLine();
	        Pattern pat = Pattern.compile("^[A-Z][a-zñ]+\\s[A-Z][a-z]+,\\s[A-Z][a-z]+$");
	        Matcher mat = pat.matcher(nombreCompleto);
	        if (mat.matches()) {
	            System.out.println("Cumple el patrón");
	        } else {
	            System.out.println("No cumple el patrón");
	        }

	    }

	}
}
