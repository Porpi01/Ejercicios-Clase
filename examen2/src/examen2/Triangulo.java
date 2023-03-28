package examen2;

import java.util.regex.*;

class Triangulo {
	double cateto1, cateto2, hipotenusa;
	
	Triangulo(){
		
	}
	
	Triangulo(double cateto1, double cateto2, double hipotenusa){
		this.cateto1=cateto1;
		this.cateto2=cateto2;
		this.hipotenusa=hipotenusa;
	}

	double getCateto1() {
		return cateto1;
	}

	void setCateto1(double cateto1) {
		this.cateto1 = cateto1;
	}

	double getCateto2() {
		return cateto2;
	}

	void setCateto2(double cateto2) {
		this.cateto2 = cateto2;
	}

	double getHipotenusa() {
		return hipotenusa;
	}

	void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	
	
}

class Utilidades {
	
	String inviertePalabra(String s) {
		String reverso="";
		
		for (int i=;i--) {
			/*HUECO 3*/
		}
		return reverso;
	}
	
	
	boolean esEtiquetaHTML(String s) {
		Pattern pat = Pattern.compile("^<\\/?[A-Z]+>$");
		Matcher mat;
		
		mat = pat.matcher(s);
		return true;
	}
	
	double calcularHipotenusa(double cateto1, double cateto2) {
		return 
	}
	
}

class Examen2 {

	public static void main(String[] args) {
		String s="Hola";
		Utilidades u=new Utilidades();
		Triangulo t=new Triangulo();
		
		//Mostrar por pantalla la cadena s invertida usando la funcion inviertePalabra
		/*HUECO 6*/
		u.inviertePalabra(s);
		//Comprobar si <BODY> y </TABLE> son etiquetas de HTML
		
		if  (u.esEtiquetaHTML(s)==true) {
			System.out.println("Son etiquetas");
		} else {
			System.out.println("No son etiquetas");
		}
		
		//Comprobar si es mayor la hipotenusa de un triangulo de lados 6 y 8
		//o la de un triangulo de lados 3 y 4
		
		if((t.getHipotenusa()>t.getCateto1())&&(t.getHipotenusa()>t.getCateto2())) {
			System.out.println("La hipotenusa de un triangulo de lados 6 y 8 es /*HUECO 9*/");
		} else {
			System.out.println("La hipotenusa de un triangulo de lados 3 y 4 es mayor");
		}
		
		//Crear un nuevo triangulo t de lados 9 y 12 con su correspondiente hipotenusa
		/* HUECO 10*/
		
		
	}

}