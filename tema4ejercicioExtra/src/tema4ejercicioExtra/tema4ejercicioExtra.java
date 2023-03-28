package tema4ejercicioExtra;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class tema4ejercicioExtra {

	private JFrame frmColores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tema4ejercicioExtra window = new tema4ejercicioExtra();
					window.frmColores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tema4ejercicioExtra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColores = new JFrame();
		frmColores.setTitle("Colores");
		frmColores.setBounds(100, 100, 582, 375);
		frmColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColores.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 210, 22);
		frmColores.getContentPane().add(menuBar);
		
		JComboBox comboBoxOpcion = new JComboBox();
		comboBoxOpcion.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
			}
		});
		
		comboBoxOpcion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int opcion;
				opcion=comboBoxOpcion.getSelectedIndex();
				switch(opcion) {
				case 0:
					frmColores.getContentPane().setBackground(Color.RED);
					break;
				case 1:
					frmColores.getContentPane().setBackground(Color.YELLOW);
					break;
				case 2:
					frmColores.getContentPane().setBackground(Color.GREEN);
					break;
				case 3:
					frmColores.getContentPane().setBackground(Color.BLUE);
					break;
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		comboBoxOpcion.setModel(new DefaultComboBoxModel(new String[] {"rojo", "amarillo ", "verde ", "azul"}));
		menuBar.add(comboBoxOpcion);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmColores.dispose();// funcion dispose se utiliza para salir
				
			}
		});
		menuBar.add(btnSalir);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(10, 34, 129, 21);
		frmColores.getContentPane().add(menuBar_1);
	}
}
