package tema4ejercicio43GUI;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


public class tema4ejercicio43GUI {
int contador =0;
String contadorSalida;
	private JFrame frameAdivinar;
	private JTextField textFieldnumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tema4ejercicio43GUI window = new tema4ejercicio43GUI();
					window.frameAdivinar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tema4ejercicio43GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAdivinar = new JFrame();
		frameAdivinar.setBounds(100, 100, 493, 301);
		frameAdivinar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAdivinar.getContentPane().setLayout(null);
		
		JLabel lblIntroduceUnNumero = new JLabel("Introduce un número");
		lblIntroduceUnNumero.setBounds(80, 33, 161, 15);
		frameAdivinar.getContentPane().add(lblIntroduceUnNumero);
		
		textFieldnumero = new JTextField();
		textFieldnumero.setBounds(80, 57, 161, 19);
		frameAdivinar.getContentPane().add(textFieldnumero);
		textFieldnumero.setColumns(10);
		
		JLabel lblnumeroAzar = new JLabel("");
		lblnumeroAzar.setBounds(283, 44, 167, 15);
		frameAdivinar.getContentPane().add(lblnumeroAzar);
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(80, 195, 161, 47);
		frameAdivinar.getContentPane().add(lblResultado);
		
		JLabel lblAcertar = new JLabel("");
		lblAcertar.setBounds(80, 158, 229, 15);
		frameAdivinar.getContentPane().add(lblAcertar);
		
		
		JButton btnAdivinarNumero = new JButton("Adivinar número");
		btnAdivinarNumero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Random azar = new Random();
				String numeroEntrada, numeroSalida;
				int numero, numeroAzar = azar.nextInt(50);
				
				numeroEntrada = textFieldnumero.getText();
				numero = Integer.parseInt(numeroEntrada);
				if( numeroAzar > numero) {
					lblnumeroAzar.setText("El número es mayor");
					contador++;
				}else if(numeroAzar==numero) {
					lblAcertar.setText("Has acertado");
					lblnumeroAzar.setText("");
					contador++;
				}else {
					lblnumeroAzar.setText("El número es menor");
					contador++;
				}
					
				numeroSalida = String.valueOf(contador);
				lblResultado.setText(numeroSalida);
			}
		});
		btnAdivinarNumero.setBounds(80, 121, 161, 25);
		frameAdivinar.getContentPane().add(btnAdivinarNumero);
		
		
	}
}
