package tema4ejercicio12;

import java.util.Scanner;

public class Tema4ejercicio12 {

	void mostrarMenu() {
		System.out.println("Escoge una opcion: ");
		System.out.println("1. Crear nuevo producto: ");
		System.out.println("2. Modificar atributos: ");
		System.out.println("3. Mostrar datos producto: ");
		System.out.println("4. Creación nuevo cliente: ");
		System.out.println("5. Modificar atributos: ");
		System.out.println("6. Mostrar datos cliente: ");
		System.out.println("7. Escoge unidades a comprar: ");
		System.out.println("8. Proceso de compra: ");
		System.out.println("9. Salir");
	}

	void mostrarCliente(cliente c) {
		System.out.println(c.getDinero());
		System.out.println(c.getNombre());
	}

	void mostrarProducto(producto p) {
		System.out.println(p.getUnidadesventa());
		System.out.println(p.getNombre());
		System.out.println(p.getPrecio());

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int opcion, stock, unidad;
		double precio, dinero, pagar;
		String nombre;
		
	   
		Tema4ejercicio12 e = new Tema4ejercicio12();
		cliente c = new cliente();
		producto p = new producto();

		do {
			e.mostrarMenu();
			opcion = entrada.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("Introduce el nombre del producto:");
				nombre = entrada.next();

				System.out.println("Introduce el precio del producto:");
				precio = entrada.nextDouble();

				System.out.println("Introduce el número de unidades: ");
				stock = entrada.nextInt();

				p = new producto(nombre, precio, stock);
				break;

			case 2:
				System.out.println("Introduce el nuevo nombre del producto: ");
				nombre = entrada.next();
				p.setNombre(nombre);
				
				System.out.println("Introduce el nuevo precio del producto: ");
				precio = entrada.nextDouble();
				p.setPrecio(precio);
				
				System.out.println("Introduce unidades del producto: ");
				stock = entrada.nextInt();
				p.setUnidadesventa(stock);
                break;
			case 3:
                 e.mostrarProducto(p);break;
				
			case 4:
				System.out.println("Introduce el nombre del cliente:");
				nombre = entrada.next();

				System.out.println("Introduce cuanto dinero tiene:");
				dinero = entrada.nextInt();

				c = new cliente(nombre, dinero);
                break;

			case 5:
				System.out.println("Introduce el nuevo nombre del cliente: ");
				nombre = entrada.next();
				c.setNombre(nombre);
				
				System.out.println("Introduce cuanto dinero tienes: ");
				dinero = entrada.nextDouble();
				c.setDinero(dinero); break;
			
			case 6:
				e.mostrarCliente(c);
				break;
				
			case 7:
				System.out.println("Introduce cuantas unidades quieres: ");
				unidad = entrada.nextInt();break;
				
			case 8:
				if(p.getUnidadesventa()!=0) {
				} else if(c.getDinero()<=0) {
					
				}
					
				break;
			case 9:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Error");

			}

		} while (opcion != 9);
	}
}

