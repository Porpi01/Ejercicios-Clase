package tema6ejercicio8;

import java.util.Scanner;

public class Tema6ejercicio8 {

	void imprimir_menu() {
		System.out.println("Seleccione opción:");
		System.out.println("1. Crear nuevo producto");
		System.out.println("2. Cambiar nombre del producto");
		System.out.println("3. Cambiar precio del producto");
		System.out.println("4. Aumentar stock del producto");
		System.out.println("5. Mostrar datos de producto");
		System.out.println("6. Crear nuevo cliente");
		System.out.println("7. Cambiar nombre del cliente");
		System.out.println("8. Cambiar dinero del cliente");
		System.out.println("9. Mostrar datos del cliente");
		System.out.println("10. Venta del producto al cliente");
		System.out.println("0. Salir");
	}

	void mostrarProducto(Producto pr) {
		System.out
				.println("Nombre: " + pr.getNombre() + " Precio: " + pr.getPrecio() + " Unidades: " + pr.getUnidades());
	}

	void mostrarCliente(Cliente c) {
		System.out.println("Nombre: " + c.getNombre() + " Dinero: " + c.getDinero());
	}

	public static void main(String[] args) {

		Tema6ejercicio8 t = new Tema6ejercicio8();
		Producto p = new Producto();
		Cliente c = new Cliente();
		Scanner s = new Scanner(System.in);
		int opcion;
		String nombreProducto;
		double precioProducto;
		int udsProducto;
		String nombreCliente;
		double dineroCliente;
		int udsCompra;
		double pago;
		int indicePersona, indiceProducto;

		Cliente[] clientes = new Cliente[2];
		Producto[] productos = new Producto[3];

		do {
			System.out.println("----------");
			t.imprimir_menu();
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				for (int i = 0; i < productos.length; i++) {
					System.out.print("Introduce nombre del producto: ");
					nombreProducto = s.next();
					System.out.print("Introduce precio del producto: ");
					precioProducto = s.nextDouble();
					System.out.print("Introduce unidades del producto: ");
					udsProducto = s.nextInt();
					productos[i] = new Producto(nombreProducto, precioProducto, udsProducto);
				}
				break;
			case 2:
				System.out.println("¿De cuál producto quieres cambiar el nombre? ");
				indiceProducto = s.nextInt();
				System.out.print("Introduce nombre del producto: ");
				nombreProducto = s.next();
				productos[indiceProducto].setNombre(nombreProducto);
				break;
			case 3:
				System.out.println("¿De cuál producto quieres cambiar el precio? ");
				indiceProducto = s.nextInt();
				System.out.print("Introduce precio del producto: ");
				precioProducto = s.nextDouble();
				productos[indiceProducto].setPrecio(precioProducto);
				break;
			case 4:
				System.out.println("¿De cuál producto quieres cambiar las unidades? ");
				indiceProducto = s.nextInt();
				System.out.print("Introduce unidades del producto: ");
				udsProducto = s.nextInt();
				productos[indiceProducto].setUnidades(udsProducto + p.getUnidades());
				break;
			case 5:
				for (int i = 0; i < productos.length; i++) {
					System.out.println("El nombre del producto es " + productos[i].getNombre());
					System.out.println("El precio del producto es " + productos[i].getPrecio());
					System.out.println("Las unidades del producto es " + productos[i].getUnidades());
				}
				break;
			case 6:
				for (int i = 0; i < clientes.length; i++) {
					System.out.print("Introduce nombre del cliente: ");
					nombreCliente = s.next();
					System.out.print("Introduce dinero del cliente: ");
					dineroCliente = s.nextDouble();
					clientes[i] = new Cliente(nombreCliente, dineroCliente);
				}
				break;
			case 7:
				System.out.println("¿De cuál cliente quieres cambiar el nombre?");
				indicePersona = s.nextInt();
				System.out.print("Introduce nombre del cliente: ");
				nombreCliente = s.next();
				clientes[indicePersona].setNombre(nombreCliente);
				break;
			case 8:
				System.out.println("¿De cuál cliente quieres cambiar el dinero?");
				indicePersona = s.nextInt();
				System.out.print("Introduce dinero del cliente: ");
				dineroCliente = s.nextDouble();
				clientes[indicePersona].setDinero(dineroCliente);
				break;
			case 9:
				for (int i = 0; i < clientes.length; i++) {
					System.out.println("El nombre del producto es " + clientes[i].getNombre());
					System.out.println("El precio del producto es " + clientes[i].getDinero());

				}
				break;
			case 10:
				System.out.println("Introduzca el producto que quiere");
				indiceProducto = s.nextInt();
				System.out.println("¿Quién eres?");
				indicePersona = s.nextInt();
				if (!productos[indiceProducto].quedan_unidades()) {
					System.out.println("No quedan unidades del producto");
				} else if (!clientes[indicePersona].quedaDinero()) {
					System.out.println("Al cliente no le queda dinero");
				} else {
					System.out.println("Introduzca nº de unidades a comprar: ");
					udsCompra = s.nextInt();
					if (udsCompra > productos[indiceProducto].getUnidades()) {
						System.out.println("No quedan suficientes unidades");
						System.out.println("Comprará " + p.getUnidades() + " uds");
						udsCompra = productos[indiceProducto].getUnidades();
					}
					if (udsCompra * productos[indiceProducto].getPrecio() > clientes[indicePersona].getDinero()) {
						System.out.println("Compra no realizada. No tiene dinero suficiente");
					} else {
						// Se calcula el coste
						pago = productos[indiceProducto].getPrecio() * udsCompra;
						// Se descuenta dinero al cliente
						clientes[indicePersona].setDinero(clientes[indicePersona].getDinero() - pago);
						System.out.println("Coste de la compra: " + pago);
						// Se descuentan las unidades compradas del almacén
						productos[indiceProducto].setUnidades(productos[indiceProducto].getUnidades() - udsCompra);
					}
				}
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 0);
	}

}
