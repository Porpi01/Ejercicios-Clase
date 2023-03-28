package tema3ejercicio12;

import java.util.Scanner;

public class Tema3ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int seguidores;
double dividir;
Scanner s = new Scanner(System.in);
System.out.println("Introduce número de seguidores:");
seguidores = s.nextInt();
dividir=seguidores/1000.0;
System.out.println("El número de seguidores que tienes son:" + String.format("%.1f",dividir)+"K");//dividir es la variable es decir n
//%, f decimales tantos como yo quiera
	}

}
