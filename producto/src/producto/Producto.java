package producto;

class Producto {
	float precio; // Atributo precio

	float calcular_precio_descontado(float precio_inic, float porcentaje_descuento) {
		/*
		 * Este método se usa para, a partir del precio inicial del producto y su
		 * porcentaje de descuento, obtener el precio ya descontado
		 */
		

		float descuento, precio_final;
		descuento = precio_inic * porcentaje_descuento / 100;
		precio_final = precio_inic - descuento;
		return precio_final;
	}

	public static void main(String args[]) {

		Producto pr;
		float rebajado;
		pr = new Producto();
		pr.precio = 5; //estado del objeto
		System.out.println(pr.precio);
		rebajado = pr.calcular_precio_descontado(5, 10);
		System.out.println(rebajado); //resultado de ejecutar un método
	}
}