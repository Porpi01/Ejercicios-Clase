package tema3ejercicio9GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class tema3ejercicio9GUI {

    private JFrame frmOperaciones;
    private JTextField textFieldNumero1;
    private JTextField textFieldNumero2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
   	 EventQueue.invokeLater(new Runnable() {
   		 public void run() {
   			 try {
   				 tema3ejercicio9GUI window = new tema3ejercicio9GUI();
   				 window.frmOperaciones.setVisible(true);
   			 } catch (Exception e) {
   				 e.printStackTrace();
   			 }
   		 }
   	 });
    }

    /**
     * Create the application.
     */
    public tema3ejercicio9GUI() {
   	 initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
   	 frmOperaciones = new JFrame();
   	 frmOperaciones.getContentPane().setBackground(Color.WHITE);
   	 frmOperaciones.setTitle("Operaciones");
   	 frmOperaciones.setBounds(100, 100, 834, 309);
   	 frmOperaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frmOperaciones.getContentPane().setLayout(null);
   	 
   	 JLabel labelResultado = new JLabel("Resultado");
   	 labelResultado.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.foreground"));
   	 labelResultado.setBounds(338, 216, 157, 15);
   	 frmOperaciones.getContentPane().add(labelResultado);
   	 
   	 JLabel lblComprobacionNumero1 = new JLabel("");
   	 lblComprobacionNumero1.addKeyListener(new KeyAdapter() {
   	 	
   	 });
   	 lblComprobacionNumero1.setForeground(new Color(255, 0, 0));
   	 lblComprobacionNumero1.setFont(new Font("Tahoma", Font.BOLD, 11));
   	 lblComprobacionNumero1.setBounds(602, 30, 188, 14);
   	 frmOperaciones.getContentPane().add(lblComprobacionNumero1);
   	 
   	 JLabel lblComrpobacionNumero2 = new JLabel("");
   	 lblComrpobacionNumero2.setForeground(Color.RED);
   	 lblComrpobacionNumero2.setFont(new Font("Tahoma", Font.BOLD, 11));
   	 lblComrpobacionNumero2.setBounds(602, 86, 188, 14);
   	 frmOperaciones.getContentPane().add(lblComrpobacionNumero2);
   	 
   	 JButton botonCalcularSuma = new JButton("Sumar");
   	
   	 botonCalcularSuma.addMouseListener(new MouseAdapter() {
   		 @Override
   		 public void mouseClicked(MouseEvent e) {
   		 String numeroEntrada, numeroEntrada2,numeroSalida;
   		 double numero,numero2, suma;
   		Pattern Numero1 = Pattern.compile("^\\d{1,6}$");
   		 numeroEntrada=textFieldNumero1.getText();
   		Matcher mat = Numero1.matcher(textFieldNumero1.getText());
		if(!mat.matches()) {
			lblComprobacionNumero1.setText("Error: número no válido");
		}else {
			lblComprobacionNumero1.setText("");
		}
		Pattern Numero2 = Pattern.compile("^\\d{1,6}$");
   		 numeroEntrada2=textFieldNumero2.getText();
   		Matcher matt = Numero2.matcher(textFieldNumero2.getText());
		if(!matt.matches()) {
			lblComrpobacionNumero2.setText("Error: número no válido");
			
		}else {
			lblComrpobacionNumero2.setText("");
		
   		 numero=Double.parseDouble(numeroEntrada);
   		 numero2=Double.parseDouble(numeroEntrada2);
   		 suma = numero + numero2;
   		 numeroSalida = String.valueOf(suma);
   		 labelResultado.setText(numeroSalida);
		}
   		 }
   	 });
   	 botonCalcularSuma.setBounds(24, 137, 138, 25);
   	 frmOperaciones.getContentPane().add(botonCalcularSuma);
   	 
   	 textFieldNumero1 = new JTextField();
   	 textFieldNumero1.setBounds(428, 27, 114, 19);
   	
   	 frmOperaciones.getContentPane().add(textFieldNumero1);
   	
   	 textFieldNumero1.setColumns(10);
   	 
   	 textFieldNumero2 = new JTextField();
   	 textFieldNumero2.setBounds(428, 83, 114, 19);
   	 frmOperaciones.getContentPane().add(textFieldNumero2);
   	 textFieldNumero2.setColumns(10);
   	 
   	 JLabel lblNumero1 = new JLabel("Numero 1");
   	 lblNumero1.setBounds(237, 29, 70, 15);
   	 frmOperaciones.getContentPane().add(lblNumero1);
   	 
   	 JLabel lblNumero2 = new JLabel("Numero 2");
   	 lblNumero2.setBounds(237, 85, 70, 15);
   	 frmOperaciones.getContentPane().add(lblNumero2);
   	 
   	 JButton btnNewButtonRestar = new JButton("Restar");
   	 btnNewButtonRestar.addMouseListener(new MouseAdapter() {
   		 @Override
   		 public void mouseClicked(MouseEvent e) {
   			 String numeroEntrada, numeroEntrada2,numeroSalida;
   			 double numero,numero2, resta;
   			Pattern Numero1 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada=textFieldNumero1.getText();
      		Matcher mat = Numero1.matcher(textFieldNumero1.getText());
   		if(!mat.matches()) {
   			lblComprobacionNumero1.setText("Error: número no válido");
   		}else {
   			lblComprobacionNumero1.setText("");
   		}
   		Pattern Numero2 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada2=textFieldNumero2.getText();
      		Matcher matt = Numero2.matcher(textFieldNumero2.getText());
   		if(!matt.matches()) {
   			lblComrpobacionNumero2.setText("Error: número no válido");
   			
   		}else {
   			lblComrpobacionNumero2.setText("");
   			 numero=Double.parseDouble(numeroEntrada);
   			 numero2=Double.parseDouble(numeroEntrada2);
   			 resta = numero - numero2;
   			 numeroSalida = String.valueOf(resta);
   			 labelResultado.setText(numeroSalida);
   		}
   		 }
   	 });
   	 btnNewButtonRestar.setBounds(186, 137, 138, 25);
   	 frmOperaciones.getContentPane().add(btnNewButtonRestar);
   	 
   	 JButton btnResto = new JButton("Resto");
   	 btnResto.addMouseListener(new MouseAdapter() {
   		 @Override
   		 public void mouseClicked(MouseEvent e) {
   			 String numeroEntrada, numeroEntrada2,numeroSalida;
   			 double numero,numero2, resto;
   			Pattern Numero1 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada=textFieldNumero1.getText();
      		Matcher mat = Numero1.matcher(textFieldNumero1.getText());
   		if(!mat.matches()) {
   			lblComprobacionNumero1.setText("Error: número no válido");
   		}else {
   			lblComprobacionNumero1.setText("");
   		}
   		Pattern Numero2 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada2=textFieldNumero2.getText();
      		Matcher matt = Numero2.matcher(textFieldNumero2.getText());
   		if(!matt.matches()) {
   			lblComrpobacionNumero2.setText("Error: número no válido");
   			
   		}else {
   			lblComrpobacionNumero2.setText("");
   			 numero=Double.parseDouble(numeroEntrada);
   			 numero2=Double.parseDouble(numeroEntrada2);
   			 resto = numero%numero2;
   			 numeroSalida = String.valueOf(resto);
   			 labelResultado.setText(numeroSalida);
   		 }
   		 }
   	 });
   	 btnResto.setBounds(348, 137, 138, 25);
   	 frmOperaciones.getContentPane().add(btnResto);
   	 
   	 JButton btnDivision = new JButton("Division");
   	 btnDivision.addMouseListener(new MouseAdapter() {
   		 @Override
   		 public void mouseClicked(MouseEvent e) {
   			 String numeroEntrada, numeroEntrada2,numeroSalida;
   			 double numero,numero2, division;
   			Pattern Numero1 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada=textFieldNumero1.getText();
      		Matcher mat = Numero1.matcher(textFieldNumero1.getText());
   		if(!mat.matches()) {
   			lblComprobacionNumero1.setText("Error: número no válido");
   		}else {
   			lblComprobacionNumero1.setText("");
   		}
   		Pattern Numero2 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada2=textFieldNumero2.getText();
      		Matcher matt = Numero2.matcher(textFieldNumero2.getText());
   		if(!matt.matches()) {
   			lblComrpobacionNumero2.setText("Error: número no válido");
   			
   		}else {
   			lblComrpobacionNumero2.setText("");
   			 numero=Double.parseDouble(numeroEntrada);
   			 numero2=Double.parseDouble(numeroEntrada2);
   			 division = numero / numero2;
   			 numeroSalida = String.valueOf(division);
   			 labelResultado.setText(numeroSalida);
   		 }
   		 }
   	 });
   	 btnDivision.setBounds(510, 137, 138, 25);
   	 frmOperaciones.getContentPane().add(btnDivision);
   	 
   	 JButton btnMultiplicacion = new JButton("Multiplicacion");
   	 btnMultiplicacion.addMouseListener(new MouseAdapter() {
   		 @Override
   		 public void mouseClicked(MouseEvent e) {
   			 String numeroEntrada, numeroEntrada2,numeroSalida;
   			 double numero,numero2, multiplicacion;
   			Pattern Numero1 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada=textFieldNumero1.getText();
      		Matcher mat = Numero1.matcher(textFieldNumero1.getText());
   		if(!mat.matches()) {
   			lblComprobacionNumero1.setText("Error: número no válido");
   		}else {
   			lblComprobacionNumero1.setText("");
   		}
   		Pattern Numero2 = Pattern.compile("^\\d{1,6}$");
      		 numeroEntrada2=textFieldNumero2.getText();
      		Matcher matt = Numero2.matcher(textFieldNumero2.getText());
   		if(!matt.matches()) {
   			lblComrpobacionNumero2.setText("Error: número no válido");
   			
   		}else {
   			lblComrpobacionNumero2.setText("");
   			 numero=Double.parseDouble(numeroEntrada);
   			 numero2=Double.parseDouble(numeroEntrada2);
   			 multiplicacion = numero *numero2;
   			 numeroSalida = String.valueOf(multiplicacion);
   			 labelResultado.setText(numeroSalida);
   		 }
   		 }
   	 });
   	 btnMultiplicacion.setBounds(672, 137, 138, 25);
   	 frmOperaciones.getContentPane().add(btnMultiplicacion);
   	 
   	
   	 
   	
   	 
   	 
    }
}
