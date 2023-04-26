package com.hibernate;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hibernate.dao.CiudadDAO;
import com.hibernate.model.Ciudad;

public class Menu {

	static void mostrarMenu() {

		System.out.println(" 1.Insertar nueva ciudad");
		System.out.println(" 2.Borrar ciudad");
		System.out.println(" 3.Actualizar nombre");
		System.out.println(" 4.Actualizar habitantes");
		System.out.println(" 5.Ver todas las ciudades");
		System.out.println(" 6.Ver datos de una ciudad");
		System.out.println(" 7.Seleccionar ciudades con más de 1 millón de habitantes");
		System.out.println(" 8.Seleccionar ciudades con menos habitantes que una cantidad introducida por el usuario.");
		System.out.println(
				" 9.Mostrar los habitantes de la ciudad que coincida con el nombre introducido por el usuario.");
		System.out.println(" 10.Salir");
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		CiudadDAO ciudadDAO = new CiudadDAO();

		int opcion, habitantes;
		String nombre;

		do {

			mostrarMenu();

			System.out.println("Escoge una opción:");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				try {
					System.out.println("Introduce el nombre de la ciudad");
					nombre = entrada.next();

					System.out.println("Introduce el número de habitantes");
					habitantes = entrada.nextInt();

					Ciudad ciudadNueva = new Ciudad(nombre, habitantes);
					ciudadDAO.insertCiudad(ciudadNueva);

					System.out.println("Ciudad introducida correctamente");

				} catch (InputMismatchException e) {
					System.out.println("Datos mal introducidos");
					entrada.next();
				}

				break;

			case 2:
				try {
					int codigoBorrar;

					System.out.println("Introduce el código de la ciudad que deseas borrar");
					codigoBorrar = entrada.nextInt();

					ciudadDAO.deleteCiudad(codigoBorrar);

					System.out.println("Ciudad borrada correctamente");

				} catch (InputMismatchException e) {
					System.out.println("Datos mal introducidos");
					entrada.next();
				} catch (IllegalStateException e2) {
					System.out.println("No existe esa ciudad");
					entrada.next();
				}
				break;

			case 3:

				try {
					int codigoActualizarNombre;
					String nombreActu;

					System.out.println("Introduce el código");
					codigoActualizarNombre = entrada.nextInt();

					System.out.println("Introduce el nuevo nombre");
					nombreActu = entrada.next();

					Ciudad ciudadActualizada = ciudadDAO.selectCiudadById(codigoActualizarNombre);
					ciudadActualizada.setNombre(nombreActu);

					ciudadActualizada.setNombre(nombreActu);

					ciudadDAO.updateCiudad(ciudadActualizada);

					System.out.println("Nombre actualizado correctamente");

				} catch (InputMismatchException e) {
					System.out.println("Datos mal introducidos");
					entrada.next();
				} catch (IllegalStateException e2) {
					System.out.println("No existe esa ciudad");
					entrada.next();
				} catch (NullPointerException e3) {
					System.out.println("No hay ninguna ciudad");
					entrada.next();
					
				}
				break;

			case 4:

				try {
					int codigoActualizarHabitantes;
					int habitantesActu;

					System.out.println("Introduce el código");
					codigoActualizarHabitantes = entrada.nextInt();

					System.out.println("Introduce los habitantes");
					habitantesActu = entrada.nextInt();

					Ciudad ciudadActualizada2 = ciudadDAO.selectCiudadById(codigoActualizarHabitantes);

					ciudadActualizada2.setHabitnate(habitantesActu);

					ciudadDAO.updateCiudad(ciudadActualizada2);

					System.out.println("Habitantes actualizados correctamente");
				} catch (InputMismatchException e) {
					System.out.println("Datos mal introducidos");
					entrada.next();
				} catch (IllegalStateException e2) {
					System.out.println("No existe esa ciudad");
					entrada.next();
				} catch (NullPointerException e3) {
					System.out.println("No hay ninguna ciudad");
					entrada.next();
				}

				break;

			case 5:

				List<Ciudad> ciudades = ciudadDAO.selectAllCiudad();

				for (Ciudad c : ciudades) {
					System.out.println("Nombre ciudad" + " " + c.getNombre());
				}

				break;

			case 6:
				int codigoVerCiudad;

				System.out.println("Introduce el código");
				codigoVerCiudad = entrada.nextInt();

				Ciudad ciudadVerCiudad = ciudadDAO.selectCiudadById(codigoVerCiudad);
				System.out.println("Id" + " " + ciudadVerCiudad.getId() + " " + "Nombre" + " "
						+ ciudadVerCiudad.getNombre() + " " + "Habitantes" + " " + ciudadVerCiudad.getHabitante());

				break;

			case 7:
				List<Ciudad> ciudadesMillon = ciudadDAO.selectAllCiudadMillon();
				for (Ciudad c : ciudadesMillon) {
					System.out.println("Nombre: " + c.getNombre() + " Habitantes: " + c.getHabitante());
				}

				break;

			case 8:
				int habitantesUsuario;

				System.out.println("Introduce cantidad de habitantes");
				habitantesUsuario = entrada.nextInt();

				List<Ciudad> ciudadesHabitantes = ciudadDAO.selectAllCiudadHabitantes(habitantesUsuario);
				for (Ciudad c : ciudadesHabitantes) {
					System.out.println("Nombre: " + c.getNombre());
				}

				break;

			case 9:

				String nombreUsuario;

				System.out.println("Introduce nombre ciudad");
				nombreUsuario = entrada.next();

				List<Ciudad> ciudadesNombre = ciudadDAO.selectAllCiudadNombre(nombreUsuario);
				for (Ciudad c : ciudadesNombre) {
					System.out.println("Habitantes: " + c.getHabitante());
				}

				break;

			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 10);

	}
}
