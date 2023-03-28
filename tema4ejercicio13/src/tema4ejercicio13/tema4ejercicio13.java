package tema4ejercicio13;

import java.util.Scanner;

public class tema4ejercicio13 {
	static int codCliente = 1001;
	static int codBici = 1;

	static void alquilarBici(Bici b, Cliente u) {
		b.setLibre(false);
		b.setCodUsuario(u.getCodCliente());
		u.setCodBici(b.getCodBici());
	}

	static void devolverBici(Bici b, Cliente u) {
		b.setLibre(true);
		b.setCodUsuario(0);
		u.setCodBici(0);
	}

	static void imprimir_menu() {
		System.out.println("----------");
		System.out.println("1. Crear usuario");
		System.out.println("2. Mostrar datos usuario");
		System.out.println("3. Crear bici");
		System.out.println("4. Mostrar datos bici");
		System.out.println("5. Alquilar bici");
		System.out.println("6. Devolver bici");
		System.out.println("0. Salir");
		System.out.print("Selecciona opción: ");
	}

	static void mostrarCliente(Cliente u) {
		System.out.println("Código: " + u.getCodCliente() + " Nombre: " + u.getNombre() + " Bici: " + u.getCodBici());
	}

	static void mostrarBicicleta(Bici b) {
		if (b.isLibre()) {
			System.out.println("Bici " + b.getCodBici() + " Libre");
		} else {
			System.out.println("Bici " + b.getCodBici() + " ocupada por el usuario " + b.getCodUsuario());
		}
	}

	public static void main(String[] args) {
		Cliente u = null;
		Bici b = null;
		String nomUsuario;

		int opcion;
		Scanner s = new Scanner(System.in);
		do {
			tema4ejercicio13.imprimir_menu();
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Introduzca nombre usuario:");
				nomUsuario = s.next();
				u = new Cliente(codCliente, nomUsuario, codBici);
				
				break;
			case 2:
				try {
					tema4ejercicio13.mostrarCliente(u);
				
				}catch(NullPointerException e){
			
				System.out.println("Usuario no creado");
					
					
				}
				break;
			case 3:

				b = new Bici(codBici, true, 0);
				System.out.println("Bici creada");
				
				break;
			case 4:
				try {
					tema4ejercicio13.mostrarBicicleta(b);
				}catch(NullPointerException e2) {
					
						System.out.println("Bici no creada");
					
				
					
				}
				break;
			case 5:
				if (b == null) {
					System.out.println("Bici no creada");
				} else if (u == null) {
					System.out.println("Usuario no creado");
				} else {
					System.out.print("Código bici? ");
					codBici = s.nextInt();
					if (b.getCodBici() != codBici) {
						System.out.println("Bici no válida");
					} else {
						System.out.print("Código usuario? ");
						codCliente = s.nextInt();
						if (u.getCodCliente() != codCliente) {
							System.out.println("Usuario no válido");
						} else {
							tema4ejercicio13.alquilarBici(b, u);
						}
					}
				}
				break;
			case 6:
				if (b == null) {
					System.out.println("Bici no creada");
				} else if (u == null) {
					System.out.println("Usuario no creado");
				} else {
					System.out.print("Código bici? ");
					codBici = s.nextInt();
					if (b.getCodBici() != codBici) {
						System.out.println("Bici no válida");
					} else {
						System.out.print("Código usuario? ");
						codCliente = s.nextInt();
						if (u.getCodCliente() != codCliente) {
							System.out.println("Usuario no válido");
						} else {
							tema4ejercicio13.devolverBici(b, u);
						}
					}
				}
				break;
			case 0:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opcion != 0);
	}
}
