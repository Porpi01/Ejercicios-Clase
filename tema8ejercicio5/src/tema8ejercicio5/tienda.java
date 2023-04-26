package tema8ejercicio5;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tienda {

	private JFrame Tienda;
	private JTable tableProducto;
	private JTextField txtCodigo;
	private JTextField txtPrecio;
	private JTextField txtNombre;
	private JTextField txtUnidad;
	private JTextField textFieldnuevoPrecio;
	private JTextField txtUnidadadquirida;
	private JTextField txtUnidadesventa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tienda window = new tienda();
					window.Tienda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tienda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Tienda = new JFrame();
		Tienda.setBackground(new Color(250, 235, 215));
		Tienda.getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		Tienda.setTitle("Tienda");
		Tienda.setBounds(100, 100, 886, 575);
		Tienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tienda.getContentPane().setLayout(null);

		tableProducto = new JTable();
		tableProducto.setBounds(57, 147, 282, -97);
		Tienda.getContentPane().add(tableProducto);

		JLabel lblnuevoProducto = new JLabel("Nuevo producto");
		lblnuevoProducto.setBounds(44, 195, 154, 15);
		Tienda.getContentPane().add(lblnuevoProducto);

		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(68, 229, 70, 15);
		Tienda.getContentPane().add(lblCodigo);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(68, 265, 70, 15);
		Tienda.getContentPane().add(lblPrecio);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(143, 225, 70, 19);
		Tienda.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);

		txtPrecio = new JTextField();
		txtPrecio.setText("");
		txtPrecio.setBounds(143, 261, 70, 19);
		Tienda.getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(268, 229, 70, 15);
		Tienda.getContentPane().add(lblNombre);

		JLabel lblUnidades = new JLabel("Unidades:");
		lblUnidades.setBounds(268, 265, 91, 15);
		Tienda.getContentPane().add(lblUnidades);

		txtNombre = new JTextField();
		txtNombre.setBounds(349, 225, 95, 19);
		Tienda.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		txtUnidad = new JTextField();
		txtUnidad.setText("");
		txtUnidad.setBounds(349, 261, 70, 19);
		Tienda.getContentPane().add(txtUnidad);
		txtUnidad.setColumns(10);

		JLabel lblBorrarProducto = new JLabel("Borrar producto:");
		lblBorrarProducto.setBounds(44, 353, 154, 15);
		Tienda.getContentPane().add(lblBorrarProducto);

		JLabel lblproductoBorrar = new JLabel("Elegir producto:");
		lblproductoBorrar.setBounds(44, 387, 154, 15);
		Tienda.getContentPane().add(lblproductoBorrar);

		JComboBox comboBoxproductoborrar = new JComboBox();

		try {
			Connection con = ConnectionSingleton.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

			comboBoxproductoborrar.removeAllItems();

			while (rs.next()) {

				int idp = rs.getInt("idproducto");
				comboBoxproductoborrar.addItem(idp);

			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		comboBoxproductoborrar.setBounds(201, 378, 76, 24);
		Tienda.getContentPane().add(comboBoxproductoborrar);

		JLabel lblActualizarPrecio = new JLabel("Actualizar precio");
		lblActualizarPrecio.setBounds(511, 17, 154, 15);
		Tienda.getContentPane().add(lblActualizarPrecio);

		JLabel lblproductoActualizar = new JLabel("Elige producto");
		lblproductoActualizar.setBounds(557, 54, 131, 15);
		Tienda.getContentPane().add(lblproductoActualizar);

		JComboBox comboBoxprecioActualizar = new JComboBox();

		try {
			Connection con = ConnectionSingleton.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

			comboBoxprecioActualizar.removeAllItems();

			while (rs.next()) {

				int idp = rs.getInt("idproducto");
				comboBoxprecioActualizar.addItem(idp);

			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		comboBoxprecioActualizar.setBounds(699, 43, 76, 24);
		Tienda.getContentPane().add(comboBoxprecioActualizar);

		JLabel lblnuevoPrecio = new JLabel("Nuevo precio");
		lblnuevoPrecio.setBounds(557, 81, 131, 15);
		Tienda.getContentPane().add(lblnuevoPrecio);

		textFieldnuevoPrecio = new JTextField();
		textFieldnuevoPrecio.setText("");
		textFieldnuevoPrecio.setBounds(699, 75, 95, 19);
		Tienda.getContentPane().add(textFieldnuevoPrecio);
		textFieldnuevoPrecio.setColumns(10);

		JLabel lblIncrementarStock = new JLabel("Incrementar stock");
		lblIncrementarStock.setBounds(511, 195, 154, 15);
		Tienda.getContentPane().add(lblIncrementarStock);

		JLabel lblproductoStock = new JLabel("Elige producto:");
		lblproductoStock.setBounds(557, 231, 167, 15);
		Tienda.getContentPane().add(lblproductoStock);

		JLabel lblunidadesStock = new JLabel("Unidades adquiridas");
		lblunidadesStock.setBounds(557, 267, 167, 15);
		Tienda.getContentPane().add(lblunidadesStock);

		txtUnidadadquirida = new JTextField();
		txtUnidadadquirida.setText("");
		txtUnidadadquirida.setBounds(718, 261, 76, 19);
		Tienda.getContentPane().add(txtUnidadadquirida);
		txtUnidadadquirida.setColumns(10);

		JComboBox comboBoxStock = new JComboBox();
		comboBoxStock.setBounds(718, 220, 76, 24);
		Tienda.getContentPane().add(comboBoxStock);

		try {
			Connection con = ConnectionSingleton.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

			comboBoxStock.removeAllItems();

			while (rs.next()) {

				int idp = rs.getInt("idproducto");
				comboBoxStock.addItem(idp);

			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		JLabel lblVenta = new JLabel("Venta");
		lblVenta.setBounds(511, 353, 70, 15);
		Tienda.getContentPane().add(lblVenta);

		JLabel lblProductoAVender = new JLabel("Producto a vender:");
		lblProductoAVender.setBounds(557, 387, 154, 15);
		Tienda.getContentPane().add(lblProductoAVender);

		JLabel lblUnidadesAVender = new JLabel("Unidades a vender");
		lblUnidadesAVender.setBounds(557, 409, 154, 15);
		Tienda.getContentPane().add(lblUnidadesAVender);

		JComboBox comboBoxVenta = new JComboBox();
		comboBoxVenta.setBounds(718, 378, 76, 24);
		Tienda.getContentPane().add(comboBoxVenta);

		try {
			Connection con = ConnectionSingleton.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

			comboBoxVenta.removeAllItems();

			while (rs.next()) {

				int idp = rs.getInt("idproducto");
				comboBoxVenta.addItem(idp);

			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		txtUnidadesventa = new JTextField();
		txtUnidadesventa.setBounds(718, 405, 76, 19);
		Tienda.getContentPane().add(txtUnidadesventa);
		txtUnidadesventa.setColumns(10);

		JLabel lblNewLabel = new JLabel("Ganancias Totales");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setBounds(511, 499, 138, 15);
		Tienda.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane(tableProducto);
		scrollPane.setBounds(44, 61, 332, 117);
		Tienda.getContentPane().add(scrollPane);

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Código");
		model.addColumn("Nombre");
		model.addColumn("Precio");
		model.addColumn("Unidades");

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(163, 12, 95, 25);
		Tienda.getContentPane().add(btnMostrar);
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				model.setRowCount(0);
				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					while (rs.next()) {
						Object[] row = new Object[4];
						row[0] = rs.getInt("idproducto");
						row[1] = rs.getString("nombre");
						row[2] = rs.getDouble("precio");
						row[3] = rs.getInt("unidades");

						model.addRow(row);
					}

					tableProducto.setModel(model);
					tableProducto.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});

		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(201, 292, 95, 25);
		Tienda.getContentPane().add(btnAñadir);
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {

					Connection con = ConnectionSingleton.getConnection();
					PreparedStatement ins_pstmt = con.prepareStatement("INSERT INTO producto  VALUES (?, ?, ?, ?)");
					ins_pstmt.setString(1, txtCodigo.getText());
					ins_pstmt.setString(2, txtNombre.getText());
					ins_pstmt.setString(3, txtPrecio.getText());
					ins_pstmt.setString(4, txtUnidad.getText());
					int rowsInserted = ins_pstmt.executeUpdate();
					ins_pstmt.close();

					JOptionPane.showMessageDialog(null, "Producto añadido correctamente");

				} catch (SQLIntegrityConstraintViolationException error) {
					JOptionPane.showMessageDialog(null, "No pueden haber entradas duplicadas");
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Hay casillas vacias");
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxproductoborrar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxproductoborrar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxprecioActualizar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxprecioActualizar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxVenta.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxVenta.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxStock.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxStock.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(302, 377, 95, 25);
		Tienda.getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Connection con = ConnectionSingleton.getConnection();
					PreparedStatement dele_pstmt = con.prepareStatement("DELETE FROM producto WHERE idproducto = ? ");
					dele_pstmt.setInt(1, comboBoxproductoborrar.getSelectedIndex()
							+ 1); /*
									 * Se suma 1 pq el indice del JComboBox empieza en 0 y el id empieza en 1
									 */

					int rowsDeleted = dele_pstmt.executeUpdate();
					dele_pstmt.close();
					JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");

				} catch (SQLException e) {
					e.printStackTrace();
				}catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Hay casillas vacias");
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxproductoborrar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxproductoborrar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxprecioActualizar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxprecioActualizar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxVenta.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxVenta.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxStock.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxStock.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});

		JButton btnactualizarPrecio = new JButton("Actualizar precio");
		btnactualizarPrecio.setBounds(587, 106, 196, 25);
		Tienda.getContentPane().add(btnactualizarPrecio);
		btnactualizarPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Connection con = ConnectionSingleton.getConnection();
					PreparedStatement upd_pstmt = con
							.prepareStatement("UPDATE producto SET precio = ? WHERE idproducto = ?");

					String numeroEntrada = textFieldnuevoPrecio.getText();
					double nuevoPrecio = Double.parseDouble(numeroEntrada);
					upd_pstmt.setDouble(1, nuevoPrecio);

					upd_pstmt.setDouble(2, Double.parseDouble(comboBoxprecioActualizar.getSelectedItem().toString()));
					int rowsUpdated = upd_pstmt.executeUpdate();
					upd_pstmt.close();
					JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");

				} catch (SQLException e) {

					e.printStackTrace();
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Hay casillas vacias");
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxproductoborrar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxproductoborrar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxprecioActualizar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxprecioActualizar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxVenta.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxVenta.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxStock.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxStock.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});

		JButton btnActualizarStock = new JButton("Actualizar Stock");
		btnActualizarStock.setBounds(587, 292, 196, 25);
		Tienda.getContentPane().add(btnActualizarStock);
		btnActualizarStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Connection con = ConnectionSingleton.getConnection();
					PreparedStatement upd_pstmt = con
							.prepareStatement("UPDATE producto SET unidades = ? WHERE idproducto = ?");

					String numeroEntrada = txtUnidadadquirida.getText();
					double nuevoPrecio = Double.parseDouble(numeroEntrada);
					upd_pstmt.setDouble(1, nuevoPrecio);
					upd_pstmt.setDouble(2, Double.parseDouble(comboBoxStock.getSelectedItem().toString()));
					int rowsUpdated = upd_pstmt.executeUpdate();
					upd_pstmt.close();
					JOptionPane.showMessageDialog(null, "Stock actualizado correctamente");

				} catch (SQLException e) {

					e.printStackTrace();
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Hay casillas vacias");
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxproductoborrar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxproductoborrar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxprecioActualizar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxprecioActualizar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxVenta.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxVenta.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxStock.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxStock.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});

		JButton btnVender = new JButton("Vender");
		btnVender.setBounds(612, 449, 117, 25);
		Tienda.getContentPane().add(btnVender);

		JLabel lblganancias = new JLabel("");
		lblganancias.setBounds(699, 499, 48, 15);

		Tienda.getContentPane().add(lblganancias);

		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con = ConnectionSingleton.getConnection();
					PreparedStatement upd_pstmt = con
							.prepareStatement("UPDATE producto SET unidades = ? WHERE idproducto = ?");
					String numeroEntrada = txtUnidadadquirida.getText();
					int unidadesVenta = Integer.parseInt(numeroEntrada);
					int unidades = 0;
					unidades -= unidadesVenta;

					upd_pstmt.setInt(1, unidadesVenta);
					upd_pstmt.setDouble(2, Double.parseDouble(comboBoxVenta.getSelectedItem().toString()));
					int rowsUpdated = upd_pstmt.executeUpdate();
					upd_pstmt.close();
					JOptionPane.showMessageDialog(null, "Producto vendido correctamente");

				} catch (SQLException e) {

					e.printStackTrace();
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Hay casillas vacias");
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxproductoborrar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxproductoborrar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxprecioActualizar.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxprecioActualizar.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxVenta.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxVenta.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				try {
					Connection con = ConnectionSingleton.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM producto");

					comboBoxStock.removeAllItems();

					while (rs.next()) {

						int idp = rs.getInt("idproducto");
						comboBoxStock.addItem(idp);

					}

					rs.close();
					stmt.close();
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});

	}

}
