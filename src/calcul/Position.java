package calcul;
import java.util.Random;
import java.awt.event.*;


public class Position {
	private int x;
	private int y;
		
	public void position(int x,int y){
		this.x=x;
		this.y=y;		
	}
	
	public void positionTesla(int x,int y){
		x=0;
		y=0;	
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int xParam) {
		x=xParam;
	}
	
    public int getY()
	{
		return y;
	}
    public void setY(int YParam) {
		y=YParam;
	}
    public void positioninitiale(){
		
		Random r = new Random();
		
		this.x = r.nextInt(40);
		
		this.y = r.nextInt(40);
    }
    
    
}
