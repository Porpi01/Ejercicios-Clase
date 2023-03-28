package tema4ejercicio33GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class tema4ejercicio33GUI {
	int suma =0;

	private JFrame facturaMaletas;
	private JTextField textFieldpesoReal;
	private JTextField textFieldpesoMaximo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tema4ejercicio33GUI window = new tema4ejercicio33GUI();
					window.facturaMaletas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tema4ejercicio33GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		facturaMaletas = new JFrame();
		facturaMaletas.setTitle("facturaMaletas");
		facturaMaletas.setBounds(100, 100, 594, 434);
		facturaMaletas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		facturaMaletas.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Maleta 1:");
		lblNewLabel.setBounds(44, 12, 96, 14);
		facturaMaletas.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Maleta 2:");
		lblNewLabel_1.setBounds(44, 83, 447, 14);
		facturaMaletas.getContentPane().add(lblNewLabel_1);
		
		textFieldpesoReal = new JTextField();
		textFieldpesoReal.setBounds(395, 40, 86, 20);
		facturaMaletas.getContentPane().add(textFieldpesoReal);
		textFieldpesoReal.setColumns(10);
		
		textFieldpesoMaximo = new JTextField();
		textFieldpesoMaximo.setBounds(395, 117, 89, 20);
		facturaMaletas.getContentPane().add(textFieldpesoMaximo);
		textFieldpesoMaximo.setColumns(10);
		
		JLabel lblDevolucion = new JLabel("Devolución:");
		lblDevolucion.setBounds(34, 347, 83, 14);
		facturaMaletas.getContentPane().add(lblDevolucion);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(163, 334, 328, 14);
		facturaMaletas.getContentPane().add(lblResultado);
		JComboBox comboBoxMaleta1 = new JComboBox();
		comboBoxMaleta1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int opcion, pesoMax;
				opcion = comboBoxMaleta1.getSelectedIndex();
				switch(opcion) {
				case 0: 
					pesoMax =10;
				break;
				case 1: 
					pesoMax = 20;
					break;
				case 2:
					pesoMax = 25;
					break;
					
				}
			}
		});
		comboBoxMaleta1.setModel(new DefaultComboBoxModel(new String[] {"10 kg", "20 kg", "25kg"}));
		comboBoxMaleta1.setBounds(143, 36, 86, 24);
		facturaMaletas.getContentPane().add(comboBoxMaleta1);
		
		
		
		
		JLabel lblPesomaxMaleta1 = new JLabel("PesoMax");
		lblPesomaxMaleta1.setBounds(44, 45, 86, 15);
		facturaMaletas.getContentPane().add(lblPesomaxMaleta1);
		
		JLabel lblPesorealMaleta1 = new JLabel("PesoReal");
		lblPesorealMaleta1.setBounds(267, 45, 86, 15);
		facturaMaletas.getContentPane().add(lblPesorealMaleta1);
		
		JLabel lblPesomaxMaleta2 = new JLabel("PesoMax");
		lblPesomaxMaleta2.setBounds(44, 122, 86, 15);
		facturaMaletas.getContentPane().add(lblPesomaxMaleta2);
		
		JComboBox comboBoxMaleta2 = new JComboBox();
		comboBoxMaleta2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int opcion, pesoMax;
				opcion = comboBoxMaleta2.getSelectedIndex();
				switch(opcion) {
				case 0: 
					pesoMax =10;
				break;
				case 1: 
					pesoMax = 20;
					break;
				case 2:
					pesoMax = 25;
					break;
					
				}
			}
		});
		comboBoxMaleta2.setModel(new DefaultComboBoxModel(new String[] {"10 kg", "20 kg", "25 kg"}));
		comboBoxMaleta2.setBounds(143, 113, 86, 24);
		facturaMaletas.getContentPane().add(comboBoxMaleta2);
		
		JLabel lblPesorealMaleta2 = new JLabel("PesoReal");
		lblPesorealMaleta2.setBounds(267, 117, 86, 20);
		facturaMaletas.getContentPane().add(lblPesorealMaleta2);
		
		JLabel lblMaleta3 = new JLabel("Maleta 3:");
		lblMaleta3.setBounds(44, 163, 447, 14);
		facturaMaletas.getContentPane().add(lblMaleta3);
		
		JLabel lblPesomaxMaleta3 = new JLabel("PesoMax");
		lblPesomaxMaleta3.setBounds(44, 200, 86, 15);
		facturaMaletas.getContentPane().add(lblPesomaxMaleta3);
		
		JComboBox comboBoxMaleta3 = new JComboBox();
		comboBoxMaleta3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int opcion, pesoMax;
				opcion = comboBoxMaleta3.getSelectedIndex();
				switch(opcion) {
				case 0: 
					pesoMax =10;
				break;
				case 1: 
					pesoMax = 20;
					break;
				case 2:
					pesoMax = 25;
					break;
					
				}
			}
		});
		comboBoxMaleta3.setModel(new DefaultComboBoxModel(new String[] {"10 kg", "20 kg", "25 kg"}));
		comboBoxMaleta3.setBounds(143, 191, 86, 24);
		facturaMaletas.getContentPane().add(comboBoxMaleta3);
		
		JLabel lblPesorealMaleta2_1 = new JLabel("PesoReal");
		lblPesorealMaleta2_1.setBounds(267, 195, 86, 20);
		facturaMaletas.getContentPane().add(lblPesorealMaleta2_1);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada, numeroSalida;
				int pesoMax, pesoReal, devolucionTotal;
				
				
				numeroEntrada = textFieldpesoMaximo.getText();
				pesoMax = Integer.parseInt(numeroEntrada);
			
				devolucionTotal = ( - pesoMax)*12;
				if (pesoReal < pesoMax) {
					lblResultado.setText("El precio a pagar es 0 euros");
					suma+=devolucionTotal;
				} else {
					lblResultado.setText("El precio a pagar es " + devolucionTotal + " euros");
					suma+=devolucionTotal;
			}

				numeroSalida = String.valueOf(devolucionTotal);
				
				
			}
		});
		btnCalcular.setBounds(199, 265, 154, 23);
		facturaMaletas.getContentPane().add(btnCalcular);
		
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(395, 195, 89, 20);
		facturaMaletas.getContentPane().add(textField);
		
		
	}
}
