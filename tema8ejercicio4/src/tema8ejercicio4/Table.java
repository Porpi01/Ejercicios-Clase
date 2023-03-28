package tema8ejercicio4;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table window = new Table();
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
	public Table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 395, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		table = new JTable();
		table.setBounds(118, 123, 134, 32);
		frame.getContentPane().add(table);

		JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(98, 61, 186, 117);
	    frame.getContentPane().add(scrollPane);

	    DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("ID");
	    model.addColumn("Nombre");
	    model.addColumn("Edad");

	    try {
	        Connection con = ConnectionSingleton.getConnection();
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM persona");
	        while (rs.next()) {
	            Object[] row = new Object[3];
	            row[0] = rs.getInt("id");
	            row[1] = rs.getString("nombre");
	            row[2] = rs.getInt("edad");
	            model.addRow(row);
	        }

	        table.setModel(model);
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
