



public class TrouBlanc {
		//variable
		private int idObjetGravitationnel;
		private String nom;
		private int diametre;
		private int diaminfluence;
		private Position positionObjetGravitationnel;
		private float coeffGravite;
		
		//constructeur
		public TrouBlanc(int idObjetGravitationnel,String nom,int diametre,int diaminfluence,
				Position positionObjetGravitationnel,float coeffGravite) {
			   this.idObjetGravitationnel=idObjetGravitationnel;
			   this.coeffGravite=coeffGravite;
			   this.diametre=diametre;
			   this.diaminfluence=diaminfluence;
			   this.nom=nom;
			   this.positionObjetGravitationnel=positionObjetGravitationnel;
			   
		}
		public int getidObjetGravitationnel() {
			return idObjetGravitationnel;
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
	    public Position getpositionObjetGravitationnel() {
	    	return positionObjetGravitationnel;
	    }
	    public float getcoeffGravite() {
	    	return coeffGravite;
	    }
	    public void setidObjetGravitationnel(int idObjetGravitationnel) {
	    	this.idObjetGravitationnel=idObjetGravitationnel;
	    	
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
	    public void setpositionObjetGravitationnel(Position positionObjetGravitationnel) {
	        this.positionObjetGravitationnel=positionObjetGravitationnel;
	}
	    public void setcoeffGravite(float coeffGravite) {
	    	this.coeffGravite=coeffGravite;
	    }
	 
	    
	}