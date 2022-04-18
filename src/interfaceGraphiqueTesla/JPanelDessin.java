package interfaceGraphiqueTesla;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.imageio.ImageIO; 
import javax.swing.JPanel;

import calcul.Asteroide;
import calcul.Recharge;
import calcul.Simulateur;
import calcul.Trou;

public class JPanelDessin extends JPanel {
	private static final long serialVersionUID = -4704888296894874299L;
	private Simulateur simul;
	private float lambdaX;//coefficients lambda entre la taille du niveau dans le simulateur et la taille de la fenêtre
	private float lambdaY;
	private Image voitureImg= null;
	private Image planeteLivraisonImg=null;
	private Image trouNoirImg=null;
	private Image trouBlancImg=null;
	private Image superchargerImg=null;


	private Image asteroideImg=null;
	private LinkedList<Image> listeTrouImg= new LinkedList<Image>();
	private LinkedList<Image> listeSuperchargerImg= new LinkedList<Image>();
	private LinkedList<Image> listeAsteroideImg = new LinkedList<Image>();
	

	public Image getTrouBlancImg() {
		return trouBlancImg;
	}

	public Image getSuperchargerImg() {
		return superchargerImg;
	}

	public Image getAsteroideImg() {
		return asteroideImg;
	}

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

	public float getLambdaX() {
		return lambdaX;
	}

	public void setLambdaX(float lambdaX) {
		this.lambdaX = lambdaX;
	}

	public float getLambdaY() {
		return lambdaY;
	}

	public void setLambdaY(float lambdaY) {
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
		sNomFile=".\\images\\"+"asteroide.png";
		try {                
	          asteroideImg = ImageIO.read(new File(sNomFile));
	       } catch (IOException ex) {
	    	   asteroideImg=null;
	    	   
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
			Iterator<Recharge> iR = simul.getNiv().getListeRecharge().iterator();
			Iterator<Asteroide> iA = simul.getNiv().getListeAsteroide().iterator();
			lambdaX=(float) this.getWidth()/simul.getNiv().getTailleNiveau().getX();
			lambdaY=(float) this.getHeight()/simul.getNiv().getTailleNiveau().getY();
			g.drawImage(voitureImg, Math.round(simul.getNiv().getTesla().getPositionTesla().getX()*lambdaX), Math.round(simul.getNiv().getTesla().getPositionTesla().getY()*lambdaY),40,20, null);
			g.drawImage(planeteLivraisonImg, Math.round(simul.getNiv().getPointArrivee().getX()*lambdaX), Math.round(simul.getNiv().getPointArrivee().getY()*lambdaY), 50,50, null);
			//System.out.println(simul.getNiv().getListeTrou().size()+" "+simul.getNiv().getListeRecharge().size()+" "+simul.getNiv().getListeTrou().size());
			
			while(iR.hasNext()) {
				Recharge rechargeTmp = iR.next();
				g.drawImage(superchargerImg, Math.round(rechargeTmp.getPositionRecharge().getX()*lambdaX) , Math.round(rechargeTmp.getPositionRecharge().getY()*lambdaY),25,40, null);
				
				
			}
			
			while(iT.hasNext()) {
				Trou trouTmp=iT.next();
				if(trouTmp.getCoeffGravite()>0) {
					g.drawImage(trouNoirImg, Math.round(trouTmp.getPositionTrou().getX()*lambdaX) , Math.round(trouTmp.getPositionTrou().getY()*lambdaY),60,60, null);
				} else {
					g.drawImage(trouBlancImg, Math.round(trouTmp.getPositionTrou().getX()*lambdaX) , Math.round(trouTmp.getPositionTrou().getY()*lambdaY),60,60, null);
				}
			}
			
			while(iA.hasNext()) {
				Asteroide asteroTmp= iA.next();
				g.drawImage(asteroideImg, Math.round(asteroTmp.getPositionAsteroide().getX()*lambdaX) , Math.round(asteroTmp.getPositionAsteroide().getY()*lambdaY),28,25, null);
				
				
			}
		}
		
	}
	

	}	
	
	
