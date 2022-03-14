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
	
	
	public JPanelDessin(int nTrouNoir, int nTrouBlanc) {
		String sNomFile=".\\images\\"+"voiture_vue_dessus.png";
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
	}
	

	/**
	 * redéfinition de la methode paintComponent
	 * @param g
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(voitureImg, 20 , 20,this.getWidth()/25,this.getHeight()/50, null);
		g.drawImage(planeteLivraisonImg, this.getWidth()-(this.getWidth()/20)-20, this.getHeight()-(this.getHeight()/20)-20,this.getWidth()/20,this.getHeight()/20, null);
		g.drawImage(trouNoirImg,this.getWidth()/4, this.getHeight()/2,this.getWidth()/20,this.getHeight()/20, null);
		g.drawImage(trouBlancImg, this.getWidth()/2, this.getHeight()/4,this.getWidth()/20,this.getHeight()/20, null);
	}
	
}
