package calcul;

public class Niveau {
	private int idNiveau;
	private String nom;
	private int nbAsteroides;
	private int nbTrouNoir;
	private int nbTrouBlanc;
	private int nbRecharges;
	private int nbBonus;
	private Position pointDepart;
	private Position pointArrivee;
	private Position tailleNiveau;
	private int duree;
	private Position positionAsteroides;
	private Position positionObjetGravitationnel;
	private Position positionRecharges;
	private Position positionBonus;
	
	public Niveau(int idNiveau,String nom,int nbAsteroides,int nbTrouNoir,int nbTrouBlanc,int nbRecharges,
			int nbBonus,Position pointDepart,Position pointArrivee,Position tailleNiveau,int duree) {
		this.idNiveau=idNiveau;
		this.nom=nom;
		this.nbAsteroides=nbAsteroides;
		this.nbTrouNoir=nbTrouNoir;
		this.nbTrouBlanc=nbTrouBlanc;
		this.nbRecharges=nbRecharges;
		this.nbBonus=nbBonus;
		this.pointDepart=pointDepart;
		this.pointArrivee=pointArrivee;
		this.tailleNiveau=tailleNiveau;
		this.duree=duree;
		
	}
	
	
	
    public int getIdNiveau() {
		return idNiveau;
	}



	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNbAsteroides() {
		return nbAsteroides;
	}



	public void setNbAsteroides(int nbAsteroides) {
		this.nbAsteroides = nbAsteroides;
	}



	public int getNbTrouNoir() {
		return nbTrouNoir;
	}



	public void setNbTrouNoir(int nbTrouNoir) {
		this.nbTrouNoir = nbTrouNoir;
	}



	public int getNbTrouBlanc() {
		return nbTrouBlanc;
	}



	public void setNbTrouBlanc(int nbTrouBlanc) {
		this.nbTrouBlanc = nbTrouBlanc;
	}



	public int getNbRecharges() {
		return nbRecharges;
	}



	public void setNbRecharges(int nbRecharges) {
		this.nbRecharges = nbRecharges;
	}



	public int getNbBonus() {
		return nbBonus;
	}



	public void setNbBonus(int nbBonus) {
		this.nbBonus = nbBonus;
	}



	public Position getPointDepart() {
		return pointDepart;
	}



	public void setPointDepart(Position pointDepart) {
		this.pointDepart = pointDepart;
	}



	public Position getPointArrivee() {
		return pointArrivee;
	}



	public void setPointArrivee(Position pointArrivee) {
		this.pointArrivee = pointArrivee;
	}



	public Position getTailleNiveau() {
		return tailleNiveau;
	}



	public void setTailleNiveau(Position tailleNiveau) {
		this.tailleNiveau = tailleNiveau;
	}



	public int getDuree() {
		return duree;
	}



	public void setDuree(int duree) {
		this.duree = duree;
	}


    public void niveau1() {
    	setIdNiveau(1);
    	setNbAsteroides(3);
    	setNbTrouNoir(3);
    	setNbTrouBlanc(3);
    	setNbRecharges(3);
    	setNbBonus(0);
    	setDuree(120);
    	
    	
    }
    public void niveau2() {
    	setIdNiveau(2);
    	setNbAsteroides(5);
    	setNbTrouNoir(5);
    	setNbTrouBlanc(5);
    	setNbRecharges(5);
    	setNbBonus(1);
    	setDuree(100);
    	
    	
    }
    public void niveau3() {
    	setIdNiveau(3);
    	setNbAsteroides(5);
    	setNbTrouNoir(5);
    	setNbTrouBlanc(5);
    	setNbRecharges(3);
    	setNbBonus(2);
    	setDuree(90);
    	
    	
    }
    public void niveau4() {
    	setIdNiveau(4);
    	setNbAsteroides(6);
    	setNbTrouNoir(7);
    	setNbTrouBlanc(7);
    	setNbRecharges(7);
    	setNbBonus(3);
    	setDuree(80);
    	
    	
    }
    public void niveau5() {
    	setIdNiveau(5);
    	setNbAsteroides(7);
    	setNbTrouNoir(9);
    	setNbTrouBlanc(9);
    	setNbRecharges(9);
    	setNbBonus(4);
    	setDuree(70);
    	
    	
    }
    public void niveau6() {
    	setIdNiveau(6);
    	setNbAsteroides(9);
    	setNbTrouNoir(11);
    	setNbTrouBlanc(11);
    	setNbRecharges(11);
    	setNbBonus(5);
    	setDuree(60);
    	
    	
    }
    public void niveau7() {
    	setIdNiveau(7);
    	setNbAsteroides(11);
    	setNbTrouNoir(11);
    	setNbTrouBlanc(11);
    	setNbRecharges(11);
    	setNbBonus(5);
    	setDuree(60);
    	
    	
    }
    public void niveau8() {
    	setIdNiveau(8);
    	setNbAsteroides(13);
    	setNbTrouNoir(13);
    	setNbTrouBlanc(13);
    	setNbRecharges(13);
    	setNbBonus(6);
    	setDuree(50);
    	
    	
    }
    public void niveau9() {
    	setIdNiveau(9);
    	setNbAsteroides(13);
    	setNbTrouNoir(15);
    	setNbTrouBlanc(15);
    	setNbRecharges(15);
    	setNbBonus(7);
    	setDuree(70);
    	
    	
    }
	public void placerAsteroides() {
		positionAsteroides.positioninitiale();
    	
    }
    
    public void placerObjetGravitationnel() {
    	positionObjetGravitationnel.positioninitiale();
    }
    
    public void placerRecharges() {
    	positionRecharges.positioninitiale();
    }
    
    public void placerBonus() {
    	positionBonus.positioninitiale();
    }
    
    public void placerTesla() {/////probleme
    	pointDepart.positionTesla(0, 0);
    	
    }
    
    

}
