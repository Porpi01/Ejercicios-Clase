package tem3ejercicio30;
import java.util.Scanner;

public class Tema3ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double cuotaResultante, rendTrabajo, rendCapital,retencionIngreso;
			
			Scanner m = new Scanner(System.in);
			System.out.println("Introduce tu rendimiento del trabajo");
			rendTrabajo = m.nextDouble();
			System.out.println("Introduce tu rendimiento del capital mobiliario");
			rendCapital = m.nextDouble();
			System.out.println("Introduce tu retención e ingresos a cuenta");
			retencionIngreso = m.nextDouble();
			cuotaResultante = (rendTrabajo + rendCapital)-retencionIngreso;
			
			
			if (cuotaResultante>=0) {
				System.out.println("Hacienda te devuelve dinero");
			} else 
			System.out.println("Le debes dinero a Hacienda");
			
		}

		
		
	}


