package tema3ejercicio13b;
import java.util.Scanner;

public class Tema3ejercicio13b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultados;
		int dividir;
		int resultadosporpagina;
		Scanner r = new Scanner(System.in);
		System.out.println("Introduce un número de páginas:");
		resultados = r.nextInt();
		System.out.println("Especifíca un número de páginas:");
		resultadosporpagina = r.nextInt();
		dividir = resultados /resultadosporpagina;
		
		
		System.out.println("El número de páginas es " + dividir + "páginas");


	}

}