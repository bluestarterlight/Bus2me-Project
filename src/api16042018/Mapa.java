package api16042018;
import java.awt.BorderLayout;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.teamdev.jxmaps.swing.MapView;

import com.teamdev.jxmaps.*;

/**

 * La clase Mapa vine con la extension MAPView de la libreria jxmaps la cual hace que aparezca un mapa en ventana

 * @author: Eugeni
 * 
 */

public class Mapa extends MapView{
	
/**
 * The map object
 */
	private static Map map;
	
	public Mapa() {
		// TODO Auto-generated constructor stub
		final Mapa example = new Mapa("test");
		example.generateMarker(map.getCenter());
	}

	//Icono de marca
	public Marker generateMarker(LatLng pos){
		Marker marker=null;
	
			
			marker = new Marker(map);
			marker.setPosition(pos);
			map.setCenter(pos);
	
		System.out.println("Graficado marker");
		return marker;
	}

	

	/**
	 * Create a new Map panel whit the param Name
	 * @param pString Name for the map
	 */
	public Mapa(String pString) {

		JFrame frame = new JFrame("Situacion del autobus: "+pString);


		// Setting of a ready handler to MapView object. onMapReady will be called when map initialization is done and
		// the map object is ready to use. Current implementation of onMapReady customizes the map object.
		
		setOnMapReadyHandler(new MapReadyHandler() {
			@Override
			public void onMapReady(MapStatus status) {
				
				// Check if the map is loaded correctly
				if (status == MapStatus.MAP_STATUS_OK) {
					
					
					// Getting the associated map object
					map = getMap();
					MapOptions mapOptions = new MapOptions();
					MapTypeControlOptions controlOptions = new MapTypeControlOptions();
					controlOptions.setPosition(ControlPosition.BOTTOM_LEFT);
					mapOptions.setMapTypeControlOptions(controlOptions);
					
					map.setOptions(mapOptions);
					System.out.println(Autobus.getUtmx());
					map.setCenter(new LatLng(43.539893,-5.672003));
					map.setZoom(17);
					

				}
			}
		});
		System.out.print("Espere mientras se genera el mapa ");
		try {
			for(int i=0;i<10;i++)
			{
				TimeUnit.SECONDS.sleep(1);
				System.out.print(".");
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("|");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(this, BorderLayout.CENTER);
		frame.setSize(700, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
