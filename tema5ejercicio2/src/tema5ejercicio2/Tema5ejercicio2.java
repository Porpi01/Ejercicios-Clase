package tema5ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tema5ejercicio2 {

	public static void main(String[] args) {

		String nombre;
		double media;
		
		File f = new File("../ejercicio1file/media.txt");
		File faprobados = new File("aprobados.txt");
		File fsuspendidos = new File ("suspendidos.txt");
		try {
			PrintWriter p = new PrintWriter(faprobados);
			PrintWriter p2 = new PrintWriter (fsuspendidos);

			try {

				Scanner entrada = new Scanner(f);

				while (entrada.hasNextLine()) {
					media = entrada.nextDouble();
					nombre = entrada.next();
					if( media < 5) {
						p.println("Han aprobado" + "\n" + nombre );
					}else {
						p2.println("Han suspendido" + "\n" + nombre);
					}
              

				}
				p.close();
				p2.close();
				
			} catch (FileNotFoundException excepcion1) {
				excepcion1.printStackTrace();
			}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
		} 
	

	}

}
