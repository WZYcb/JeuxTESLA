package calcul;
public class Recharge {
	private int idRecharge;
	private int diametre;
	public Position positionRecharge;
	
	public void recharge(int idRecharge,int diametre,Position positionRecharge) {
		this.idRecharge=idRecharge;
		this.diametre=diametre;
		this.positionRecharge=positionRecharge;
		
	}
	
    public int getIdRecharge() {
    	return idRecharge;
    }
    public int getDiametre() {
    	return diametre;
    }
    public Position getPositionRecharge() {
    	return positionRecharge;
    }
    public void setIdRecharge(int idRecharge) {
    	this.idRecharge=idRecharge;
    }
    public void setDiametre(int diametre) {
    	this.diametre=diametre;
    }
    public void setPositionRecharge(Position positionRecharge) {
    	this.positionRecharge=positionRecharge;
    }
    
}
