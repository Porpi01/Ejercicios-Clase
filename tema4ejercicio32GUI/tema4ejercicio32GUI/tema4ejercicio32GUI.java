package tema4ejercicio32GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class tema4ejercicio32GUI {

	private JFrame frame;
	private JTextField textFieldNumeroSeguidores;
	private JLabel lblSeguidores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tema4ejercicio32GUI window = new tema4ejercicio32GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tema4ejercicio32GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombreCuenta = new JLabel("@fulanito");
		lblNombreCuenta.setBounds(176, 54, 54, 14);
		frame.getContentPane().add(lblNombreCuenta);
		
		textFieldNumeroSeguidores = new JTextField();
		textFieldNumeroSeguidores.setBounds(161, 91, 86, 20);
		frame.getContentPane().add(textFieldNumeroSeguidores);
		textFieldNumeroSeguidores.setColumns(10);
		
		lblSeguidores = new JLabel("seguidores");
		lblSeguidores.setBounds(257, 94, 80, 14);
		frame.getContentPane().add(lblSeguidores);
		
		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String numeroEntrada, numeroSalida, numeroEntrada2, numeroSalida2;
				int numeroSeguidores, boton;
				
				numeroEntrada = textFieldNumeroSeguidores.getText();
				numeroSeguidores = Integer.parseInt(numeroEntrada);
				
				
				
				if(boton==0) {
				numeroSeguidores++;
				btnSeguir.setText("Seguir");
				
				}else {
					numeroSeguidores--;
					btnSeguir.setText("Dejar de seguir");
				}
				numeroSalida = String.valueOf(numeroSeguidores);
				textFieldNumeroSeguidores.setText(numeroSalida);
			}
		});
		btnSeguir.setBounds(160, 125, 86, 23);
		frame.getContentPane().add(btnSeguir);
		

		
		
		
		
	}
}
