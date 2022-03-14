package interfaceGraphiqueTesla;


import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import calcul.Simulateur;

public class JPanelDessin extends JPanel {
	private static final long serialVersionUID = -4704888296894874299L;
	private Simulateur simul = new Simulateur(this);
	private int lambdaX;//coefficients lambda entre la taille du niveau dans le simulateur et la taille de la fenêtre
	private int lambdaY;
	private Image voitureImg= null;
	private Image trouNoirImg= null;
	private Image trouBlancImg=null;
	private Image planeteLivraisonImg=null;
//	private Image supercharger=ImageIO.read(new File(".\\images\\supercharger_tesla.png"));
	
	
	public Simulateur getSimul() {
		return simul;
	}

	public void setSimul(Simulateur simul) {
		this.simul = simul;
	}

	public int getLambdaX() {
		return lambdaX;
	}

	public void setLambdaX(int lambdaX) {
		this.lambdaX = lambdaX;
	}

	public int getLambdaY() {
		return lambdaY;
	}

	public void setLambdaY(int lambdaY) {
		this.lambdaY = lambdaY;
	}

	public Image getVoitureImg() {
		return voitureImg;
	}

	public void setVoitureImg(Image voitureImg) {
		this.voitureImg = voitureImg;
	}

	public Image getTrouNoirImg() {
		return trouNoirImg;
	}

	public void setTrouNoirImg(Image trouNoirImg) {
		this.trouNoirImg = trouNoirImg;
	}

	public Image getTrouBlancImg() {
		return trouBlancImg;
	}

	public void setTrouBlancImg(Image trouBlancImg) {
		this.trouBlancImg = trouBlancImg;
	}

	public Image getPlaneteLivraisonImg() {
		return planeteLivraisonImg;
	}

	public void setPlaneteLivraisonImg(Image planeteLivraisonImg) {
		this.planeteLivraisonImg = planeteLivraisonImg;
	}
	
	
	public JPanelDessin() {
		int nTrouNoir=simul.getNiveau().getNbTrouNoir();
		int nTrouBlanc=simul.getNiveau().getNbTrouBlanc();
		String sNomFile=".\\images\\"+"voiture_vue_dessus.png";
		lambdaX=this.getWidth()/simul.getNiveau().getTailleNiveau().getX();
		lambdaY=this.getHeight()/simul.getNiveau().getTailleNiveau().getY();
		try {                
	          voitureImg = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   voitureImg=null;
	       }
		sNomFile=".\\images\\"+"planete_livraison.png";
		try {                
	          planeteLivraisonImg = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   planeteLivraisonImg=null;
	       }	
		sNomFile=".\\images\\"+"trou_noir.png";
		int i=0;
		while(nTrouNoir>0 && i<nTrouNoir) {
			try {                
		          trouNoirImg = ImageIO.read(new File(sNomFile));
		       } catch (IOException ex) {
		    	   trouNoirImg=null;
		       }
			i=i+1;
		}
		
		i=0;
		sNomFile=".\\images\\"+"trou_blanc.png";
		while(nTrouBlanc>0 && i<nTrouBlanc) {
			try {                
		          trouBlancImg = ImageIO.read(new File(sNomFile));
		       } catch (IOException ex) {
		    	   trouBlancImg=null;
		       }
			i=i+1;
		}
		this.repaint();
		simul.start();
	}
	

	/**
	 * redéfinition de la methode paintComponent
	 * @param g
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(voitureImg, simul.getTesla().getPositionTesla().getX()*lambdaX,simul.getTesla().getPositionTesla().getY()*lambdaY,this.getWidth()/25,this.getHeight()/50, null);
		g.drawImage(planeteLivraisonImg, simul.getNiveau().getPointArrivee().getX()*lambdaX, simul.getNiveau().getPointArrivee().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		g.drawImage(trouNoirImg, simul.getTrouNoir().getPositionTrouNoir().getX()*lambdaX , simul.getTrouNoir().getPositionTrouNoir().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		g.drawImage(trouBlancImg, simul.getTrouBlanc().getPositionTrouBlanc().getX()*lambdaX , simul.getTrouBlanc().getPositionTrouBlanc().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
	}
	
}
