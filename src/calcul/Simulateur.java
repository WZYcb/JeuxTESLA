package calcul;

import java.util.Iterator;

import interfaceGraphiqueTesla.InterfaceJeu;
import interfaceGraphiqueTesla.InterfaceNiveaux;

public class Simulateur extends Thread{
	

	private InterfaceJeu mjf;
	private boolean stop;
	private int key = -1;
	private Niveau niv;
	private InterfaceNiveaux inter;
	
	public Simulateur(InterfaceJeu interfaceJeu) {
		stop=false;
		niv = new Niveau(1);
		mjf = interfaceJeu;
	}
	
	
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Niveau getNiv() {
		return niv;
	}



	public void setNiv(Niveau niv) {
		this.niv = niv;
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
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void faireUneEtape() {
		// deplacer voiture en fonction de la touche et des trous
		//etape 1 : touches
		if (key!=-1) {
			niv.getTesla().action(key);		
			key=-1;
			}
		// etape 2 : trous noirs
		//influenceTrouNoir();
		//deplacement des objets
			
	}
	public void influenceTrouNoir() {
		Iterator<Trou> iT = niv.getListeTrou().iterator();
		while(iT.hasNext()) {
			Trou trouTemp = iT.next();
			int influence = trouTemp.getRayonInfluence();
			Position posActuelleTesla = niv.getTesla().getPositionTesla(); 
			if((posActuelleTesla.getX()<(trouTemp.getPositionTrou().getX()+influence)) && (posActuelleTesla.getX()>(trouTemp.getPositionTrou().getX()-influence)) && (posActuelleTesla.getY()<(trouTemp.getPositionTrou().getY()+influence)) && (posActuelleTesla.getY()>(trouTemp.getPositionTrou().getY()-influence))) {
				//le if sert � v閞ifier que la tesla est dans le p閞im鑤re d'influence du trou
				//niv.getTesla().setPositionTesla(new Position());
				// utiliser le coeffGravite pour d閜lacer la tesla vers le trou
			}
		}
	}

	public void arret() {
		stop=true;
	}


}
