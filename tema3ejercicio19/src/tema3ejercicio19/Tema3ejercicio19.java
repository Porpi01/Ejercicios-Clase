package tema3ejercicio19;
import java.util.Scanner;
public class Tema3ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nombre,apell1,apell2;
int x,añonacimiento,edad;//X es la longitud
char inicial1,inicial2,inicial3;
int añoactual=2022;
Scanner n = new Scanner(System.in);
System.out.println("Introduce tu nombre");
nombre = n.next();//Declarar
System.out.println("Introduce tu primer apellido");
apell1 = n.next();
System.out.println("Introduce tu segundo apellido");
apell2 = n.next();
System.out.println("Introduce tu año de nacimiento");
añonacimiento = n.nextInt();

inicial1=nombre.charAt(0);
inicial2=apell1.charAt(0);
inicial3=apell2.charAt(0);
edad=añoactual-añonacimiento;
System.out.println( " La cadena formada con las iniciales y tu edad es "+ inicial1 + inicial2 + inicial3 + edad);


	}

}
