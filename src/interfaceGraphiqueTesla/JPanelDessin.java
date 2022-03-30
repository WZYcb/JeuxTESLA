package interfaceGraphiqueTesla;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import calcul.Niveau;
import calcul.Simulateur;

public class JPanelDessin extends JPanel {
	private static final long serialVersionUID = -4704888296894874299L;
	private Simulateur simul = new Simulateur(this);
	private int lambdaX;//coefficients lambda entre la taille du niveau dans le simulateur et la taille de la fenêtre
	private int lambdaY;
	private Image voitureImg= null;
	private Image planeteLivraisonImg=null;
	private LinkedList<Image> listeTrouImg= new LinkedList<Image>();
	private LinkedList<Image> listeSuperchargerImg= new LinkedList<Image>();
	
	
	public LinkedList<Image> getListeTrouImg() {
		return listeTrouImg;
	}

	public void setListeTrouImg(LinkedList<Image> listeTrouImg) {
		this.listeTrouImg = listeTrouImg;
	}

	public LinkedList<Image> getListeSuperchargerImg() {
		return listeSuperchargerImg;
	}

	public void setListeSuperchargerImg(LinkedList<Image> listeSuperchargerImg) {
		this.listeSuperchargerImg = listeSuperchargerImg;
	}

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

	public Image getPlaneteLivraisonImg() {
		return planeteLivraisonImg;
	}

	public void setPlaneteLivraisonImg(Image planeteLivraisonImg) {
		this.planeteLivraisonImg = planeteLivraisonImg;
	}
	
	
	public JPanelDessin() {
		String sNomFile=".\\images\\"+"trou_noir.png";
		try {                
	         listeTrouImg.add(ImageIO.read(new File(sNomFile)));
	       } catch (IOException ex) {
	    	   listeTrouImg=null;
	       }
	}
	

	/**
	 * redéfinition de la methode paintComponent
	 * @param g
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawImage(voitureImg, simul.getTesla().getPositionTesla().getX()*lambdaX,simul.getTesla().getPositionTesla().getY()*lambdaY,this.getWidth()/25,this.getHeight()/50, null);
		//g.drawImage(planeteLivraisonImg, simul.getNiveau().getPointArrivee().getX()*lambdaX, simul.getNiveau().getPointArrivee().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		//g.drawImage(trouNoirImg1, simul.getTrouNoir().getPositionTrouNoir().getX()*lambdaX , simul.getTrouNoir().getPositionTrouNoir().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		//g.drawImage(trouBlancImg1, simul.getTrouBlanc().getPositionTrouBlanc().getX()*lambdaX , simul.getTrouBlanc().getPositionTrouBlanc().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		//g.drawImage(listeTrouImg.get(0),0, 0,this.getWidth()/20,this.getHeight()/20, null);
		// discuter avec Eliott de comment gérer plusieurs objets de même classe (plusieurs trous noirs par exemple)
	}
	
	public int keyPressed(KeyEvent event) {
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
		return key;
	}

	
}
