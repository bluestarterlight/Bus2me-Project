package api16042018;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JProgressBar;


/**

 * La clase panel info actualiza los datos de cad auno de los autobuses en un panel mediante jlabels y un timer de actualizacion automatico al json.

 * @author: Eugeni
 * 
 */

public class panel_info extends JFrame {

	private JPanel contentPane;
	public static JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblActualizando_1;
	public static JLabel lblIdParada;
	public static JLabel lblIdDistancia;
	public static JLabel label_1;
	public static JLabel lblNewLabel_5;
	public static JLabel lblNewLabel_8;
	public static JLabel lblNewLabel_11;
	public static JLabel lblNewLabel_12;
	public static JLabel lblNewLabel_13;
	public static JLabel lblNewLabel_14;
	public static JLabel lblNewLabel_15;
	public static JLabel lblNewLabel_18;
	public static JLabel lblNewLabel_19;
	public static JLabel lblNewLabel_20;
	public static JLabel lblNewLabel_23;
	public static JLabel lblNewLabel_24;
	public static JLabel lblNewLabel_25;
	public static JLabel lblNewLabel_26;
	public static JLabel lblNewLabel_29;
	public static JLabel lblNewLabel_30;
	public static JLabel lblNewLabel_31;
	public static JLabel lblNewLabel_32;
	public static JLabel lblNewLabel_6;
	public static JLabel lblNewLabel_7;
	public static JLabel lblNewLabel_9;
	public static JLabel lblNewLabel_10;
	public static JLabel lblPanelInformativoAutobuses;
	private JLabel lblParada;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JButton btnGeolocalizar;


	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */

	// Clase en la que está el código a ejecutar

