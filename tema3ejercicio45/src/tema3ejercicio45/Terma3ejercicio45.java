package tema3ejercicio45;

import java.util.Scanner;

public class Terma3ejercicio45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pesoMax, pesoReal, devolucion, suma = 0, nummaletas, contador = 1;
		Scanner e = new Scanner(System.in);
		System.out.println("¿Cuantas maletas lleva? ");
		nummaletas = e.nextInt();
		do {
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
			contador++;

		} while (contador <= nummaletas);

		System.out.println("El coste total es " + suma);

	}

}
