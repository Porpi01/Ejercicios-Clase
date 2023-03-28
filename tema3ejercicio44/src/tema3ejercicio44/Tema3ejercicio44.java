package tema3ejercicio44;

import java.util.Random;
import java.util.Scanner;

public class Tema3ejercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p = new Scanner(System.in);
		Random azar = new Random();
		int vit1 = azar.nextInt(100), ataquef1 = azar.nextInt(70), ataquem1 = azar.nextInt(50);
		int defensaf1 = azar.nextInt(60), defensam1 = azar.nextInt(50);
		int vit2 = azar.nextInt(100), ataquef2 = azar.nextInt(70), ataquem2 = azar.nextInt(50);
		int defensaf2 = azar.nextInt(60), defensam2 = azar.nextInt(50);
		int ataquet1, defensat1, ataquet2, defensat2, daño, daño2;
		String pj1, pj2;

		System.out.println("Introduce el nombre del personaje 1");
		pj1 = p.next();
		System.out.println("Introduce el nombre del personaje 2");
		pj2 = p.next();
		do {
			ataquet1 = ataquef1 + ataquem1;
			ataquet2 = ataquef2 + ataquem2;
			defensat1 = defensaf1 + defensam1;
			defensat2 = defensaf2 + defensam2;
			daño = ataquet1 - defensat2;
			vit2 = vit2 - daño;
			System.out.println("La vitalidad del personaje 2 tras el primer ataque es " + vit2);
			daño2 = ataquet2 - defensat1;
			vit1 = vit1 - daño2;
			System.out.println("La vitalidad del personaje 1 tras el segundo ataque es " + vit1 + "y"
					+ "la vitalidad del personaje 2 tras el segundo ataque es " + vit2);

		} while ((vit1 > 0) && (vit2 > 0));// 
		if (vit1 <= 0)
			System.out.println("El personaje 1 ha muerto");
		
		if (vit2 <= 0)
			System.out.println("El personaje 2 ha muerto");
		
	}

}
