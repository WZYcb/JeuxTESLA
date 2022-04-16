package calcul;

public class Asteroide {
	private int idAsteroide;
	private Position positionAsteroide;
	private Vitesse vitesseAsteroide;
	
	public Asteroide(int idAsteroide,Position positionAsteroide,Vitesse vitesseAsteroide) {
		this.idAsteroide=idAsteroide;
		this.positionAsteroide=positionAsteroide;
		this.vitesseAsteroide=vitesseAsteroide;
		
	}
	public int getIdAsteroide() {
		return idAsteroide;
	}
	
	public Position getPositionAsteroide() {
		return positionAsteroide;
	}
	public Vitesse getVitesseAsteroide() {
		return vitesseAsteroide;
	}
	public void setIdAsteroide(int idAsteroide) {
		this.idAsteroide=idAsteroide;
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
