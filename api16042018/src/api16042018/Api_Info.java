package api16042018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Api_Info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					
					Api_Info v = new Api_Info();
					v.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Api_Info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInfoBus = new JButton("Info Bus");
		btnInfoBus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				infobus v = new infobus();
				dispose();
				v.setVisible(true);
				
			}
		});
		btnInfoBus.setBounds(92, 122, 89, 23);
		contentPane.add(btnInfoBus);
		
		JButton btnGeoBus = new JButton("Geo Bus");
		btnGeoBus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Geobus v = new Geobus();
				dispose();
				v.setVisible(true);
				
			}
		});
		btnGeoBus.setBounds(257, 122, 89, 23);
		contentPane.add(btnGeoBus);
	}

}
