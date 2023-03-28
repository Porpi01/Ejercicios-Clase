package ejercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nombre {

	List<String> nombres = new ArrayList<>();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nombre window = new Nombre();
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
	public Nombre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 789, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPaneMostrar = new JTextPane();
		textPaneMostrar.setBounds(463, 118, 224, 242);
		frame.getContentPane().add(textPaneMostrar);
		
		JRadioButton rdbtnAñadir = new JRadioButton("Introducir nombres",true);
		JLabel lblNewLabelTitulo = new JLabel("Parejas");
		lblNewLabelTitulo.setFont(new Font("Dialog", Font.BOLD, 40));
		JButton btnGuardar = new JButton("Guardar");
		JTextArea textAreaMostrar = new JTextArea();
		textAreaMostrar.setEnabled(false);
		JButton btnGenerarParejas = new JButton("Generar parejas");
		
		
		
		
		btnGenerarParejas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random azar = new Random();
				if (rdbtnAñadir.isSelected()) {
					int numPareja = nombres.size() / 2;
					
					
				

				
				} else {

					int numPareja = nombres.size() / 2;
					for (int i = 0; i < numPareja; i++) {
						String nombre1 = nombres.get(azar.nextInt(nombres.size()));
						nombres.remove(nombre1);
						String nombre2 = nombres.get(azar.nextInt(nombres.size()));
						nombres.remove(nombre2);
						textPaneMostrar.setText(textPaneMostrar.getText() + nombre1 + "" + nombre2 + "\n");
					
					}
				}

			}
		});
		
		
		rdbtnAñadir.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (rdbtnAñadir.isSelected()) {
					textAreaMostrar.setEnabled(true);
					} else {
						textAreaMostrar.setEnabled(false);
						}

			}
		});
	
		rdbtnAñadir.setBounds(59, 102, 211, 23);
		frame.getContentPane().add(rdbtnAñadir);
		
		
		JRadioButton rdbtnFichero = new JRadioButton("Coger nombres fichero");
		rdbtnFichero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random azar = new Random();
				

				FileReader lectura;

				
				try {
					lectura = new FileReader("nombres.txt");
					BufferedReader br = new BufferedReader(lectura);
					Scanner entrada = new Scanner(br);
				
					while (entrada.hasNext()) {
						nombres.add(entrada.next());
						

					}


				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		});
		rdbtnFichero.setBounds(59, 132, 310, 23);
		frame.getContentPane().add(rdbtnFichero);
		
		
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(rdbtnAñadir);
		g1.add(rdbtnFichero);
		
		
		
		lblNewLabelTitulo.setBounds(292, 12, 201, 80);
		frame.getContentPane().add(lblNewLabelTitulo);
		
		
		
		btnGuardar.setBounds(505, 372, 117, 25);
		frame.getContentPane().add(btnGuardar);

		public void actionPerformed(ActionEvent arg0) {

			try {

			
				
					FileWriter escribir;

					try {
					
						escribir = new FileWriter("login.txt");
						BufferedWriter bw = new BufferedWriter(escribir);
						PrintWriter pw = new PrintWriter(bw);

						for (int i = 0; i < nombres.size(); i++) {
							pw.println(nombres.get(i));
								
						}
						pw.close();
						

					} catch (IOException error) {
					}
				
			} catch (NullPointerException error) {

				
			}
		}
		

	});
	
		
		
		
		textAreaMostrar.setBounds(69, 163, 289, 197);
		frame.getContentPane().add(textAreaMostrar);
		
		
		btnGenerarParejas.setBounds(465, 81, 211, 25);
		frame.getContentPane().add(btnGenerarParejas);
	}
}
