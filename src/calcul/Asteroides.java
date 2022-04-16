package calcul;

public class Asteroides {
	private int idAsteroides;
	private Position positionAsteroide;
	private Vitesse vitesseAsteroide;
	
	public Asteroides(int idAsteroides,Position positionAsteroide,Vitesse vitesseAsteroide) {
		this.idAsteroides=idAsteroides;
		this.positionAsteroide=positionAsteroide;
		this.vitesseAsteroide=vitesseAsteroide;
		
	}
	public int getIdAsteroides() {
		return idAsteroides;
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
