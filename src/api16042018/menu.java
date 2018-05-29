package api16042018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 * CONSTRUCTOR...............
	 */	public menu() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("TICKET VIAJE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ticket v = new ticket();
				dispose();
				v.setVisible(true);

			}
		});
		btnNewButton.setBounds(42, 164, 167, 51);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("ABONADOS");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Abonados a = new Abonados();
				dispose();
				a.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(42, 226, 167, 51);
		contentPane.add(btnNewButton_1);

		JButton btnInfobus = new JButton("INFOBUS");
		btnInfobus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInfobus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnInfobus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				panel_info a = new panel_info();
				dispose();
				a.setVisible(true);

			}
		});
		btnInfobus.setBounds(42, 102, 167, 51);
		contentPane.add(btnInfobus);
	

		//Metodo ImageIcon() de la libreria java.awt.Image; javax.swing.Icon; javax.swing.ImageIcon;
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("../Graficos/FONDO.png"));
	    
	    JButton btnNewButton_2 = new JButton("INICIO");
	    btnNewButton_2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		
	    		Bienvenida a = new Bienvenida();
				dispose();
				a.setVisible(true);
	    	}
	    });
	    btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    btnNewButton_2.setBounds(42, 288, 167, 51);
	    contentPane.add(btnNewButton_2);
	    
	    JLabel lblNewLabel = new JLabel("BUS2ME");
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
	    lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\resized_80x80\\bus-logo.png"));
	    lblNewLabel.setBounds(42, 11, 167, 80);
	    contentPane.add(lblNewLabel);
	    
	    JButton btnPanelPrincipal = new JButton("PANEL PRINCIPAL");
	    btnPanelPrincipal.setFont(new Font("Tahoma", Font.BOLD, 12));
	    btnPanelPrincipal.setBounds(216, 42, 361, 23);
	    contentPane.add(btnPanelPrincipal);
	    
	    JLabel lblNewLabel_1 = new JLabel("");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\FONDO.png"));
	    lblNewLabel_1.setBounds(0, 0, 633, 387);
	    contentPane.add(lblNewLabel_1);
		
	}
}
