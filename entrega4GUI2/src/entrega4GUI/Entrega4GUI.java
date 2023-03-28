package entrega4GUI;

//Monica Alcañiz Puig
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Entrega4GUI {
	JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta", true);

	
	
	JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");

	static final double PRECIO_SOLOMILLO = 15.45;
	static final double PRECIO_PAELLA = 8;
	static final double PRECIO_MERLUZA_CON_REMOLACHA = 12.35;

	static final double PRECIO_HAMBURGUESA = 8;
	static final double PRECIO_COSTILLAR = 8;
	static final double PRECIO_LASAÑA_CASERA = 8;

	static final double PRECIO_COULANT = 3;
	static final double PRECIO_TARTA_DE_QUESO = 3;

	static final double PRECIO_AGUA = 2;
	static final double PRECIO_CERVEZA = 3.50;
	static final double PRECIO_COCA_COLA = 2.50;
	static final double PRECIO_AQUARIUS = 2.50;

	static final double PRECIO_CAFE_CON_LECHE = 2.5;
	static final double PRECIO_CAFE_SOLO = 1.50;
	static final double PRECIO_DESCAFEINADO = 2;
	static final double PRECIO_CORTADO = 2.30;
	double precio1, precio2, precio3, precio4, precio5, precioFinal = 0;

	private JFrame frameMenu;
	ButtonGroup g1 = new ButtonGroup();

	private JTextField textFieldTarjeta;

	/**
	 * Launch the application.
	 */
	
	void MostrarPlato1 () {
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrega4GUI window = new Entrega4GUI();
					window.frameMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Entrega4GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMenu = new JFrame();
		frameMenu.setBackground(new Color(238, 238, 238));
		frameMenu.getContentPane().setBackground(new Color(229, 197, 239));
		frameMenu.setTitle("Menú");
		frameMenu.setBounds(100, 100, 668, 851);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.getContentPane().setLayout(null);

		JLabel lblPlatoPrincipal = new JLabel("Plato principal");
		
		lblPlatoPrincipal.setBounds(38, 135, 115, 15);
		frameMenu.getContentPane().add(lblPlatoPrincipal);

		JLabel lblSegundoPlato = new JLabel("Segundo plato");
		
		lblSegundoPlato.setBounds(38, 188, 115, 15);
		frameMenu.getContentPane().add(lblSegundoPlato);

		JLabel lblBebida = new JLabel("Bebida");
		
		lblBebida.setBounds(38, 294, 70, 15);
		frameMenu.getContentPane().add(lblBebida);

		JLabel lblMtodoDePago = new JLabel("Método de pago");
		
		lblMtodoDePago.setBounds(38, 400, 167, 15);
		frameMenu.getContentPane().add(lblMtodoDePago);

		JLabel lblTicket = new JLabel("TICKET");
		
		lblTicket.setBounds(254, 477, 70, 24);
		frameMenu.getContentPane().add(lblTicket);

		
		JComboBox comboBoxPostre = new JComboBox();
		comboBoxPostre.setModel(new DefaultComboBoxModel(new String[] {"Coulant de chocolate 3 €", "Tarta de queso 3€"}));
		comboBoxPostre.setBounds(225, 232, 264, 24);
		frameMenu.getContentPane().add(comboBoxPostre);


		JComboBox comboBoxBebida = new JComboBox();
		
		comboBoxBebida.setModel(new DefaultComboBoxModel(
				new String[] { "Agua 2 €", "Cerveza 3.50€", "Coca Cola 2,50€", "Aquarius 2,50€" }));
		comboBoxBebida.setBounds(225, 285, 264, 24);
		frameMenu.getContentPane().add(comboBoxBebida);

		JComboBox comboBoxCafe = new JComboBox();
		comboBoxCafe.setEnabled(false);
		comboBoxCafe.setModel(new DefaultComboBoxModel(
				new String[] { "Cafe con leche 2,50€", "Café solo 1,50€", "Descafeinado 2€", "Cortado 2,30 €" }));
		comboBoxCafe.setBounds(225, 338, 264, 24);
		frameMenu.getContentPane().add(comboBoxCafe);

		JCheckBox chckbxCafé = new JCheckBox("Café");
		chckbxCafé.setMnemonic('C');

		chckbxCafé.setBackground(new Color(229, 197, 239));
		chckbxCafé.setBounds(38, 347, 63, 15);
		frameMenu.getContentPane().add(chckbxCafé);

		JTextPane textPaneTicket = new JTextPane();
		textPaneTicket.setBackground(Color.WHITE);
		textPaneTicket.setBounds(131, 512, 330, 209);
		frameMenu.getContentPane().add(textPaneTicket);

		JLabel lblTarjeta = new JLabel("");
		lblTarjeta.setBounds(348, 396, 264, 15);
		frameMenu.getContentPane().add(lblTarjeta);

		textFieldTarjeta = new JTextField();

		textFieldTarjeta.setBounds(348, 374, 145, 19);
		frameMenu.getContentPane().add(textFieldTarjeta);
		textFieldTarjeta.setColumns(10);
		
		JComboBox comboBoxSegundoPlato = new JComboBox();
		comboBoxSegundoPlato.setModel(new DefaultComboBoxModel(new String[] {"Hamburguesa 8 €", "Costillar 8 €", "Lasaña casera 8 €"}));
		comboBoxSegundoPlato.setBounds(225, 179, 264, 24);
		frameMenu.getContentPane().add(comboBoxSegundoPlato);
		
		JComboBox comboBoxPlatoPrincipal = new JComboBox();
		comboBoxPlatoPrincipal.setModel(new DefaultComboBoxModel(
				new String[] { "Solomillo con salsa verde 15,45  €", "Paella  8 €", "Merluza con remolacha 12,35 €" }));
		comboBoxPlatoPrincipal.setBounds(225, 126, 264, 24);
		frameMenu.getContentPane().add(comboBoxPlatoPrincipal);
		
		chckbxCafé.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {// Función utilizada para seleccionar y quitar seleccion en un
															// checkbox
				if (chckbxCafé.isSelected()) {
					comboBoxCafe.setEnabled(true);

				} else {
					comboBoxCafe.setEnabled(false);
				}

			}
		});
		
		chckbxCafé.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;
				
				

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
						
							
					}
					

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				}
				
			}
		});
		
		comboBoxSegundoPlato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					}
					
						
					

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				
				}
				
			
				
			}
		});
		
		

	
		comboBoxPlatoPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					
					}

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				
				}
				
			

			}
		});
		
		comboBoxPostre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;
				

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						textPaneTicket.setText("Has pagado con tarjeta");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					
					}

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				}
				
			}
		});
		
		comboBoxBebida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;
				

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					}

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				}
				
			}
		});
		
		comboBoxCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;
		

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					
					}

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				}
				
			
				
			}
		});

		JLabel lblTítulo = new JLabel("DULCES Y SALADAS");
		lblTítulo.setFont(new Font("Keraleeyam", Font.BOLD, 20));
		lblTítulo.setBounds(237, 34, 224, 30);
		frameMenu.getContentPane().add(lblTítulo);

		JLabel lblMen = new JLabel("Menú");
		lblMen.setBounds(296, 56, 50, 25);
		frameMenu.getContentPane().add(lblMen);


		JLabel lblPostre = new JLabel("Postre");
	
		
		lblPostre.setBounds(38, 237, 70, 15);
		frameMenu.getContentPane().add(lblPostre);
		rdbtnTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textFieldTarjeta.setEditable(true);
				textFieldTarjeta.setVisible(true);
			}
		});

		rdbtnTarjeta.setBackground(new Color(229, 197, 239));
		rdbtnTarjeta.setBounds(225, 370, 95, 23);
		frameMenu.getContentPane().add(rdbtnTarjeta);
		rdbtnEfectivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldTarjeta.setVisible(false);
				lblTarjeta.setText("");
			}
		});

		rdbtnEfectivo.setBackground(new Color(229, 197, 239));
		rdbtnEfectivo.setBounds(225, 396, 95, 23);
		frameMenu.getContentPane().add(rdbtnEfectivo);
		g1.add(rdbtnEfectivo);
		g1.add(rdbtnTarjeta);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPaneTicket.setText(null);
			}
		});
		btnBorrar.setMnemonic('B');
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPaneTicket.setText(null);
			}
		});
		btnBorrar.setBounds(403, 451, 90, 25);
		frameMenu.getContentPane().add(btnBorrar);
		
		JMenuBar barra = new JMenuBar();//Crear la barra de menú
		barra.setToolTipText("");
		barra.setBounds(0, 0, 652, 22);
		frameMenu.getContentPane().add(barra);
		
		JMenu mnCamarero = new JMenu("Camarero"); //Creación menu Camarero
		barra.add(mnCamarero);
		
		JMenuItem mntmCamarero1 = new JMenuItem("Carmen González Navarro");
		mntmCamarero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;
				

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						textPaneTicket.setText("Has pagado con tarjeta");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					
					}

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				}
				
				
			}
		});
		mnCamarero.add(mntmCamarero1);
		
		JMenuItem mntmCamarero2 = new JMenuItem("Jorge Castro García");
		mntmCamarero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;
				
				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						textPaneTicket.setText("Has pagado con tarjeta");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					
						
					}

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				
				}
				
			}
		});
		mnCamarero.add(mntmCamarero2);
		
		JMenuItem mntmCamarero3 = new JMenuItem("Elena Fernández Rivarola");
		mntmCamarero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion, opcion2, opcion3, opcion4, opcion5, opcion6;
				

				if (rdbtnTarjeta.isSelected()) {
					Pattern pat = Pattern.compile("^\\d{16}$");

					Matcher mat = pat.matcher(textFieldTarjeta.getText());
					if (!mat.matches()) {
						lblTarjeta.setText("Error:Número no válido");
						textPaneTicket.setText("");

					} else {
						lblTarjeta.setText("");
						textPaneTicket.setText("Has pagado con tarjeta");
						opcion = comboBoxPlatoPrincipal.getSelectedIndex();
						switch (opcion) {
						case 0:
							precio1 = PRECIO_SOLOMILLO;
							
							textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
							break;
						case 1:
							precio1 = PRECIO_PAELLA;
							
							textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
							break;

						case 2:
							precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
						
							textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
							break;
						}

						opcion2 = comboBoxSegundoPlato.getSelectedIndex();
						switch (opcion2) {
						case 0:
							precio2 = PRECIO_HAMBURGUESA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
							break;
						case 1:
							precio2 = PRECIO_COSTILLAR;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
							break;

						case 2:
							precio2 = PRECIO_LASAÑA_CASERA;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
							break;
						}
						opcion3 = comboBoxPostre.getSelectedIndex();
						switch (opcion3) {
						case 0:
							precio3 = PRECIO_COULANT;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
							break;
						case 1:
							precio3 = PRECIO_TARTA_DE_QUESO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
							break;

						}
						opcion4 = comboBoxBebida.getSelectedIndex();
						switch (opcion4) {
						case 0:
							precio4 = PRECIO_AGUA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
							break;
						case 1:
							precio4 = PRECIO_CERVEZA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
							break;

						case 2:
							precio4 = PRECIO_COCA_COLA;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
							break;
						case 3:
							precio4 = PRECIO_AQUARIUS;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
							break;
						}
						opcion5 = comboBoxCafe.getSelectedIndex();
						if (chckbxCafé.isSelected()) {
							switch (opcion5) {
							case 0:
								precio5 = PRECIO_CAFE_CON_LECHE;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
								break;
							case 1:
								precio5 = PRECIO_CAFE_SOLO;
								
								textPaneTicket
										.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
								break;

							case 2:
								precio5 = PRECIO_DESCAFEINADO;
								
								textPaneTicket.setText(
										textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
								break;
							case 3:
								precio5 = PRECIO_CORTADO;
								
								textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
								break;
							}
						} 
						textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
						precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
					
					
					
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "Le ha atendido Elena Fernández Rivarola");
					}

				}else {
					opcion = comboBoxPlatoPrincipal.getSelectedIndex();
					switch (opcion) {
					case 0:
						precio1 = PRECIO_SOLOMILLO;
						
						textPaneTicket.setText( "\n" + "SOLOMILLO CON SALSA VERDE:" + PRECIO_SOLOMILLO);
						break;
					case 1:
						precio1 = PRECIO_PAELLA;
						
						textPaneTicket.setText( "\n" + "PAELLA:" + PRECIO_PAELLA);
						break;

					case 2:
						precio1 = PRECIO_MERLUZA_CON_REMOLACHA;
					
						textPaneTicket.setText( "\n" + "MERLUZA CON REMOLACHA:" + PRECIO_MERLUZA_CON_REMOLACHA);
						break;
					}

					opcion2 = comboBoxSegundoPlato.getSelectedIndex();
					switch (opcion2) {
					case 0:
						precio2 = PRECIO_HAMBURGUESA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "HAMBURGUESA:" + PRECIO_HAMBURGUESA);
						break;
					case 1:
						precio2 = PRECIO_COSTILLAR;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COSTILLAR:" + PRECIO_COSTILLAR);
						break;

					case 2:
						precio2 = PRECIO_LASAÑA_CASERA;
						
						textPaneTicket
								.setText(textPaneTicket.getText() + "\n" + "LASAÑA CASERA:" + PRECIO_LASAÑA_CASERA);
						break;
					}
					opcion3 = comboBoxPostre.getSelectedIndex();
					switch (opcion3) {
					case 0:
						precio3 = PRECIO_COULANT;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "COULANT DE CHOCOLATE:" + PRECIO_COULANT);
						break;
					case 1:
						precio3 = PRECIO_TARTA_DE_QUESO;
						
						textPaneTicket.setText(
								textPaneTicket.getText() + "\n" + "TARTA DE QUESO:" + PRECIO_TARTA_DE_QUESO);
						break;

					}
					opcion4 = comboBoxBebida.getSelectedIndex();
					switch (opcion4) {
					case 0:
						precio4 = PRECIO_AGUA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AGUA:" + PRECIO_AGUA);
						break;
					case 1:
						precio4 = PRECIO_CERVEZA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CERVEZA:" + PRECIO_CERVEZA);
						break;

					case 2:
						precio4 = PRECIO_COCA_COLA;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "COCA COLA:" + PRECIO_COCA_COLA);
						break;
					case 3:
						precio4 = PRECIO_AQUARIUS;
						
						textPaneTicket.setText(textPaneTicket.getText() + "\n" + "AQUARIUS:" + PRECIO_AQUARIUS);
						break;
					}
					opcion5 = comboBoxCafe.getSelectedIndex();
					if (chckbxCafé.isSelected()) {
						switch (opcion5) {
						case 0:
							precio5 = PRECIO_CAFE_CON_LECHE;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE CON LECHE:" + PRECIO_CAFE_CON_LECHE);
							break;
						case 1:
							precio5 = PRECIO_CAFE_SOLO;
							
							textPaneTicket
									.setText(textPaneTicket.getText() + "\n" + "CAFE SOLO:" + PRECIO_CAFE_SOLO);
							break;

						case 2:
							precio5 = PRECIO_DESCAFEINADO;
							
							textPaneTicket.setText(
									textPaneTicket.getText() + "\n" + "CAFE DESCAFEINADO:" + PRECIO_DESCAFEINADO);
							break;
						case 3:
							precio5 = PRECIO_CORTADO;
							
							textPaneTicket.setText(textPaneTicket.getText() + "\n" + "CORTADO:" + PRECIO_CORTADO);
							break;
						}
					} 
					textPaneTicket.setText(textPaneTicket.getText()+ "\n" +"Has pagado con tarjeta");
					precioFinal = precio1+ precio2 + precio3 +precio4 +precio5;
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "TOTAL:" + String.format("%.2f",precioFinal));
				
				
				
					textPaneTicket.setText(textPaneTicket.getText() + "\n" + "Le ha atendido Elena Fernández Rivarola");
				}
				
				
			}
		});
		mnCamarero.add(mntmCamarero3);
		
		JMenu mnCambiarFondo = new JMenu("Cambiar color fondo"); //Creacion menu Cambiar Fondo
		
		barra.add(mnCambiarFondo);
		
		JMenuItem mntmFondoVerde = new JMenuItem("Verde");
		mntmFondoVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenu.getContentPane().setBackground(Color.GREEN);
				rdbtnTarjeta.setBackground( Color.GREEN);
				rdbtnEfectivo.setBackground( Color.GREEN);
				chckbxCafé.setBackground( Color.GREEN);
			}
		});
		
		mnCambiarFondo.add(mntmFondoVerde);
		
		JMenuItem mntmNaranja = new JMenuItem("Naranja");
		mntmNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenu.getContentPane().setBackground(Color.ORANGE);
				rdbtnTarjeta.setBackground( Color.ORANGE);
				rdbtnEfectivo.setBackground( Color.ORANGE);
				chckbxCafé.setBackground( Color.ORANGE);
			}
		});
		mnCambiarFondo.add(mntmNaranja);
		
		JMenuItem mntmRosa = new JMenuItem("Rosa");
		mntmRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameMenu.getContentPane().setBackground(new Color(229, 197, 239));
				rdbtnTarjeta.setBackground( new Color(229, 197, 239));
				rdbtnEfectivo.setBackground( new Color(229, 197, 239));
				chckbxCafé.setBackground( new Color(229, 197, 239));
			}
		});
		mnCambiarFondo.add(mntmRosa);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameMenu.dispose();
			}
		});
		btnSalir.setMnemonic('S');
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frameMenu.dispose();
			}
		});
		barra.add(btnSalir);
		
		
		

	}
}
