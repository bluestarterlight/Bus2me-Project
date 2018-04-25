package api16042018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Button;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;

public class infobus extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel label_0;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	
	
	private JLabel lblOpcion;
	private JLabel lblOpcion_2;
	private JLabel lblDistancia;
	private JLabel lblHoraDeActualizacion;
	private JLabel lblSiguienteParada;
	
	//Dimension del vector
	public String vector_1[] = new String[7];
	private JLabel lblInfobus;
	

	/**
	 * Launch the application.
	 */
	
	public static void dame_info_buses() {
	//public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					infobus frame_1 = new infobus();
					frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public infobus() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1016, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Mostrar datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				ApiManager llamada = new ApiManager();

				// Muestro por pantalla el vector

				TimerTask timerTask = new TimerTask() {
					
					public void run() {
						System.out.println("Hola");

						vector_1 = ApiManager.dame_info_bus1();

						label_0.setText(vector_1[0]);
						label_1.setText(vector_1[1]);
						label_2.setText(vector_1[2]);
						label_3.setText(vector_1[3]);
						label_4.setText(vector_1[4]);
						
						vector_1 = ApiManager.dame_info_bus2();

						label_5.setText(vector_1[0]);
						label_6.setText(vector_1[1]);
						label_7.setText(vector_1[2]);
						label_8.setText(vector_1[3]);
						label_9.setText(vector_1[4]);
				
						vector_1 = ApiManager.dame_info_bus3();

						label_10.setText(vector_1[0]);
						label_11.setText(vector_1[1]);
						label_12.setText(vector_1[2]);
						label_13.setText(vector_1[3]);
						label_14.setText(vector_1[4]);
					
						vector_1 = ApiManager.dame_info_bus4();

						label_15.setText(vector_1[0]);
						label_16.setText(vector_1[1]);
						label_17.setText(vector_1[2]);
						label_18.setText(vector_1[3]);
						label_19.setText(vector_1[4]);
			
						vector_1 = ApiManager.dame_info_bus5();

						label_20.setText(vector_1[0]);
						label_21.setText(vector_1[1]);
						label_22.setText(vector_1[2]);
						label_23.setText(vector_1[3]);
						label_24.setText(vector_1[4]);

						vector_1 = ApiManager.dame_info_bus6();

						label_25.setText(vector_1[0]);
						label_26.setText(vector_1[1]);
						label_27.setText(vector_1[2]);
						label_28.setText(vector_1[3]);
						label_29.setText(vector_1[4]);

						vector_1 = ApiManager.dame_info_bus7();

						label_30.setText(vector_1[0]);
						label_31.setText(vector_1[1]);
						label_32.setText(vector_1[2]);
						label_3.setText(vector_1[3]);
						label_40.setText(vector_1[4]);

					}
				};

				// Aquí se pone en marcha el timer cada segundo.
				Timer timer = new Timer();
				// Dentro de 0 milisegundos avísame cada 1000 milisegundos
				timer.scheduleAtFixedRate(timerTask, 0, 1000);
			}
		});

		btnNewButton.setBounds(196, 459, 124, 23);
		contentPane.add(btnNewButton);

		label_0 = new JLabel("");
		label_0.setBounds(54, 99, 51, 23);
		contentPane.add(label_0);
		
		lblOpcion = new JLabel("id Linea");
		lblOpcion.setBounds(63, 74, 89, 14);
		contentPane.add(lblOpcion);

		lblOpcion_2 = new JLabel("id Autobus");
		lblOpcion_2.setBounds(117, 74, 89, 14);
		contentPane.add(lblOpcion_2);
		
		lblHoraDeActualizacion = new JLabel("Hora de actualizacion");
		lblHoraDeActualizacion.setBounds(379, 74, 150, 14);
		contentPane.add(lblHoraDeActualizacion);
		
		lblDistancia = new JLabel("Distancia");
		lblDistancia.setBounds(302, 74, 89, 14);
		contentPane.add(lblDistancia);
		
		lblSiguienteParada = new JLabel("Siguiente Parada");
		lblSiguienteParada.setBounds(191, 74, 89, 14);
		contentPane.add(lblSiguienteParada);
		
		lblInfobus = new JLabel("INFOBUS");
		lblInfobus.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblInfobus.setBounds(196, 11, 124, 40);
		contentPane.add(lblInfobus);
		
		label_1 = new JLabel("");
		label_1.setBounds(115, 99, 51, 23);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setBounds(201, 99, 51, 23);
		contentPane.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setBounds(296, 99, 51, 23);
		contentPane.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setBounds(389, 99, 51, 23);
		contentPane.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setBounds(54, 129, 51, 23);
		contentPane.add(label_5);
		
		label_6 = new JLabel("");
		label_6.setBounds(125, 129, 51, 23);
		contentPane.add(label_6);
		
		label_7 = new JLabel("");
		label_7.setBounds(201, 133, 51, 23);
		contentPane.add(label_7);
		
		label_8 = new JLabel("");
		label_8.setBounds(302, 133, 51, 23);
		contentPane.add(label_8);
		
		label_9 = new JLabel("");
		label_9.setBounds(389, 129, 51, 23);
		contentPane.add(label_9);
		
		label_10 = new JLabel("");
		label_10.setBounds(72, 177, 51, 23);
		contentPane.add(label_10);
		
		label_11 = new JLabel("");
		label_11.setBounds(135, 177, 51, 23);
		contentPane.add(label_11);
		
		label_12 = new JLabel("");
		label_12.setBounds(211, 177, 51, 23);
		contentPane.add(label_12);
		
		label_13 = new JLabel("");
		label_13.setBounds(296, 177, 51, 23);
		contentPane.add(label_13);
		
		label_14 = new JLabel("");
		label_14.setBounds(389, 177, 51, 23);
		contentPane.add(label_14);
		
		label_15 = new JLabel("");
		label_15.setBounds(54, 231, 51, 23);
		contentPane.add(label_15);
		
		label_16 = new JLabel("");
		label_16.setBounds(125, 231, 51, 23);
		contentPane.add(label_16);
		
		label_17 = new JLabel("");
		label_17.setBounds(201, 231, 51, 23);
		contentPane.add(label_17);
		
		label_18 = new JLabel("");
		label_18.setBounds(302, 231, 51, 23);
		contentPane.add(label_18);
		
		label_19 = new JLabel("");
		label_19.setBounds(410, 231, 51, 23);
		contentPane.add(label_19);
		
		label_20 = new JLabel("");
		label_20.setBounds(54, 265, 51, 23);
		contentPane.add(label_20);
		
		label_21 = new JLabel("");
		label_21.setBounds(115, 265, 51, 23);
		contentPane.add(label_21);
		
		label_22 = new JLabel("");
		label_22.setBounds(211, 265, 51, 23);
		contentPane.add(label_22);
		
		label_23 = new JLabel("");
		label_23.setBounds(302, 265, 51, 23);
		contentPane.add(label_23);
		
		label_24 = new JLabel("");
		label_24.setBounds(420, 265, 51, 23);
		contentPane.add(label_24);
		
		label_25 = new JLabel("");
		label_25.setBounds(63, 304, 51, 23);
		contentPane.add(label_25);
		
		label_26 = new JLabel("");
		label_26.setBounds(125, 299, 51, 23);
		contentPane.add(label_26);
		
		label_27 = new JLabel("");
		label_27.setBounds(201, 299, 51, 23);
		contentPane.add(label_27);
		
		label_28 = new JLabel("");
		label_28.setBounds(296, 299, 51, 23);
		contentPane.add(label_28);
		
		label_29 = new JLabel("");
		label_29.setBounds(430, 304, 51, 23);
		contentPane.add(label_29);
		
		label_30 = new JLabel("");
		label_30.setBounds(54, 338, 51, 23);
		contentPane.add(label_30);
		
		label_31 = new JLabel("");
		label_31.setBounds(120, 333, 51, 23);
		contentPane.add(label_31);
		
		label_32 = new JLabel("");
		label_32.setBounds(229, 333, 51, 23);
		contentPane.add(label_32);
		
		label_33 = new JLabel("");
		label_33.setBounds(296, 333, 51, 23);
		contentPane.add(label_33);
		
		label_34 = new JLabel("");
		label_34.setBounds(410, 333, 51, 23);
		contentPane.add(label_34);
		
		label_35 = new JLabel("");
		label_35.setBounds(54, 395, 51, 23);
		contentPane.add(label_35);
		
		label_36 = new JLabel("");
		label_36.setBounds(125, 395, 51, 23);
		contentPane.add(label_36);
		
		label_37 = new JLabel("");
		label_37.setBounds(229, 395, 51, 23);
		contentPane.add(label_37);
		
		label_38 = new JLabel("");
		label_38.setBounds(340, 395, 51, 23);
		contentPane.add(label_38);
		
		label_39 = new JLabel("");
		label_39.setBounds(449, 395, 51, 23);
		contentPane.add(label_39);
		
		label_40 = new JLabel("");
		label_40.setBounds(478, 395, 51, 23);
		contentPane.add(label_40);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				Api_Info v = new Api_Info ();
				dispose();
				v.setVisible(true);
				
			}
		});
		btnVolver.setBounds(450, 448, 89, 23);
		contentPane.add(btnVolver);
		
	
		
		
		
		
		
	
		
		

	}
}
