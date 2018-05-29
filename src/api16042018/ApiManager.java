package api16042018;

import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

import org.json.*;

public class ApiManager   {
	
	static String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
	
	/**
	 * <h2>Metodo dame_info_buses obtiene la informacion parametrizada cuando la idlinea es igual a linea<h2>
	 * @param linea
	 * @return autobuses;
	 */

	public static ArrayList<Autobus> dame_info_buses(int linea) {

		String respuesta = clienteRest.request(api);
		
		ArrayList<Autobus> autobuses = new ArrayList<>();

		try {

			// Accedemos al vector de buses
			JSONObject obj = new JSONObject(respuesta);
			JSONObject posiciones = obj.getJSONObject("posiciones");
			JSONArray posicion = posiciones.getJSONArray("posicion");

			// Recorremos buses buscando los de la linea indicada
			for (int i = 0; i < posicion.length(); i++) {
				
				JSONObject num_posicion = posicion.getJSONObject(i);
				
				int idlinea = num_posicion.getInt("idlinea");

				if (idlinea == linea) {

					Autobus obj_Autobus = new Autobus();
					
					
					obj_Autobus.setIdlinea(num_posicion.getInt("idlinea"));
					obj_Autobus.setIdtrayecto(num_posicion.getInt("idtrayecto"));
					obj_Autobus.setIdautobus(num_posicion.getString("idautobus"));
					obj_Autobus.setUtmx(num_posicion.getInt("utmx"));
					obj_Autobus.setUtmy(num_posicion.getInt("utmy"));
					obj_Autobus.setHora_de_actualizacion(num_posicion.getString("horaactualizacion"));
					obj_Autobus.setIdparada(num_posicion.getInt("idparada"));
					obj_Autobus.setMinutos(num_posicion.getInt("minutos"));
					obj_Autobus.setDistancia(num_posicion.getDouble("distancia"));
					obj_Autobus.setMatricula(num_posicion.getString("matricula"));
					obj_Autobus.setIdsiguienteparada(num_posicion.getInt("idsiguienteparada"));
					obj_Autobus.setOrdenparada(num_posicion.getInt("ordenparada"));
					
					
					autobuses.add(obj_Autobus);
				}

			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//autobuses.get(i);
		
		return autobuses;
	}
}