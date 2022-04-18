package calcul;

import java.util.Random;

public class Trou {
	
	private int idTrou;
	private String nom;
	private int rayonInfluence=500;
	private Position positionTrou;
	private float coeffGravite;
	
	
	public Trou(int idTrou,int rayonInfluence,Position positionTrou) {
		this.idTrou=idTrou;
		this.positionTrou=positionTrou;
		Random rd = new Random();
		if(rd.nextBoolean()) {
			coeffGravite=0.1f;
		} else {
			coeffGravite=-0.1f;
		}
	}
	public int getIdTrou() {
		return idTrou;
	}
	
    public String getNom() {
    	return nom;
    }
    
    public int getRayonInfluence() {
    	return rayonInfluence;
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
    public void setRayonInfluence(int rayonInfluence) {
    	this.rayonInfluence=rayonInfluence;
    }
    public void setPositionTrou(Position positionTrou) {
        this.positionTrou=positionTrou;
}
    public void setCoeffGravite(float coeffGravite) {
    	this.coeffGravite=coeffGravite;
    }
 
    
}
