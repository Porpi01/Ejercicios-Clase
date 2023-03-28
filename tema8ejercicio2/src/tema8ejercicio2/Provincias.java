package tema8ejercicio2;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Provincias {

	private JFrame frmTemaEjercicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Provincias window = new Provincias();
					window.frmTemaEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Provincias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		frmTemaEjercicio = new JFrame();
		frmTemaEjercicio.setTitle("Tema 8 Ejercicio 2");
		frmTemaEjercicio.setBounds(100, 100, 683, 457);
		frmTemaEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTemaEjercicio.getContentPane().setLayout(null);

		JLabel lblCAutonoma = new JLabel("Comunidad Autónoma");
		lblCAutonoma.setBounds(89, 90, 207, 15);
		frmTemaEjercicio.getContentPane().add(lblCAutonoma);

		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(430, 90, 70, 15);
		frmTemaEjercicio.getContentPane().add(lblProvincia);

		JComboBox comboBoxProvincia = new JComboBox();
		
		comboBoxProvincia.setBounds(430, 117, 174, 24);
		frmTemaEjercicio.getContentPane().add(comboBoxProvincia);

		JComboBox comboBoxComunidades = new JComboBox();
		comboBoxComunidades.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

				try {
					Connection con=ConnectionSingleton.getConnection();
					PreparedStatement stmt = con
							.prepareStatement("SELECT * FROM provincia WHERE comunidad_idcomunidad=?");
					stmt.setInt(1, comboBoxComunidades.getSelectedIndex() + 1); /*Se suma 1  pq el indice del JComboBox 
					empieza en 0 y el id empieza en 1*/
					
					ResultSet rs = stmt.executeQuery();
					comboBoxProvincia.removeAllItems();

					while (rs.next()) {

						String nomp = rs.getString("nomp");
						comboBoxProvincia.addItem(nomp);

					}

					rs.close();
					stmt.close();
					

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});
		comboBoxComunidades.setBounds(89, 117, 174, 24);
		frmTemaEjercicio.getContentPane().add(comboBoxComunidades);

		try {
			Connection con=ConnectionSingleton.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM comunidad");

			comboBoxComunidades.removeAllItems();

			while (rs.next()) {

				String nomp = rs.getString("nomc");
				comboBoxComunidades.addItem(nomp);

			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
