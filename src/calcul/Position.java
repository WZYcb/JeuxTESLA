package calcul;
import java.util.Random;



public class Position {
	private int x;
	private int y;
		
	public Position(int x,int y) {
		this.x=x;
		this.y=y;		
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int xParam) {
		x=xParam;
	}
	
    public int getY() {
		return y;
	}
    public void setY(int yParam) {
		y=yParam;
	}
    public void positionInitiale(){
		
		Random r = new Random();
		
		this.x = r.nextInt(40);
		
		this.y = r.nextInt(40);
    }
    
    
}
