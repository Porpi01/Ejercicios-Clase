package tema3ejercicio9GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class tema3ejercicio9GUI {

	private JFrame frmOperaciones;
	private JTextField textFieldNumero1;
	private JTextField textFieldNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tema3ejercicio9GUI window = new tema3ejercicio9GUI();
					window.frmOperaciones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tema3ejercicio9GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOperaciones = new JFrame();
		frmOperaciones.getContentPane().setBackground(Color.WHITE);
		frmOperaciones.setTitle("Operaciones");
		frmOperaciones.setBounds(100, 100, 834, 309);
		frmOperaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOperaciones.getContentPane().setLayout(null);

		JLabel labelResultado = new JLabel("Resultado");
		labelResultado.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.foreground"));
		labelResultado.setBounds(338, 232, 157, 15);
		frmOperaciones.getContentPane().add(labelResultado);

		JLabel lblComprobacionNumero1 = new JLabel("");
		lblComprobacionNumero1.addKeyListener(new KeyAdapter() {

		});
		lblComprobacionNumero1.setForeground(new Color(255, 0, 0));
		lblComprobacionNumero1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComprobacionNumero1.setBounds(602, 30, 188, 14);
		frmOperaciones.getContentPane().add(lblComprobacionNumero1);

		JLabel lblComprobacionNumero2 = new JLabel("");
		lblComprobacionNumero2.setForeground(Color.RED);
		lblComprobacionNumero2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComprobacionNumero2.setBounds(602, 86, 188, 14);
		frmOperaciones.getContentPane().add(lblComprobacionNumero2);

		textFieldNumero1 = new JTextField();
		textFieldNumero1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Pattern pat = Pattern.compile("^\\d{1,6}$");

				Matcher mat = pat.matcher(textFieldNumero1.getText());
				if (!mat.matches()) {
					lblComprobacionNumero1.setText("Error: número no válido");
				} else {
					lblComprobacionNumero1.setText("");
				}

			}

		});
		textFieldNumero1.setBounds(428, 27, 114, 19);

		frmOperaciones.getContentPane().add(textFieldNumero1);

		textFieldNumero1.setColumns(10);

		textFieldNumero2 = new JTextField();
		textFieldNumero2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Pattern pat = Pattern.compile("^\\d{1,6}$");
				Matcher mat = pat.matcher(textFieldNumero2.getText());
				if (!mat.matches()) {
					lblComprobacionNumero2.setText("Error: número no válido");
				} else {
					lblComprobacionNumero2.setText("");
				}
			}
		});

		textFieldNumero2.setBounds(428, 93, 114, 19);
		frmOperaciones.getContentPane().add(textFieldNumero2);
		textFieldNumero2.setColumns(10);

		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(243, 24, 70, 15);
		frmOperaciones.getContentPane().add(lblNumero1);

		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(243, 95, 70, 15);
		frmOperaciones.getContentPane().add(lblNumero2);

		JLabel lblSeleccionar = new JLabel("Seleccione operación");
		lblSeleccionar.setBounds(243, 166, 151, 15);
		frmOperaciones.getContentPane().add(lblSeleccionar);

		JComboBox comboBoxOperacion = new JComboBox();
		comboBoxOperacion.addMouseListener(new MouseAdapter() {

		});
		comboBoxOperacion.setBounds(428, 157, 114, 24);
		frmOperaciones.getContentPane().add(comboBoxOperacion);

		comboBoxOperacion.addItem("sumar");
		comboBoxOperacion.addItem("restar");
		comboBoxOperacion.addItem("dividir");
		comboBoxOperacion.addItem("resto");
		comboBoxOperacion.addItem("multiplicación");

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada, numeroEntrada2, numeroSalida;
				double numero, numero2, suma, resta, dividir, resto, multiplicacion;;
				int operacion;

				operacion = comboBoxOperacion.getSelectedIndex();
				switch (operacion) {
				case 0:

					numeroEntrada = textFieldNumero1.getText();
					numeroEntrada2 = textFieldNumero2.getText();
					numero = Double.parseDouble(numeroEntrada);
					numero2 = Double.parseDouble(numeroEntrada2);
					suma = numero + numero2;
					numeroSalida = String.valueOf(suma);
					labelResultado.setText(numeroSalida);
					break;
				case 1:

					numeroEntrada = textFieldNumero1.getText();
					numeroEntrada2 = textFieldNumero2.getText();
					numero = Double.parseDouble(numeroEntrada);
					numero2 = Double.parseDouble(numeroEntrada2);
					resta = numero - numero2;
					numeroSalida = String.valueOf(resta);
					labelResultado.setText(numeroSalida);
					break;
				case 2:
					numeroEntrada = textFieldNumero1.getText();
					numeroEntrada2 = textFieldNumero2.getText();
					numero = Double.parseDouble(numeroEntrada);
					numero2 = Double.parseDouble(numeroEntrada2);
					dividir = numero / numero2;
					numeroSalida = String.valueOf(dividir);
					labelResultado.setText(numeroSalida);
					break;
				case 3:
					numeroEntrada = textFieldNumero1.getText();
					numeroEntrada2 = textFieldNumero2.getText();
					numero = Double.parseDouble(numeroEntrada);
					numero2 = Double.parseDouble(numeroEntrada2);
					resto = numero % numero2;
					numeroSalida = String.valueOf(resto);
					labelResultado.setText(numeroSalida);
					break;

				case 4:
					numeroEntrada = textFieldNumero1.getText();
					numeroEntrada2 = textFieldNumero2.getText();
					numero = Double.parseDouble(numeroEntrada);
					numero2 = Double.parseDouble(numeroEntrada2);
					multiplicacion = numero * numero2;
					numeroSalida = String.valueOf(multiplicacion);
					labelResultado.setText(numeroSalida);
					break;

				}
			}
		});
		btnCalcular.setBounds(326, 195, 117, 25);
		frmOperaciones.getContentPane().add(btnCalcular);

		String sumar = comboBoxOperacion.getSelectedItem().toString();

	}
}
