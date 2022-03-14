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
	
    public int idRecharge() {
    	return idRecharge;
    }
    public int diametre() {
    	return diametre;
    }
    public Position positionRecharge() {
    	return positionRecharge;
    }
    public void setidRecharge(int idRecharge) {
    	this.idRecharge=idRecharge;
    }
    public void setdiametre(int diametre) {
    	this.diametre=diametre;
    }
    public void setpositionRecharge(Position positionRecharge) {
    	this.positionRecharge=positionRecharge;
    }
    
}
