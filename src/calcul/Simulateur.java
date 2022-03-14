package calcul;
import java.util.Random;

import interfaceGraphiqueTesla.InterfaceJeu;
import interfaceGraphiqueTesla.InterfaceNiveaux;
import interfaceGraphiqueTesla.JPanelDessin;


public class Simulateur extends Thread{
	
	
	private JPanelDessin mjf;
	private Tesla tesla;
	private TrouNoir trouNoir;
	private TrouBlanc trouBlanc;
	private boolean stop;
	
	public Simulateur(JPanelDessin mjfParam) {
		stop=false;
		mjf = mjfParam;
	}
	
	public JPanelDessin getMjf() {
		return mjf;
	}

	public void setMjf(JPanelDessin mjf) {
		this.mjf = mjf;
	}

	public Tesla getTesla() {
		return tesla;
	}

	public void setTesla(Tesla tesla) {
		this.tesla = tesla;
	}

	public TrouNoir getTrouNoir() {
		return trouNoir;
	}

	public void setTrouNoir(TrouNoir trouNoir) {
		this.trouNoir = trouNoir;
	}

	public TrouBlanc getTrouBlanc() {
		return trouBlanc;
	}

	public void setTrouBlanc(TrouBlanc trouBlanc) {
		this.trouBlanc = trouBlanc;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
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
