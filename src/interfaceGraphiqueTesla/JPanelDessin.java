package interfaceGraphiqueTesla;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

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
		int nTrouNoir=simul.getNiveau().getNbTrouNoir();
		int nTrouBlanc=simul.getNiveau().getNbTrouBlanc();
		int nRecharge=simul.getNiveau().getNbRecharges();
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
		if(nTrouNoir>0) {
			try {                
		          trouNoirImg1 = ImageIO.read(new File(sNomFile));
		       } catch (IOException ex) {
		    	   trouNoirImg1=null;
		       }
			if(nTrouNoir>1) {
				try {                
			          trouNoirImg2 = ImageIO.read(new File(sNomFile));
			       } catch (IOException ex) {
			    	   trouNoirImg2=null;
			       }
				if(nTrouNoir>2) {
					try {                
				          trouNoirImg3 = ImageIO.read(new File(sNomFile));
				       } catch (IOException ex) {
				    	   trouNoirImg3=null;
				       }
				}
			}
		}
		sNomFile=".\\images\\"+"trou_blanc.png";
		if(nTrouBlanc>0) {
			try {                
		          trouBlancImg1 = ImageIO.read(new File(sNomFile));
		       } catch (IOException ex) {
		    	   trouBlancImg1=null;
		       }
			if(nTrouBlanc>1) {
				try {                
			          trouBlancImg2 = ImageIO.read(new File(sNomFile));
			       } catch (IOException ex) {
			    	   trouBlancImg2=null;
			       }
				if(nTrouBlanc>2) {
					try {                
				          trouBlancImg3 = ImageIO.read(new File(sNomFile));
				       } catch (IOException ex) {
				    	   trouBlancImg3=null;
				       }
				}
			}
		}
		sNomFile=".\\images\\"+"supercharger_tesla.png";
		if(nRecharge>0) {
			try {                
		          superchargerImg1 = ImageIO.read(new File(sNomFile));
		       } catch (IOException ex) {
		    	   superchargerImg1=null;
		       }
			if(nRecharge>1) {
				try {                
			          superchargerImg2 = ImageIO.read(new File(sNomFile));
			       } catch (IOException ex) {
			    	   superchargerImg2=null;
			       }
				if(nRecharge>2) {
					try {                
				          superchargerImg3 = ImageIO.read(new File(sNomFile));
				       } catch (IOException ex) {
				    	   superchargerImg3=null;
				       }
				}
			}
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
		//g.drawImage(voitureImg, simul.getTesla().getPositionTesla().getX()*lambdaX,simul.getTesla().getPositionTesla().getY()*lambdaY,this.getWidth()/25,this.getHeight()/50, null);
		//g.drawImage(planeteLivraisonImg, simul.getNiveau().getPointArrivee().getX()*lambdaX, simul.getNiveau().getPointArrivee().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		//g.drawImage(trouNoirImg1, simul.getTrouNoir().getPositionTrouNoir().getX()*lambdaX , simul.getTrouNoir().getPositionTrouNoir().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		//g.drawImage(trouBlancImg1, simul.getTrouBlanc().getPositionTrouBlanc().getX()*lambdaX , simul.getTrouBlanc().getPositionTrouBlanc().getY()*lambdaY,this.getWidth()/20,this.getHeight()/20, null);
		//g.drawImage(listeTrou.get(0),0, 0,this.getWidth()/20,this.getHeight()/20, null);
		// discuter avec Eliott de comment gérer plusieurs objets de même classe (plusieurs trous noirs par exemple)
	}
	
}
