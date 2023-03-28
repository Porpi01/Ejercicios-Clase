import java.util.Scanner;

public class Tema6ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int descargas[] = new int [6];
        int maximo [] = new int [6];
        int minimo [] = new int[6];
         maximo[0] = 0;
         minimo[0] = Integer.MAX_VALUE;;
        
        for(int i=0; i<descargas.length;i++) {
        	System.out.println("Introduce el número de descargas de la aplicacion");
        	descargas[i] = entrada.nextInt();
        	if(descargas[i]> maximo[0]) {
        		maximo[0] = descargas[i];
        	}if(descargas[i]<=minimo[0]){
        		minimo[0]=descargas[i];
        	}
        	
        	}System.out.println(maximo[0]);
        	System.out.println(minimo [0]);
        }
	}


