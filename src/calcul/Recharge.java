package calcul;
public class Recharge {
	private int idRecharge;
	public Position positionRecharge;
	
	public Recharge(int idRecharge,Position positionRecharge) {
		this.idRecharge=idRecharge;
		this.positionRecharge=positionRecharge;
		
	}
	
    public int getIdRecharge() {
    	return idRecharge;
    }
    public Position getPositionRecharge() {
    	return positionRecharge;
    }
    public void setIdRecharge(int idRecharge) {
    	this.idRecharge=idRecharge;
    }
    public void setPositionRecharge(Position positionRecharge) {
    	this.positionRecharge=positionRecharge;
    }
    
}
