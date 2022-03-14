package calcul;

public class Asteroides {
	private int idAsteroides;
	private int diametre;
	private Position positionAsteroide;
	private Vitesse vitesseAsteroide;
	
	public Asteroides(int idAsteroides,int diametre,Position positionAsteroide,Vitesse vitesseAsteroide) {
		this.idAsteroides=idAsteroides;
		this.diametre=diametre;
		this.positionAsteroide=positionAsteroide;
		this.vitesseAsteroide=vitesseAsteroide;
		
	}
	public int getidAsteroides() {
		return idAsteroides;
	}
	public int getdiametre() {
		return diametre;
	}
	public Position getpositionAsteroide() {
		return positionAsteroide;
	}
	public Vitesse getvitesseAsteroide() {
		return vitesseAsteroide;
	}
	public void setidAsteroides(int idAsteroides) {
		this.idAsteroides=idAsteroides;
	}
	public void setdiametre(int diametre) {
		this.diametre=diametre;
	}
	public void setpositionAsteroide(Position positionAsteroide) {
		this.positionAsteroide=positionAsteroide;
	}
	public void setvitesseAsteroide(Vitesse vitesseAsteroide) {
		this.vitesseAsteroide=vitesseAsteroide;
	}
	 public int mouvement() {
	    	return vitesseAsteroide.directionAngle();
	    	}

}
