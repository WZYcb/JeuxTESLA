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
	public int getIdAsteroides() {
		return idAsteroides;
	}
	public int getDiametre() {
		return diametre;
	}
	public Position getPositionAsteroide() {
		return positionAsteroide;
	}
	public Vitesse getVitesseAsteroide() {
		return vitesseAsteroide;
	}
	public void setIdAsteroides(int idAsteroides) {
		this.idAsteroides=idAsteroides;
	}
	public void setDiametre(int diametre) {
		this.diametre=diametre;
	}
	public void setPositionAsteroide(Position positionAsteroide) {
		this.positionAsteroide=positionAsteroide;
	}
	public void setVitesseAsteroide(Vitesse vitesseAsteroide) {
		this.vitesseAsteroide=vitesseAsteroide;
	}
	 public int mouvement() {
		 positionAsteroide.setX(positionAsteroide.getX()-vitesseAsteroide.getX());
		 positionAsteroide.setY(positionAsteroide.getY()-vitesseAsteroide.getY());
	    	return vitesseAsteroide.directionAngle();
	    	}

}
