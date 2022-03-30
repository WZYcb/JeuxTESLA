package calcul;

public class Bonus {
	private int idBonus;
	private String nom;
	private int diametre;
	private Position positionBonus;
	
	public Bonus(int idBonus,String nom,int diametre,Position positionBonus) {
		this.idBonus=idBonus;
		this.nom=nom;
		this.diametre=diametre;
		positionBonus.positioninitiale();
		
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getidBonus() {
		return idBonus;
	}

	public void setidBonus(int idBonus) {
		this.idBonus = idBonus;
	}
	public int getdiametre() {
		return diametre;
	} 

	public void setdiametre(int diametre) {
		this.diametre= diametre;
	}
	public Position getpositionBonus() {
		return positionBonus;
	}

	public void setpositionBonus(Position positionBonus) {
		this.positionBonus= positionBonus;
	}

}
