package tema4ejercicio18;

public class Tema4ejercicio18 {

	// Atributo para el precio base del producto
	double precioBase = 100;

	// Método para calcular el precio final del producto, sin impuestos
	double calcularPrecio() {
		return precioBase;
	}

	// Método para calcular el precio final del producto, con impuestos
	double calcularPrecio(double impuesto) {
		return precioBase + (precioBase * impuesto);
	}

	// Método para calcular el precio final del producto, con descuento
	double calcularPrecio(double descuento, boolean aplicarImpuesto) {
		double precioFinal = precioBase - (precioBase * descuento);
		if (aplicarImpuesto) {
			precioFinal += precioFinal * 0.16;
		}
		return precioFinal;
	}

	public static void main(String args[]) {
		Tema4ejercicio18 prod = new Tema4ejercicio18();
		// Introduce aquí el código
		
		
		System.out.println("El precio normal es "+ prod.calcularPrecio());
		
		System.out.println("El precio con un 4% de IVA es " + prod.calcularPrecio(0.04));
		
		System.out.println("El precio con un descuento del 8% es " +prod.calcularPrecio(0.08, false));
		
		System.out.println("El precio con un descuento del 10% y un 16% de IVA es " +prod.calcularPrecio(0.1, true));
	}
}
