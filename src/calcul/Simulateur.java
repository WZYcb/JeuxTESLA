package calcul;

import java.util.Iterator;

import interfaceGraphiqueTesla.InterfaceJeu;

public class Simulateur extends Thread{
	

	private InterfaceJeu mjf;
	private boolean stop;
	private int key = -1;
	private Niveau niv;
	
	public Simulateur(InterfaceJeu interfaceJeu) {
		stop=false;
		niv= new Niveau(1);
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
		influenceTrouNoir();
		//deplacement des objets
			
	}
	public void influenceTrouNoir() {
		Iterator<Trou> iT = niv.getListeTrou().iterator();
		while(iT.hasNext()) {
			Trou trouTemp = iT.next();
			double influence = trouTemp.getRayonInfluence();
			Position posActuelleTesla = niv.getTesla().getPositionTesla();
			double distance = Math.sqrt(Math.pow((double) posActuelleTesla.getX()-trouTemp.getPositionTrou().getX(), (double) 2)+Math.pow((double) posActuelleTesla.getY()-trouTemp.getPositionTrou().getY(), (double) 2));
			if(distance < influence) {
				niv.getTesla().setPositionTesla(new Position((int) ( posActuelleTesla.getX() +trouTemp.getCoeffGravite()*(posActuelleTesla.getX()-trouTemp.getPositionTrou().getX())), (int) (posActuelleTesla.getY() +trouTemp.getCoeffGravite()*(posActuelleTesla.getY()-trouTemp.getPositionTrou().getY()))));
				float temp = trouTemp.getCoeffGravite()*(posActuelleTesla.getX()-trouTemp.getPositionTrou().getX());
				System.out.println(posActuelleTesla.getX()-trouTemp.getPositionTrou().getX()+"  "+temp);
				//le if sert à vérifier que la tesla est dans le périmètre d'influence du trou
				// on utilise le coeffGravite pour déplacer la tesla vers le trou ou la repousser
			}
		}
	}

	public void arret() {
		stop=true;
	}


}
