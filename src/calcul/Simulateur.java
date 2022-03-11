package calcul;
import java.util.Random;

import interfaceGraphiqueTesla.InterfaceJeu;
import interfaceGraphiqueTesla.InterfaceNiveaux;


public class Simulateur extends Thread{
	
	private int iPosX;
	private int iPosY;
	private InterfaceJeu mjf;
	private boolean stop;
	
	public Simulateur(InterfaceJeu mjfParam) {
		stop=false;
		iPosX = 50;
		iPosY = 50;
		mjf = mjfParam;
	}
	
	public int getX() {
		return iPosX;
	}

	public int getY() {
		return iPosY;
	}
	
	public void run() {
		int iCpt=0;
		while(!stop) {
			iCpt++;
			faireUneEtape();
			
			
			// Demande de rafraichissement de la fenetre
			mjf.repaint();

			try {
				// Mise en pause pendant 1000ms
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void faireUneEtape() {
		System.out.println("hello world");
	}

	public void arret() {
		stop=true;
	}


}
