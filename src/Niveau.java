
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
	public int getidNiveau() {
		return idNiveau;
	}
    public String getnom() {
    	return nom;
    }
    public int getnbAsteroides() {
    	return nbAsteroides;
    }
    public int getnbTrouNoir() {
    	return nbTrouNoir;
    }
    public int getnbTrouBlanc() {
    	return nbTrouBlanc;
    }
    public int getnbRecharges() {
    	return nbRecharges;
    
    }
    public int getnbBonus() {
    	return nbBonus;
    }
    public Position getpointDepart() {
    	return pointDepart;
    }
    public Position getpointArrivee() {
    	return pointArrivee;
    }
    public Position gettailleNiveau() {
    	return tailleNiveau;
    }
    public int getduree() {
    	return duree;
    }
    public void setidNiveau(int idNiveau) {
    	this.idNiveau=idNiveau;
    }
    public void setnom(String nom) {
    	this.nom=nom;
    }
    public void setnbAsteroides(int nbAsteroides) {
    	this.nbAsteroides=nbAsteroides;
    }
    public void setnbTrouNoir(int nbTrouNoir) {
    	this.nbTrouNoir=nbTrouNoir;
    }
    public void setnbTrouBlanc(int nbTrouBlanc) {
    	this.nbTrouBlanc=nbTrouBlanc;
    }
    public void setnbRecharges(int nbRecharges) {
    	this.nbRecharges=nbRecharges;
    }
    public void setnbBonus(int nbBonus) {
    	this.nbBonus=nbBonus;
    }
    public void setpointDepart(Position pointDepart) {
    	this.pointDepart=pointDepart;
    }
    public void pointArrivee(Position pointArrivee) {
    	this.pointArrivee=pointArrivee;
    }
    public void settailleNiveau(Position tailleNiveau) {
    	this.tailleNiveau=tailleNiveau;
    }
    public void setduree(int duree) {
    	this.duree=duree;
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
