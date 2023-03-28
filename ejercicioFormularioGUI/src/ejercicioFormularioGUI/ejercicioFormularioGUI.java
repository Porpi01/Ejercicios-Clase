package ejercicioFormularioGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicioFormularioGUI {

	String email;
	private JFrame frmFormulario;
	private JTextField textFieldLogin;
	private JTextField textFieldEmail;
	private JPasswordField passwordFieldPassword;
	private JPasswordField passwordFieldPassword2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicioFormularioGUI window = new ejercicioFormularioGUI();
					window.frmFormulario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ejercicioFormularioGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormulario = new JFrame();
		frmFormulario.getContentPane().setBackground(new Color(255, 255, 255));
		frmFormulario.setBackground(new Color(247, 222, 180));
		frmFormulario.setTitle("Formulario");
		frmFormulario.setBounds(100, 100, 956, 391);
		frmFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormulario.getContentPane().setLayout(null);
		
		JLabel lblFormula = new JLabel("Formulario de Registro");
		lblFormula.setForeground(new Color(51, 209, 122));
		lblFormula.setFont(new Font("Dialog", Font.BOLD, 20));
		lblFormula.setBounds(51, 31, 269, 32);
		frmFormulario.getContentPane().add(lblFormula);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(51, 85, 70, 15);
		frmFormulario.getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(51, 126, 133, 15);
		frmFormulario.getContentPane().add(lblPassword);
		
		JLabel lblPassword2 = new JLabel("Repite password:");
		lblPassword2.setBounds(51, 165, 133, 15);
		frmFormulario.getContentPane().add(lblPassword2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(51, 205, 70, 15);
		frmFormulario.getContentPane().add(lblEmail);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(217, 81, 174, 19);
		frmFormulario.getContentPane().add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(217, 201, 174, 19);
		frmFormulario.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblComprobarPassword = new JLabel("");
		lblComprobarPassword.setForeground(Color.RED);
		
		lblComprobarPassword.setBounds(443, 126, 437, 15);
		frmFormulario.getContentPane().add(lblComprobarPassword);
		
		JLabel lblcomprobarPassword2 = new JLabel("");
		lblcomprobarPassword2.setForeground(Color.RED);
		lblcomprobarPassword2.setBounds(443, 165, 437, 15);
		frmFormulario.getContentPane().add(lblcomprobarPassword2);
		
		passwordFieldPassword = new JPasswordField();
		passwordFieldPassword.setBounds(217, 122, 174, 19);
		frmFormulario.getContentPane().add(passwordFieldPassword);
		
		passwordFieldPassword2 = new JPasswordField();
		passwordFieldPassword2.setBounds(217, 161, 174, 19);
		frmFormulario.getContentPane().add(passwordFieldPassword2);
		
		JLabel lblComprobarEmail = new JLabel("");
		lblComprobarEmail.setForeground(Color.RED);
		lblComprobarEmail.setBounds(443, 205, 437, 15);
		frmFormulario.getContentPane().add(lblComprobarEmail);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
	
				
				Pattern password = Pattern.compile("^\\w{8}$");
				Matcher matt = password.matcher(passwordFieldPassword.getText());
				if (matt.matches()&& passwordFieldPassword.equals(passwordFieldPassword2)) {
					lblComprobarPassword.setText("");
					lblcomprobarPassword2.setText("");
				}else if(matt.matches()&& passwordFieldPassword !=passwordFieldPassword2) {
					lblcomprobarPassword2.setText("Error: la contraseña no coincide");
				}
				else {
					lblComprobarPassword.setText("Error: debe tener 8 caracteres");
				}
				
				Pattern mail = Pattern.compile("^^\\w+@\\w+\\.[a-z]{2,3}$$");
				Matcher mat = mail.matcher(textFieldEmail.getText());
				if (email.indexOf('@') == -1) {
					lblComprobarEmail.setText("Error: falta el @");
					
					} else if (email.indexOf('.') == -1) {
						lblComprobarEmail.setText("Error: falta el .");
					
					} else if (email.indexOf('@') > email.indexOf('.')) {
						lblComprobarEmail.setText("Error: la @ ha de ir antes que el .");
					
					} else if (email.length() - email.indexOf('.') == 2) {
						lblComprobarEmail.setText("Error: solo hay un caracter tras el .");
					
					} else if (email.length() - email.indexOf('.') > 4) {
						lblComprobarEmail.setText("Error: hay demasiados caracteres tras el .");
						
					} else {
						lblComprobarEmail.setText("Email correcto");
					}
				
			}
		});
		btnRegistrar.setBounds(217, 255, 174, 25);
		frmFormulario.getContentPane().add(btnRegistrar);
	}
}
