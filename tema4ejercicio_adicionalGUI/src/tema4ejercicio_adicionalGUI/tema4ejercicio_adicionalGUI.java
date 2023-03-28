package tema4ejercicio_adicionalGUI;
//Monica Alcañiz Puig
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;

public class tema4ejercicio_adicionalGUI {
	char A = 'A';
	char C = 'C';
	char T = 'T';
	char G = 'G';
    int contador=0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tema4ejercicio_adicionalGUI window = new tema4ejercicio_adicionalGUI();
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
	public tema4ejercicio_adicionalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 622, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHliceEstabilizadora = new JLabel("Hélice estabilizadora");
		lblHliceEstabilizadora.setBounds(54, 52, 176, 15);
		frame.getContentPane().add(lblHliceEstabilizadora);
		
		JLabel lblHliceCodificadora = new JLabel("Hélice codificadora");
		lblHliceCodificadora.setBounds(54, 120, 192, 15);
		frame.getContentPane().add(lblHliceCodificadora);
		
		JTextPane textPaneHéliceEstabilizadora = new JTextPane();
		textPaneHéliceEstabilizadora.setBounds(248, 46, 284, 21);
		frame.getContentPane().add(textPaneHéliceEstabilizadora);
		
		JLabel lblResultadoCodificacion = new JLabel("");
		lblResultadoCodificacion.setBounds(247, 120, 284, 15);
		frame.getContentPane().add(lblResultadoCodificacion);
		
		JButton btnA = new JButton("A");
		btnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textPaneHéliceEstabilizadora.setText(textPaneHéliceEstabilizadora.getText() + "A");
				
			}
		});
		btnA.setBounds(73, 200, 64, 25);
		frame.getContentPane().add(btnA);
		
		JButton btnC = new JButton("C");
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPaneHéliceEstabilizadora.setText(textPaneHéliceEstabilizadora.getText() + "C");
			}
		});
		btnC.setBounds(210, 200, 64, 25);
		frame.getContentPane().add(btnC);
		
		JButton btnT = new JButton("T");
		btnT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPaneHéliceEstabilizadora.setText(textPaneHéliceEstabilizadora.getText() +"T");
			}
		});
		btnT.setBounds(347, 200, 64, 25);
		frame.getContentPane().add(btnT);
		
		JButton btnG = new JButton("G");
		btnG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPaneHéliceEstabilizadora.setText(textPaneHéliceEstabilizadora.getText() +"G");
			}
		});
		btnG.setBounds(484, 200, 64, 25);
		frame.getContentPane().add(btnG);
		
		JButton btnCODIFICAR = new JButton("CODIFICAR");
		btnCODIFICAR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String numeroEntrada, numeroSalida, cadena;
				int longitud;
				
				cadena = textPaneHéliceEstabilizadora.getText();
				longitud = cadena.length();
				
			    for(int i = 0; i<longitud; i++) {
			     if(textPaneHéliceEstabilizadora.getText().charAt(i)=='A') {
			    		lblResultadoCodificacion.setText(lblResultadoCodificacion.getText()+"T");
			    	} else if(textPaneHéliceEstabilizadora.getText().charAt(i)=='G') {
			    		lblResultadoCodificacion.setText(lblResultadoCodificacion.getText()+"C");
			    	} else if(textPaneHéliceEstabilizadora.getText().charAt(i)=='T') {
			    		lblResultadoCodificacion.setText(lblResultadoCodificacion.getText()+"A");
			    	} else  {
			    		lblResultadoCodificacion.setText(lblResultadoCodificacion.getText()+"G");
			    	}
			    }
				
			}
		});
		btnCODIFICAR.setBounds(247, 275, 117, 25);
		frame.getContentPane().add(btnCODIFICAR);
		
		
	}
}
