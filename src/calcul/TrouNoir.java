package calcul;
public class TrouNoir {
		//variable
		private int idTrouNoir;
		private String nom;
		private int diametre;
		private int diaminfluence;
		private Position positionTrouNoir;
		private float coeffGravite;
		
		//constructeur
		public TrouNoir(int idTrouNoir,String nom,int diametre,int diaminfluence,
				Position positionTrouNoir,float coeffGravite) {
			   this.idTrouNoir=idTrouNoir;
			   this.coeffGravite=coeffGravite;
			   this.diametre=diametre;
			   this.diaminfluence=diaminfluence;
			   this.nom=nom;
			   this.positionTrouNoir=positionTrouNoir;
			   
		}
		public int getidTrouNoir() {
			return idTrouNoir;
		}
		
	    public String getnom() {
	    	return nom;
	    }
	    
	    public int getdiametre() {
	    	return diametre;
	    	
	    }
	    public int getdiaminfluence() {
	    	return diaminfluence;
	    }
	    public Position getpositionTrouNoir() {
	    	return positionTrouNoir;
	    }
	    public float getcoeffGravite() {
	    	return coeffGravite;
	    }
	    public void setidTrouNoir(int idTrouNoir) {
	    	this.idTrouNoir=idTrouNoir;
	    	
	    }
	    public void setnom(String nom) {
	    	this.nom=nom;
	    }
	    public void setdiametre(int diametre) {
	    	this.diametre=diametre;
	    }
	    public void setdiaminfluence(int diaminfluence) {
	    	this.diaminfluence=diaminfluence;
	    }
	    public void setpositionTrouNoir(Position positionTrouNoir) {
	        this.positionTrouNoir=positionTrouNoir;
	}
	    public void setcoeffGravite(float coeffGravite) {
	    	this.coeffGravite=coeffGravite;
	    }
	 
	    
	    
	}
