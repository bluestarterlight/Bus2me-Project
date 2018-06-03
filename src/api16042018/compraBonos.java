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


/**

 * La clase compraBonos es una idea a nivel frame de como el usuario puede comprar el ticket

 * @author: Eugeni
 * 
 */


public class compraBonos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compraBonos frame = new compraBonos();
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
	public compraBonos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnComprar = new JButton("Comprar ");
		btnComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				justificantecompra v = new justificantecompra();
				dispose();
				v.setVisible(true);
				
				
			}
		});
		btnComprar.setBounds(231, 117, 120, 23);
		contentPane.add(btnComprar);
		
		JLabel lblNumeroDeBonos = new JLabel("Numero de Bonos");
		lblNumeroDeBonos.setBounds(32, 57, 96, 14);
		contentPane.add(lblNumeroDeBonos);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(162, 57, 46, 14);
		contentPane.add(lblPrecio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(124, 54, 28, 20);
		contentPane.add(comboBox);
		
		JButton btnVolver = new JButton("Cerrar sesion");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				menu v = new menu();
				dispose();
				v.setVisible(true);
			}
		});
		btnVolver.setBounds(231, 153, 120, 23);
		contentPane.add(btnVolver);
	}
}
