package tema6ejercicio5;
//Monica Alcañiz Puig

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tema6ejercicio5 {

	public static void main(String[] args) {
		
		Alumno al = new Alumno();

		Alumno alumnos [] =  new Alumno [20];
		Scanner entrada = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		String nombre;
		double media;
		
		
		
		for(int  i = 0; i<alumnos.length;i++) {
			
			System.out.println("Introduce nota 1");
			nota1 = entrada.nextInt();
			System.out.println("Introduce nota 2");
			nota2 = entrada.nextInt();
			System.out.println("Introduce nota 3");
			nota3 = entrada.nextInt();
			
			System.out.println("Introduce tu nombre");
			nombre = entrada.next();
			
			media = (nota1 + nota2 + nota3)/3;
			try {
				FileWriter fw = new FileWriter ("../ejercicio1file/media.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				 pw.println(nombre + media);
				    pw.close();
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		   
			
		}
		
	}

}
