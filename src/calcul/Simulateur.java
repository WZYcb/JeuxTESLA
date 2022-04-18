package calcul;

import java.util.Iterator;

import interfaceGraphiqueTesla.InterfaceGameOver;
import interfaceGraphiqueTesla.InterfaceJeu;
import interfaceGraphiqueTesla.InterfaceNivReussi;


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
		//deplacement des asteroides
		Iterator<Asteroide> iA = niv.getListeAsteroide().iterator();
		while(iA.hasNext()) {
			Asteroide asteroTmp=iA.next();
			asteroTmp.mouvement();
			}
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
				float coeffGrav = trouTemp.getCoeffGravite();
				posActuelleTesla.setX((int) (posActuelleTesla.getX() +coeffGrav*((float) (trouTemp.getPositionTrou().getX()-posActuelleTesla.getX()))));
				posActuelleTesla.setY((int) (posActuelleTesla.getY() +coeffGrav*((float) (trouTemp.getPositionTrou().getY()-posActuelleTesla.getY()))));
				float temp = trouTemp.getCoeffGravite()*(posActuelleTesla.getX()-trouTemp.getPositionTrou().getX());
			}
		}
	}
	
	public void recupererRecharge() {
		Position posActuelleTesla = niv.getTesla().getPositionTesla();
		Position tailleTesla = new Position( (int) (((float)40)/mjf.getMapJeu().getLambdaX()),(int) (((float)20)/mjf.getMapJeu().getLambdaY()));
		posActuelleTesla = new Position(posActuelleTesla.getX()+(tailleTesla.getX()/2),posActuelleTesla.getY()+(tailleTesla.getY()/2));
		Position tailleRecharge = new Position( (int) (((float)25)/mjf.getMapJeu().getLambdaX()),(int) (((float)40)/mjf.getMapJeu().getLambdaY()));
		Iterator<Recharge> iR = niv.getListeRecharge().iterator();
		while(iR.hasNext()) {
			Recharge rechargeTemp = iR.next();
			if((posActuelleTesla.getX()>(rechargeTemp.getPositionRecharge().getX())) && (posActuelleTesla.getX()<(rechargeTemp.getPositionRecharge().getX()+tailleRecharge.getX())) && (posActuelleTesla.getY()>(rechargeTemp.getPositionRecharge().getY())) && (posActuelleTesla.getY()<(rechargeTemp.getPositionRecharge().getY()+tailleRecharge.getY()))) {
				niv.getTesla().recupererRecharge();
			}
		}
		
	}
	public boolean collision() {
		boolean flag=false;
		Position posActuelleTesla = niv.getTesla().getPositionTesla();
		//Recupération de la taille de l'image pour définir la taille de la hitbox des objets
		Position tailleTesla = new Position( (int) (((float)40)/mjf.getMapJeu().getLambdaX()),(int) (((float)20)/mjf.getMapJeu().getLambdaY()));
		posActuelleTesla = new Position(posActuelleTesla.getX()+(tailleTesla.getX()/2),posActuelleTesla.getY()+(tailleTesla.getY()/2));
		Position tailleTrou = new Position( (int) (((float)60)/mjf.getMapJeu().getLambdaX()),(int) (((float)60)/mjf.getMapJeu().getLambdaY()));
		//collision avec les trous
		Iterator<Trou> iT = niv.getListeTrou().iterator();
		while(iT.hasNext() && !flag) {
			Trou trouTemp = iT.next();
			
			if((posActuelleTesla.getX()>(trouTemp.getPositionTrou().getX())) && (posActuelleTesla.getX()<(trouTemp.getPositionTrou().getX()+tailleTrou.getX())) && (posActuelleTesla.getY()>(trouTemp.getPositionTrou().getY())) && (posActuelleTesla.getY()<(trouTemp.getPositionTrou().getY()+tailleTrou.getY()))) {
				flag=true;
				gameOver();
			}
		}
		//collision avec les astéroïdes
		Iterator<Asteroide> iA = niv.getListeAsteroide().iterator();
		while(iA.hasNext()) {
			Asteroide asteroTemp= iA.next();
			
			Position tailleAst = new Position( (int) (((float) 28)/mjf.getMapJeu().getLambdaX()),(int) (((float) 25)/mjf.getMapJeu().getLambdaY()));
			if((posActuelleTesla.getX()>(asteroTemp.getPositionAsteroide().getX())) && (posActuelleTesla.getX()<(asteroTemp.getPositionAsteroide().getX()+tailleAst.getX())) && (posActuelleTesla.getY()>(asteroTemp.getPositionAsteroide().getY())) && (posActuelleTesla.getY()<(asteroTemp.getPositionAsteroide().getY()+tailleAst.getY()))) {
				flag=true;
				gameOver();
			}
			
		}
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
		InterfaceNivReussi youwin= new InterfaceNivReussi();
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
		Position posActuelleTesla = niv.getTesla().getPositionTesla();
		Position tailleTesla = new Position( (int) (((float)40)/mjf.getMapJeu().getLambdaX()),(int) (((float)20)/mjf.getMapJeu().getLambdaY()));
		posActuelleTesla = new Position(posActuelleTesla.getX()+(tailleTesla.getX()/2),posActuelleTesla.getY()+(tailleTesla.getY()/2));
		Position taillePlanete = new Position( (int) (((float)40)/mjf.getMapJeu().getLambdaX()),(int) (((float)40)/mjf.getMapJeu().getLambdaY()));
		if((posActuelleTesla.getX()>(niv.getPointArrivee().getX())) && (posActuelleTesla.getX()<(niv.getPointArrivee().getX()+taillePlanete.getX())) && (posActuelleTesla.getY()>(niv.getPointArrivee().getY())) && (posActuelleTesla.getY()<(niv.getPointArrivee().getY()+taillePlanete.getY()))) {
			flag=true;
			win();
		}
		return flag;
	}
	
	public void arret() {
		stop=true;
	}


}
