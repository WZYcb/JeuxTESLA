package calcul;
import java.util.Random;

public class Vitesse {
	private int x;
	private int y;
	private int Vitesse;
	private Direction direction = Direction.STOP;
    enum Direction {
			U, D, L, R, LU, LD, RU, RD, STOP
		};
	
    public Vitesse(int x,int y) {
    	this.x=x;
    	this.y=y;
    	
	}
    public int getX()
	{ 
		return x;
	}
	
    public int getY()
	{
		return y;
	}
    public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
    public int getVitesse()
	{
		return Vitesse;
	}
  
    
    public int directionAngle() {
    	Random random= new Random();
    	int num=random.nextInt(4);
    	
        
    	switch(num) {
    	   case 0:
    	       return gauche();
    	   case 1:
    		   return droite();
    	   case 2:
    		   return haut();
    	   case 3:
    		   return bas();   	   
    	}
		return num;		
    	}
    public int gauche() {
    	return x=x-1;
    }
    
    public int droite() {
    	return x=x+1;
    }

    public int haut() {
    	return y=y+1;
    }
	
    public int bas() {
    	return y=y-1;
    }
    
    
  
   
   
	
   public void deplacer() {
	   Vitesse=3;
	  
	   switch (direction) {
	   
		case U:
			y -= Vitesse;
			break;
		case D:
			y += Vitesse;
			break;
		case L:
			x -= Vitesse;
			break;
		case R:
			x += Vitesse;
			break;
		case LU:
			x -= Vitesse;
			y -= Vitesse;
			break;
		case LD:
			x -= Vitesse;
			y += Vitesse;
			break;
		case RU:
			x += Vitesse;
			y -= Vitesse;
			break;
		case RD:
			x += Vitesse;
			y += Vitesse;
			break;
		case STOP:
			break;
		}
	   
	   
   }
	
	
	public void amplitude() {
		
		
		
	}
	
	
}
