
/*Monica Alcañiz Puig*/
package tema8ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class Persona {

	static void mostrarMenu() {
		System.out.println("Escoge una opcion");
		System.out.println("1. Mostrar todo el contenido de la tabla");
		System.out.println("2. Mostrar los nombres de las personas mayores de edad");
		System.out.println("3. Mostrar la edad de una persona con un id tecleado por el usuario");
		System.out.println("4. Insertar una nueva persona, pidiendole id, nombre y edad al usuario");
		System.out.println("5. Borrar la persona con un id tecleado por el usuario");
		System.out.println("6. Actualizar la edad de una persona con un id tecleado por el usuario");
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idUsuario, edadUsuario;
		String nombreUsuario;
		int opcion;

		String url = "jdbc:mysql://127.0.0.1:3307/prueba"; // Nombre de la base de datos
		String user = "alumno";
		String password = "alumno";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT*FROM persona");

			do {
				mostrarMenu();

				opcion = entrada.nextInt();

				switch (opcion) {
				case 1:

					while (rs.next()) {
						int idp = rs.getInt("id");
						String nomp = rs.getString("nombre");
						int edadp = rs.getInt("edad");
						System.out.println("ID: " + idp + " Nombre: " + nomp + " Edad: " + edadp);
					}
					
					break;
				case 2:
					PreparedStatement sel_pstmt = con.prepareStatement("SELECT * FROM persona WHERE edad>18");
					ResultSet rs_sel = sel_pstmt.executeQuery();
					while (rs_sel.next()) {

						String nomp = rs_sel.getString("nombre");
						System.out.println(" Nombre: " + nomp);
					}
					rs_sel.close();
					sel_pstmt.close();

					break;
				case 3:

					int idTecleado;
					System.out.println("Introduce un id");
					idTecleado = entrada.nextInt();

					PreparedStatement sel_pstmt2 = con.prepareStatement("SELECT * FROM persona WHERE id=?");
					sel_pstmt2.setInt(1, idTecleado);
					ResultSet rs_sel2 = sel_pstmt2.executeQuery();
					while (rs_sel2.next()) {

						String edadp = rs_sel2.getString("edad");
						System.out.println(" Edad: " + edadp);
					}
					rs_sel2.close();
					sel_pstmt2.close();

					break;
				case 4:
					try {

						System.out.println("Introduce un id");
						idUsuario = entrada.nextInt();

						System.out.println("Introduce la edad");
						edadUsuario = entrada.nextInt();

						System.out.println("Introduce el nombre");
						nombreUsuario = entrada.next();

						PreparedStatement ins_pstmt = con.prepareStatement("INSERT INTO persona  VALUES (?, ?, ?)");
						ins_pstmt.setInt(1, idUsuario);
						ins_pstmt.setString(2, nombreUsuario);
						ins_pstmt.setInt(3, edadUsuario);
						int rowsInserted = ins_pstmt.executeUpdate();
						ins_pstmt.close();
					} catch (SQLIntegrityConstraintViolationException error) {
						System.out.println("No pueden haber entradas duplicadas");
					}
					break;
				case 5:

					System.out.println("Introduce un id");
					idUsuario = entrada.nextInt();

					PreparedStatement dele_pstmt = con.prepareStatement("DELETE FROM persona WHERE id = ?");
					dele_pstmt.setInt(1, idUsuario);
					int rowsDeleted = dele_pstmt.executeUpdate();
					dele_pstmt.close();

					break;
				case 6:

					System.out.println("Introduce un id");
					idUsuario = entrada.nextInt();

					PreparedStatement upd_pstmt = con.prepareStatement("UPDATE persona SET edad = ? WHERE id = ?");
					upd_pstmt.setInt(1, 15);
					upd_pstmt.setInt(2, idUsuario);
					int rowsUpdated = upd_pstmt.executeUpdate();
					upd_pstmt.close();

					break;
				case 7:
					System.out.println("Salir");
					break;
				}
			} while (opcion != 7);

			rs.close();
			stmt.close();
			con.close();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
