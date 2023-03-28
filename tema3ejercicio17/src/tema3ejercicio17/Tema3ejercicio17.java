package tema3ejercicio17;
import java.util.Scanner;
public class Tema3ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seg, porcentajedes,tamañot, tamañoactual,velocidad;
		Scanner d = new Scanner(System.in); // Declarar objeto y crear variable Scanner.
		System.out.println("Introduce el tamaño total del fichero:");
		tamañot = d.nextDouble();
		System.out.println("Introduce el tamaño actual del fichero");
		tamañoactual = d.nextDouble();
		System.out.println("Introduce la velocidad de conexión:");
		velocidad = d.nextDouble();
		porcentajedes= (tamañoactual/tamañot)*100;
		seg = ((tamañot - tamañoactual)/velocidad);
		System.out.println("El porcentaje de fichero ya descargado es " + porcentajedes + "%");
		System.out.println("Los segundo que quedan para terminar de descargarlo son: " + seg + "segundos");

		
	}

}
