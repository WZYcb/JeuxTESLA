
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
    
    public int gauche() {
    	x=x-1;
    }
    
    public int droite() {
    	x=x+1;
    }

    public int haut() {
    	y=y+1;
    }
	
    public int bas() {
    	y=y-1;
    }
    
}
