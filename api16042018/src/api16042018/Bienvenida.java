package api16042018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bienvenida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\esperes2.JPG"));
		lblNewLabel_1.setBounds(114, 51, 310, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("BUS2ME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\resized_80x80\\bus-logo.png"));
		lblNewLabel.setBounds(35, 0, 165, 92);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INICIAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				menu a = new menu();
				dispose();
				a.setVisible(true);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(434, 35, 144, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SALIR");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(434, 105, 144, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\inicio bus.jpg"));
		lblNewLabel_2.setBounds(0, 0, 623, 372);
		contentPane.add(lblNewLabel_2);
	}
}
