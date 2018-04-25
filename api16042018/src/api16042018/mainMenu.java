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
import javax.swing.SwingConstants;
import java.awt.Font;

public class mainMenu extends JFrame {

	private static Thread infobus;
	private static Thread abonados;
	private static Thread tickets;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				
				try {
					mainMenu frame = new mainMenu();
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
	public mainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ticket viaje");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ticket v = new ticket();
				dispose();
				v.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(0, 96, 142, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Abonados");
		btnNewButton_1.setBounds(140, 94, 156, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnInfobus = new JButton("Infobus");
		btnInfobus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Api_Info v = new Api_Info();
				dispose();
				v.setVisible(true);
				
			}
		});
		btnInfobus.setBounds(292, 93, 142, 60);
		contentPane.add(btnInfobus);
		
		JLabel lblNewLabel = new JLabel("Bus4me");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 54);
		contentPane.add(lblNewLabel);
	}
}

