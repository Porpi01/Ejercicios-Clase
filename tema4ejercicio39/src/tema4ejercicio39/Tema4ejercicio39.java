package tema4ejercicio39;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.toedter.calendar.JCalendar;

public class Tema4ejercicio39 {

	private JFrame Calendario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema4ejercicio39 window = new Tema4ejercicio39();
					window.Calendario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tema4ejercicio39() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calendario = new JFrame();
		Calendario.setTitle("Calendario");
		Calendario.setBounds(100, 100, 558, 412);
		Calendario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calendario.getContentPane().setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(12, 0, 534, 363);
		Calendario.getContentPane().add(calendar);
	}
}
