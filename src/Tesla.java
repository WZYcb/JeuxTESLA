
public class Tesla {
	
	private int idTesla;
	private int nivBattrie;
	private float vMax;
	private float couple;
    private String nom;
	private String couleur;
    private Position positionTesla;
    private Vitesse vitesseTesla;
    
    public Tesla(int idTesla,int nivBattrie,float vMax, float couple,String nom,String couleur,
    		Position positionTesla,Vitesse vitesseTesla) {
    	this.idTesla=idTesla;
    	this.nivBattrie=nivBattrie;
    	this.vMax=vMax;
    	this.couple=couple;
    	this.nom=nom;
    	this.couleur=couleur;
    	this.positionTesla=positionTesla;
    	this.vitesseTesla=vitesseTesla;
    	
    }
    
    public int getidTesla() {
    	return idTesla;
    }
    public int getnivBattrie() {
    	return nivBattrie;
    }
    public float getvMax() {
    	return vMax;
    }
    public String getcouleur() {
    	return couleur;
    }
    public float getcouple() {
    	return couple;
    }
    public String getnom() {
    	return nom;
    }
    public Position getpositionTesla() {
    	return positionTesla;
    }
    public Vitesse getVitesseTesla() {
    	return vitesseTesla;
    }
    
    public void setidTesla(int idTesla) {
    	this.idTesla=idTesla;
    }
    public void setnivBattrie(int nivBattrie) {
    	this.nivBattrie=nivBattrie;
    }
    public void setnvMax(float vMax) {
    	this.vMax=vMax;
    }
    public void setcouple(float couple) {
    	this.couple=couple;
    }
    public void setnom(String nom) {
    	this.nom=nom;
    }
    public void setcouleur(String couleur) {
    	this.couleur=couleur;
    }
    public void setpositionTesla(Position positionTesla) {
    	this.positionTesla=positionTesla;
    }
    
    public void setvitesseTesla(Vitesse vitesseTesla) {
    	this.vitesseTesla=vitesseTesla;
    }
    
    public void deplacerTesla() {
    	int positionx = positionTesla.getx()+5;
    	int positiony = positionTesla.gety()+5; 	
    }
    	
    public void rechargerTesla() {
    	Position positionrecaherge= 
        if (positionTesla==);
    	
    	
    		
    	
    	
    }
    

    public void dechargerTesla() {
    	
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
    

}
