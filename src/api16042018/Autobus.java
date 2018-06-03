package api16042018;

/**

 * La clase autobus nps define getters y setters para almacenar y dar los parametros de los autobuses.

 * @author: Eugeni
 * 
 */

public class Autobus {
	
	int idlinea = 0;
	int idtrayecto = 0;
	String idautobus = "";
	static int utmx = 0;
	static int utmy = 0;
	String hora_de_actualizacion = "";
	int idparada = 0;
	int minutos = 0;
	double distancia = 0;
	String matricula = "";
	int idsiguienteparada = 0;
	int ordenparada = 0;
	
	
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public int getIdlinea() {
		return idlinea;
	}
	public void setIdlinea(int idlinea) {
		this.idlinea = idlinea;
	}
	public int getIdtrayecto() {
		return idtrayecto;
	}
	public void setIdtrayecto(int idtrayecto) {
		this.idtrayecto = idtrayecto;
	}
	public String getIdautobus() {
		return idautobus;
	}
	public void setIdautobus(String idautobus) {
		this.idautobus = idautobus;
	}
	public static int getUtmx() {
		return utmx;
	}
	public void setUtmx(int utmx) {
		this.utmx = utmx;
	}
	// se puede acceder desde cualquier clase
	public static int getUtmy() {
		return utmy;
	}
	public void setUtmy(int utmy) {
		this.utmy = utmy;
	}
	public String getHora_de_actualizacion() {
		return hora_de_actualizacion;
	}
	public void setHora_de_actualizacion(String hora_de_actualizacion) {
		this.hora_de_actualizacion = hora_de_actualizacion;
	}
	public int getIdparada() {
		return idparada;
	}
	public void setIdparada(int idparada) {
		this.idparada = idparada;
	}
	public int getOrdenparada() {
		return ordenparada;
	}
	public void setOrdenparada(int ordenparada) {
		this.ordenparada = ordenparada;
	}
	public int getIdsiguienteparada() {
		return idsiguienteparada;
	}
	public void setIdsiguienteparada(int idsiguienteparada) {
		this.idsiguienteparada = idsiguienteparada;
	}
	
}
