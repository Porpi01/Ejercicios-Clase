package tema6ejercicio21;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import tienda.Producto;

public class Tema6ejercicio21 {
	/**
	 * Método mostrarMenu de tipo static void
	 * 
	 * @return no devuelve nada ya que es void
	 */

	static void mostrarMenu() {

		System.out.println("Seleccione una opción: ");
		System.out.println("1. Añadir nuevo producto");
		System.out.println("2. Borrar producto");
		System.out.println("3. Mostrar datos del producto");
		System.out.println("4. Mostrar todos los productos");
		System.out.println("5. Averiguar si quedan unidades");
		System.out.println("6. Salir");
	}

	public static void main(String[] args) {

		HashMap<Integer, Producto> mapaProductos = new HashMap<>();
		Scanner entrada = new Scanner(System.in);
		int opcion;
		int codigo;
		String nombreProducto;
		double precioProducto;
		int udsProducto;

		do {
			mostrarMenu();
			opcion = entrada.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("Introduce el código del producto");
				codigo = entrada.nextInt();
				System.out.print("Introduce nombre del producto: ");
				nombreProducto = entrada.next();
				System.out.print("Introduce precio del producto: ");
				precioProducto = entrada.nextDouble();
				System.out.print("Introduce unidades del producto: ");
				udsProducto = entrada.nextInt();

				mapaProductos.put(codigo, new Producto(nombreProducto, precioProducto, udsProducto));

				System.out.println("Producto creado");
				break;

			case 2:

				System.out.println("¿Cuál producto quieres borrar? ");
				codigo = entrada.nextInt();
				if (mapaProductos.containsKey(codigo)) {
					mapaProductos.remove(codigo);
				} else {
					System.out.println("No existe producto con ese código");
				}
				break;

			case 3:

				System.out.println("¿De cuál producto quieres saber los datos? ");
				codigo = entrada.nextInt();
				if (mapaProductos.containsKey(codigo)) {
					Producto producto = mapaProductos.get(codigo);
					System.out.println("Los datos del producto son: " + "Código " + codigo + " Nombre producto:  "
							+ producto.getNombre() + " Precio producto:  " + producto.getPrecio()
							+ " Unidades producto: " + producto.getUnidades());
				} else {
					System.out.println("No existe producto con ese código");
				}

				break;

			case 4:
				for (Entry<Integer, Producto> entry : mapaProductos.entrySet()) {
					codigo = entry.getKey();
					Producto producto = entry.getValue();
					System.out.println(
							"Código: " + codigo + " Nombre producto:  " + producto.getNombre() + " Precio producto:  "
									+ producto.getPrecio() + " Unidades producto: " + producto.getUnidades());
				}

				break;

			case 5:
				System.out.println("¿De cuál producto quieres saber si quedan unidades? ");
				codigo = entrada.nextInt();

				if (mapaProductos.containsKey(codigo)) {
					if (mapaProductos.get(codigo).getUnidades() > 0) {
						System.out.println("Quedan unidades");
					} else {
						System.out.println("No quedan unidades");
					}
				} else {
					System.out.println("No existe ningún producto con ese código.");
				}

				break;

			case 6:
				break;

			}

		} while (opcion != 6);
	}
}
