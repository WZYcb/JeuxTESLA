



public class TrouBlanc {
		//variable
		private int idTrouBlanc;
		private String nom;
		private int diametre;
		private int diaminfluence;
		private Position positionTrouBlanc;
		private float coeffGravite;
		
		//constructeur
		public TrouBlanc(int idTrouBlanc,String nom,int diametre,int diaminfluence,
				Position positionTrouBlanc,float coeffGravite) {
			   this.idTrouBlanc=idTrouBlanc;
			   this.coeffGravite=coeffGravite;
			   this.diametre=diametre;
			   this.diaminfluence=diaminfluence;
			   this.nom=nom;
			   this.positionTrouBlanc=positionTrouBlanc;
			   
		}
		public int getidTrouBlanc() {
			return idTrouBlanc;
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
	    public Position getpositionTrouBlanc() {
	    	return positionTrouBlanc;
	    }
	    public float getcoeffGravite() {
	    	return coeffGravite;
	    }
	    public void setidTrouBlanc(int idTrouBlanc) {
	    	this.idTrouBlanc=idTrouBlanc;
	    	
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
	    public void setpositionTrouBlanc(Position positionTrouBlanc) {
	        this.positionTrouBlanc=positionTrouBlanc;
	}
	    public void setcoeffGravite(float coeffGravite) {
	    	this.coeffGravite=coeffGravite;
	    }
	 
	    
	}