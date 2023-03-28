package tema3ejercicio33;

import java.util.Scanner;

public class Tema3ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pesoMax, pesoReal, devolucion;
		Scanner e = new Scanner(System.in);
		System.out.println("Dime por cuanto peso máximo factura su maleta");
		pesoMax = e.nextInt();
		System.out.println("Dime cuanto pesa realmente su maleta");
		pesoReal = e.nextInt();
		devolucion = (pesoReal - pesoMax) * 12;

		if (pesoReal < pesoMax) {
			System.out.println("El precio a pagar será 0");
		} else if (pesoReal > pesoMax)
			System.out.println("El precio a pagar será: " + devolucion);

	}

}
