package tema8ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class tienda {

	private JFrame Tienda;
	private JTable tableProducto;
	private JTextField txtCodigo;
	private JTextField txtPrecio;
	private JTextField txtNombre;
	private JTextField txtUnidad;
	private JTextField textFieldnuevoPrecio;
	private JTextField txtUnidadadquirida;

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
		Tienda.setBounds(100, 100, 886, 534);
		Tienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tienda.getContentPane().setLayout(null);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(140, 12, 95, 25);
		Tienda.getContentPane().add(btnMostrar);
		
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
		
		JButton btnAadir = new JButton("Añadir");
		btnAadir.setBounds(201, 292, 95, 25);
		Tienda.getContentPane().add(btnAadir);
		
		JLabel lblBorrarProducto = new JLabel("Borrar producto:");
		lblBorrarProducto.setBounds(44, 353, 154, 15);
		Tienda.getContentPane().add(lblBorrarProducto);
		
		JLabel lblproductoBorrar = new JLabel("Elegir producto:");
		lblproductoBorrar.setBounds(44, 387, 154, 15);
		Tienda.getContentPane().add(lblproductoBorrar);
		
		JComboBox comboBoxproductoborrar = new JComboBox();
		comboBoxproductoborrar.setBounds(201, 378, 76, 24);
		Tienda.getContentPane().add(comboBoxproductoborrar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(302, 377, 95, 25);
		Tienda.getContentPane().add(btnEliminar);
		
		JLabel lblActualizarPrecio = new JLabel("Actualizar precio");
		lblActualizarPrecio.setBounds(525, 17, 154, 15);
		Tienda.getContentPane().add(lblActualizarPrecio);
		
		JLabel lblproductoActualizar = new JLabel("Elige producto");
		lblproductoActualizar.setBounds(561, 52, 131, 15);
		Tienda.getContentPane().add(lblproductoActualizar);
		
		JComboBox comboBoxproductoActualizar = new JComboBox();
		comboBoxproductoActualizar.setBounds(699, 43, 76, 24);
		Tienda.getContentPane().add(comboBoxproductoActualizar);
		
		JLabel lblnuevoPrducto = new JLabel("Nuevo producto:");
		lblnuevoPrducto.setBounds(561, 79, 131, 15);
		Tienda.getContentPane().add(lblnuevoPrducto);
		
		textFieldnuevoPrecio = new JTextField();
		textFieldnuevoPrecio.setText("");
		textFieldnuevoPrecio.setBounds(699, 75, 95, 19);
		Tienda.getContentPane().add(textFieldnuevoPrecio);
		textFieldnuevoPrecio.setColumns(10);
		
		JButton btnactualizarPrecio = new JButton("Actualizar precio");
		btnactualizarPrecio.setBounds(587, 106, 196, 25);
		Tienda.getContentPane().add(btnactualizarPrecio);
		
		JLabel lblIncrementarStock = new JLabel("Incrementar stock");
		lblIncrementarStock.setBounds(537, 179, 70, 15);
		Tienda.getContentPane().add(lblIncrementarStock);
		
		JLabel lblproductoStock = new JLabel("Elige producto:");
		lblproductoStock.setBounds(525, 214, 70, 15);
		Tienda.getContentPane().add(lblproductoStock);
		
		JLabel lblunidadesStock = new JLabel("Unidades adquiridas");
		lblunidadesStock.setBounds(525, 241, 70, 15);
		Tienda.getContentPane().add(lblunidadesStock);
		
		txtUnidadadquirida = new JTextField();
		txtUnidadadquirida.setText("unidadAdquirida");
		txtUnidadadquirida.setBounds(642, 227, 114, 19);
		Tienda.getContentPane().add(txtUnidadadquirida);
		txtUnidadadquirida.setColumns(10);
		
		JComboBox comboBoxStock = new JComboBox();
		comboBoxStock.setBounds(642, 190, 32, 24);
		Tienda.getContentPane().add(comboBoxStock);
	}
}
