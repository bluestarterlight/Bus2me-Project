package api16042018;

import org.json.*;

public class ApiManager {
	
	//public static void main(String[] args) {
		
	public static String[] dame_info_bus1() {
		
		int idlinea = 0;
		int idtrayecto = 0;
		String idautobus = "";
		int utmx = 0; 
		int utmy = 0;
		String hora_de_actualizacion= "";
		int idparada = 0;
		int ordenparada = 0;
		int idsiguienteparada =0;
		
		//Aqui definimos la dimension del vector.
		String vector_1[]= new String [10];
		double distancia=0;
		
		
		// TODO Auto-generated method stub
		
		String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
		
		String respuesta= clienteRest.request(api);	
		
		//System.out.println(respuesta);
		
		try {
			
			JSONObject obj = new JSONObject(respuesta);
			
			JSONObject posiciones = obj.getJSONObject("posiciones");
		
			JSONArray posicion = posiciones.getJSONArray("posicion");
			
			for (int i = 0; i < 1; i++)
			
			{
			    JSONObject num_posicion =posicion.getJSONObject(i);
			   
			    
			   idlinea = num_posicion.getInt("idlinea");
			   idtrayecto = num_posicion.getInt("idtrayecto");
			   idautobus = num_posicion.getString("idautobus");
			   utmx = num_posicion.getInt("utmx");
			   utmx = 
			   utmy = num_posicion.getInt("utmy");
			   hora_de_actualizacion= num_posicion.getString("horaactualizacion");
			   distancia= num_posicion.getDouble("distancia");
			   idparada = num_posicion.getInt("idparada");
			   ordenparada = num_posicion.getInt("ordenparada");
			   idsiguienteparada = num_posicion.getInt("idsiguienteparada");
			   
			   //pasar todo a string porque lo mostraremos 
			   
			   String idlinea_1= Integer.toString(idlinea);
			   String idtrayecto_1= Integer.toString(idtrayecto);
			   String utmx_1= Integer.toString(utmx);
			   String utmy_1= Integer.toString(utmy);
			   String distancia_1= Double.toString(distancia);
			   String idparada_1= Double.toString(idparada);
			   String ordenparada_1= Double.toString(ordenparada);
			   String idsiguienteparada_1= Double.toString(idsiguienteparada);
			    
			   //añadimos cada campo en un vector ya que si lo pasamos todo al bulder tiene que ser con un solo string.
			   
			   vector_1[0]= idlinea_1;				   
			   vector_1[1]= idautobus;
			   vector_1[2]= idsiguienteparada_1;
			   vector_1[3]= distancia_1;
			   vector_1[4]= hora_de_actualizacion;
			   vector_1[5]= utmx_1;	
			   vector_1[6]= utmy_1;
			   vector_1[7]= idparada_1;
			   vector_1[8]= ordenparada_1;
			   vector_1[9]= idtrayecto_1;
			   
			   
			   
			   //para imprimir todos
			   
			    System.out.println("id linea:"+ idlinea);   
				System.out.println("id trayecto:"+idtrayecto);
				System.out.println("id autobus:"+idautobus);
				System.out.println("coordenadas utmx:"+utmx);
				System.out.println("coordenadas utmy:"+utmy);
				System.out.println("hora de actualización:"+hora_de_actualizacion);
				System.out.println("distancia:"+distancia);
				System.out.println("ordenparada:"+ordenparada);
				System.out.println("idparada ESTA ES LA PARADA:"+idparada);
				System.out.println("idsiguienteparada ESTA ES LA SIGUIENTE PARADA:"+idsiguienteparada);
				System.out.println("..........");
				
			}
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vector_1;		
}



	
public static String[] dame_info_bus2() {
	
	int idlinea = 0;
	int idtrayecto = 0;
	String idautobus = "";
	int utmx = 0; 
	int utmy = 0;
	String hora_de_actualizacion= "";
	int idparada = 0;
	int ordenparada = 0;
	int idsiguienteparada =0;
	
	//Aqui definimos la dimension del vector.
	String vector_1[]= new String [10];
	double distancia=0;
	
	
	// TODO Auto-generated method stub
	
	String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
	
	String respuesta= clienteRest.request(api);	
	
	//System.out.println(respuesta);
	
	try {
		
		JSONObject obj = new JSONObject(respuesta);
		
		JSONObject posiciones = obj.getJSONObject("posiciones");
	
		JSONArray posicion = posiciones.getJSONArray("posicion");
		
		for (int i = 1; i < 2; i++)
		
		{
		    JSONObject num_posicion =posicion.getJSONObject(i);
		   
		    
		   idlinea = num_posicion.getInt("idlinea");
		   idtrayecto = num_posicion.getInt("idtrayecto");
		   idautobus = num_posicion.getString("idautobus");
		   utmx = num_posicion.getInt("utmx");
		   utmx = 
		   utmy = num_posicion.getInt("utmy");
		   hora_de_actualizacion= num_posicion.getString("horaactualizacion");
		   distancia= num_posicion.getDouble("distancia");
		   idparada = num_posicion.getInt("idparada");
		   ordenparada = num_posicion.getInt("ordenparada");
		   idsiguienteparada = num_posicion.getInt("idsiguienteparada");
		   
		   //pasar todo a string porque lo mostraremos 
		   
		   String idlinea_1= Integer.toString(idlinea);
		   String idtrayecto_1= Integer.toString(idtrayecto);
		   String utmx_1= Integer.toString(utmx);
		   String utmy_1= Integer.toString(utmy);
		   String distancia_1= Double.toString(distancia);
		   String idparada_1= Double.toString(idparada);
		   String ordenparada_1= Double.toString(ordenparada);
		   String idsiguienteparada_1= Double.toString(idsiguienteparada);
		    
		   //añadimos cada campo en un vector ya que si lo pasamos todo al bulder tiene que ser con un solo string.
		   
		   vector_1[0]= idlinea_1;				   
		   vector_1[1]= idautobus;
		   vector_1[2]= idsiguienteparada_1;
		   vector_1[3]= distancia_1;
		   vector_1[4]= hora_de_actualizacion;
		   vector_1[5]= utmx_1;	
		   vector_1[6]= utmy_1;
		   vector_1[7]= idparada_1;
		   vector_1[8]= ordenparada_1;
		   vector_1[9]= idtrayecto_1;
		   
		   
		   
		   //para imprimir todos
		   
		    System.out.println("id linea:"+ idlinea);   
			System.out.println("id trayecto:"+idtrayecto);
			System.out.println("id autobus:"+idautobus);
			System.out.println("coordenadas utmx:"+utmx);
			System.out.println("coordenadas utmy:"+utmy);
			System.out.println("hora de actualización:"+hora_de_actualizacion);
			System.out.println("distancia:"+distancia);
			System.out.println("ordenparada:"+ordenparada);
			System.out.println("idparada ESTA ES LA PARADA:"+idparada);
			System.out.println("idsiguienteparada ESTA ES LA SIGUIENTE PARADA:"+idsiguienteparada);
			System.out.println("..........");
			
		}
		
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vector_1;		
}


public static String[] dame_info_bus3() {
	
	int idlinea = 0;
	int idtrayecto = 0;
	String idautobus = "";
	int utmx = 0; 
	int utmy = 0;
	String hora_de_actualizacion= "";
	int idparada = 0;
	int ordenparada = 0;
	int idsiguienteparada =0;
	
	//Aqui definimos la dimension del vector.
	String vector_1[]= new String [10];
	double distancia=0;
	
	
	// TODO Auto-generated method stub
	
	String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
	
	String respuesta= clienteRest.request(api);	
	
	//System.out.println(respuesta);
	
	try {
		
		JSONObject obj = new JSONObject(respuesta);
		
		JSONObject posiciones = obj.getJSONObject("posiciones");
	
		JSONArray posicion = posiciones.getJSONArray("posicion");
		
		for (int i = 2; i < 3; i++)
		
		{
		    JSONObject num_posicion =posicion.getJSONObject(i);
		   
		    
		   idlinea = num_posicion.getInt("idlinea");
		   idtrayecto = num_posicion.getInt("idtrayecto");
		   idautobus = num_posicion.getString("idautobus");
		   utmx = num_posicion.getInt("utmx");
		   utmx = 
		   utmy = num_posicion.getInt("utmy");
		   hora_de_actualizacion= num_posicion.getString("horaactualizacion");
		   distancia= num_posicion.getDouble("distancia");
		   idparada = num_posicion.getInt("idparada");
		   ordenparada = num_posicion.getInt("ordenparada");
		   idsiguienteparada = num_posicion.getInt("idsiguienteparada");
		   
		   //pasar todo a string porque lo mostraremos 
		   
		   String idlinea_1= Integer.toString(idlinea);
		   String idtrayecto_1= Integer.toString(idtrayecto);
		   String utmx_1= Integer.toString(utmx);
		   String utmy_1= Integer.toString(utmy);
		   String distancia_1= Double.toString(distancia);
		   String idparada_1= Double.toString(idparada);
		   String ordenparada_1= Double.toString(ordenparada);
		   String idsiguienteparada_1= Double.toString(idsiguienteparada);
		    
		   //añadimos cada campo en un vector ya que si lo pasamos todo al bulder tiene que ser con un solo string.
		   
		   vector_1[0]= idlinea_1;				   
		   vector_1[1]= idautobus;
		   vector_1[2]= idsiguienteparada_1;
		   vector_1[3]= distancia_1;
		   vector_1[4]= hora_de_actualizacion;
		   vector_1[5]= utmx_1;	
		   vector_1[6]= utmy_1;
		   vector_1[7]= idparada_1;
		   vector_1[8]= ordenparada_1;
		   vector_1[9]= idtrayecto_1;
		   
		   
		   //para imprimir todos
		   
		    System.out.println("id linea:"+ idlinea);   
			System.out.println("id trayecto:"+idtrayecto);
			System.out.println("id autobus:"+idautobus);
			System.out.println("coordenadas utmx:"+utmx);
			System.out.println("coordenadas utmy:"+utmy);
			System.out.println("hora de actualización:"+hora_de_actualizacion);
			System.out.println("distancia:"+distancia);
			System.out.println("ordenparada:"+ordenparada);
			System.out.println("idparada ESTA ES LA PARADA:"+idparada);
			System.out.println("idsiguienteparada ESTA ES LA SIGUIENTE PARADA:"+idsiguienteparada);
			System.out.println("..........");
			
		}
		
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vector_1;		
}


public static String[] dame_info_bus4() {
	
	int idlinea = 0;
	int idtrayecto = 0;
	String idautobus = "";
	int utmx = 0; 
	int utmy = 0;
	String hora_de_actualizacion= "";
	int idparada = 0;
	int ordenparada = 0;
	int idsiguienteparada =0;
	
	//Aqui definimos la dimension del vector.
	String vector_1[]= new String [10];
	double distancia=0;
	
	
	// TODO Auto-generated method stub
	
	String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
	
	String respuesta= clienteRest.request(api);	
	
	//System.out.println(respuesta);
	
	try {
		
		JSONObject obj = new JSONObject(respuesta);
		
		JSONObject posiciones = obj.getJSONObject("posiciones");
	
		JSONArray posicion = posiciones.getJSONArray("posicion");
		
		for (int i = 3; i < 4; i++)
		
		{
		    JSONObject num_posicion =posicion.getJSONObject(i);
		   
		    
		   idlinea = num_posicion.getInt("idlinea");
		   idtrayecto = num_posicion.getInt("idtrayecto");
		   idautobus = num_posicion.getString("idautobus");
		   utmx = num_posicion.getInt("utmx");
		   utmx = 
		   utmy = num_posicion.getInt("utmy");
		   hora_de_actualizacion= num_posicion.getString("horaactualizacion");
		   distancia= num_posicion.getDouble("distancia");
		   idparada = num_posicion.getInt("idparada");
		   ordenparada = num_posicion.getInt("ordenparada");
		   idsiguienteparada = num_posicion.getInt("idsiguienteparada");
		   
		   //pasar todo a string porque lo mostraremos 
		   
		   String idlinea_1= Integer.toString(idlinea);
		   String idtrayecto_1= Integer.toString(idtrayecto);
		   String utmx_1= Integer.toString(utmx);
		   String utmy_1= Integer.toString(utmy);
		   String distancia_1= Double.toString(distancia);
		   String idparada_1= Double.toString(idparada);
		   String ordenparada_1= Double.toString(ordenparada);
		   String idsiguienteparada_1= Double.toString(idsiguienteparada);
		    
		   //añadimos cada campo en un vector ya que si lo pasamos todo al bulder tiene que ser con un solo string.
		   
		   vector_1[0]= idlinea_1;				   
		   vector_1[1]= idautobus;
		   vector_1[2]= idsiguienteparada_1;
		   vector_1[3]= distancia_1;
		   vector_1[4]= hora_de_actualizacion;
		   vector_1[5]= utmx_1;	
		   vector_1[6]= utmy_1;
		   vector_1[7]= idparada_1;
		   vector_1[8]= ordenparada_1;
		   vector_1[9]= idtrayecto_1;
		   
		   
		   //para imprimir todos
		   
		    System.out.println("id linea:"+ idlinea);   
			System.out.println("id trayecto:"+idtrayecto);
			System.out.println("id autobus:"+idautobus);
			System.out.println("coordenadas utmx:"+utmx);
			System.out.println("coordenadas utmy:"+utmy);
			System.out.println("hora de actualización:"+hora_de_actualizacion);
			System.out.println("distancia:"+distancia);
			System.out.println("ordenparada:"+ordenparada);
			System.out.println("idparada ESTA ES LA PARADA:"+idparada);
			System.out.println("idsiguienteparada ESTA ES LA SIGUIENTE PARADA:"+idsiguienteparada);
			System.out.println("..........");
			
		}
		
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vector_1;		
}


public static String[] dame_info_bus5() {
	
	int idlinea = 0;
	int idtrayecto = 0;
	String idautobus = "";
	int utmx = 0; 
	int utmy = 0;
	String hora_de_actualizacion= "";
	int idparada = 0;
	int ordenparada = 0;
	int idsiguienteparada =0;
	
	//Aqui definimos la dimension del vector.
	String vector_1[]= new String [10];
	double distancia=0;
	
	
	// TODO Auto-generated method stub
	
	String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
	
	String respuesta= clienteRest.request(api);	
	
	//System.out.println(respuesta);
	
	try {
		
		JSONObject obj = new JSONObject(respuesta);
		
		JSONObject posiciones = obj.getJSONObject("posiciones");
	
		JSONArray posicion = posiciones.getJSONArray("posicion");
		
		for (int i = 4; i < 5; i++)
		
		{
		    JSONObject num_posicion =posicion.getJSONObject(i);
		   
		    
		   idlinea = num_posicion.getInt("idlinea");
		   idtrayecto = num_posicion.getInt("idtrayecto");
		   idautobus = num_posicion.getString("idautobus");
		   utmx = num_posicion.getInt("utmx");
		   utmx = 
		   utmy = num_posicion.getInt("utmy");
		   hora_de_actualizacion= num_posicion.getString("horaactualizacion");
		   distancia= num_posicion.getDouble("distancia");
		   idparada = num_posicion.getInt("idparada");
		   ordenparada = num_posicion.getInt("ordenparada");
		   idsiguienteparada = num_posicion.getInt("idsiguienteparada");
		   
		   //pasar todo a string porque lo mostraremos 
		   
		   String idlinea_1= Integer.toString(idlinea);
		   String idtrayecto_1= Integer.toString(idtrayecto);
		   String utmx_1= Integer.toString(utmx);
		   String utmy_1= Integer.toString(utmy);
		   String distancia_1= Double.toString(distancia);
		   String idparada_1= Double.toString(idparada);
		   String ordenparada_1= Double.toString(ordenparada);
		   String idsiguienteparada_1= Double.toString(idsiguienteparada);
		    
		   //añadimos cada campo en un vector ya que si lo pasamos todo al bulder tiene que ser con un solo string.
		   
		   vector_1[0]= idlinea_1;				   
		   vector_1[1]= idautobus;
		   vector_1[2]= idsiguienteparada_1;
		   vector_1[3]= distancia_1;
		   vector_1[4]= hora_de_actualizacion;
		   vector_1[5]= utmx_1;	
		   vector_1[6]= utmy_1;
		   vector_1[7]= idparada_1;
		   vector_1[8]= ordenparada_1;
		   vector_1[9]= idtrayecto_1;
		   
		   
		   //para imprimir todos
		   
		    System.out.println("id linea:"+ idlinea);   
			System.out.println("id trayecto:"+idtrayecto);
			System.out.println("id autobus:"+idautobus);
			System.out.println("coordenadas utmx:"+utmx);
			System.out.println("coordenadas utmy:"+utmy);
			System.out.println("hora de actualización:"+hora_de_actualizacion);
			System.out.println("distancia:"+distancia);
			System.out.println("ordenparada:"+ordenparada);
			System.out.println("idparada ESTA ES LA PARADA:"+idparada);
			System.out.println("idsiguienteparada ESTA ES LA SIGUIENTE PARADA:"+idsiguienteparada);
			System.out.println("..........");
			
		}
		
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vector_1;		
}

public static String[] dame_info_bus6() {
	
	int idlinea = 0;
	int idtrayecto = 0;
	String idautobus = "";
	int utmx = 0; 
	int utmy = 0;
	String hora_de_actualizacion= "";
	int idparada = 0;
	int ordenparada = 0;
	int idsiguienteparada =0;
	
	//Aqui definimos la dimension del vector.
	String vector_1[]= new String [10];
	double distancia=0;
	
	
	// TODO Auto-generated method stub
	
	String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
	
	String respuesta= clienteRest.request(api);	
	
	//System.out.println(respuesta);
	
	try {
		
		JSONObject obj = new JSONObject(respuesta);
		
		JSONObject posiciones = obj.getJSONObject("posiciones");
	
		JSONArray posicion = posiciones.getJSONArray("posicion");
		
		for (int i = 5; i < 6; i++)
		
		{
		    JSONObject num_posicion =posicion.getJSONObject(i);
		   
		    
		   idlinea = num_posicion.getInt("idlinea");
		   idtrayecto = num_posicion.getInt("idtrayecto");
		   idautobus = num_posicion.getString("idautobus");
		   utmx = num_posicion.getInt("utmx");
		   utmx = 
		   utmy = num_posicion.getInt("utmy");
		   hora_de_actualizacion= num_posicion.getString("horaactualizacion");
		   distancia= num_posicion.getDouble("distancia");
		   idparada = num_posicion.getInt("idparada");
		   ordenparada = num_posicion.getInt("ordenparada");
		   idsiguienteparada = num_posicion.getInt("idsiguienteparada");
		   
		   //pasar todo a string porque lo mostraremos 
		   
		   String idlinea_1= Integer.toString(idlinea);
		   String idtrayecto_1= Integer.toString(idtrayecto);
		   String utmx_1= Integer.toString(utmx);
		   String utmy_1= Integer.toString(utmy);
		   String distancia_1= Double.toString(distancia);
		   String idparada_1= Double.toString(idparada);
		   String ordenparada_1= Double.toString(ordenparada);
		   String idsiguienteparada_1= Double.toString(idsiguienteparada);
		    
		   //añadimos cada campo en un vector ya que si lo pasamos todo al bulder tiene que ser con un solo string.
		   
		   vector_1[0]= idlinea_1;				   
		   vector_1[1]= idautobus;
		   vector_1[2]= idsiguienteparada_1;
		   vector_1[3]= distancia_1;
		   vector_1[4]= hora_de_actualizacion;
		   vector_1[5]= utmx_1;	
		   vector_1[6]= utmy_1;
		   vector_1[7]= idparada_1;
		   vector_1[8]= ordenparada_1;
		   vector_1[9]= idtrayecto_1;
		   
		   
		   //para imprimir todos
		   
		    System.out.println("id linea:"+ idlinea);   
			System.out.println("id trayecto:"+idtrayecto);
			System.out.println("id autobus:"+idautobus);
			System.out.println("coordenadas utmx:"+utmx);
			System.out.println("coordenadas utmy:"+utmy);
			System.out.println("hora de actualización:"+hora_de_actualizacion);
			System.out.println("distancia:"+distancia);
			System.out.println("ordenparada:"+ordenparada);
			System.out.println("idparada ESTA ES LA PARADA:"+idparada);
			System.out.println("idsiguienteparada ESTA ES LA SIGUIENTE PARADA:"+idsiguienteparada);
			System.out.println("..........");
			
		}
		
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vector_1;		
}

public static String[] dame_info_bus7() {
	
	int idlinea = 0;
	int idtrayecto = 0;
	String idautobus = "";
	int utmx = 0; 
	int utmy = 0;
	String hora_de_actualizacion= "";
	int idparada = 0;
	int ordenparada = 0;
	int idsiguienteparada =0;
	
	//Aqui definimos la dimension del vector.
	String vector_1[]= new String [10];
	double distancia=0;
	
	
	// TODO Auto-generated method stub
	
	String api = "http://datos.gijon.es/doc/transporte/busgijontr.json";
	
	String respuesta= clienteRest.request(api);	
	
	//System.out.println(respuesta);
	
	try {
		
		JSONObject obj = new JSONObject(respuesta);
		
		JSONObject posiciones = obj.getJSONObject("posiciones");
	
		JSONArray posicion = posiciones.getJSONArray("posicion");
		
		for (int i = 6; i < 7; i++)
		
		{
		    JSONObject num_posicion =posicion.getJSONObject(i);
		   
		    
		   idlinea = num_posicion.getInt("idlinea");
		   idtrayecto = num_posicion.getInt("idtrayecto");
		   idautobus = num_posicion.getString("idautobus");
		   utmx = num_posicion.getInt("utmx");
		   utmy = num_posicion.getInt("utmy");
		   hora_de_actualizacion= num_posicion.getString("horaactualizacion");
		   distancia= num_posicion.getDouble("distancia");
		   idparada = num_posicion.getInt("idparada");
		   ordenparada = num_posicion.getInt("ordenparada");
		   idsiguienteparada = num_posicion.getInt("idsiguienteparada");
		   
		   //pasar todo a string porque lo mostraremos 
		   
		   String idlinea_1= Integer.toString(idlinea);
		   String idtrayecto_1= Integer.toString(idtrayecto);
		   String utmx_1= Integer.toString(utmx);
		   String utmy_1= Integer.toString(utmy);
		   String distancia_1= Double.toString(distancia);
		   String idparada_1= Double.toString(idparada);
		   String ordenparada_1= Double.toString(ordenparada);
		   String idsiguienteparada_1= Double.toString(idsiguienteparada);
		    
		   //añadimos cada campo en un vector ya que si lo pasamos todo al bulder tiene que ser con un solo string.
		   
		   vector_1[0]= idlinea_1;				   
		   vector_1[1]= idautobus;
		   vector_1[2]= idsiguienteparada_1;
		   vector_1[3]= distancia_1;
		   vector_1[4]= hora_de_actualizacion;
		   vector_1[5]= utmx_1;	
		   vector_1[6]= utmy_1;
		   vector_1[7]= idparada_1;
		   vector_1[8]= ordenparada_1;
		   vector_1[9]= idtrayecto_1;
		   
		   
		   //para imprimir todos
		   
		    System.out.println("id linea:"+ idlinea);   
			System.out.println("id trayecto:"+idtrayecto);
			System.out.println("id autobus:"+idautobus);
			System.out.println("coordenadas utmx:"+utmx);
			System.out.println("coordenadas utmy:"+utmy);
			System.out.println("hora de actualización:"+hora_de_actualizacion);
			System.out.println("distancia:"+distancia);
			System.out.println("ordenparada:"+ordenparada);
			System.out.println("idparada ESTA ES LA PARADA:"+idparada);
			System.out.println("idsiguienteparada ESTA ES LA SIGUIENTE PARADA:"+idsiguienteparada);
			System.out.println("..........");
			
		}
		
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return vector_1;		
}
}

