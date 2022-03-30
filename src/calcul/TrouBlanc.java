package calcul;
public class TrouBlanc {
		//variable
		private int idTrouBlanc;
		private String nom;
		private int diametre;
		private int diamInfluence;
		private Position positionTrouBlanc;
		private float coeffGravite;
		
		//constructeur
		public TrouBlanc(int idTrouBlanc,String nom,int diametre,int diamInfluence,
				Position positionTrouBlanc,float coeffGravite) {
			   this.idTrouBlanc=idTrouBlanc;
			   this.coeffGravite=coeffGravite;
			   this.diametre=diametre;
			   this.diamInfluence=diamInfluence;
			   this.nom=nom;
			   this.positionTrouBlanc=positionTrouBlanc;
			   
		}
		public int getIdTrouBlanc() {
			return idTrouBlanc;
		}
		
	    public String getNom() {
	    	return nom;
	    }
	    
	    public int getDiametre() {
	    	return diametre;
	    	
	    }
	    public int getDiamInfluence() {
	    	return diamInfluence;
	    }
	    public Position getPositionTrouBlanc() {
	    	return positionTrouBlanc;
	    }
	    public float getCoeffGravite() {
	    	return coeffGravite;
	    }
	    public void setIdTrouBlanc(int idTrouBlanc) {
	    	this.idTrouBlanc=idTrouBlanc;
	    	
	    }
	    public void setNom(String nom) {
	    	this.nom=nom;
	    }
	    public void setDiametre(int diametre) {
	    	this.diametre=diametre;
	    }
	    public void setDiamInfluence(int diamInfluence) {
	    	this.diamInfluence=diamInfluence;
	    }
	    public void setPositionTrouBlanc(Position positionTrouBlanc) {
	        this.positionTrouBlanc=positionTrouBlanc;
	}
	    public void setCoeffGravite(float coeffGravite) {
	    	this.coeffGravite=coeffGravite;
	    }
	 
	    
	}