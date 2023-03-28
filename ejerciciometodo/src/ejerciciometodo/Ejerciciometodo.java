package ejerciciometodo;

import java.util.Scanner;

public class Ejerciciometodo {


	int escogerOpcion(int num1, int num2, int num3,int opcion) {
		
		

		switch (opcion) {
		case 1:
			num3= num1 + num2; break;

		case 2:
			num3 = num1 - num2;break;

		case 3:
			num3 = num1 * num2;break;

		case 4:
			num3 = num1 / num2;break;

		case 5:
			num3 = num1 % num2; break;

		}
		return num3;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2,num3=0;//NO SON LAS MISMAS VARIBALES QUE LAS DE LA CLASE
		
		int opcion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = entrada.nextInt();
		System.out.println("Introduce otro numero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Escoge una opción: ");
		opcion = entrada.nextInt();
		Ejerciciometodo p = new Ejerciciometodo();// Declaro objeto clase
		opcion = p.escogerOpcion(num1,num2,num3,opcion);
		System.out.println("El resultado de la suma es:"+num3);
		System.out.println("El resultado de la resta es:"+num3);
		System.out.println("El resultado de la multiplicaion es:"+num3);
		System.out.println("El resultado de la division es:"+num3);
		System.out.println("El resultado del resto es:"+num3);
		
	}

}