	public panel_info() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("Actualizando...");
		lblNewLabel.setBounds(62, 100, 118, 14);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Actualizando...");
		lblNewLabel_1.setBounds(190, 100, 98, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("AUTOBUS");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(50, 69, 89, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("ACTUALIZACION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(157, 69, 104, 14);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Actualizando...");
		lblNewLabel_4.setBounds(320, 100, 78, 14);
		contentPane.add(lblNewLabel_4);

		lblActualizando_1 = new JLabel("Actualizando...");
		lblActualizando_1.setBounds(580, 100, 73, 14);
		contentPane.add(lblActualizando_1);

		lblIdParada = new JLabel("ULTIMA PARADA");
		lblIdParada.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdParada.setBounds(290, 69, 108, 14);
		contentPane.add(lblIdParada);

		lblIdDistancia = new JLabel("DISTANCIA");
		lblIdDistancia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdDistancia.setBounds(565, 69, 76, 14);
		contentPane.add(lblIdDistancia);

		lblNewLabel_5 = new JLabel("Actualizando...");
		lblNewLabel_5.setBounds(455, 100, 76, 14);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_8 = new JLabel("SIGUIENTE PARADA");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(410, 69, 136, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_12 = new JLabel("Actualizando...");
		lblNewLabel_12.setBounds(62, 135, 77, 14);
		contentPane.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("Actualizando...");
		lblNewLabel_13.setBounds(62, 170, 77, 14);
		contentPane.add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("Actualizando...");
		lblNewLabel_14.setBounds(62, 205, 77, 14);
		contentPane.add(lblNewLabel_14);

		lblNewLabel_15 = new JLabel("Actualizando...");
		lblNewLabel_15.setBounds(62, 240, 77, 14);
		contentPane.add(lblNewLabel_15);

		lblNewLabel_6 = new JLabel("Actualizando...");
		lblNewLabel_6.setBounds(190, 135, 71, 14);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Actualizando...");
		lblNewLabel_7.setBounds(190, 170, 86, 14);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_9 = new JLabel("Actualizando...");
		lblNewLabel_9.setBounds(190, 205, 76, 14);
		contentPane.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("Actualizando...");
		lblNewLabel_10.setBounds(192, 240, 75, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Actualizando...");
		lblNewLabel_11.setBounds(320, 135, 78, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_18 = new JLabel("Actualizando...");
		lblNewLabel_18.setBounds(320, 170, 78, 14);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Actualizando...");
		lblNewLabel_19.setBounds(320, 205, 78, 14);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("Actualizando...");
		lblNewLabel_20.setBounds(320, 240, 86, 14);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_23 = new JLabel("Actualizando...");
		lblNewLabel_23.setBounds(580, 135, 73, 14);
		contentPane.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("Actualizando...");
		lblNewLabel_24.setBounds(580, 170, 73, 14);
		contentPane.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("Actualizando...");
		lblNewLabel_25.setBounds(580, 205, 73, 14);
		contentPane.add(lblNewLabel_25);
		
		lblNewLabel_26 = new JLabel("Actualizando...");
		lblNewLabel_26.setBounds(580, 240, 75, 14);
		contentPane.add(lblNewLabel_26);
		
		
		lblNewLabel_29 = new JLabel("Actualizando...");
		lblNewLabel_29.setBounds(455, 135, 76, 14);
		contentPane.add(lblNewLabel_29);
		
		lblNewLabel_30 = new JLabel("Actualizando...");
		lblNewLabel_30.setBounds(455, 170, 76, 14);
		contentPane.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("Actualizando...");
		lblNewLabel_31.setBounds(455, 205, 76, 14);
		contentPane.add(lblNewLabel_31);
		
		lblNewLabel_32 = new JLabel("Actualizando...");
		lblNewLabel_32.setBounds(455, 240, 76, 14);
		contentPane.add(lblNewLabel_32);
		
		lblPanelInformativoAutobuses = new JLabel("PANEL INFORMATIVO AUTOBUSES");
		lblPanelInformativoAutobuses.setForeground(new Color(255, 255, 0));
		lblPanelInformativoAutobuses.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPanelInformativoAutobuses.setBounds(166, 11, 383, 28);
		contentPane.add(lblPanelInformativoAutobuses);

		TimerTask timerTask = new TimerTask() {

			public void run() {

				ArrayList<Autobus> autobuses_1 = new ArrayList<>();
				System.out.println("hola");
				autobuses_1 = ApiManager.dame_info_buses(1);
				System.out.println("adios");

				for (int i = 0; i < autobuses_1.size(); i++) {


					if (i == 0) {

						Autobus a = autobuses_1.get(i);

						lblNewLabel.setText(a.getIdautobus());
						lblNewLabel_1.setText(a.getHora_de_actualizacion());
						lblNewLabel_4.setText(String.valueOf((a.idparada)));
						lblActualizando_1.setText(String.valueOf((a.distancia)));
						lblNewLabel_5.setText(String.valueOf((a.idsiguienteparada)));
						a.getUtmx();
						a.getUtmy();

					}

					else if (i == 1) {

						Autobus a = autobuses_1.get(i);

						lblNewLabel_12.setText(a.getIdautobus());
						lblNewLabel_6.setText(a.getHora_de_actualizacion());
						lblNewLabel_11.setText(String.valueOf((a.idparada)));
						lblNewLabel_23.setText(String.valueOf((a.distancia)));
						lblNewLabel_29.setText(String.valueOf((a.idsiguienteparada)));
						a.getUtmx();
						a.getUtmy();
					}

					else if (i == 2) {

						Autobus a = autobuses_1.get(i);

						lblNewLabel_13.setText(a.getIdautobus());
						lblNewLabel_7.setText(a.getHora_de_actualizacion());
						lblNewLabel_18.setText(String.valueOf((a.idparada)));
						lblNewLabel_24.setText(String.valueOf((a.distancia)));
						lblNewLabel_30.setText(String.valueOf((a.idsiguienteparada)));
						a.getUtmx();
						a.getUtmy();
					}

					else if (i == 3) {

						Autobus a = autobuses_1.get(i);

						lblNewLabel_14.setText(a.getIdautobus());
						lblNewLabel_9.setText(a.getHora_de_actualizacion());
						lblNewLabel_19.setText(String.valueOf((a.idparada)));
						lblNewLabel_25.setText(String.valueOf((a.distancia)));
						lblNewLabel_31.setText(String.valueOf((a.idsiguienteparada)));
						a.getUtmx();
						a.getUtmy();
					}

					else if (i == 4) {

						Autobus a = autobuses_1.get(i);

						lblNewLabel_15.setText(a.getIdautobus());
						lblNewLabel_10.setText(a.getHora_de_actualizacion());
						lblNewLabel_20.setText(String.valueOf((a.idparada)));
						lblNewLabel_26.setText(String.valueOf((a.distancia)));
						lblNewLabel_32.setText(String.valueOf((a.idsiguienteparada)));
						a.getUtmx();
						a.getUtmy();
					}

					/*else if (i == 5) {

						Autobus a = autobuses_1.get(i);

						lblNewLabel_16.setText(a.getIdautobus());
						label_3.setText(a.getHora_de_actualizacion());
						lblNewLabel_21.setText(String.valueOf((a.idparada)));
						lblNewLabel_27.setText(String.valueOf((a.distancia)));
						lblNewLabel_33.setText(String.valueOf((a.idsiguienteparada)));
						a.getUtmx();
						a.getUtmy();
					}

					else if (i == 6) {

						Autobus a = autobuses_1.get(i);

						lblNewLabel_17.setText(a.getIdautobus());
						lblNewLabel_35.setText(a.getHora_de_actualizacion());
						lblNewLabel_22.setText(String.valueOf((a.idparada)));
						lblNewLabel_28.setText(String.valueOf((a.distancia)));
						lblNewLabel_34.setText(String.valueOf((a.idsiguienteparada)));

					}
					*/

				}

			}
		};

		// Aquí se pone en marcha el timer cada segundo.
		Timer timer = new Timer();
		// Dentro de 0 milisegundos avísame cada 1000 milisegundos
		timer.scheduleAtFixedRate(timerTask, 0, 20000);

		// Boton Volver...................................
		JButton btnVolver = new JButton("Volver");

		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				menu v = new menu();
				dispose();
				v.setVisible(true);

			}
		});

		btnVolver.setBounds(514, 284, 149, 42);
		contentPane.add(btnVolver);
		
		lblParada = new JLabel("PARADA 34");
		lblParada.setForeground(new Color(255, 255, 255));
		lblParada.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblParada.setBounds(290, 38, 106, 14);
		contentPane.add(lblParada);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\TIRA BLANCA2.JPG"));
		label_4.setBounds(23, 236, 640, 22);
		contentPane.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\TIRA BLANCA2.JPG"));
		label_5.setBounds(23, 202, 640, 22);
		contentPane.add(label_5);
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\TIRA BLANCA2.JPG"));
		label_6.setBounds(23, 166, 640, 22);
		contentPane.add(label_6);
		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\TIRA BLANCA2.JPG"));
		label_7.setBounds(23, 131, 640, 22);
		contentPane.add(label_7);
		
		label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\TIRA BLANCA2.JPG"));
		label_8.setBounds(23, 97, 640, 22);
		contentPane.add(label_8);
		
		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\lenovopcc\\Documents\\PROYECTO DAW\\IMAGEN\\TIRA BLANCA2.JPG"));
		label_9.setBounds(23, 58, 640, 28);
		contentPane.add(label_9);
		
		
		
		btnGeolocalizar = new JButton("GEOLOCALIZA TU BUS");
		btnGeolocalizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeolocalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Mapa a = new Mapa();
				dispose();
				a.setVisible(true);
				
			}
		});
		btnGeolocalizar.setBounds(23, 283, 211, 42);
		contentPane.add(btnGeolocalizar);
		

	}
}
