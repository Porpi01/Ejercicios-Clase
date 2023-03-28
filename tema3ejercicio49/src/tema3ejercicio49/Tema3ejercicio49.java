package tema3ejercicio49;

import java.util.Scanner;

public class Tema3ejercicio49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pesoMax, pesoReal, devolucion, suma = 0, nummaletas;
		Scanner e = new Scanner(System.in);
		System.out.println("¿Cuantas maletas lleva? ");
		nummaletas = e.nextInt();
		for (int contador = 1; contador <= nummaletas; contador++) {

			System.out.println("Dime por cuanto peso máximo factura su maleta (10,20,25 kg) ");
			pesoMax = e.nextInt();
			System.out.println("Dime cuanto pesa realmente su maleta ");
			pesoReal = e.nextInt();
			devolucion = (pesoReal - pesoMax) * 12;
			if (pesoReal < pesoMax) {
				System.out.println("El precio a pagar será 0");
			} else {
				System.out.println("El precio a pagar será: " + devolucion);
				suma = suma + devolucion;
			} // Vamos sumando las devoluciones

			System.out.println("El coste total es " + suma);
		}
	}

}
