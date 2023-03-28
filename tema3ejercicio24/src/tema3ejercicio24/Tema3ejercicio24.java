package tema3ejercicio24;
import java.util.Scanner;
public class Tema3ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int entero, par, impar;
Scanner e = new Scanner(System.in);
System.out.println("Introduce un número entero");
entero=e.nextInt();
if (entero%2 == 0)// El resto del entero entre 2 debe ser igual a 0 % significa el resto
	System.out.println("Es un número par");
else
	System.out.println("Es un número impar");
	}

}
