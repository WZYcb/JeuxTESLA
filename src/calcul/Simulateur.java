package calcul;
import java.util.Random;

import interfaceGraphiqueTesla.InterfaceJeu;
import interfaceGraphiqueTesla.InterfaceNiveaux;
import interfaceGraphiqueTesla.JPanelDessin;


public class Simulateur extends Thread{
	
	private int iPosX;
	private int iPosY;
	private JPanelDessin mjf;
	private Tesla tesla;
	private TrouNoir trouNoir;
	private TrouBlanc trouBlanc;
	private boolean stop;
	
	public Simulateur(JPanelDessin mjfParam) {
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
	
	}

	public void arret() {
		stop=true;
	}


}
