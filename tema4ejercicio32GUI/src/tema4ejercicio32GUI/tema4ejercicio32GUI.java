package tema4ejercicio32GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class tema4ejercicio32GUI {
int boton=0;
	private JFrame frame;
	private JTextField textFieldNumSeguidores;

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
		
		JLabel lblMissAlumno = new JLabel("@MissAlumno");
		lblMissAlumno.setBounds(164, 68, 96, 15);
		frame.getContentPane().add(lblMissAlumno);
		
		JLabel lblNumSeguidores = new JLabel("seguidores");
		lblNumSeguidores.setBounds(273, 99, 133, 15);
		frame.getContentPane().add(lblNumSeguidores);
		textFieldNumSeguidores = new JTextField();
		textFieldNumSeguidores.setText("");
		textFieldNumSeguidores.setBounds(160, 97, 84, 19);
		frame.getContentPane().add(textFieldNumSeguidores);
		textFieldNumSeguidores.setColumns(10);
		
		
		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numeroSeguidores;
				String numeroEntrada, numeroSalida;
				int numero;
				
				if(boton==0) {
					numeroEntrada = textFieldNumSeguidores.getText();
					numero = Integer.parseInt(numeroEntrada);
					numero++;
					boton=1;
					btnSeguir.setText("Dejar de seguir");
					numeroSalida = String.valueOf(numero);
					textFieldNumSeguidores.setText(numeroSalida);
					
				}else {
					numeroEntrada = textFieldNumSeguidores.getText();
					numero = Integer.parseInt(numeroEntrada);
					numero--;
					boton=0;
					btnSeguir.setText("Seguir");
					numeroSalida = String.valueOf(numero);
					textFieldNumSeguidores.setText(numeroSalida);
				}
					
				
					
				
				
			}
		});
		btnSeguir.setBounds(107, 142, 236, 25);
		frame.getContentPane().add(btnSeguir);
		
	
	}
}
