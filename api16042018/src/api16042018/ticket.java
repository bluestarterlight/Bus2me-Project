package api16042018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class ticket extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { ticket frame = new ticket();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public ticket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setForeground(new Color(165, 42, 42));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				
				
				justificantecompra v = new justificantecompra();
				dispose();
				v.setVisible(true);

			}
		});
		btnComprar.setBounds(466, 198, 132, 52);
		contentPane.add(btnComprar);

		JButton btnNewButton = new JButton("MENU");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				menu v = new menu();
				dispose();
				v.setVisible(true);

			}
		});
		btnNewButton.setBounds(466, 135, 132, 52);
		contentPane.add(btnNewButton);

		JLabel lblNumeroDeTickets = new JLabel("Viajes:");
		lblNumeroDeTickets.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumeroDeTickets.setForeground(new Color(255, 255, 255));
		lblNumeroDeTickets.setBounds(33, 102, 54, 19);
		contentPane.add(lblNumeroDeTickets);
		
		textField = new JTextField();
		textField.setBounds(363, 98, 72, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(92, 97, 61, 24);
		contentPane.add(comboBox);
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		
		double numero=Double.parseDouble((String) comboBox.getSelectedItem());
		double total = numero * 1.5;
		textField.setText(String.valueOf(total));
		
		//int numero = (int) comboBox.getSelectedItem();
		//int total = numero * 2;
		//textField.setText(Integer.toString(total));
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrecio.setForeground(new Color(255, 255, 255));
		lblPrecio.setBounds(185, 104, 61, 14);
		contentPane.add(lblPrecio);

		JLabel lblEuro = new JLabel("1 euro");
		lblEuro.setBounds(239, 106, 54, 14);
		contentPane.add(lblEuro);

		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setForeground(new Color(255, 255, 255));
		lblTotal.setBounds(303, 104, 67, 14);
		contentPane.add(lblTotal);

		JLabel lblNewLabel = new JLabel("BUS2ME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setIcon(
		new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\resized_80x80\\bus-logo.png"));
		lblNewLabel.setBounds(456, 11, 148, 80);
		contentPane.add(lblNewLabel);
		
		JButton btnCompraDeBilletes = new JButton("COMPRA DE BILLETES");
		btnCompraDeBilletes.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCompraDeBilletes.setBounds(29, 40, 406, 25);
		contentPane.add(btnCompraDeBilletes);
	}
}
