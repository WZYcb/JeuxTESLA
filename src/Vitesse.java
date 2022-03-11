
public class Vitesse {
	private int x;
	private int y;
	private int xVitesse;
	private int yVitesse;
	
    public void vitesse(int x,int y) {
    	this.x=x;
    	this.y=y;
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
    	}
		
   public void leftMove() {
	   xVitesse=-5;
   }
   public void rightMove() {
	   xVitesse=5;
   }
   
   public void upMove() {
	   yVitesse=5;
   }
   public void downMove() {
	   yVitesse=-5;
   }
   
    
	public void amplitude() {
		
		
		
	}
	
}
