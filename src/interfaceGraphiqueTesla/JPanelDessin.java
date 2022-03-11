package interfaceGraphiqueTesla;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class JPanelDessin extends JPanel {
	private static final long serialVersionUID = -4704888296894874299L;
	private Image voiture= null;
//	private Image trouNoir=ImageIO.read(new File(".\\images\\trou_noir.png"));
//	private Image trouBlanc=ImageIO.read(new File(".\\images\\trou_blanc.png"));
//	private Image planeteLivraison=ImageIO.read(new File(".\\images\\planete_livraison.png"));
//	private Image supercharger=ImageIO.read(new File(".\\images\\supercharger_tesla.png"));
	
	public JPanelDessin() {
		String sNomFile=".\\images\\"+"voiture_vue_dessus.png";
		try {                
	          voiture = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   voiture=null;
	       }
	}
	
	/**
	 * redéfinition de la methode paintComponent
	 * @param g
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(voiture, 0, 0, null);
	}
}
