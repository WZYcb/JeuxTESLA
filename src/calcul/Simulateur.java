package calcul;
import java.util.Random;

import interfaceGraphiqueTesla.InterfaceNiveaux;


public class Simulateur extends Thread{
	
	private int iPosX;
	private int iPosY;
	private InterfaceNiveaux mjf;
	private boolean stop;
	
	public Simulateur(InterfaceNiveaux mjfParam) {
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
			
			mjf.setBlabla("Etape : "+ iCpt);
			// Demande de rafraichissement de la fenetre
			mjf.repaint();

			try {
				// Mise en pause pendant 150ms
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void faireUneEtape() {
		Random r = new Random();
		iPosX = r.nextInt(mjf.getPanelDessin().getWidth());
		iPosY = r.nextInt(mjf.getPanelDessin().getHeight());
	}

	public void arret() {
		stop=true;
	}


}
