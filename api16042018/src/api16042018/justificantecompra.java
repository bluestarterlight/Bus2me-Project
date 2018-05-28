package api16042018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class justificantecompra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					justificantecompra frame = new justificantecompra();
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
	public justificantecompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUstedHaRealizado = new JLabel("Usted ha realizado la compra de su billete correctamente");
		lblUstedHaRealizado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUstedHaRealizado.setBounds(10, 130, 414, 14);
		contentPane.add(lblUstedHaRealizado);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				menu v = new menu();
				dispose();
				v.setVisible(true);
				
			}
		});
		btnAceptar.setBounds(170, 177, 89, 23);
		contentPane.add(btnAceptar);
	}

}
