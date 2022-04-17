package calcul;

import java.util.Iterator;

import interfaceGraphiqueTesla.InterfaceGameOver;
import interfaceGraphiqueTesla.InterfaceJeu;
import interfaceGraphiqueTesla.JFrame;


public class Simulateur extends Thread{


	private InterfaceJeu mjf;
	private boolean stop;
	private int key = -1;
	private Niveau niv;
	private double framerate =120;
	private double timeSec;
	private double timeMin;

	public Simulateur(InterfaceJeu interfaceJeu,int niveau) {
		stop=false;
		niv = new Niveau(niveau);
		mjf = interfaceJeu;
		timeSec = 0;
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
				Thread.sleep((long) (1000/framerate));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void faireUneEtape() {
		// deplacer voiture en fonction de la touche et des trous
		//etape 1 : touches
		if ((key!=-1) && niv.getTesla().getNivBatterie()>0) {
			niv.getTesla().action(key);
			niv.getTesla().dechargerTesla();
			key=-1;
			}
		mjf.afficherNivBatterie();
		// etape 2 : trous noirs
		influenceTrouNoir();
		//deplacement des objets
		
		//recharge 
		recupererRecharge();
		//check collision
		collision();
		//check niveau réussi
		isFinished();
		//faire avancer le timer+check temps écoulé
		avancerTimer();
	}
	public void influenceTrouNoir() {
		Iterator<Trou> iT = niv.getListeTrou().iterator();
		while(iT.hasNext()) {
			Trou trouTemp = iT.next();
			double influence = trouTemp.getRayonInfluence();
			Position posActuelleTesla = niv.getTesla().getPositionTesla();
			double distance = Math.sqrt(Math.pow((double) posActuelleTesla.getX()-trouTemp.getPositionTrou().getX(), (double) 2)+Math.pow((double) posActuelleTesla.getY()-trouTemp.getPositionTrou().getY(), (double) 2));
			if(distance < influence) {
				int coeffGravInt = Math.round(trouTemp.getCoeffGravite());
				posActuelleTesla.setX(posActuelleTesla.getX() +coeffGravInt*(trouTemp.getPositionTrou().getX()-posActuelleTesla.getX()));
				posActuelleTesla.setY(posActuelleTesla.getY() +coeffGravInt*(trouTemp.getPositionTrou().getY()-posActuelleTesla.getY()));
				float temp = trouTemp.getCoeffGravite()*(posActuelleTesla.getX()-trouTemp.getPositionTrou().getX());
				System.out.println(posActuelleTesla.getX()-trouTemp.getPositionTrou().getX()+"  "+temp);
				//le if sert � v�rifier que la tesla est dans le p�rim�tre d'influence du trou
				// on utilise le coeffGravite pour d�placer la tesla vers le trou ou la repousser
			}
		}
	}
	
	public void recupererRecharge() {
		Iterator<Recharge> iR = niv.getListeRecharge().iterator();
		while(iR.hasNext()) {
			Recharge rechargeTemp = iR.next();
			if((niv.getTesla().getPositionTesla().getX()>(rechargeTemp.getPositionRecharge().getX()-30)) && (niv.getTesla().getPositionTesla().getX()<(rechargeTemp.getPositionRecharge().getX()+30)) && (niv.getTesla().getPositionTesla().getY()>(rechargeTemp.getPositionRecharge().getY()-30)) && (niv.getTesla().getPositionTesla().getY()<(rechargeTemp.getPositionRecharge().getY()+30))) {
				niv.getTesla().recupererRecharge();
			}
		}
		
	}
	public boolean collision() {
		boolean flag=false;
		//collision avec les trous
		Iterator<Trou> iT = niv.getListeTrou().iterator();
		while(iT.hasNext() && !flag) {
			Trou trouTemp = iT.next();
			Position posActuelleTesla = niv.getTesla().getPositionTesla();
			if((posActuelleTesla.getX()>(trouTemp.getPositionTrou().getX())) && (posActuelleTesla.getX()<(trouTemp.getPositionTrou().getX()+30)) && (posActuelleTesla.getY()>(trouTemp.getPositionTrou().getY())) && (posActuelleTesla.getY()<(trouTemp.getPositionTrou().getY()+30))) {
				flag=true;
				gameOver();
			}
		}
		//collision avec les astéroïdes
		
		return flag;
	}
	
	public void gameOver() {
		arret();
		InterfaceGameOver youLost= new InterfaceGameOver();
		youLost.setVisible(true);
		mjf.dispose();
	}
	
	
	public void win() {
		arret();
		JFrame youwin= new JFrame();
		youwin.setVisible(true);
		mjf.dispose();
	}
	
	public void avancerTimer() {
		timeSec= timeSec+ (1/framerate);
		timeMin= timeSec/60;
	
		mjf.afficherTempsRestant();
		tempsEcoule();
	}
	
	public double getTimeSec() {
		return timeSec;
	}



	public double getTimeMin() {
		return timeMin;
	}
	
	public void tempsEcoule() {
		if(timeMin>=niv.getLimiteTemps()) {
			gameOver();
		}
	}

	public boolean isFinished() {
		boolean flag=false;
		if((niv.getTesla().getPositionTesla().getX()>(niv.getPointArrivee().getX()-30)) && (niv.getTesla().getPositionTesla().getX()<(niv.getPointArrivee().getX()+30)) && (niv.getTesla().getPositionTesla().getY()>(niv.getPointArrivee().getY()-30)) && (niv.getTesla().getPositionTesla().getY()<(niv.getPointArrivee().getY()+30))) {
			flag=true;
			win();
		}
		return flag;
	}
	
	public void arret() {
		stop=true;
	}


}
