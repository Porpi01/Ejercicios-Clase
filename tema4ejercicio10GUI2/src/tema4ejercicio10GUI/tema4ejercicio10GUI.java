package tema4ejercicio10GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tema4ejercicio10GUI {

	private JFrame frmEjercicio;
	private JTextField textFieldNumero1;
	private JTextField textFieldNumero2;
	private JTextField textFieldNumero3;
	private JButton btnCalcular;
	private JLabel lblMedia;
	private JLabel lblRespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tema4ejercicio10GUI window = new tema4ejercicio10GUI();
					window.frmEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tema4ejercicio10GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.setTitle("Ejercicio 10");
		frmEjercicio.setBounds(100, 100, 365, 300);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);
		
		JLabel lbl1evaluacion = new JLabel("1ºEvaluacion");
		lbl1evaluacion.setBounds(51, 26, 105, 15);
		frmEjercicio.getContentPane().add(lbl1evaluacion);
		
		JLabel lbl2evaluacion = new JLabel("2ºEvaluacion");
		lbl2evaluacion.setBounds(51, 68, 105, 15);
		frmEjercicio.getContentPane().add(lbl2evaluacion);
		
		JLabel lbl3evaluacion = new JLabel("3ºEvaluacion");
		lbl3evaluacion.setBounds(51, 107, 105, 15);
		frmEjercicio.getContentPane().add(lbl3evaluacion);
		
		lblRespuesta = new JLabel("11");
		lblRespuesta.setBounds(211, 201, 70, 15);
		frmEjercicio.getContentPane().add(lblRespuesta);
		
		textFieldNumero1 = new JTextField();
		textFieldNumero1.setBounds(201, 26, 114, 19);
		frmEjercicio.getContentPane().add(textFieldNumero1);
		textFieldNumero1.setColumns(10);
		
		textFieldNumero2 = new JTextField();
		textFieldNumero2.setBounds(201, 66, 114, 19);
		frmEjercicio.getContentPane().add(textFieldNumero2);
		textFieldNumero2.setColumns(10);
		
		textFieldNumero3 = new JTextField();
		textFieldNumero3.setBounds(201, 105, 114, 19);
		frmEjercicio.getContentPane().add(textFieldNumero3);
		textFieldNumero3.setColumns(10);
		
		btnCalcular = new JButton("Calcular media");
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double media;
				String numeroEntrada1, numeroEntrada2,numeroEntrada3, numeroSalida;
				double numero1, numero2, numero3;
				
				numeroEntrada1 = textFieldNumero1.getText();
				numeroEntrada2 = textFieldNumero2.getText();
				numeroEntrada3 = textFieldNumero3.getText();
				
				numero1 = Double.parseDouble(numeroEntrada1);
				numero2 = Double.parseDouble(numeroEntrada2);
				numero3 = Double.parseDouble(numeroEntrada3);
				
				media= (numero1+numero2+numero3)/3;
				numeroSalida = String.valueOf(media);
				lblRespuesta.setText(numeroSalida);
			}
		});
		btnCalcular.setBounds(81, 151, 192, 25);
		frmEjercicio.getContentPane().add(btnCalcular);
		
		lblMedia = new JLabel("Media:");
		lblMedia.setBounds(51, 201, 70, 15);
		frmEjercicio.getContentPane().add(lblMedia);
		
		
	}

}
