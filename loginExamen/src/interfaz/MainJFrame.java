/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import business.Person;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author ankit
 */
public class MainJFrame extends javax.swing.JFrame {
	
	public static List<Person> listaPerfiles = new ArrayList<>();
	public static int contador = 0;
    /**
     * Creates new form MainJFrame
     */
    
    Person person;
 
    public MainJFrame() {
        initComponents();
        person= new Person();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        createPerson = new javax.swing.JButton();
        viewPerson = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createPerson.setText("Crear Perfil");
        createPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonActionPerformed(evt);
            }
        });

        viewPerson.setText("Mostrar Perfil");
        viewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonActionPerformed(evt);
            }
        });
        
        btnCargarPerfil = new JButton();
        btnCargarPerfil.setText("Cargar Perfil");
        btnCargarPerfil.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FileReader lectura;
			
        		try {
					lectura = new FileReader("login.txt");
					BufferedReader br = new BufferedReader(lectura);
					Scanner s = new Scanner(br);
					
				while(s.hasNext()) {
					

						 person.setName(s.next()); 
						 person.setGeographic_data(s.next());
						 
						 person.setFechaNacimiento(s.next()); 
						 person.setPhone(s.next());
						 person.setDepartamento(s.next());
						 
						 person.setEmail(s.next()); 
						 person.setSsn(s.next());
						 person.setFechaIncorporacion(s.next()); 
						 person.setBankAccNum(s.next());
						 
						 person.setImageTxt(s.next()); 
						 person.setCódigo(s.nextInt());
						 person.setCódigo(s.nextInt());
						 
					
    	        		
					
				}br.close();
				
				} catch (IOException error) {
					
			
			}catch(InputMismatchException error2) {
				
				JOptionPane.showMessageDialog(null, "No hay ningún perfil ");
				
			}
				
        	}
        });
      
        
        JButton btnGuardar = new JButton("Guardar Perfil");
        btnGuardar.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent arg0) {
        		
        		try{
        			if(person.getName().isEmpty() || person.getGeographic_data().isEmpty() || person.getFechaIncorporacion().isEmpty() ||
        		
        				person.getBankAccNum().isEmpty() || person.getDepartamento().isEmpty() || person.getEmail().isEmpty() ||
        				person.getFechaNacimiento().isEmpty() || person.getPhone().isEmpty() || person.getImagetxt().isEmpty() || person.getSsn().isEmpty()) {
        				
        			}else {
        	        		
        	        		FileWriter escribir;

        	        		try {
        	        			escribir = new FileWriter("login.txt",true);
        	        			BufferedWriter bw = new BufferedWriter(escribir);
        	        			PrintWriter pw = new PrintWriter(bw);

        	        			pw.println(person.getName() + "\n"  + person.getGeographic_data() + "\n"  + 
        	        			person.getFechaNacimiento()	+"\n " + person.getPhone() + "\n" + person.getDepartamento() + "\n" +
        	        			person.getEmail() + "\n" + person.getSsn() + "\n" +
        	        			person.getFechaIncorporacion() + "\n"  + person.getBankAccNum()+ "\n" +
        	        			person.getImagetxt()+ "\n" + person.getCódigo()); // Para imprimir en el fichero
        	        			pw.close();
        	        			JOptionPane.showMessageDialog(null, "Perfil guardado correctamente");
        	        		} catch (IOException error) {
        	        			
        	        		}
        	
        		}
        			
        		}catch(NullPointerException error) {
        		
        			JOptionPane.showMessageDialog(null, "No hay ningún perfil creado");
        		}
        	}
        });
        
        JButton btnAnterior = new JButton("Anterior");
        btnAnterior.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		contador--;
        		 try {
        		        DisplayJPanel viewJPanel= new DisplayJPanel(listaPerfiles.get(contador));
        		        jSplitPane1.setRightComponent(viewJPanel);
        		 }catch(IndexOutOfBoundsException error) {
        		    	JOptionPane.showMessageDialog(null, "No hay más perfiles");
        		    	contador++;
        		    	
        		 }
        		
        	}
        });
        
        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		contador++;
        		try {
        			DisplayJPanel viewJPanel= new DisplayJPanel(listaPerfiles.get(contador));
        		
 		        jSplitPane1.setRightComponent(viewJPanel);
        		}catch(IndexOutOfBoundsException error) {
 		    	JOptionPane.showMessageDialog(null, "No hay más perfiles");
 		    	contador--;
 		    	
        		}
        	}
        });
        

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanelLayout.setHorizontalGroup(
        	controlJPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(controlJPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(controlJPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(createPerson)
        				.addComponent(viewPerson, Alignment.TRAILING)
        				.addComponent(btnCargarPerfil, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnAnterior, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnSiguiente, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlJPanelLayout.setVerticalGroup(
        	controlJPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(controlJPanelLayout.createSequentialGroup()
        			.addGap(80)
        			.addComponent(createPerson)
        			.addGap(38)
        			.addComponent(viewPerson)
        			.addGap(35)
        			.addComponent(btnCargarPerfil)
        			.addGap(32)
        			.addComponent(btnGuardar)
        			.addGap(37)
        			.addComponent(btnAnterior)
        			.addGap(31)
        			.addComponent(btnSiguiente)
        			.addContainerGap(79, Short.MAX_VALUE))
        );
        controlJPanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {createPerson, viewPerson, btnCargarPerfil, btnGuardar, btnAnterior, btnSiguiente});
        controlJPanelLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {createPerson, viewPerson, btnCargarPerfil, btnGuardar, btnAnterior, btnSiguiente});
        controlJPanel.setLayout(controlJPanelLayout);

        jSplitPane1.setLeftComponent(controlJPanel);

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanelLayout.setHorizontalGroup(
        	displayJPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 1210, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
        	displayJPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 470, Short.MAX_VALUE)
        );
        displayJPanel.setLayout(displayJPanelLayout);

        jSplitPane1.setRightComponent(displayJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonActionPerformed
        // TODO add your handling code here:
    	
    	
        CreateJPanel createJPanel= new CreateJPanel(person);
        jSplitPane1.setRightComponent(createJPanel);
        
        
    }//GEN-LAST:event_createPersonActionPerformed

 
    //GEN-LAST:event_viewPersonActionPerformed
    
    private void viewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonActionPerformed
        // TODO add your handling code here:
    try {
        DisplayJPanel viewJPanel= new DisplayJPanel(person);
        jSplitPane1.setRightComponent(viewJPanel);
    }catch(NullPointerException error1) {
    	JOptionPane.showMessageDialog(null, "No hay ningún perfil creado");
    	
    }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JButton createPerson;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private JButton btnCargarPerfil;
    private JButton viewPerson;
    private JLabel lblErrorcargarPerfil;
}