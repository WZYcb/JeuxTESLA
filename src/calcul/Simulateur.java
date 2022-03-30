package calcul;


import java.awt.event.*;

import interfaceGraphiqueTesla.InterfaceJeu;
import interfaceGraphiqueTesla.InterfaceNiveaux;
import interfaceGraphiqueTesla.JPanelDessin;


public class Simulateur extends Thread{
	

	private JPanelDessin mjf;
	private boolean stop;
	private int key;
	
	public Simulateur(JPanelDessin mjfParam) {
		stop=false;

		mjf = mjfParam;
	}
	
	
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void run() {
		int iCpt=0;
		while(!stop) {
			iCpt++;
			faireUneEtape();
			
			
			// Demande de rafraichissement de la fenetre
			mjf.repaint();

			try {
				// Mise en pause pendant 250ms
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void faireUneEtape(KeyEvent event) {
		int key=-1;
		if (event.getKeyCode()==KeyEvent.VK_UP) {
			key=KeyEvent.VK_UP;
		}
		else if (event.getKeyCode()==KeyEvent.VK_DOWN) {
			key=KeyEvent.VK_DOWN;
		}
		else if (event.getKeyCode()==KeyEvent.VK_RIGHT) {
			key=KeyEvent.VK_RIGHT;
		}
		else if (event.getKeyCode()==KeyEvent.VK_LEFT) {
			key=KeyEvent.VK_LEFT;
		}
		Niveau.getTesla.action(key);
	
	}

	public void arret() {
		stop=true;
	}


}
