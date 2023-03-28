package tema4ejercicio10GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class tema4ejercicio10GUI {

	private JFrame frmEjercicio;
	private JTextField textFieldNumero1;
	private JTextField textFieldNumero2;
	private JTextField textFieldNumero3;
	private JButton btnCalcular;
	private JLabel lblMedia;
	private JLabel lblRespuesta;
	private JLabel lblNotaFinal;
	private JLabel lblComprobarNumero1;
	private JLabel lblComprobarNumero2;
	private JLabel lblComprobarNumero3;

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
		frmEjercicio.setBounds(100, 100, 650, 336);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);
		
		JLabel lbl1evaluacion = new JLabel("1ºEvaluación");
		lbl1evaluacion.setBounds(51, 26, 105, 15);
		frmEjercicio.getContentPane().add(lbl1evaluacion);
		
		JLabel lbl2evaluacion = new JLabel("2ºEvaluación");
		lbl2evaluacion.setBounds(51, 68, 105, 15);
		frmEjercicio.getContentPane().add(lbl2evaluacion);
		
		JLabel lbl3evaluacion = new JLabel("3ºEvaluación");
		lbl3evaluacion.setBounds(51, 107, 105, 15);
		frmEjercicio.getContentPane().add(lbl3evaluacion);
		
		lblNotaFinal = new JLabel("");
		lblNotaFinal.setForeground(Color.RED);
		lblNotaFinal.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNotaFinal.setBounds(245, 211, 192, 30);
		frmEjercicio.getContentPane().add(lblNotaFinal);
		
		lblRespuesta = new JLabel("");
		lblRespuesta.setBounds(349, 184, 70, 15);
		frmEjercicio.getContentPane().add(lblRespuesta);
		
		lblComprobarNumero1 = new JLabel("");
		lblComprobarNumero1.setForeground(Color.RED);
		lblComprobarNumero1.setBounds(400, 26, 222, 15);
		frmEjercicio.getContentPane().add(lblComprobarNumero1);
		
		lblComprobarNumero2 = new JLabel("");
		lblComprobarNumero2.setForeground(Color.RED);
		lblComprobarNumero2.setBounds(400, 68, 222, 15);
		frmEjercicio.getContentPane().add(lblComprobarNumero2);
		
		lblComprobarNumero3 = new JLabel("");
		lblComprobarNumero3.setForeground(Color.RED);
		lblComprobarNumero3.setBounds(400, 107, 222, 15);
		frmEjercicio.getContentPane().add(lblComprobarNumero3);
		
		
		textFieldNumero1 = new JTextField();
		textFieldNumero1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String numeroEntrada1;
				double numero1;
				Pattern pat = Pattern.compile("^\\d$");

				Matcher mat = pat.matcher(textFieldNumero1.getText());
				if (!mat.matches()) {
					lblComprobarNumero1.setText("Error:Número no válido");
					lblComprobarNumero1.setForeground(Color.RED);
				} else {
					lblComprobarNumero1.setText("");
				}	
				
				numeroEntrada1 = textFieldNumero1.getText();
				numero1 = Double.parseDouble(numeroEntrada1);
				
				if(numero1 <5) {
					lblComprobarNumero1.setText("SUSPENDIDO");
					lblComprobarNumero1.setForeground(Color.RED);
				}else {
					lblComprobarNumero1.setText("APROBADO");
					lblComprobarNumero1.setForeground(Color.GREEN);
				}
			}
		});
		textFieldNumero1.setBounds(201, 26, 114, 19);
		frmEjercicio.getContentPane().add(textFieldNumero1);
		textFieldNumero1.setColumns(10);
		
		textFieldNumero2 = new JTextField();
		textFieldNumero2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String numeroEntrada2;
				double numero2;
				Pattern pat = Pattern.compile("^\\d$");

				Matcher mat = pat.matcher(textFieldNumero2.getText());
				if (!mat.matches()) {
					lblComprobarNumero2.setText("Error:Número no válido");
					lblComprobarNumero2.setForeground(Color.RED);
				} else {
					lblComprobarNumero2.setText("");
				}	
				
				numeroEntrada2 = textFieldNumero2.getText();
				numero2 = Double.parseDouble(numeroEntrada2);
				
				if(numero2 <5) {
					lblComprobarNumero2.setText("SUSPENDIDO");
					lblComprobarNumero2.setForeground(Color.RED);
				}else {
					lblComprobarNumero2.setText("APROBADO");
					lblComprobarNumero2.setForeground(Color.GREEN);
				}
			}
		});
		textFieldNumero2.setBounds(201, 66, 114, 19);
		frmEjercicio.getContentPane().add(textFieldNumero2);
		textFieldNumero2.setColumns(10);
		
		textFieldNumero3 = new JTextField();
		textFieldNumero3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String numeroEntrada3;
				double numero3;
				Pattern pat = Pattern.compile("^\\d$");

				Matcher mat = pat.matcher(textFieldNumero3.getText());
				if (!mat.matches()) {
					lblComprobarNumero3.setText("Error:Número no válido");
					lblComprobarNumero3.setForeground(Color.RED);
				} else {
					lblComprobarNumero3.setText("");
				}	
				
				numeroEntrada3 = textFieldNumero3.getText();
				numero3 = Double.parseDouble(numeroEntrada3);
				
				if(numero3 <5) {
					lblComprobarNumero3.setText("SUSPENDIDO");
					lblComprobarNumero3.setForeground(Color.RED);
				}else {
					lblComprobarNumero3.setText("APROBADO");
					lblComprobarNumero3.setForeground(Color.GREEN);
				}
			}
		});
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
				
				if(media<5) {
					lblNotaFinal.setText("SUSPENDIDO");
					lblNotaFinal.setForeground(Color.RED);
				}else{
					lblNotaFinal.setText("APROBADO");
					lblNotaFinal.setForeground(Color.GREEN);
				}
			}
		});
		btnCalcular.setBounds(227, 136, 192, 25);
		frmEjercicio.getContentPane().add(btnCalcular);
		
		lblMedia = new JLabel("Media:");
		lblMedia.setBounds(224, 184, 70, 15);
		frmEjercicio.getContentPane().add(lblMedia);
		
		
		
		
		
	}

}
