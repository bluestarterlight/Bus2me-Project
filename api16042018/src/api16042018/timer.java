package api16042018;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

import java.util.Timer;

public class timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TimerTask timerTask = new TimerTask()
	     {
	         public void run() 
	         {
	             System.out.println("Hola");
	         }
	     };
	    
	      // Aquí se pone en marcha el timer cada segundo.
	     Timer timer = new Timer();
	     // Dentro de 0 milisegundos avísame cada 1000 milisegundos
	     timer.scheduleAtFixedRate(timerTask, 0, 1000); 

}
}