
public class Vitesse {
	private int x;
	private int y;
	
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
	
    
    
    
	public void amplitude() {
		if()
		
		
	}
	
}
