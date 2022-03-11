
public class Position {
	private int x;
	private int y;
	
	
	public void position(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	public int getx()
	{
		return x;
	}
	
    public int gety()
	{
		return y;
	}
    
    public void gauche() {
    	x=x-1;
    }
    
    public void droite() {
    	x=x+1;
    }

    public void haut() {
    	y=y+1;
    }
	
    public void bas() {
    	y=y-1;
    }
    
}
