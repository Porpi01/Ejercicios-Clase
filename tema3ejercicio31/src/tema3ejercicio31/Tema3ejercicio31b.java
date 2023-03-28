package tema3ejercicio31;
import java.util.Scanner;
public class Tema3ejercicio31b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int moneda, vidas, moneda2=0,vida2;
		Scanner e = new Scanner(System.in);
		System.out.println("Dime el número de vidas que tienes actualmente");
		vidas = e.nextInt();
		System.out.println("Dime el número de monedas que tienes actualmente");
		moneda = e.nextInt();
		vida2 =vidas++;
		moneda++;
		
		if(moneda>=100) {
		System.out.println("El numero de vidas es "+vidas + "y el número de monedas es "+moneda2);
		}else
			System.out.println("El numero de vidas es "+vida2 + "y el número de monedas es "+moneda);
	}

}
