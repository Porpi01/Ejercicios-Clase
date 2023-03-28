package tema4ejercicio19;

public class Triangulo {
	double lado1, lado2, lado3;

	Triangulo(double l1) {// Equilatero
		lado1 = l1;
		lado2 = l1;
		lado3 = l1;
	}

	Triangulo(double l1, double l2) {// Isosceles
		lado1 = l1;
		lado2 = l2;
		lado3 = l2;

	}

	Triangulo(double l1, double l2, double l3) {// Escaleno
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;

	}

	public static void main(String[] args) {

		Triangulo t = new Triangulo(5); // Triángulo Equilatero
		Triangulo m = new Triangulo(5, 10); // Triángulo Isosceles
		Triangulo tr = new Triangulo(5, 10, 4); // Triangulo Escaleno

	}

}
