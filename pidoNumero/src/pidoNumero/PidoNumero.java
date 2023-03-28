package pidoNumero;

import java.util.Scanner;

public class PidoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numero;
		do {

			System.out.println("Introduce un numero del 0 al 10: ");
			numero = entrada.nextInt();
			if ((numero >= 0) && (numero <= 10)) {
				System.out.println("El numero introducido es: " + numero);
			}
		} while (numero > 10);

	}

}
