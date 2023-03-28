package ventanaHelloWorld;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class VentanaHelloWorld {

	private JFrame mi_ventana;
	private JTextField textFieldNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaHelloWorld window = new VentanaHelloWorld();
					window.mi_ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaHelloWorld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mi_ventana = new JFrame();
		mi_ventana.getContentPane().setBackground(Color.GREEN);
		mi_ventana.setBackground(Color.LIGHT_GRAY);
		mi_ventana.setTitle("mi_ventana");
		mi_ventana.setBounds(100, 100, 450, 300);
		mi_ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mi_ventana.getContentPane().setLayout(null);
		
		JLabel lblHolaMundo = new JLabel("");
		lblHolaMundo.setFont(new Font("Courier 10 Pitch", Font.BOLD, 13));
		lblHolaMundo.setBounds(168, 30, 114, 25);
		mi_ventana.getContentPane().add(lblHolaMundo);
		
		JButton botonIncrementar = new JButton("Incrementar");
		botonIncrementar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada, numeroSalida;
				int numero;
				numeroEntrada=textFieldNumero.getText();
				numero=Integer.parseInt(numeroEntrada);
				numero++;
				numeroSalida=String.valueOf(numero);
				lblHolaMundo.setText(numeroSalida);
			}
		});
		botonIncrementar.setBounds(126, 173, 183, 25);
		mi_ventana.getContentPane().add(botonIncrementar);
		
		textFieldNumero = new JTextField();
		textFieldNumero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mi_ventana.getContentPane().setBackground(Color.RED);
				botonIncrementar.setEnabled(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mi_ventana.getContentPane().setBackground(Color.BLUE);
				botonIncrementar.setEnabled(true);
			}
			
		});
		textFieldNumero.setText("0");
		textFieldNumero.setBounds(181, 107, 75, 25);
		mi_ventana.getContentPane().add(textFieldNumero);
		textFieldNumero.setColumns(10);
	}
}
