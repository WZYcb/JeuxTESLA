package interfaceGraphiqueTesla;


import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import calcul.Simulateur;

public class JPanelDessin extends JPanel {
	private static final long serialVersionUID = -4704888296894874299L;
	private Image voiture= null;
	private Image trouNoir= null;
	private Image trouBlanc=null;
	private Image planeteLivraison=null;
//	private Image supercharger=ImageIO.read(new File(".\\images\\supercharger_tesla.png"));
	
	public JPanelDessin(int nTrouNoir, int nTrouBlanc) {
		String sNomFile=".\\images\\"+"voiture_vue_dessus.png";
		try {                
	          voiture = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   voiture=null;
	       }
		sNomFile=".\\images\\"+"planete_livraison.png";
		try {                
	          planeteLivraison = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   planeteLivraison=null;
	       }	
		sNomFile=".\\images\\"+"trou_noir.png";
		int i=0;
		while(nTrouNoir>0 && i<nTrouNoir) {
			try {                
		          trouNoir = ImageIO.read(new File(sNomFile));
		       } catch (IOException ex) {
		    	   trouNoir=null;
		       }
			i=i+1;
		}
		
		i=0;
		sNomFile=".\\images\\"+"trou_blanc.png";
		while(nTrouBlanc>0 && i<nTrouBlanc) {
			try {                
		          trouBlanc = ImageIO.read(new File(sNomFile));
		       } catch (IOException ex) {
		    	   trouBlanc=null;
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
		g.drawImage(voiture, 20 , 20,this.getWidth()/25,this.getHeight()/50, null);
		g.drawImage(planeteLivraison, this.getWidth()-(this.getWidth()/20)-20, this.getHeight()-(this.getHeight()/20)-20,this.getWidth()/20,this.getHeight()/20, null);
		g.drawImage(trouNoir,this.getWidth()/4, this.getHeight()/2,this.getWidth()/20,this.getHeight()/20, null);
		g.drawImage(trouBlanc, this.getWidth()/2, this.getHeight()/4,this.getWidth()/20,this.getHeight()/20, null);
	}
	
}
