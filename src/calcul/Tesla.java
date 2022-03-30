package calcul;

import java.awt.event.KeyEvent;

public class Tesla {
	
	private int idTesla;
	private int nivBattrie;
	private float vMax;
	private float couple;
    private String nom;
	private String couleur;
    private Position positionTesla;
    private int vitesseTesla = 5;
    
    public Tesla(int idTesla,int nivBattrie,float vMax, float couple,String nom,String couleur,
    		Position positionTesla,int vitesseTesla) {
    	this.idTesla=idTesla;
    	this.nivBattrie=nivBattrie;
    	this.vMax=vMax;
    	this.couple=couple;
    	this.nom=nom;
    	this.couleur=couleur;
    	this.positionTesla=positionTesla;
    	this.vitesseTesla=vitesseTesla;
    	
    }
    
    public Tesla(int idTesla) {
    	this.idTesla=idTesla;
    	
    	
    }
    public int getIdTesla() {
    	return idTesla;
    }
    public int getNivBattrie() {
    	return nivBattrie;
    }
    public float getVMax() {
    	return vMax;
    }
    public String getCouleur() {
    	return couleur;
    }
    public float getCouple() {
    	return couple;
    }
    public String getNom() {
    	return nom;
    }
    public Position getPositionTesla() {
    	return positionTesla;
    }
    public int getVitesseTesla() {
    	return vitesseTesla;
    }
    
    public void setIdTesla(int idTesla) {
    	this.idTesla=idTesla;
    }
    public void setNivBattrie(int nivBattrie) {
    	this.nivBattrie=nivBattrie;
    }
    public void setVMax(float vMax) {
    	this.vMax=vMax;
    }
    public void setCouple(float couple) {
    	this.couple=couple;
    }
    public void setNom(String nom) {
    	this.nom=nom;
    }
    public void setCouleur(String couleur) {
    	this.couleur=couleur;
    }
    public void setPositionTesla(Position positionTesla) {
    	this.positionTesla=positionTesla;
    }
    
    public void setVitesseTesla(int vitesseTesla) {
    	this.vitesseTesla=vitesseTesla;
    }
    
    public void deplacerTesla() {
    	
    
    }		
        	
    
    
    public void rechargerTesla() {
    	nivBattrie=nivBattrie+20;

    }
    

    public void dechargerTesla() {
    	nivBattrie=nivBattrie-1;

    }
    

    public boolean contactAsteroide() {
    	
		return false;
    	
    	
    }
    
    public boolean contactBonus() {
		return false;
    	
    }
    
    public boolean contactRecharge() {
		return false;
    	
    }
    
    public void recupererRecharge() {
    	if (contactRecharge()==true) {
    		
    	}
    	
    	
    }
    
    public void recupererBonus() {
    	
    }
    
    void action(int numeroTouche) { 
        if ( numeroTouche== KeyEvent.VK_UP) { 
        	positionTesla.setX(positionTesla.getX()+vitesseTesla);
        } 
        else if (numeroTouche == KeyEvent.VK_DOWN) { 
        	positionTesla.setX(positionTesla.getX()-vitesseTesla);
        } 
        else if (numeroTouche == KeyEvent.VK_RIGHT) { 
        	positionTesla.setY(positionTesla.getY()+vitesseTesla);
        } 
        else if (numeroTouche == KeyEvent.VK_LEFT) { 
        	positionTesla.setY(positionTesla.getY()-vitesseTesla);
        } 
        
    }  
    

}
