package calcul;

public class Trou {
	//variable
	private int idTrou;
	private String nom;
	private int diametre;
	private int diamInfluence;
	private Position positionTrou;
	private float coeffGravite;
	
	//constructeur
	public Trou(int idTrou,String nom,int diametre,int diamInfluence,
			Position positionTrou,float coeffGravite) {
		   this.idTrou=idTrou;
		   this.coeffGravite=coeffGravite;
		   this.diametre=diametre;
		   this.diamInfluence=diamInfluence;
		   this.nom=nom;
		   this.positionTrou=positionTrou;
		   
	}
	public int getIdTrou() {
		return idTrou;
	}
	
    public String getNom() {
    	return nom;
    }
    
    public int getDiametre() {
    	return diametre;
    	
    }
    public int getDiamInfluence() {
    	return diamInfluence;
    }
    public Position getPositionTrou() {
    	return positionTrou;
    }
    public float getCoeffGravite() {
    	return coeffGravite;
    }
    public void setIdTrou(int idTrou) {
    	this.idTrou=idTrou;
    	
    }
    public void setNom(String nom) {
    	this.nom=nom;
    }
    public void setDiametre(int diametre) {
    	this.diametre=diametre;
    }
    public void setDiamInfluence(int diamInfluence) {
    	this.diamInfluence=diamInfluence;
    }
    public void setPositionTrou(Position positionTrou) {
        this.positionTrou=positionTrou;
}
    public void setCoeffGravite(float coeffGravite) {
    	this.coeffGravite=coeffGravite;
    }
 
    
}
