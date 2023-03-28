package persona;

public class Persona {
	int edad;// Atributo edad
	double altura;// Atributo altura (m)

	public static void main(String args[]) {

		Persona obj1;// Declarar persona
		obj1 = new Persona();
		obj1.edad = 30; // Valores
		obj1.altura = 1.75; // Valores
		Persona obj2;// Declarar persona
		obj2 = new Persona();
		obj2.edad = 20;// Valores
		obj2.altura = 1.8;// Valores
		System.out.println("La edad de la persona 1 es " + obj1.edad);// resultado de ejecutar un método
		System.out.println("La altura de la persona 1 es " + obj1.altura);// resultado de ejecutar un método
		System.out.println("La edad de la persona 2 es " + obj2.edad);//
		System.out.println("La altura de la persona 2 es " + obj2.altura);
	}

}
