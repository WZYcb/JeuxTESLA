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



	public void placerAsteroides() {
    	
    	
    	
    }
    
    public void placerObjetGravitationnel() {
    	
    }
    
    public void placerRecharges() {
    	
    }
    
    public void placerBonus() {
    	
    }
    
    public void placerTesla() {
    	
    }
    
    

}
