package tema7ejercicio12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;


 class FormValidationException extends Exception {
	
	private String field;
	private String reason;
	
	public FormValidationException(String field, String reason) {
		this.field =field;
		this.reason = reason;
	
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}


public class Tema7ejercicio12 {

	private JFrame frame;
	private JTextField textFieldCaracteres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema7ejercicio12 window = new Tema7ejercicio12();
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
	public Tema7ejercicio12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 688, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldCaracteres = new JTextField();
		textFieldCaracteres.setBounds(184, 177, 294, 50);
		frame.getContentPane().add(textFieldCaracteres);
		textFieldCaracteres.setColumns(10);
		
		JButton btnNewButton = new JButton("Excepcion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
			if (textFieldCaracteres == null || !textFieldCaracteres.matches ("^\\w{10}$")) {
				throw new FormValidationException ("");
				
			}
			
				Pattern pat = Pattern.compile();
				Matcher mat = pat.matcher(textFieldCaracteres.getText());
				if (!mat.matches()) {
					 JOptionPane.showMessageDialog(null, "Error formato no válido: debe introducir 10 caracteres");
					
     	}
			
				
				
			}
		});
		btnNewButton.setBounds(262, 239, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Escribe 10 caracteres");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel.setBounds(226, 127, 240, 25);
		frame.getContentPane().add(lblNewLabel);
	}
}
