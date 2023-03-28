package tema3ejercicio27;

import java.util.Scanner;

public class Tema3ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vit1, ataquef1, ataquem1, defensaf1, defensam1, pers1, pers2, vit2, ataquef2, ataquem2, defensaf2,
				defensam2, ataquet1, defensat1, ataquet2, defensat2, daño, daño2;
		String pj1, pj2;
		Scanner p = new Scanner(System.in);

		System.out.println("Introduce el nombre del personaje 1");
		pj1 = p.nextLine();
		System.out.println("Introduce la vitalidad del personaje 1");
		vit1 = p.nextInt();
		System.out.println("Introduce el ataque físico del personaje 1");
		ataquef1 = p.nextInt();
		System.out.println("Introduce el ataque mágico del personaje 1");
		ataquem1 = p.nextInt();
		System.out.println("Introduce el la defensa mágica del personaje 1 ");
		defensam1 = p.nextInt();
		System.out.println("Introduce la defensa física del personaje 1 ");
		defensaf1 = p.nextInt();
        p.nextLine();
		System.out.println("Introduce el nombre del personaje 2");
		pj2 = p.nextLine();
		System.out.println("Introduce la vitalidad del personaje 2 ");
		vit2 = p.nextInt();
		System.out.println("Introduce el ataque físico del personaje 2 ");
		ataquef2 = p.nextInt();
		System.out.println("Introduce el ataque mágico del personaje 2 ");
		ataquem2 = p.nextInt();
		System.out.println("Introduce el la defensa mágica del personaje 2 ");
		defensam2 = p.nextInt();
		System.out.println("Introduce la defensa física del personaje 2 ");
		defensaf2 = p.nextInt();

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
		
		if(vit1<0)
			System.out.println("La vitalidad del personaje 1 baja de 0");
		else
			System.out.println("La vitalidad del personaje 1 supera 0");

		if(vit2<0)
			System.out.println("La vitalidad del personaje 2 baja de 0");
		else
			System.out.println("La vitalidad del personaje 2 supera 0");
	}


}

