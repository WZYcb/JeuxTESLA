package interfaceGraphiqueTesla;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


import calcul.Recharge;
import calcul.Simulateur;
import calcul.Trou;

public class JPanelDessin extends JPanel {
	private static final long serialVersionUID = -4704888296894874299L;
	private Simulateur simul;
	private int lambdaX;//coefficients lambda entre la taille du niveau dans le simulateur et la taille de la fenêtre
	private int lambdaY;
	private Image voitureImg= null;
	private Image planeteLivraisonImg=null;
	private Image trouNoirImg=null;
	private Image trouBlancImg=null;
	private Image superchargerImg=null;
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
		String sNomFile=".\\images\\"+"voiture_vue_dessus.png";
		try {                
	         voitureImg=ImageIO.read(new File(sNomFile));
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
		try {                
	          trouNoirImg = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   trouNoirImg=null;
	       }
		sNomFile=".\\images\\"+"trou_blanc.png";
		try {                
	          trouBlancImg = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   trouBlancImg=null;
	       }
		sNomFile=".\\images\\"+"supercharger_tesla.png";
		try {                
	          superchargerImg = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   superchargerImg=null;
	       }
		
	}
	

	/**
	 * redéfinition de la methode paintComponent
	 * @param g
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (simul!=null) {
			Iterator<Trou> iT = simul.getNiv().getListeTrou().iterator();
			int i=0;
			lambdaX=this.getWidth()/1000;
			lambdaY=this.getHeight()/1000;
			g.drawImage(voitureImg, simul.getNiv().getTesla().getPositionTesla().getX()*lambdaX,simul.getNiv().getTesla().getPositionTesla().getY()*lambdaY,this.getWidth()/25,this.getHeight()/50, null);
			g.drawImage(planeteLivraisonImg, simul.getNiv().getPointArrivee().getX()*lambdaX, simul.getNiv().getPointArrivee().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
			while(iT.hasNext()) {
				if(iT.next().getCoeffGravite()>0) {
					g.drawImage(trouNoirImg, simul.getNiv().getListeTrou().get(i).getPositionTrou().getX()*lambdaX , simul.getNiv().getListeTrou().get(i).getPositionTrou().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
					
				} else {
					g.drawImage(trouBlancImg, simul.getNiv().getListeTrou().get(i).getPositionTrou().getX()*lambdaX , simul.getNiv().getListeTrou().get(i).getPositionTrou().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
				}
				i=i+1;
				
			}
			Iterator<Recharge >iR = simul.getNiv().getListeRecharge().iterator();
			i=0;
			while(iR.hasNext()) {
				g.drawImage(superchargerImg, simul.getNiv().getListeRecharge().get(i).getPositionRecharge().getX()*lambdaX , simul.getNiv().getListeRecharge().get(i).getPositionRecharge().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
				i=i+1;
				
			}
			
		}
		//g.drawImage(listeTrouImg.get(0),0, 0,this.getWidth()/20,this.getHeight()/20, null);
	}
	

	
	
}
