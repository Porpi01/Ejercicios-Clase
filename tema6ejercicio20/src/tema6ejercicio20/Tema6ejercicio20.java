package tema6ejercicio20;

//Mónica Alcañiz Puig
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * Clase Tema6 ejercicio20 para crear una colección de países y habitantes
 * 
 * @author Mónica Alcañiz Puig
 * @version 16 de febrero de 2023
 *
 */

public class Tema6ejercicio20 {

	/**
	 * Método mostrarMenu de tipo static void
	 * 
	 * @return no devuelve nada ya que es void
	 */

	static void mostrarMenu() {

		System.out.println("Seleccione una opción: ");
		System.out.println("1. Añadir un nuevo país con sus habitantes");
		System.out.println("2. Borrar país");
		System.out.println("3. Mostrar número de habitantes");
		System.out.println("4. Listar nombres de paises");
		System.out.println("5. Mostrar país con sus habitantes");
		System.out.println("6. Eliminar todo");
		System.out.println("7. Buscar el país con más habitantes");
		System.out.println("8. Guardar datos en fichero");
		System.out.println("9. Cargar todos los datos desde un fichero");
		System.out.println("10.Salir");
	}

	public static void main(String[] args) {

		HashMap<String, Integer> mapaPaises = new HashMap<>();
		Scanner entrada = new Scanner(System.in);
		int opcion;
		int habitantes;
		String nombrePais;

		do {
			mostrarMenu();
			opcion = entrada.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("Introduce el nombre del pais ");
				nombrePais = entrada.next();
				System.out.println("Introduce número de habitantes");
				habitantes = entrada.nextInt();

				mapaPaises.put(nombrePais, habitantes);

				System.out
						.println("El nombre del país es " + nombrePais + " y el número de habitantes es " + habitantes);

				break;

			case 2:

				System.out.println("Introduce el nombre del país ");
				nombrePais = entrada.next();

				if (mapaPaises.containsKey(nombrePais)) {
					mapaPaises.remove(nombrePais);
				} else {
					System.out.println("El país no existe");
				}

				break;

			case 3:

				System.out.println("¿De cuál país quieres saber los habitantes?");
				nombrePais = entrada.next();

				if (mapaPaises.containsKey(nombrePais)) {

					System.out
							.println("El número de habitantes de " + nombrePais + " es  " + mapaPaises.get(nombrePais));
				} else {
					System.out.println("El país no existe");
				}

				break;

			case 4:
				
                 if(mapaPaises == null) {
                	System.out.println("La lista está vacía"); 
                 }else {
                	 System.out.println(mapaPaises.keySet());
                 }

				

				break;

			case 5:
				
				System.out.println(mapaPaises);
				break;

			case 6:
				mapaPaises.clear();
				break;

			case 7:
				int maximo = 0;
				String paisMaximo = "";
				for (String nombre : mapaPaises.keySet()) {
					int valor = mapaPaises.get(nombre);
					if (valor > maximo) {
						maximo = valor;
						paisMaximo = nombre;

					}

				}
				System.out.println("El país con más habitantes es " + paisMaximo);

				break;

			case 8:
				FileWriter fw;
				try {
					fw = new FileWriter("Países");
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					pw.println(mapaPaises);
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			case 9:
				String linea;
				FileReader lectura;
				try {
					lectura = new FileReader("Países");
					BufferedReader br = new BufferedReader(lectura);
					Scanner s = new Scanner(br);
					linea = br.readLine();
					while (linea != null) {
						System.out.println(linea);
						linea = br.readLine();
					}

					br.close();

				} catch (IOException e) {

					e.printStackTrace();
				}

				break;

			case 10:
				break;

			default:
				System.out.println("Error");
				break;

			}

		} while (opcion != 10);

	}

}
