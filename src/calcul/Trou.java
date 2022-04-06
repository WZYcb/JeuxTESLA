package calcul;

import java.util.Random;

public class Trou {
	
	private int idTrou;
	private String nom;
	private int diamInfluence;
	private Position positionTrou;
	private float coeffGravite;
	
	
	public Trou(int idTrou,int diamInfluence,Position positionTrou) {
		this.idTrou=idTrou;
		this.positionTrou=positionTrou;
		Random rd = new Random();
		if(rd.nextBoolean()) {
			coeffGravite=1;
		} else {
			coeffGravite=-1;
		}
	}
	public int getIdTrou() {
		return idTrou;
	}
	
    public String getNom() {
    	return nom;
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
